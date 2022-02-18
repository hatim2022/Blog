import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.servlet.ModelAndView
import kotlin.collections.HashMap
import kotlin.collections.MutableMap
import kotlin.collections.set


@Controller
class HtmlController {

    @GetMapping("/")
    fun blog(model: Model): ModelAndView {
        val model: MutableMap<String, String?> = HashMap()
        model["name"] = "Alex"

        return ModelAndView("index", model)
    }

}