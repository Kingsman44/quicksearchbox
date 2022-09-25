package com.google.android.libraries.search.silk.p3162a.p3180r;

import com.google.android.libraries.silk.p3238b.C41742a;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4292ab.C56626b;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4292ab.C56627c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4292ab.C56628d;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56847c;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56848d;
import com.google.protos.p4874ap.p4877b.p4878a.C63710u;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.search.silk.a.r.c */
/* compiled from: PG */
public final /* synthetic */ class C40638c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C56626b f106647a;

    public /* synthetic */ C40638c(C56626b bVar) {
        this.f106647a = bVar;
    }

    public final C60870cx apply(Object obj) {
        C56626b bVar = this.f106647a;
        C63710u uVar = (C63710u) obj;
        if (uVar != null && ((C58485gu) Collection.EL.stream(uVar.f172254a).map(C40639d.f106648a).collect(C58370cn.f155946a)).containsAll(bVar.f151189a)) {
            C56627c cVar = (C56627c) C56628d.f151191c.createBuilder();
            String str = uVar.f172256c;
            cVar.copyOnWrite();
            C56628d dVar = (C56628d) cVar.instance;
            str.getClass();
            dVar.f151193a |= 1;
            dVar.f151194b = str;
            return C60856cj.m92900i((C56628d) cVar.build());
        }
        C56847c cVar2 = (C56847c) C56848d.f151669d.createBuilder();
        cVar2.copyOnWrite();
        C56848d dVar2 = (C56848d) cVar2.instance;
        dVar2.f151671a |= 1;
        dVar2.f151672b = "invalid_argument";
        String str2 = "Failed to sync user settings of saved locations. Location Mids to add: " + String.valueOf(bVar.f151189a) + " ,to delete: " + String.valueOf(bVar.f151190b);
        cVar2.copyOnWrite();
        C56848d dVar3 = (C56848d) cVar2.instance;
        dVar3.f151671a |= 2;
        dVar3.f151673c = str2;
        return C60856cj.m92899h(new C41742a((C56848d) cVar2.build()));
    }
}
