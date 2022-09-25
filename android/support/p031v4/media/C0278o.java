package android.support.p031v4.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;

/* renamed from: android.support.v4.media.o */
/* compiled from: PG */
final class C0278o {

    /* renamed from: a */
    public final Bundle f967a;

    /* renamed from: b */
    private final Messenger f968b;

    public C0278o(IBinder iBinder, Bundle bundle) {
        this.f968b = new Messenger(iBinder);
        this.f967a = bundle;
    }

    /* renamed from: a */
    public final void mo851a(int i, Bundle bundle, Messenger messenger) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = 1;
        obtain.setData(bundle);
        obtain.replyTo = messenger;
        this.f968b.send(obtain);
    }
}
