package androidx.p201w.p202a;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import androidx.p201w.C4362f;

/* renamed from: androidx.w.a.j */
/* compiled from: PG */
final class C4341j extends WebMessagePort.WebMessageCallback {

    /* renamed from: a */
    final /* synthetic */ C4362f f13961a;

    public C4341j(C4362f fVar) {
        this.f13961a = fVar;
    }

    public final void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
        this.f13961a.mo9289a(C4344m.m12446c(webMessage));
    }
}
