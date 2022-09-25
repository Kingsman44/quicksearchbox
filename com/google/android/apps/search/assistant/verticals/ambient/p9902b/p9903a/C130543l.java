package com.google.android.apps.search.assistant.verticals.ambient.p9902b.p9903a;

import com.google.android.apps.search.assistant.verticals.ambient.p10017u.C131832d;
import com.google.android.apps.search.assistant.verticals.ambient.p10017u.C131833e;
import com.google.android.apps.search.assistant.verticals.ambient.p10017u.C131834f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p4016z.C53685aj;
import com.google.assistant.p4016z.C53686ak;
import com.google.assistant.p4016z.C53709bg;
import com.google.assistant.p4016z.C53710bh;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C63042fg;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.b.a.l */
/* compiled from: PG */
public final /* synthetic */ class C130543l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C130544m f357592a;

    /* renamed from: b */
    public final /* synthetic */ long f357593b;

    public /* synthetic */ C130543l(C130544m mVar, long j) {
        this.f357592a = mVar;
        this.f357593b = j;
    }

    public final C60870cx apply(Object obj) {
        C130544m mVar = this.f357592a;
        long j = this.f357593b;
        C58485gu guVar = (C58485gu) obj;
        C131834f fVar = mVar.f357597d;
        C53709bg bgVar = (C53709bg) C53710bh.f141001c.createBuilder();
        Stream map = Collection.EL.stream(guVar).map(C131832d.f360042a);
        Objects.requireNonNull(bgVar);
        map.forEach(new C131833e(bgVar));
        C53685aj ajVar = (C53685aj) C53686ak.f140913f.createBuilder();
        C63042fg c = fVar.mo110336c();
        ajVar.copyOnWrite();
        C53686ak akVar = (C53686ak) ajVar.instance;
        c.getClass();
        akVar.f140918d = c;
        akVar.f140915a |= 1;
        C53710bh bhVar = (C53710bh) bgVar.build();
        ajVar.copyOnWrite();
        C53686ak akVar2 = (C53686ak) ajVar.instance;
        bhVar.getClass();
        akVar2.f140917c = bhVar;
        akVar2.f140916b = 5;
        ajVar.copyOnWrite();
        C53686ak akVar3 = (C53686ak) ajVar.instance;
        akVar3.f140915a |= 2;
        akVar3.f140919e = j;
        fVar.f360045b.mo110321e((C53686ak) ajVar.build());
        return C47638k.m84750a((Iterable) Collection.EL.stream(mVar.f357596c).map(new C130533b(mVar, guVar)).collect(C58370cn.f155946a)).mo51520a(C130535d.f357585a, mVar.f357598e);
    }
}
