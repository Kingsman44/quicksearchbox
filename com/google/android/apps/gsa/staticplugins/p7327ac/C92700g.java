package com.google.android.apps.gsa.staticplugins.p7327ac;

import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.p7117n.p7118a.p7119a.C90358b;
import com.google.common.base.C58817ah;
import com.google.p343ac.p346b.p347a.C6625b;
import com.google.p343ac.p346b.p347a.C6636m;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.ac.g */
/* compiled from: PG */
public final /* synthetic */ class C92700g implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C92701h f258741a;

    public /* synthetic */ C92700g(C92701h hVar) {
        this.f258741a = hVar;
    }

    public final Object apply(Object obj) {
        C92701h hVar = this.f258741a;
        C90358b bVar = (C90358b) obj;
        C86124t tVar = (C86124t) hVar.f258754d.mo27525b();
        C6625b bVar2 = (C6625b) C6636m.f19775aC.createBuilder();
        if (tVar.mo79746e(C90110fh.f250586K) || ((C84474e) hVar.f258756f.mo27525b()).mo78127p()) {
            boolean z = bVar.f252352b;
            bVar2.copyOnWrite();
            ((C6636m) bVar2.instance).f19824as = z;
        }
        if (tVar.mo79746e(C90110fh.f250585J)) {
            C62971cq cqVar = bVar.f252353c;
            bVar2.copyOnWrite();
            C6636m mVar = (C6636m) bVar2.instance;
            C62971cq cqVar2 = mVar.f19825at;
            if (!cqVar2.mo58948c()) {
                mVar.f19825at = C62942bv.mutableCopy(cqVar2);
            }
            C62947c.addAll((Iterable) cqVar, (List) mVar.f19825at);
        }
        return (C6636m) bVar2.build();
    }
}
