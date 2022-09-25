package androidx.p201w.p202a;

import android.webkit.ServiceWorkerClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.p201w.C4358b;

/* renamed from: androidx.w.a.t */
/* compiled from: PG */
public final class C4351t extends ServiceWorkerClient {

    /* renamed from: a */
    private final C4358b f13965a;

    public C4351t(C4358b bVar) {
        this.f13965a = bVar;
    }

    public final WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
        return this.f13965a.mo9288a();
    }
}
