package androidx.p201w.p202a;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import androidx.p201w.C4362f;

/* renamed from: androidx.w.a.k */
/* compiled from: PG */
final class C4342k extends WebMessagePort.WebMessageCallback {

    /* renamed from: a */
    final /* synthetic */ C4362f f13962a;

    public C4342k(C4362f fVar) {
        this.f13962a = fVar;
    }

    public final void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
        this.f13962a.mo9289a(C4344m.m12446c(webMessage));
    }
}
