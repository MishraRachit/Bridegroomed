package mvvm.f4wzy.com.samplelogin.network

import com.example.bridegroomed.model.User
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FieldMap
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST
import java.util.HashMap

interface BackEndApi {
    @FormUrlEncoded
    @POST("user/generate_auth_cookie/")
    fun LOGIN(@Field("email") email: String, @Field("password") password: String): Call<User>

    /*@FormUrlEncoded
    @POST("\"user/generate_auth_cookie/\"")
    fun login(@FieldMap data: HashMap<String, String>): Observable<LoginResponse>*/
}

