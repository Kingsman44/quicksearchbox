package com.google.apps.tiktok.account.data.manager;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.protobuf.MessageLite;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.apps.tiktok.account.data.manager.av */
/* compiled from: PG */
final class C46249av implements C60845bz {

    /* renamed from: a */
    private final C46282ca f121231a;

    public C46249av(C46282ca caVar) {
        this.f121231a = caVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C46257bc.f121238a.mo56225c()).mo56382g(th)).mo56372aa(54702)).mo56386p("Failure in AccountManager");
        try {
            this.f121231a.mo50306a(C46257bc.m82525a(th));
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) C46257bc.f121238a.mo56225c()).mo56382g(e)).mo56372aa(54703)).mo56386p("Exception in client in failure callback");
        } catch (RuntimeException e2) {
            try {
                this.f121231a.mo50306a(C46257bc.m82525a(new C46256bb(th, e2)));
            } catch (RemoteException e3) {
                ((C59052c) ((C59052c) ((C59052c) C46257bc.f121238a.mo56225c()).mo56382g(e3)).mo56372aa(54704)).mo56386p("Exception in client failure callback after serialization failure");
            }
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putInt("account_ids", ((AccountId) entry.getKey()).mo50068a());
            ProtoParsers.m95532o(bundle, "account_infos", (MessageLite) entry.getValue());
            arrayList.add(bundle);
        }
        try {
            this.f121231a.mo50307b(arrayList);
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) C46257bc.f121238a.mo56225c()).mo56382g(e)).mo56372aa(54705)).mo56386p("Exception in client in success callback");
        }
    }
}
