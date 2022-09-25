package com.google.android.libraries.geller.p1818f;

import com.google.common.base.C58817ah;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58495hd;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65808cl;
import com.google.protos.p5129p.p5131b.C65853v;
import com.google.protos.p5129p.p5131b.C65854w;
import java.util.HashMap;
import java.util.Set;

/* renamed from: com.google.android.libraries.geller.f.ar */
/* compiled from: PG */
public final /* synthetic */ class C21808ar implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C21826bi f60166a;

    /* renamed from: b */
    public final /* synthetic */ Set f60167b;

    /* renamed from: c */
    public final /* synthetic */ C65808cl f60168c;

    /* renamed from: d */
    public final /* synthetic */ int f60169d;

    public /* synthetic */ C21808ar(C21826bi biVar, int i, Set set, C65808cl clVar) {
        this.f60166a = biVar;
        this.f60169d = i;
        this.f60167b = set;
        this.f60168c = clVar;
    }

    public final Object apply(Object obj) {
        C21826bi biVar = this.f60166a;
        int i = this.f60169d;
        Set<C65753ak> set = this.f60167b;
        C65808cl clVar = this.f60168c;
        C58495hd hdVar = (C58495hd) obj;
        HashMap hashMap = new HashMap();
        if (i != 3) {
            for (C65753ak akVar : set) {
                C65853v vVar = (C65853v) C65854w.f179011g.createBuilder();
                vVar.copyOnWrite();
                C65854w wVar = (C65854w) vVar.instance;
                wVar.f179014b = akVar.f178757bE;
                wVar.f179013a |= 1;
                hashMap.put(akVar, (C65854w) vVar.build());
            }
        }
        C58836b bVar = C58836b.f156633a;
        return biVar.mo27130d(set, clVar, i, hashMap, hdVar, bVar, bVar);
    }
}
