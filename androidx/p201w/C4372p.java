package androidx.p201w;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import androidx.p201w.p202a.C4325ab;
import androidx.p201w.p202a.C4327ad;
import androidx.p201w.p202a.C4331ah;
import androidx.p201w.p202a.C4335d;
import androidx.p201w.p202a.C4344m;
import androidx.p201w.p202a.C4346o;
import androidx.p201w.p202a.C4348q;
import androidx.p201w.p202a.C4356y;
import androidx.p201w.p202a.C4357z;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.web.webview.p3485h.p3486a.C44415c;
import java.util.Set;
import org.chromium.support_lib_boundary.p5648a.C72562a;

/* renamed from: androidx.w.p */
/* compiled from: PG */
public final class C4372p {

    /* renamed from: a */
    public static final Uri f13981a = Uri.parse("*");

    /* renamed from: b */
    public static final Uri f13982b = Uri.parse(BuildConfig.FLAVOR);

    /* renamed from: a */
    public static C4373q m12522a(WebView webView) {
        C4335d dVar = C4325ab.f13948a;
        WebViewRenderProcess b = C4348q.m12487b(webView);
        if (b != null) {
            return C4331ah.m12432a(b);
        }
        return null;
    }

    /* renamed from: b */
    public static String m12523b() {
        if (C4325ab.f13950c.mo9267d()) {
            return C4327ad.f13952a.mo9268a().getVariationsHeader();
        }
        throw C4325ab.m12422a();
    }

    /* renamed from: c */
    public static void m12524c(WebView webView, C4374r rVar) {
        C4335d dVar = C4325ab.f13948a;
        C4348q.m12490e(webView, rVar);
    }

    /* renamed from: d */
    public static C4363g[] m12525d(WebView webView) {
        C4335d dVar = C4325ab.f13948a;
        return C4357z.m12502e(C4344m.m12456m(webView));
    }

    /* renamed from: e */
    public static void m12526e(WebView webView, String str, Set set, C44415c cVar) {
        if (C4325ab.f13949b.mo9267d()) {
            C4327ad.f13952a.mo9269b(webView).addWebMessageListener(str, (String[]) set.toArray(new String[0]), new C72562a(new C4356y(cVar)));
            return;
        }
        throw C4325ab.m12422a();
    }

    /* renamed from: f */
    public static PackageInfo m12527f() {
        return C4346o.m12474a();
    }

    /* renamed from: g */
    public static void m12528g(WebView webView, C4371o oVar) {
        C4335d dVar = C4325ab.f13948a;
        C4344m.m12450g(webView, 1, oVar);
    }
}
