package androidx.media3.exoplayer.p145h;

import android.os.Handler;
import android.os.Message;

/* renamed from: androidx.media3.exoplayer.h.r */
/* compiled from: PG */
public final /* synthetic */ class C3123r implements Handler.Callback {

    /* renamed from: a */
    public final /* synthetic */ C3127v f9152a;

    public /* synthetic */ C3123r(C3127v vVar) {
        this.f9152a = vVar;
    }

    public final boolean handleMessage(Message message) {
        C3127v vVar = this.f9152a;
        if (message.what != 0) {
            return true;
        }
        vVar.f9170a = false;
        C3125t E = vVar.mo7110E();
        if (E == null) {
            return true;
        }
        vVar.mo6952y(E);
        return true;
    }
}
