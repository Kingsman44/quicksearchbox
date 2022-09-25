package com.google.apps.tiktok.account.data.manager;

import android.os.Bundle;
import androidx.p104d.p105a.C2164c;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46215j;
import com.google.common.p4522b.C58490gz;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.apps.tiktok.account.data.manager.bq */
/* compiled from: PG */
final class C46271bq extends C46280bz {

    /* renamed from: a */
    private final C2164c f121258a;

    public C46271bq(C2164c cVar) {
        this.f121258a = cVar;
    }

    /* renamed from: a */
    public final void mo50306a(Bundle bundle) {
        this.f121258a.mo5439d((Throwable) bundle.getSerializable("exception"));
    }

    /* renamed from: b */
    public final void mo50307b(List list) {
        try {
            C2164c cVar = this.f121258a;
            C58490gz gzVar = new C58490gz(4);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Bundle bundle = (Bundle) it.next();
                gzVar.mo55429h(AccountId.m82057b(bundle.getInt("account_ids")), (C46215j) ProtoParsers.m95520c(bundle, "account_infos", C46215j.f121154k, C62921ba.m95368a()));
            }
            cVar.mo5437b(gzVar.mo55427f(true));
        } catch (C62974ct e) {
            this.f121258a.mo5439d(e);
        }
    }
}
