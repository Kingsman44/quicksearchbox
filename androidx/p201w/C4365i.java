package androidx.p201w;

import android.content.Context;
import android.util.Log;
import android.webkit.WebResourceResponse;
import androidx.p201w.p202a.C4349r;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: androidx.w.i */
/* compiled from: PG */
public final class C4365i implements C4368l {

    /* renamed from: a */
    private final C4349r f13974a;

    public C4365i(Context context) {
        this.f13974a = new C4349r(context);
    }

    /* renamed from: a */
    public final WebResourceResponse mo9290a(String str) {
        try {
            C4349r rVar = this.f13974a;
            String substring = (str.length() <= 1 || str.charAt(0) != '/') ? str : str.substring(1);
            return new WebResourceResponse(C4349r.m12495c(str), (String) null, C4349r.m12493a(substring, rVar.f13964a.getAssets().open(substring, 2)));
        } catch (IOException e) {
            Log.e("WebViewAssetLoader", "Error opening asset path: ".concat(String.valueOf(str)), e);
            return new WebResourceResponse((String) null, (String) null, (InputStream) null);
        }
    }
}
