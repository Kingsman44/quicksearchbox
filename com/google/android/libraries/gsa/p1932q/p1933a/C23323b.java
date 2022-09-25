package com.google.android.libraries.gsa.p1932q.p1933a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.gsa.q.a.b */
/* compiled from: PG */
final class C23323b implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C23324c f63824a;

    public C23323b(C23324c cVar) {
        this.f63824a = cVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f63824a.f63839j = false;
        C23324c cVar = this.f63824a;
        if (cVar.f63840k != null) {
            cVar.f63835f = new Messenger(iBinder);
            try {
                Message obtain = Message.obtain((Handler) null, 2);
                obtain.replyTo = this.f63824a.f63836g;
                this.f63824a.mo28820c(obtain);
            } catch (RemoteException e) {
                ((C59052c) ((C59052c) ((C59052c) C23324c.f63825a.mo56226d()).mo56382g(e)).mo56372aa(48652)).mo56386p("SsbServiceConnection - remote call failed");
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C23324c cVar = this.f63824a;
        cVar.f63835f = null;
        cVar.f63839j = false;
    }
}
