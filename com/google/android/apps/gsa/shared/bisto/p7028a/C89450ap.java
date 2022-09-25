package com.google.android.apps.gsa.shared.bisto.p7028a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124641bg;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124642bh;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124708f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g;
import com.google.android.p10712d.C142531w;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.protobuf.C62947c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.ap */
/* compiled from: PG */
final class C89450ap extends C89473bl {

    /* renamed from: a */
    final /* synthetic */ C142531w f242468a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89450ap(C89474bm bmVar, String str, C142531w wVar) {
        super(bmVar, str, (C58528ij) C58733pz.f156496a);
        this.f242468a = wVar;
    }

    /* renamed from: a */
    public final C124709g mo83351a(C124709g gVar) {
        C124708f c = C89474bm.m145533c(gVar);
        C124641bg g = C89474bm.m145537g(c);
        ArrayList arrayList = new ArrayList();
        for (C142531w wVar : Collections.unmodifiableList(((C124642bh) g.instance).f343864k)) {
            if ((wVar.f386758a & 1) != 0 && !wVar.f386759b.equals(this.f242468a.f386759b)) {
                arrayList.add(wVar);
            }
        }
        g.copyOnWrite();
        ((C124642bh) g.instance).f343864k = C124642bh.emptyProtobufList();
        g.copyOnWrite();
        C124642bh bhVar = (C124642bh) g.instance;
        bhVar.mo106572a();
        C62947c.addAll((Iterable) arrayList, (List) bhVar.f343864k);
        C142531w wVar2 = this.f242468a;
        g.copyOnWrite();
        C124642bh bhVar2 = (C124642bh) g.instance;
        wVar2.getClass();
        bhVar2.mo106572a();
        bhVar2.f343864k.add(wVar2);
        c.copyOnWrite();
        C124709g gVar2 = (C124709g) c.instance;
        C124642bh bhVar3 = (C124642bh) g.build();
        C124709g gVar3 = C124709g.f344049g;
        bhVar3.getClass();
        gVar2.f344054d = bhVar3;
        gVar2.f344051a |= 4;
        return (C124709g) c.build();
    }
}
