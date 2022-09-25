package androidx.preference;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: androidx.preference.aa */
/* compiled from: PG */
final class C3975aa extends Handler {

    /* renamed from: a */
    final /* synthetic */ C3983ai f12793a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3975aa(C3983ai aiVar, Looper looper) {
        super(looper);
        this.f12793a = aiVar;
    }

    public final void handleMessage(Message message) {
        if (message.what == 1) {
            this.f12793a.mo8405f();
        }
    }
}
