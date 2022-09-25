package com.google.apps.tiktok.account.data.manager;

import android.os.RemoteException;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.apps.tiktok.account.data.manager.ay */
/* compiled from: PG */
final class C46252ay implements C60845bz {

    /* renamed from: a */
    private final C46285cd f121235a;

    public C46252ay(C46285cd cdVar) {
        this.f121235a = cdVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        try {
            this.f121235a.mo50308a(C46257bc.m82525a(th));
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) C46257bc.f121238a.mo56225c()).mo56382g(e)).mo56372aa(54711)).mo56386p("Exception in client failure callback");
        } catch (RuntimeException e2) {
            try {
                this.f121235a.mo50308a(C46257bc.m82525a(new C46256bb(th, e2)));
            } catch (RemoteException e3) {
                ((C59052c) ((C59052c) ((C59052c) C46257bc.f121238a.mo56225c()).mo56382g(e3)).mo56372aa(54712)).mo56386p("Exception in client failure callback after serialization failure");
            }
        }
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        try {
            this.f121235a.mo50309b();
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) C46257bc.f121238a.mo56225c()).mo56382g(e)).mo56372aa(54713)).mo56386p("Exception in client in success callback");
        }
    }
}
