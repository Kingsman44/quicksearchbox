package androidx.media;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;

/* renamed from: androidx.media.al */
/* compiled from: PG */
final class C2414al {

    /* renamed from: a */
    final Messenger f6682a;

    public C2414al(Messenger messenger) {
        this.f6682a = messenger;
    }

    /* renamed from: a */
    public final void mo5826a(int i, Bundle bundle) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = 2;
        obtain.setData(bundle);
        this.f6682a.send(obtain);
    }
}
