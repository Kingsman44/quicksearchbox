package com.google.android.libraries.gsa.actionusermodel;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4152bb.p4153a.C55084fg;
import com.google.p4152bb.p4153a.C55421x;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p4986a.C64648ab;
import com.google.protos.p4985f.p4986a.C64672az;
import com.google.protos.p4985f.p4986a.C64674ba;
import com.google.protos.p4985f.p4986a.C64676bc;
import com.google.protos.p4985f.p4986a.C64705o;
import com.google.protos.p4985f.p4986a.C64706p;
import com.google.protos.p4985f.p4986a.C64707q;
import com.google.protos.p4985f.p4986a.C64708r;
import com.google.protos.p4985f.p4986a.C64715y;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.w */
/* compiled from: PG */
public final /* synthetic */ class C22151w implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C22153y f61103a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f61104b;

    /* renamed from: c */
    public final /* synthetic */ String f61105c;

    /* renamed from: d */
    public final /* synthetic */ String f61106d;

    /* renamed from: e */
    public final /* synthetic */ C55421x f61107e;

    /* renamed from: f */
    public final /* synthetic */ C64676bc f61108f;

    /* renamed from: g */
    public final /* synthetic */ Optional f61109g;

    /* renamed from: h */
    public final /* synthetic */ C63088z f61110h;

    /* renamed from: i */
    public final /* synthetic */ boolean f61111i;

    /* renamed from: j */
    public final /* synthetic */ C64708r f61112j;

    /* renamed from: k */
    public final /* synthetic */ boolean f61113k;

    /* renamed from: l */
    public final /* synthetic */ int f61114l;

    public /* synthetic */ C22151w(C22153y yVar, C58485gu guVar, String str, String str2, C55421x xVar, int i, C64676bc bcVar, Optional optional, C63088z zVar, boolean z, C64708r rVar, boolean z2) {
        this.f61103a = yVar;
        this.f61104b = guVar;
        this.f61105c = str;
        this.f61106d = str2;
        this.f61107e = xVar;
        this.f61114l = i;
        this.f61108f = bcVar;
        this.f61109g = optional;
        this.f61110h = zVar;
        this.f61111i = z;
        this.f61112j = rVar;
        this.f61113k = z2;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C22153y yVar = this.f61103a;
        C58485gu guVar = this.f61104b;
        String str = this.f61105c;
        String str2 = this.f61106d;
        C55421x xVar = this.f61107e;
        int i = this.f61114l;
        C64676bc bcVar = this.f61108f;
        Optional optional = this.f61109g;
        C63088z zVar = this.f61110h;
        boolean z = this.f61111i;
        C64708r rVar = this.f61112j;
        boolean z2 = this.f61113k;
        C118826c cVar = (C118826c) obj;
        C64707q qVar = (C64707q) C64708r.f175399l.createBuilder();
        long epochMilli = yVar.f61120c.mo57444a().toEpochMilli();
        qVar.copyOnWrite();
        C64708r rVar2 = (C64708r) qVar.instance;
        boolean z3 = z;
        C63088z zVar2 = zVar;
        rVar2.f175401a |= 1;
        rVar2.f175405e = epochMilli;
        C64705o oVar = (C64705o) C64706p.f175396b.createBuilder();
        oVar.mo59297a(xVar);
        C64706p pVar = (C64706p) oVar.build();
        qVar.copyOnWrite();
        C64708r rVar3 = (C64708r) qVar.instance;
        pVar.getClass();
        rVar3.f175406f = pVar;
        rVar3.f175401a |= 32;
        qVar.copyOnWrite();
        C64708r rVar4 = (C64708r) qVar.instance;
        rVar4.f175401a |= 128;
        rVar4.f175407g = 25000;
        C64715y yVar2 = (C64715y) C64648ab.f175238d.createBuilder();
        yVar2.copyOnWrite();
        C64648ab abVar = (C64648ab) yVar2.instance;
        abVar.f175241b = i - 1;
        abVar.f175240a |= 1;
        yVar2.copyOnWrite();
        C64648ab abVar2 = (C64648ab) yVar2.instance;
        str.getClass();
        abVar2.f175240a |= 2;
        abVar2.f175242c = str;
        qVar.mo59300c((C64648ab) yVar2.build());
        qVar.copyOnWrite();
        C64708r rVar5 = (C64708r) qVar.instance;
        rVar5.f175408h = bcVar.f175326g;
        rVar5.f175401a |= 1024;
        qVar.mo59299b(guVar);
        Objects.requireNonNull(qVar);
        optional.ifPresent(new C22149u(qVar));
        C55084fg e = C22063au.m41302e(str2, yVar.mo27366h(), z2);
        C64672az azVar = (C64672az) C64674ba.f175306k.createBuilder();
        azVar.copyOnWrite();
        C64674ba baVar = (C64674ba) azVar.instance;
        baVar.f175311d = e.f144948h;
        baVar.f175308a |= 4;
        azVar.copyOnWrite();
        C64674ba baVar2 = (C64674ba) azVar.instance;
        baVar2.f175308a |= 16;
        baVar2.f175312e = true;
        azVar.copyOnWrite();
        C64674ba baVar3 = (C64674ba) azVar.instance;
        baVar3.f175308a |= 1;
        baVar3.f175309b = true;
        boolean z4 = xVar == C55421x.PHONE_CALL_CONTACT;
        azVar.copyOnWrite();
        C64674ba baVar4 = (C64674ba) azVar.instance;
        baVar4.f175308a |= 2;
        baVar4.f175310c = z4;
        azVar.copyOnWrite();
        C64674ba baVar5 = (C64674ba) azVar.instance;
        baVar5.f175308a |= 64;
        baVar5.f175314g = true;
        azVar.copyOnWrite();
        C64674ba baVar6 = (C64674ba) azVar.instance;
        baVar6.f175308a |= 128;
        baVar6.f175315h = true;
        C64674ba baVar7 = (C64674ba) azVar.build();
        qVar.copyOnWrite();
        C64708r rVar6 = (C64708r) qVar.instance;
        baVar7.getClass();
        rVar6.f175403c = baVar7;
        rVar6.f175402b = 11;
        if (rVar != null) {
            qVar.mergeFrom(rVar);
        }
        C60870cx a = yVar.f61122e.mo27347a();
        C60870cx f = yVar.mo27364f(zVar2);
        return C60856cj.m92893b(f, a).mo57334a(C47810es.m84978r(new C22150v(a, z3, i, e, guVar, f, qVar)), C60826bg.f164896a);
    }
}
