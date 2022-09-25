package androidx.p201w.p202a;

import android.webkit.WebViewRenderProcess;
import androidx.p201w.C4373q;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: androidx.w.a.ah */
/* compiled from: PG */
public final class C4331ah extends C4373q {

    /* renamed from: b */
    private static final WeakHashMap f13955b = new WeakHashMap();

    /* renamed from: a */
    public final WeakReference f13956a;

    public C4331ah(WebViewRenderProcess webViewRenderProcess) {
        this.f13956a = new WeakReference(webViewRenderProcess);
    }

    /* renamed from: a */
    public static C4331ah m12432a(WebViewRenderProcess webViewRenderProcess) {
        WeakHashMap weakHashMap = f13955b;
        C4331ah ahVar = (C4331ah) weakHashMap.get(webViewRenderProcess);
        if (ahVar != null) {
            return ahVar;
        }
        C4331ah ahVar2 = new C4331ah(webViewRenderProcess);
        weakHashMap.put(webViewRenderProcess, ahVar2);
        return ahVar2;
    }
}
