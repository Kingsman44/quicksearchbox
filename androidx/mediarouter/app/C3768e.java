package androidx.mediarouter.app;

import android.os.Handler;
import android.os.Message;
import java.util.List;

/* renamed from: androidx.mediarouter.app.e */
/* compiled from: PG */
final class C3768e extends Handler {

    /* renamed from: a */
    final /* synthetic */ C3772i f12170a;

    public C3768e(C3772i iVar) {
        this.f12170a = iVar;
    }

    public final void handleMessage(Message message) {
        if (message.what == 1) {
            this.f12170a.mo7992j((List) message.obj);
        }
    }
}
