package androidx.mediarouter.p175a;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: androidx.mediarouter.a.e */
/* compiled from: PG */
final class C3732e extends Handler {

    /* renamed from: a */
    final /* synthetic */ C3733f f11979a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3732e(C3733f fVar) {
        super(Looper.getMainLooper());
        this.f11979a = fVar;
    }

    public final void handleMessage(Message message) {
        String str;
        int i = message.what;
        int i2 = message.arg1;
        int i3 = message.arg2;
        Object obj = message.obj;
        Bundle peekData = message.peekData();
        C3667ac acVar = (C3667ac) this.f11979a.f11984e.get(i2);
        if (acVar == null) {
            Log.w("MR2Provider", "Pending callback not found for control request.");
            return;
        }
        this.f11979a.f11984e.remove(i2);
        if (i == 3) {
            acVar.mo7722b((Bundle) obj);
        } else if (i == 4) {
            if (peekData == null) {
                str = null;
            } else {
                str = peekData.getString("error");
            }
            acVar.mo7721a(str, (Bundle) obj);
        }
    }
}
