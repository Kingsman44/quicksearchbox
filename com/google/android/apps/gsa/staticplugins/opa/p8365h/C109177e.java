package com.google.android.apps.gsa.staticplugins.opa.p8365h;

import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.publicsearch.p6481a.C84199a;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60888db;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.h.e */
/* compiled from: PG */
public final class C109177e implements C84199a {

    /* renamed from: a */
    public final C58974d f303990a;

    /* renamed from: b */
    public final C68214a f303991b;

    /* renamed from: c */
    public final C60888db f303992c;

    /* renamed from: d */
    public final C109176d f303993d;

    /* renamed from: e */
    public final C47770dh f303994e;

    /* renamed from: f */
    private final Handler f303995f;

    public C109177e(C68214a aVar, C60888db dbVar, C47770dh dhVar, Looper looper, C83564a aVar2, C109176d dVar) {
        this.f303991b = aVar;
        this.f303992c = dbVar;
        this.f303993d = dVar;
        this.f303995f = new C109171b(this, looper);
        this.f303990a = aVar2.mo76900a("BrdcstRcvrBProvider");
        this.f303994e = dhVar;
    }

    /* renamed from: a */
    public final IBinder mo77668a(C58833ax axVar) {
        return new Messenger(this.f303995f).getBinder();
    }

    /* renamed from: b */
    public final void mo97647b(Messenger messenger, int i) {
        try {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.arg1 = i;
            messenger.send(obtain);
            ((C58970a) ((C58970a) this.f303990a.mo56224b()).mo56372aa(23866)).mo56387q("handleMessage(): DONE id:%d", i);
        } catch (RemoteException e) {
            ((C58970a) ((C58970a) ((C58970a) this.f303990a.mo56225c()).mo56382g(e)).mo56372aa(23867)).mo56386p("handleMessage(): remote exception");
        }
    }
}
