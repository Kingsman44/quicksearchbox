package androidx.mediarouter.p175a;

import android.os.Handler;
import android.os.Message;

/* renamed from: androidx.mediarouter.a.s */
/* compiled from: PG */
final class C3746s extends Handler {

    /* renamed from: a */
    final /* synthetic */ C3749v f12027a;

    public C3746s(C3749v vVar) {
        this.f12027a = vVar;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            C3749v vVar = this.f12027a;
            vVar.f12036l = false;
            C3741n nVar = vVar.f12032h;
            if (nVar != null) {
                C3751x xVar = vVar.f12035k;
                C3679ao aoVar = ((C3677am) nVar).f11812a;
                C3684at b = aoVar.mo7732b(vVar);
                if (b != null) {
                    aoVar.mo7745o(b, xVar);
                }
            }
        } else if (i == 2) {
            C3749v vVar2 = this.f12027a;
            vVar2.f12034j = false;
            vVar2.mo7825f(vVar2.f12033i);
        }
    }
}
