package com.google.android.libraries.gsa.actionusermodel;

import com.google.android.libraries.gsa.actionusermodel.p1830c.C22102e;
import com.google.android.libraries.gsa.actionusermodel.p1830c.C22104g;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58370cn;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.s */
/* compiled from: PG */
public final /* synthetic */ class C22147s implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C22153y f61091a;

    /* renamed from: b */
    public final /* synthetic */ Optional f61092b;

    /* renamed from: c */
    public final /* synthetic */ String f61093c;

    public /* synthetic */ C22147s(C22153y yVar, Optional optional, String str) {
        this.f61091a = yVar;
        this.f61092b = optional;
        this.f61093c = str;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C22153y yVar = this.f61091a;
        Optional optional = this.f61092b;
        String str = this.f61093c;
        C22104g gVar = (C22104g) obj;
        C22102e eVar = (C22102e) gVar.toBuilder();
        eVar.copyOnWrite();
        ((C22104g) eVar.instance).f60927f = C22104g.emptyProtobufList();
        eVar.mo27355b((Iterable) Collection.EL.stream(gVar.f60927f).map(new C22148t(yVar)).collect(C58370cn.f155946a));
        eVar.copyOnWrite();
        C22104g gVar2 = (C22104g) eVar.instance;
        str.getClass();
        gVar2.f60922a |= 8;
        gVar2.f60926e = str;
        C22104g gVar3 = (C22104g) eVar.build();
        yVar.mo27367i(optional, gVar3);
        return gVar3;
    }
}
