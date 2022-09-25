package com.google.android.apps.gsa.staticplugins.opa.p8602w;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.android.apps.gsa.publicsearch.p6481a.C84199a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.w.b */
/* compiled from: PG */
public final class C114164b implements C84199a {

    /* renamed from: g */
    private static final C59071e f316484g = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.w.b");

    /* renamed from: a */
    public final C69464a f316485a;

    /* renamed from: b */
    public final C68214a f316486b;

    /* renamed from: c */
    public final C68214a f316487c;

    /* renamed from: d */
    public final C68214a f316488d;

    /* renamed from: e */
    public final C68214a f316489e;

    /* renamed from: f */
    public final C68214a f316490f;

    public C114164b(C69464a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6) {
        this.f316485a = aVar;
        this.f316486b = aVar2;
        this.f316487c = aVar3;
        this.f316488d = aVar4;
        this.f316489e = aVar5;
        this.f316490f = aVar6;
    }

    /* renamed from: b */
    public static final void m189384b(Messenger messenger, boolean z) {
        Message obtain = Message.obtain();
        obtain.getData().putBoolean("opa_started_successfully", z);
        if (messenger != null) {
            try {
                messenger.send(obtain);
            } catch (RemoteException e) {
                ((C59052c) ((C59052c) ((C59052c) f316484g.mo56226d()).mo56382g(e)).mo56372aa(24356)).mo56386p("Sending opa start status failed");
            }
        }
    }

    /* renamed from: a */
    public final IBinder mo77668a(C58833ax axVar) {
        return new Messenger(new C114163a(this)).getBinder();
    }
}
