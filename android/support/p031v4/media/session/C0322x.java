package android.support.p031v4.media.session;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media.C2417ao;

/* renamed from: android.support.v4.media.session.x */
/* compiled from: PG */
final class C0322x extends Handler {

    /* renamed from: a */
    final /* synthetic */ C0324z f1047a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0322x(C0324z zVar, Looper looper) {
        super(looper);
        this.f1047a = zVar;
    }

    public final void handleMessage(Message message) {
        C0284aa aaVar;
        C0322x xVar;
        if (message.what == 1) {
            synchronized (this.f1047a.f1049a) {
                aaVar = (C0284aa) this.f1047a.f1051c.get();
                xVar = this.f1047a.f1052d;
            }
            if (aaVar != null && this.f1047a == aaVar.mo917a() && xVar != null) {
                C2417ao aoVar = (C2417ao) message.obj;
                aaVar.mo919c();
                aaVar.mo919c();
            }
        }
    }
}
