import androidx.compose.ui.window.ComposeUIViewController
import com.courses.coursesapp.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
