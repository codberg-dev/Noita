package codberg.codberg.noitavonni.view.splash

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import codberg.codberg.noitavonni.R
import codberg.codberg.noitavonni.databinding.ActivitySplashBinding

/**
 * Android 12부터 스플래시 방식 변경 예정
 *
 * 자동로그인 여부 판별
 *
 * 로그인 액티비티, 메인 액티비티 연결
 *
 */
class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    private var isAutoLogin = false

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash)

        getLoginState()

    }

    private fun getLoginState() {
        // 자동로그인 SharedPreference 값 로드


        if (isAutoLogin) {
            getUserInfo()
        } else {
            toLogin()
        }

    }

    // 유저 정보 불러오기
    private fun getUserInfo() {
        //http 연결 성공 시
        toMain()
    }

    private fun toLogin() {

    }

    private fun toMain() {

    }

}