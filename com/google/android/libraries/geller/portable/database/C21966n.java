package com.google.android.libraries.geller.portable.database;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.protos.p5129p.p5131b.C65768az;
import com.google.protos.p5129p.p5131b.C65776bg;
import com.google.protos.p5129p.p5131b.C65779bj;
import com.google.protos.p5129p.p5131b.C65780bk;
import com.google.protos.p5129p.p5131b.C65782bm;
import com.google.protos.p5129p.p5131b.C65783bn;
import com.google.protos.p5129p.p5131b.C65786bq;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.google.android.libraries.geller.portable.database.n */
/* compiled from: PG */
public final /* synthetic */ class C21966n implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C65768az f60590a;

    /* renamed from: b */
    public final /* synthetic */ long f60591b;

    /* renamed from: c */
    public final /* synthetic */ boolean f60592c;

    /* renamed from: d */
    public final /* synthetic */ String f60593d;

    public /* synthetic */ C21966n(C65768az azVar, long j, boolean z, String str) {
        this.f60590a = azVar;
        this.f60591b = j;
        this.f60592c = z;
        this.f60593d = str;
    }

    public final Object apply(Object obj) {
        ArrayList arrayList;
        C65768az azVar = this.f60590a;
        long j = this.f60591b;
        boolean z = this.f60592c;
        String str = this.f60593d;
        C65786bq bqVar = (C65786bq) obj;
        C58528ij ijVar = C21977y.f60610a;
        C65779bj bjVar = (C65779bj) C65780bk.f178819g.createBuilder();
        bjVar.copyOnWrite();
        C65780bk bkVar = (C65780bk) bjVar.instance;
        azVar.getClass();
        bkVar.f178822b = azVar;
        int i = 1;
        bkVar.f178821a |= 1;
        bjVar.copyOnWrite();
        C65780bk bkVar2 = (C65780bk) bjVar.instance;
        bkVar2.f178821a |= 16;
        bkVar2.f178826f = j;
        if (true == z) {
            i = 2;
        }
        bjVar.copyOnWrite();
        C65780bk bkVar3 = (C65780bk) bjVar.instance;
        bkVar3.f178823c = i - 1;
        bkVar3.f178821a = 2 | bkVar3.f178821a;
        C65780bk bkVar4 = (C65780bk) bjVar.build();
        String str2 = azVar.f178798d;
        if (Collections.unmodifiableMap(bqVar.f178836a).containsKey(str2)) {
            arrayList = new ArrayList(((C65783bn) Collections.unmodifiableMap(bqVar.f178836a).get(str2)).f178831a);
        } else {
            arrayList = new ArrayList();
        }
        if (((C58759qy) C21977y.f60610a).f156534a.equals(str)) {
            arrayList.add(bkVar4);
            Collections.sort(arrayList, C21976x.f60609a);
            C65776bg bgVar = (C65776bg) bqVar.toBuilder();
            C65782bm bmVar = (C65782bm) C65783bn.f178829b.createBuilder();
            bmVar.mo59425a(arrayList);
            bgVar.mo59424a(str2, (C65783bn) bmVar.build());
            return (C65786bq) bgVar.build();
        } else if (!arrayList.isEmpty() && ((C65780bk) arrayList.get(0)).f178826f >= bkVar4.f178826f) {
            return bqVar;
        } else {
            C65776bg bgVar2 = (C65776bg) bqVar.toBuilder();
            C65782bm bmVar2 = (C65782bm) C65783bn.f178829b.createBuilder();
            bmVar2.copyOnWrite();
            C65783bn bnVar = (C65783bn) bmVar2.instance;
            bkVar4.getClass();
            bnVar.mo59426a();
            bnVar.f178831a.add(bkVar4);
            bgVar2.mo59424a(str2, (C65783bn) bmVar2.build());
            return (C65786bq) bgVar2.build();
        }
    }
}
