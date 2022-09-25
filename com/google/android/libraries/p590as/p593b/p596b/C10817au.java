package com.google.android.libraries.p590as.p593b.p596b;

import com.google.android.libraries.p590as.p593b.p596b.p604g.C10879g;
import com.google.android.libraries.p590as.p593b.p596b.p604g.C10880h;
import com.google.android.libraries.p590as.p593b.p596b.p604g.C10881i;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.as.b.b.au */
/* compiled from: PG */
public final /* synthetic */ class C10817au implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C10846ba f35858a;

    /* renamed from: b */
    public final /* synthetic */ C10879g f35859b;

    public /* synthetic */ C10817au(C10846ba baVar, C10879g gVar) {
        this.f35858a = baVar;
        this.f35859b = gVar;
    }

    public final Object apply(Object obj) {
        C10846ba baVar = this.f35858a;
        C10879g gVar = this.f35859b;
        C10881i iVar = (C10881i) obj;
        C58485gu guVar = (C58485gu) Collection.EL.stream(iVar.f35967a).filter(new C10821ay(gVar)).collect(C58370cn.f155946a);
        if (iVar.f35967a.size() == guVar.size()) {
            ((C58970a) ((C58970a) C10846ba.f35901a.mo56226d()).mo56372aa(53975)).mo56354G("[%s] LP request deletion found no match. Was API invoked properly? Locale: %s", baVar.f35904d, gVar.f35961b);
        }
        C10880h hVar = (C10880h) C10881i.f35965b.createBuilder();
        hVar.mo19331a(guVar);
        return (C10881i) hVar.build();
    }
}
