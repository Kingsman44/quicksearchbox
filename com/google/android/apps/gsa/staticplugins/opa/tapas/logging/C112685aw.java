package com.google.android.apps.gsa.staticplugins.opa.tapas.logging;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108253bx;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p.C113050ay;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113425ff;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8581e.C113389c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4553a.C59501by;
import com.google.common.p4552o.p4553a.C59502bz;
import com.google.common.p4552o.p4553a.C59504ca;
import com.google.common.p4552o.p4553a.C59505cb;
import com.google.common.p4552o.p4553a.C59522cs;
import com.google.common.p4552o.p4553a.C59523ct;
import com.google.common.p4552o.p4553a.C59525cv;
import com.google.common.p4552o.p4553a.C59527cx;
import com.google.common.p4552o.p4553a.C59531da;
import com.google.common.p4552o.p4553a.C59532db;
import com.google.common.p4552o.p4553a.C59536df;
import com.google.common.p4552o.p4553a.C59539di;
import com.google.common.p4552o.p4553a.C59540dj;
import com.google.common.p4552o.p4553a.C59542dl;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p3186j$.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.logging.aw */
/* compiled from: PG */
public final class C112685aw implements C113389c {

    /* renamed from: a */
    public static final /* synthetic */ int f312348a = 0;

    /* renamed from: b */
    private static final C59071e f312349b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.logging.aw");

    /* renamed from: c */
    private static final C121537f f312350c = C121537f.m200840b("Tapas/TapasStateManager", C121511c.f337208a);

    /* renamed from: d */
    private final C112684av f312351d = new C112684av();

    /* renamed from: e */
    private final C68214a f312352e;

    /* renamed from: f */
    private final C113425ff f312353f;

    /* renamed from: g */
    private final C21370a f312354g;

    /* renamed from: h */
    private final C68214a f312355h;

    /* renamed from: i */
    private final C86124t f312356i;

    /* renamed from: j */
    private final C112698f f312357j;

    /* renamed from: k */
    private final C112687ay f312358k;

    public C112685aw(C68214a aVar, C113425ff ffVar, C21370a aVar2, C68214a aVar3, C86124t tVar, C112698f fVar, C112687ay ayVar) {
        this.f312352e = aVar;
        this.f312353f = ffVar;
        this.f312354g = aVar2;
        this.f312355h = aVar3;
        this.f312356i = tVar;
        this.f312357j = fVar;
        this.f312358k = ayVar;
        mo99634i();
    }

    /* renamed from: q */
    private final synchronized C59505cb m186477q() {
        C59501by byVar;
        byVar = (C59501by) C59505cb.f157884b.createBuilder();
        for (int i = 0; i < this.f312351d.f312346u.size(); i++) {
            C108253bx bxVar = (C108253bx) this.f312351d.f312346u.get(i);
            C59502bz bzVar = (C59502bz) C59504ca.f157878e.createBuilder();
            int i2 = bxVar.f301147e;
            bzVar.copyOnWrite();
            C59504ca caVar = (C59504ca) bzVar.instance;
            caVar.f157881b = i2 - 1;
            caVar.f157880a |= 1;
            bzVar.copyOnWrite();
            C59504ca caVar2 = (C59504ca) bzVar.instance;
            caVar2.f157880a |= 4;
            caVar2.f157883d = i;
            boolean z = bxVar.f301146d;
            bzVar.copyOnWrite();
            C59504ca caVar3 = (C59504ca) bzVar.instance;
            caVar3.f157880a |= 2;
            caVar3.f157882c = z;
            C59504ca caVar4 = (C59504ca) bzVar.build();
            byVar.copyOnWrite();
            C59505cb cbVar = (C59505cb) byVar.instance;
            caVar4.getClass();
            C62971cq cqVar = cbVar.f157886a;
            if (!cqVar.mo58948c()) {
                cbVar.f157886a = C62942bv.mutableCopy(cqVar);
            }
            cbVar.f157886a.add(caVar4);
        }
        return (C59505cb) byVar.build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0138, code lost:
        if (r2.f157901b.size() > 0) goto L_0x013a;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m186478r() {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.av r0 = r5.f312351d     // Catch:{ all -> 0x01a2 }
            j$.util.Optional r0 = r0.f312341p     // Catch:{ all -> 0x01a2 }
            boolean r0 = r0.isPresent()     // Catch:{ all -> 0x01a2 }
            if (r0 == 0) goto L_0x01a0
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01a2 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.av r0 = r5.f312351d     // Catch:{ all -> 0x01a2 }
            j$.util.Optional r0 = r0.f312341p     // Catch:{ all -> 0x01a2 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x01a2 }
            com.google.common.o.a.cs r0 = (com.google.common.p4552o.p4553a.C59522cs) r0     // Catch:{ all -> 0x01a2 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.av r1 = r5.f312351d     // Catch:{ all -> 0x01a2 }
            boolean r1 = r1.f312339n     // Catch:{ all -> 0x01a2 }
            r0.copyOnWrite()     // Catch:{ all -> 0x01a2 }
            com.google.protobuf.bv r2 = r0.instance     // Catch:{ all -> 0x01a2 }
            com.google.common.o.a.ct r2 = (com.google.common.p4552o.p4553a.C59523ct) r2     // Catch:{ all -> 0x01a2 }
            com.google.common.o.a.ct r3 = com.google.common.p4552o.p4553a.C59523ct.f157929n     // Catch:{ all -> 0x01a2 }
            int r3 = r2.f157931a     // Catch:{ all -> 0x01a2 }
            r3 = r3 | 64
            r2.f157931a = r3     // Catch:{ all -> 0x01a2 }
            r2.f157939i = r1     // Catch:{ all -> 0x01a2 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.av r1 = r5.f312351d     // Catch:{ all -> 0x01a2 }
            java.util.ArrayList r1 = r1.f312328c     // Catch:{ all -> 0x01a2 }
            r0.copyOnWrite()     // Catch:{ all -> 0x01a2 }
            com.google.protobuf.bv r2 = r0.instance     // Catch:{ all -> 0x01a2 }
            com.google.common.o.a.ct r2 = (com.google.common.p4552o.p4553a.C59523ct) r2     // Catch:{ all -> 0x01a2 }
            com.google.protobuf.cq r3 = r2.f157937g     // Catch:{ all -> 0x01a2 }
            boolean r4 = r3.mo58948c()     // Catch:{ all -> 0x01a2 }
            if (r4 != 0) goto L_0x0045
            com.google.protobuf.cq r3 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r3)     // Catch:{ all -> 0x01a2 }
            r2.f157937g = r3     // Catch:{ all -> 0x01a2 }
        L_0x0045:
            com.google.protobuf.cq r2 = r2.f157937g     // Catch:{ all -> 0x01a2 }
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r1, (java.util.List) r2)     // Catch:{ all -> 0x01a2 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.av r1 = r5.f312351d     // Catch:{ all -> 0x01a2 }
            java.util.ArrayList r1 = r1.f312326a     // Catch:{ all -> 0x01a2 }
            j$.util.stream.Stream r1 = p3186j$.util.Collection.EL.stream(r1)     // Catch:{ all -> 0x01a2 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.av r2 = r5.f312351d     // Catch:{ all -> 0x01a2 }
            java.util.HashMap r2 = r2.f312327b     // Catch:{ all -> 0x01a2 }
            p3186j$.util.Objects.requireNonNull(r2)     // Catch:{ all -> 0x01a2 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.ar r3 = new com.google.android.apps.gsa.staticplugins.opa.tapas.logging.ar     // Catch:{ all -> 0x01a2 }
            r3.<init>(r2)     // Catch:{ all -> 0x01a2 }
            j$.util.stream.Stream r1 = r1.map(r3)     // Catch:{ all -> 0x01a2 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.as r2 = com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112681as.f312323a     // Catch:{ all -> 0x01a2 }
            j$.util.stream.Stream r1 = r1.filter(r2)     // Catch:{ all -> 0x01a2 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.at r2 = com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112682at.f312324a     // Catch:{ all -> 0x01a2 }
            j$.util.stream.Stream r1 = r1.map(r2)     // Catch:{ all -> 0x01a2 }
            j$.util.stream.Collector r2 = p3186j$.util.stream.Collectors.toList()     // Catch:{ all -> 0x01a2 }
            java.lang.Object r1 = r1.collect(r2)     // Catch:{ all -> 0x01a2 }
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x01a2 }
            r0.copyOnWrite()     // Catch:{ all -> 0x01a2 }
            com.google.protobuf.bv r2 = r0.instance     // Catch:{ all -> 0x01a2 }
            com.google.common.o.a.ct r2 = (com.google.common.p4552o.p4553a.C59523ct) r2     // Catch:{ all -> 0x01a2 }
            com.google.protobuf.cq r3 = r2.f157935e     // Catch:{ all -> 0x01a2 }
            boolean r4 = r3.mo58948c()     // Catch:{ all -> 0x01a2 }
            if (r4 != 0) goto L_0x008d
            com.google.protobuf.cq r3 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r3)     // Catch:{ all -> 0x01a2 }
            r2.f157935e = r3     // Catch:{ all -> 0x01a2 }
        L_0x008d:
            com.google.protobuf.cq r2 = r2.f157935e     // Catch:{ all -> 0x01a2 }
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r1, (java.util.List) r2)     // Catch:{ all -> 0x01a2 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.av r1 = r5.f312351d     // Catch:{ all -> 0x01a2 }
            java.util.ArrayList r1 = r1.f312344s     // Catch:{ all -> 0x01a2 }
            r0.copyOnWrite()     // Catch:{ all -> 0x01a2 }
            com.google.protobuf.bv r2 = r0.instance     // Catch:{ all -> 0x01a2 }
            com.google.common.o.a.ct r2 = (com.google.common.p4552o.p4553a.C59523ct) r2     // Catch:{ all -> 0x01a2 }
            com.google.protobuf.cq r3 = r2.f157941k     // Catch:{ all -> 0x01a2 }
            boolean r4 = r3.mo58948c()     // Catch:{ all -> 0x01a2 }
            if (r4 != 0) goto L_0x00ab
            com.google.protobuf.cq r3 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r3)     // Catch:{ all -> 0x01a2 }
            r2.f157941k = r3     // Catch:{ all -> 0x01a2 }
        L_0x00ab:
            com.google.protobuf.cq r2 = r2.f157941k     // Catch:{ all -> 0x01a2 }
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r1, (java.util.List) r2)     // Catch:{ all -> 0x01a2 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.av r1 = r5.f312351d     // Catch:{ all -> 0x01a2 }
            java.util.ArrayList r1 = r1.f312345t     // Catch:{ all -> 0x01a2 }
            r0.copyOnWrite()     // Catch:{ all -> 0x01a2 }
            com.google.protobuf.bv r2 = r0.instance     // Catch:{ all -> 0x01a2 }
            com.google.common.o.a.ct r2 = (com.google.common.p4552o.p4553a.C59523ct) r2     // Catch:{ all -> 0x01a2 }
            com.google.protobuf.cq r3 = r2.f157942l     // Catch:{ all -> 0x01a2 }
            boolean r4 = r3.mo58948c()     // Catch:{ all -> 0x01a2 }
            if (r4 != 0) goto L_0x00c9
            com.google.protobuf.cq r3 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r3)     // Catch:{ all -> 0x01a2 }
            r2.f157942l = r3     // Catch:{ all -> 0x01a2 }
        L_0x00c9:
            com.google.protobuf.cq r2 = r2.f157942l     // Catch:{ all -> 0x01a2 }
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r1, (java.util.List) r2)     // Catch:{ all -> 0x01a2 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.av r1 = r5.f312351d     // Catch:{ all -> 0x01a2 }
            j$.util.Optional r1 = r1.f312336k     // Catch:{ all -> 0x01a2 }
            p3186j$.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x01a2 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.au r2 = new com.google.android.apps.gsa.staticplugins.opa.tapas.logging.au     // Catch:{ all -> 0x01a2 }
            r2.<init>(r0)     // Catch:{ all -> 0x01a2 }
            r1.ifPresent(r2)     // Catch:{ all -> 0x01a2 }
            com.google.common.o.a.cf r1 = com.google.common.p4552o.p4553a.C59509cf.f157898d     // Catch:{ all -> 0x01a2 }
            com.google.protobuf.bn r1 = r1.createBuilder()     // Catch:{ all -> 0x01a2 }
            com.google.common.o.a.cc r1 = (com.google.common.p4552o.p4553a.C59506cc) r1     // Catch:{ all -> 0x01a2 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.av r2 = r5.f312351d     // Catch:{ all -> 0x01a2 }
            java.util.ArrayList r2 = r2.f312329d     // Catch:{ all -> 0x01a2 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x01a2 }
            if (r2 != 0) goto L_0x0102
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.av r2 = r5.f312351d     // Catch:{ all -> 0x01a2 }
            java.util.ArrayList r2 = r2.f312329d     // Catch:{ all -> 0x01a2 }
            r1.copyOnWrite()     // Catch:{ all -> 0x01a2 }
            com.google.protobuf.bv r3 = r1.instance     // Catch:{ all -> 0x01a2 }
            com.google.common.o.a.cf r3 = (com.google.common.p4552o.p4553a.C59509cf) r3     // Catch:{ all -> 0x01a2 }
            r3.mo56971a()     // Catch:{ all -> 0x01a2 }
            com.google.protobuf.ch r3 = r3.f157901b     // Catch:{ all -> 0x01a2 }
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r2, (java.util.List) r3)     // Catch:{ all -> 0x01a2 }
        L_0x0102:
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.av r2 = r5.f312351d     // Catch:{ all -> 0x01a2 }
            j$.util.Optional r2 = r2.f312343r     // Catch:{ all -> 0x01a2 }
            boolean r2 = r2.isPresent()     // Catch:{ all -> 0x01a2 }
            if (r2 == 0) goto L_0x0127
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.av r2 = r5.f312351d     // Catch:{ all -> 0x01a2 }
            j$.util.Optional r2 = r2.f312343r     // Catch:{ all -> 0x01a2 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x01a2 }
            com.google.common.o.a.ce r2 = (com.google.common.p4552o.p4553a.C59508ce) r2     // Catch:{ all -> 0x01a2 }
            r1.copyOnWrite()     // Catch:{ all -> 0x01a2 }
            com.google.protobuf.bv r3 = r1.instance     // Catch:{ all -> 0x01a2 }
            com.google.common.o.a.cf r3 = (com.google.common.p4552o.p4553a.C59509cf) r3     // Catch:{ all -> 0x01a2 }
            int r2 = r2.f157897i     // Catch:{ all -> 0x01a2 }
            r3.f157902c = r2     // Catch:{ all -> 0x01a2 }
            int r2 = r3.f157900a     // Catch:{ all -> 0x01a2 }
            r2 = r2 | 1
            r3.f157900a = r2     // Catch:{ all -> 0x01a2 }
        L_0x0127:
            com.google.protobuf.bv r2 = r1.instance     // Catch:{ all -> 0x01a2 }
            com.google.common.o.a.cf r2 = (com.google.common.p4552o.p4553a.C59509cf) r2     // Catch:{ all -> 0x01a2 }
            int r3 = r2.f157900a     // Catch:{ all -> 0x01a2 }
            r3 = r3 & 1
            if (r3 == 0) goto L_0x0132
            goto L_0x013a
        L_0x0132:
            com.google.protobuf.ch r2 = r2.f157901b     // Catch:{ all -> 0x01a2 }
            int r2 = r2.size()     // Catch:{ all -> 0x01a2 }
            if (r2 <= 0) goto L_0x0152
        L_0x013a:
            com.google.protobuf.bv r1 = r1.build()     // Catch:{ all -> 0x01a2 }
            com.google.common.o.a.cf r1 = (com.google.common.p4552o.p4553a.C59509cf) r1     // Catch:{ all -> 0x01a2 }
            r0.copyOnWrite()     // Catch:{ all -> 0x01a2 }
            com.google.protobuf.bv r2 = r0.instance     // Catch:{ all -> 0x01a2 }
            com.google.common.o.a.ct r2 = (com.google.common.p4552o.p4553a.C59523ct) r2     // Catch:{ all -> 0x01a2 }
            r1.getClass()     // Catch:{ all -> 0x01a2 }
            r2.f157943m = r1     // Catch:{ all -> 0x01a2 }
            int r1 = r2.f157931a     // Catch:{ all -> 0x01a2 }
            r1 = r1 | 256(0x100, float:3.59E-43)
            r2.f157931a = r1     // Catch:{ all -> 0x01a2 }
        L_0x0152:
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.av r1 = r5.f312351d     // Catch:{ all -> 0x01a2 }
            java.util.ArrayList r1 = r1.f312340o     // Catch:{ all -> 0x01a2 }
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ all -> 0x01a2 }
            com.google.common.o.a.ct r0 = (com.google.common.p4552o.p4553a.C59523ct) r0     // Catch:{ all -> 0x01a2 }
            r1.add(r0)     // Catch:{ all -> 0x01a2 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.av r0 = r5.f312351d     // Catch:{ all -> 0x01a2 }
            j$.util.Optional r1 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x01a2 }
            r0.f312341p = r1     // Catch:{ all -> 0x01a2 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.av r0 = r5.f312351d     // Catch:{ all -> 0x01a2 }
            r1 = 0
            r0.f312339n = r1     // Catch:{ all -> 0x01a2 }
            java.util.ArrayList r0 = r0.f312328c     // Catch:{ all -> 0x01a2 }
            r0.clear()     // Catch:{ all -> 0x01a2 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.av r0 = r5.f312351d     // Catch:{ all -> 0x01a2 }
            java.util.ArrayList r0 = r0.f312329d     // Catch:{ all -> 0x01a2 }
            r0.clear()     // Catch:{ all -> 0x01a2 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.av r0 = r5.f312351d     // Catch:{ all -> 0x01a2 }
            java.util.ArrayList r0 = r0.f312344s     // Catch:{ all -> 0x01a2 }
            r0.clear()     // Catch:{ all -> 0x01a2 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.av r0 = r5.f312351d     // Catch:{ all -> 0x01a2 }
            java.util.ArrayList r0 = r0.f312345t     // Catch:{ all -> 0x01a2 }
            r0.clear()     // Catch:{ all -> 0x01a2 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.av r0 = r5.f312351d     // Catch:{ all -> 0x01a2 }
            j$.util.Optional r1 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x01a2 }
            r0.f312343r = r1     // Catch:{ all -> 0x01a2 }
            com.google.android.apps.gsa.search.core.i.t r0 = r5.f312356i     // Catch:{ all -> 0x01a2 }
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249600gb     // Catch:{ all -> 0x01a2 }
            boolean r0 = r0.mo79746e(r1)     // Catch:{ all -> 0x01a2 }
            if (r0 == 0) goto L_0x019b
            r5.m186479s()     // Catch:{ all -> 0x01a2 }
        L_0x019b:
            r5.mo99640o()     // Catch:{ all -> 0x01a2 }
            monitor-exit(r5)
            return
        L_0x01a0:
            monitor-exit(r5)
            return
        L_0x01a2:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112685aw.m186478r():void");
    }

    /* renamed from: s */
    private final synchronized void m186479s() {
        boolean z;
        C113050ay ayVar = (C113050ay) this.f312352e.mo27525b();
        if (ayVar.mo99830g()) {
            ArrayList arrayList = this.f312351d.f312326a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C113415ez ezVar = (C113415ez) arrayList.get(i);
                if (!this.f312351d.f312327b.containsKey(ezVar)) {
                    C59104x d = f312349b.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "TapasSessionState");
                    ((C59052c) ((C59052c) d).mo56372aa(27520)).mo56386p("Suggestion is present in the last suggestions list but not in the map");
                    z = false;
                } else {
                    z = ((C59527cx) ((C59525cv) this.f312351d.f312327b.get(ezVar)).instance).f157952d;
                }
                ayVar.mo99825b(ezVar, z);
            }
        }
    }

    /* renamed from: t */
    private final void m186480t(Optional optional) {
        if (this.f312356i.mo79746e(C90063do.f249600gb)) {
            C113050ay ayVar = (C113050ay) this.f312352e.mo27525b();
            ayVar.mo99826c();
            if (optional.isPresent()) {
                C60220t tVar = ((C60218r) optional.get()).f162928b;
                if (tVar == null) {
                    tVar = C60220t.f162931e;
                }
                ayVar.mo99828e(tVar.f162934b);
            }
            ayVar.mo99829f();
        }
    }

    /* renamed from: u */
    private final synchronized void m186481u(int i) {
        C58976aa aaVar = C58975e.f156826a;
        for (C59525cv cvVar : this.f312351d.f312327b.values()) {
            cvVar.copyOnWrite();
            C59527cx cxVar = (C59527cx) cvVar.instance;
            C59527cx cxVar2 = C59527cx.f157947n;
            cxVar.f157949a |= 8;
            cxVar.f157952d = false;
        }
        C59522cs csVar = (C59522cs) C59523ct.f157929n.createBuilder();
        int i2 = this.f312351d.f312338m;
        csVar.copyOnWrite();
        C59523ct ctVar = (C59523ct) csVar.instance;
        ctVar.f157931a |= 1;
        ctVar.f157932b = i2;
        int length = this.f312351d.f312335j.length();
        csVar.copyOnWrite();
        C59523ct ctVar2 = (C59523ct) csVar.instance;
        ctVar2.f157931a |= 2;
        ctVar2.f157933c = length;
        csVar.copyOnWrite();
        C59523ct ctVar3 = (C59523ct) csVar.instance;
        ctVar3.f157936f = i - 1;
        ctVar3.f157931a |= 8;
        if (this.f312356i.mo79746e(C90063do.f249600gb)) {
            C59542dl a = ((C113050ay) this.f312352e.mo27525b()).mo99824a();
            csVar.copyOnWrite();
            C59523ct ctVar4 = (C59523ct) csVar.instance;
            a.getClass();
            ctVar4.f157938h = a;
            ctVar4.f157931a |= 32;
        }
        long b = this.f312354g.mo26870b();
        long j = this.f312351d.f312347v;
        long j2 = j == 0 ? 0 : b - j;
        if (j2 > 0) {
            csVar.copyOnWrite();
            C59523ct ctVar5 = (C59523ct) csVar.instance;
            ctVar5.f157931a |= 128;
            ctVar5.f157940j = j2;
        }
        C112684av avVar = this.f312351d;
        avVar.f312347v = b;
        avVar.f312341p = Optional.m71637of(csVar);
        if (this.f312356i.mo79746e(C90063do.f249600gb)) {
            ((C113050ay) this.f312352e.mo27525b()).mo99831h(i, this.f312351d.f312335j);
        }
        this.f312351d.f312338m++;
    }

    /* JADX WARNING: type inference failed for: r2v23, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.common.p4552o.p4553a.C59529cz mo99626a() {
        /*
            r20 = this;
            r1 = r20
            monitor-enter(r20)
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x02e3 }
            com.google.common.o.a.cz r0 = com.google.common.p4552o.p4553a.C59529cz.f157963h     // Catch:{ all -> 0x02e3 }
            com.google.protobuf.bn r0 = r0.createBuilder()     // Catch:{ all -> 0x02e3 }
            com.google.common.o.a.cy r0 = (com.google.common.p4552o.p4553a.C59528cy) r0     // Catch:{ all -> 0x02e3 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.av r2 = r1.f312351d     // Catch:{ all -> 0x02e3 }
            long r2 = r2.f312337l     // Catch:{ all -> 0x02e3 }
            r0.copyOnWrite()     // Catch:{ all -> 0x02e3 }
            com.google.protobuf.bv r4 = r0.instance     // Catch:{ all -> 0x02e3 }
            com.google.common.o.a.cz r4 = (com.google.common.p4552o.p4553a.C59529cz) r4     // Catch:{ all -> 0x02e3 }
            int r5 = r4.f157965a     // Catch:{ all -> 0x02e3 }
            r6 = 1
            r5 = r5 | r6
            r4.f157965a = r5     // Catch:{ all -> 0x02e3 }
            r4.f157966b = r2     // Catch:{ all -> 0x02e3 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.av r2 = r1.f312351d     // Catch:{ all -> 0x02e3 }
            java.util.ArrayList r2 = r2.f312340o     // Catch:{ all -> 0x02e3 }
            r0.copyOnWrite()     // Catch:{ all -> 0x02e3 }
            com.google.protobuf.bv r3 = r0.instance     // Catch:{ all -> 0x02e3 }
            com.google.common.o.a.cz r3 = (com.google.common.p4552o.p4553a.C59529cz) r3     // Catch:{ all -> 0x02e3 }
            com.google.protobuf.cq r4 = r3.f157967c     // Catch:{ all -> 0x02e3 }
            boolean r5 = r4.mo58948c()     // Catch:{ all -> 0x02e3 }
            if (r5 != 0) goto L_0x0039
            com.google.protobuf.cq r4 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r4)     // Catch:{ all -> 0x02e3 }
            r3.f157967c = r4     // Catch:{ all -> 0x02e3 }
        L_0x0039:
            com.google.protobuf.cq r3 = r3.f157967c     // Catch:{ all -> 0x02e3 }
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r2, (java.util.List) r3)     // Catch:{ all -> 0x02e3 }
            com.google.common.o.a.dn r2 = com.google.common.p4552o.p4553a.C59544dn.f158002d     // Catch:{ all -> 0x02e3 }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ all -> 0x02e3 }
            com.google.common.o.a.dm r2 = (com.google.common.p4552o.p4553a.C59543dm) r2     // Catch:{ all -> 0x02e3 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.ay r3 = r1.f312358k     // Catch:{ all -> 0x02e3 }
            r4 = 7
            int r3 = r3.mo99643a(r4)     // Catch:{ all -> 0x02e3 }
            r2.copyOnWrite()     // Catch:{ all -> 0x02e3 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x02e3 }
            com.google.common.o.a.dn r4 = (com.google.common.p4552o.p4553a.C59544dn) r4     // Catch:{ all -> 0x02e3 }
            int r5 = r4.f158004a     // Catch:{ all -> 0x02e3 }
            r5 = r5 | r6
            r4.f158004a = r5     // Catch:{ all -> 0x02e3 }
            r4.f158005b = r3     // Catch:{ all -> 0x02e3 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.ay r3 = r1.f312358k     // Catch:{ all -> 0x02e3 }
            r4 = 30
            int r3 = r3.mo99643a(r4)     // Catch:{ all -> 0x02e3 }
            r2.copyOnWrite()     // Catch:{ all -> 0x02e3 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x02e3 }
            com.google.common.o.a.dn r4 = (com.google.common.p4552o.p4553a.C59544dn) r4     // Catch:{ all -> 0x02e3 }
            int r5 = r4.f158004a     // Catch:{ all -> 0x02e3 }
            r7 = 2
            r5 = r5 | r7
            r4.f158004a = r5     // Catch:{ all -> 0x02e3 }
            r4.f158006c = r3     // Catch:{ all -> 0x02e3 }
            r0.copyOnWrite()     // Catch:{ all -> 0x02e3 }
            com.google.protobuf.bv r3 = r0.instance     // Catch:{ all -> 0x02e3 }
            com.google.common.o.a.cz r3 = (com.google.common.p4552o.p4553a.C59529cz) r3     // Catch:{ all -> 0x02e3 }
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ all -> 0x02e3 }
            com.google.common.o.a.dn r2 = (com.google.common.p4552o.p4553a.C59544dn) r2     // Catch:{ all -> 0x02e3 }
            r2.getClass()     // Catch:{ all -> 0x02e3 }
            r3.f157970f = r2     // Catch:{ all -> 0x02e3 }
            int r2 = r3.f157965a     // Catch:{ all -> 0x02e3 }
            r2 = r2 | 8
            r3.f157965a = r2     // Catch:{ all -> 0x02e3 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.av r2 = r1.f312351d     // Catch:{ all -> 0x02e3 }
            java.util.ArrayList r2 = r2.f312334i     // Catch:{ all -> 0x02e3 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x02e3 }
            if (r2 != 0) goto L_0x00d2
            com.google.common.o.a.dg r2 = com.google.common.p4552o.p4553a.C59537dg.f157985b     // Catch:{ all -> 0x02e3 }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ all -> 0x02e3 }
            com.google.common.o.a.dc r2 = (com.google.common.p4552o.p4553a.C59533dc) r2     // Catch:{ all -> 0x02e3 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.av r3 = r1.f312351d     // Catch:{ all -> 0x02e3 }
            java.util.ArrayList r3 = r3.f312334i     // Catch:{ all -> 0x02e3 }
            r2.copyOnWrite()     // Catch:{ all -> 0x02e3 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x02e3 }
            com.google.common.o.a.dg r4 = (com.google.common.p4552o.p4553a.C59537dg) r4     // Catch:{ all -> 0x02e3 }
            com.google.protobuf.cq r5 = r4.f157987a     // Catch:{ all -> 0x02e3 }
            boolean r8 = r5.mo58948c()     // Catch:{ all -> 0x02e3 }
            if (r8 != 0) goto L_0x00b5
            com.google.protobuf.cq r5 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r5)     // Catch:{ all -> 0x02e3 }
            r4.f157987a = r5     // Catch:{ all -> 0x02e3 }
        L_0x00b5:
            com.google.protobuf.cq r4 = r4.f157987a     // Catch:{ all -> 0x02e3 }
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r3, (java.util.List) r4)     // Catch:{ all -> 0x02e3 }
            r0.copyOnWrite()     // Catch:{ all -> 0x02e3 }
            com.google.protobuf.bv r3 = r0.instance     // Catch:{ all -> 0x02e3 }
            com.google.common.o.a.cz r3 = (com.google.common.p4552o.p4553a.C59529cz) r3     // Catch:{ all -> 0x02e3 }
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ all -> 0x02e3 }
            com.google.common.o.a.dg r2 = (com.google.common.p4552o.p4553a.C59537dg) r2     // Catch:{ all -> 0x02e3 }
            r2.getClass()     // Catch:{ all -> 0x02e3 }
            r3.f157969e = r2     // Catch:{ all -> 0x02e3 }
            int r2 = r3.f157965a     // Catch:{ all -> 0x02e3 }
            r2 = r2 | 4
            r3.f157965a = r2     // Catch:{ all -> 0x02e3 }
        L_0x00d2:
            com.google.android.apps.gsa.search.core.i.t r2 = r1.f312356i     // Catch:{ all -> 0x02e3 }
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248215aB     // Catch:{ all -> 0x02e3 }
            boolean r2 = r2.mo79746e(r3)     // Catch:{ all -> 0x02e3 }
            if (r2 == 0) goto L_0x00f2
            com.google.common.o.a.cb r2 = r20.m186477q()     // Catch:{ all -> 0x02e3 }
            r0.copyOnWrite()     // Catch:{ all -> 0x02e3 }
            com.google.protobuf.bv r3 = r0.instance     // Catch:{ all -> 0x02e3 }
            com.google.common.o.a.cz r3 = (com.google.common.p4552o.p4553a.C59529cz) r3     // Catch:{ all -> 0x02e3 }
            r2.getClass()     // Catch:{ all -> 0x02e3 }
            r3.f157971g = r2     // Catch:{ all -> 0x02e3 }
            int r2 = r3.f157965a     // Catch:{ all -> 0x02e3 }
            r2 = r2 | 32
            r3.f157965a = r2     // Catch:{ all -> 0x02e3 }
        L_0x00f2:
            com.google.android.apps.gsa.search.core.i.t r2 = r1.f312356i     // Catch:{ all -> 0x02e3 }
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247740mp     // Catch:{ all -> 0x02e3 }
            boolean r2 = r2.mo79746e(r3)     // Catch:{ all -> 0x02e3 }
            if (r2 == 0) goto L_0x02db
            dagger.a r2 = r1.f312355h     // Catch:{ all -> 0x02e3 }
            java.lang.Object r2 = r2.mo27525b()     // Catch:{ all -> 0x02e3 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.ag r2 = (com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.C112312ag) r2     // Catch:{ all -> 0x02e3 }
            monitor-enter(r2)     // Catch:{ all -> 0x02e3 }
            j$.util.Optional r3 = r2.f311682n     // Catch:{ all -> 0x02d8 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x02d8 }
            if (r3 == 0) goto L_0x0112
            com.google.common.o.a.cr r3 = com.google.common.p4552o.p4553a.C59521cr.f157924d     // Catch:{ all -> 0x02d8 }
            monitor-exit(r2)     // Catch:{ all -> 0x02d8 }
            goto L_0x02c5
        L_0x0112:
            j$.util.Optional r3 = r2.f311682n     // Catch:{ all -> 0x02d8 }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x02d8 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.bi r3 = (com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.C112341bi) r3     // Catch:{ all -> 0x02d8 }
            monitor-exit(r2)     // Catch:{ all -> 0x02d8 }
            com.google.common.o.a.cr r4 = com.google.common.p4552o.p4553a.C59521cr.f157924d     // Catch:{ all -> 0x02e3 }
            com.google.protobuf.bn r4 = r4.createBuilder()     // Catch:{ all -> 0x02e3 }
            com.google.common.o.a.cp r4 = (com.google.common.p4552o.p4553a.C59519cp) r4     // Catch:{ all -> 0x02e3 }
            int r5 = r3.f180452f     // Catch:{ all -> 0x02e3 }
            r4.copyOnWrite()     // Catch:{ all -> 0x02e3 }
            com.google.protobuf.bv r8 = r4.instance     // Catch:{ all -> 0x02e3 }
            com.google.common.o.a.cr r8 = (com.google.common.p4552o.p4553a.C59521cr) r8     // Catch:{ all -> 0x02e3 }
            int r9 = r8.f157926a     // Catch:{ all -> 0x02e3 }
            r9 = r9 | r6
            r8.f157926a = r9     // Catch:{ all -> 0x02e3 }
            r8.f157927b = r5     // Catch:{ all -> 0x02e3 }
            java.util.List r3 = r3.f180453g     // Catch:{ all -> 0x02e3 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x02e3 }
        L_0x0139:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x02e3 }
            if (r5 == 0) goto L_0x02be
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x02e3 }
            com.google.research.a.e.k r5 = (com.google.research.p5181a.p5187e.C66361k) r5     // Catch:{ all -> 0x02e3 }
            boolean r8 = r5 instanceof com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.C112372f     // Catch:{ all -> 0x02e3 }
            if (r8 == 0) goto L_0x0139
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.f r5 = (com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.C112372f) r5     // Catch:{ all -> 0x02e3 }
            com.google.common.o.a.co r8 = com.google.common.p4552o.p4553a.C59518co.f157917e     // Catch:{ all -> 0x02e3 }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ all -> 0x02e3 }
            com.google.common.o.a.cn r8 = (com.google.common.p4552o.p4553a.C59517cn) r8     // Catch:{ all -> 0x02e3 }
            com.google.research.a.d.o r9 = r5.f180444k     // Catch:{ all -> 0x02e3 }
            int r9 = r9.f180408b     // Catch:{ all -> 0x02e3 }
            r8.copyOnWrite()     // Catch:{ all -> 0x02e3 }
            com.google.protobuf.bv r10 = r8.instance     // Catch:{ all -> 0x02e3 }
            com.google.common.o.a.co r10 = (com.google.common.p4552o.p4553a.C59518co) r10     // Catch:{ all -> 0x02e3 }
            int r11 = r10.f157919a     // Catch:{ all -> 0x02e3 }
            r11 = r11 | r6
            r10.f157919a = r11     // Catch:{ all -> 0x02e3 }
            r10.f157920b = r9     // Catch:{ all -> 0x02e3 }
            com.google.research.a.d.p r9 = r5.f180442i     // Catch:{ all -> 0x02e3 }
            java.util.List r9 = r9.f180412c     // Catch:{ all -> 0x02e3 }
            r10 = 0
            java.lang.Object r9 = r9.get(r10)     // Catch:{ all -> 0x02e3 }
            com.google.research.a.d.e r9 = (com.google.research.p5181a.p5186d.C66333e) r9     // Catch:{ all -> 0x02e3 }
            int r9 = r9.f180369j     // Catch:{ all -> 0x02e3 }
            r8.copyOnWrite()     // Catch:{ all -> 0x02e3 }
            com.google.protobuf.bv r11 = r8.instance     // Catch:{ all -> 0x02e3 }
            com.google.common.o.a.co r11 = (com.google.common.p4552o.p4553a.C59518co) r11     // Catch:{ all -> 0x02e3 }
            int r12 = r11.f157919a     // Catch:{ all -> 0x02e3 }
            r12 = r12 | r7
            r11.f157919a = r12     // Catch:{ all -> 0x02e3 }
            r11.f157921c = r9     // Catch:{ all -> 0x02e3 }
            com.google.android.apps.gsa.search.core.i.t r9 = r2.f311675g     // Catch:{ all -> 0x02e3 }
            com.google.android.apps.gsa.shared.m.d r11 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249546fa     // Catch:{ all -> 0x02e3 }
            boolean r9 = r9.mo79746e(r11)     // Catch:{ all -> 0x02e3 }
            if (r9 == 0) goto L_0x028b
            com.google.research.a.d.p r9 = r5.f180442i     // Catch:{ all -> 0x02e3 }
            java.util.List r9 = r9.f180412c     // Catch:{ all -> 0x02e3 }
            java.lang.Object r9 = r9.get(r10)     // Catch:{ all -> 0x02e3 }
            com.google.research.a.d.l r9 = (com.google.research.p5181a.p5186d.C66340l) r9     // Catch:{ all -> 0x02e3 }
            com.google.research.a.d.p r11 = r5.f180442i     // Catch:{ all -> 0x02e3 }
            com.google.research.a.d.o r9 = r9.mo59547o(r11)     // Catch:{ all -> 0x02e3 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x02e3 }
            r11.<init>()     // Catch:{ all -> 0x02e3 }
            com.google.research.a.c.g r12 = r5.f180443j     // Catch:{ all -> 0x02e3 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.a.c r12 = (com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.p8561a.C112299c) r12     // Catch:{ all -> 0x02e3 }
            r13 = 0
        L_0x01a4:
            int r14 = r9.f180407a     // Catch:{ all -> 0x02e3 }
            if (r13 >= r14) goto L_0x0254
            r14 = 0
            r6 = 0
        L_0x01ab:
            int r7 = r9.f180408b     // Catch:{ all -> 0x02e3 }
            if (r6 >= r7) goto L_0x01bc
            double r17 = r9.mo59550a(r10, r13, r6)     // Catch:{ all -> 0x02e3 }
            double r17 = java.lang.Math.abs(r17)     // Catch:{ all -> 0x02e3 }
            double r14 = r14 + r17
            int r6 = r6 + 1
            goto L_0x01ab
        L_0x01bc:
            java.util.List r6 = r12.f311638a     // Catch:{ all -> 0x02e3 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x02e3 }
            r7 = r13
        L_0x01c3:
            boolean r17 = r6.hasNext()     // Catch:{ all -> 0x02e3 }
            if (r17 == 0) goto L_0x01ff
            java.lang.Object r17 = r6.next()     // Catch:{ all -> 0x02e3 }
            com.google.research.a.c.g r17 = (com.google.research.p5181a.p5185c.C66316g) r17     // Catch:{ all -> 0x02e3 }
            int r10 = r17.mo59505a()     // Catch:{ all -> 0x02e3 }
            if (r7 >= r10) goto L_0x01f2
            java.util.Locale r6 = java.util.Locale.US     // Catch:{ all -> 0x02e3 }
            r19 = r3
            r10 = 2
            java.lang.Object[] r3 = new java.lang.Object[r10]     // Catch:{ all -> 0x02e3 }
            java.lang.String r10 = r17.mo59509d()     // Catch:{ all -> 0x02e3 }
            r18 = 0
            r3[r18] = r10     // Catch:{ all -> 0x02e3 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x02e3 }
            r10 = 1
            r3[r10] = r7     // Catch:{ all -> 0x02e3 }
            java.lang.String r7 = "%s[%d]"
            java.lang.String r3 = java.lang.String.format(r6, r7, r3)     // Catch:{ all -> 0x02e3 }
            goto L_0x0217
        L_0x01f2:
            r19 = r3
            r18 = 0
            int r3 = r17.mo59505a()     // Catch:{ all -> 0x02e3 }
            int r7 = r7 - r3
            r3 = r19
            r10 = 0
            goto L_0x01c3
        L_0x01ff:
            r19 = r3
            r18 = 0
            int r3 = r12.f311640c     // Catch:{ all -> 0x02e3 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x02e3 }
            r6.<init>()     // Catch:{ all -> 0x02e3 }
            java.lang.String r10 = "UNEXPECTED INDEX #"
            r6.append(r10)     // Catch:{ all -> 0x02e3 }
            int r7 = r7 + r3
            r6.append(r7)     // Catch:{ all -> 0x02e3 }
            java.lang.String r3 = r6.toString()     // Catch:{ all -> 0x02e3 }
        L_0x0217:
            com.google.common.o.a.ch r6 = com.google.common.p4552o.p4553a.C59511ch.f157903d     // Catch:{ all -> 0x02e3 }
            com.google.protobuf.bn r6 = r6.createBuilder()     // Catch:{ all -> 0x02e3 }
            com.google.common.o.a.cg r6 = (com.google.common.p4552o.p4553a.C59510cg) r6     // Catch:{ all -> 0x02e3 }
            r6.copyOnWrite()     // Catch:{ all -> 0x02e3 }
            com.google.protobuf.bv r7 = r6.instance     // Catch:{ all -> 0x02e3 }
            com.google.common.o.a.ch r7 = (com.google.common.p4552o.p4553a.C59511ch) r7     // Catch:{ all -> 0x02e3 }
            r3.getClass()     // Catch:{ all -> 0x02e3 }
            int r10 = r7.f157905a     // Catch:{ all -> 0x02e3 }
            r16 = 1
            r10 = r10 | 1
            r7.f157905a = r10     // Catch:{ all -> 0x02e3 }
            r7.f157906b = r3     // Catch:{ all -> 0x02e3 }
            r6.copyOnWrite()     // Catch:{ all -> 0x02e3 }
            com.google.protobuf.bv r3 = r6.instance     // Catch:{ all -> 0x02e3 }
            com.google.common.o.a.ch r3 = (com.google.common.p4552o.p4553a.C59511ch) r3     // Catch:{ all -> 0x02e3 }
            int r7 = r3.f157905a     // Catch:{ all -> 0x02e3 }
            r10 = 2
            r7 = r7 | r10
            r3.f157905a = r7     // Catch:{ all -> 0x02e3 }
            r3.f157907c = r14     // Catch:{ all -> 0x02e3 }
            com.google.protobuf.bv r3 = r6.build()     // Catch:{ all -> 0x02e3 }
            com.google.common.o.a.ch r3 = (com.google.common.p4552o.p4553a.C59511ch) r3     // Catch:{ all -> 0x02e3 }
            r11.add(r3)     // Catch:{ all -> 0x02e3 }
            int r13 = r13 + 1
            r3 = r19
            r6 = 1
            r7 = 2
            r10 = 0
            goto L_0x01a4
        L_0x0254:
            r19 = r3
            r16 = 1
            j$.util.stream.Stream r3 = p3186j$.util.Collection.EL.stream(r11)     // Catch:{ all -> 0x02e3 }
            java.util.Comparator r6 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.C112372f.f311800a     // Catch:{ all -> 0x02e3 }
            j$.util.stream.Stream r3 = r3.sorted(r6)     // Catch:{ all -> 0x02e3 }
            r6 = 25
            j$.util.stream.Stream r3 = r3.limit(r6)     // Catch:{ all -> 0x02e3 }
            j$.util.stream.Collector r6 = com.google.common.p4522b.C58370cn.f155946a     // Catch:{ all -> 0x02e3 }
            java.lang.Object r3 = r3.collect(r6)     // Catch:{ all -> 0x02e3 }
            com.google.common.b.gu r3 = (com.google.common.p4522b.C58485gu) r3     // Catch:{ all -> 0x02e3 }
            r8.copyOnWrite()     // Catch:{ all -> 0x02e3 }
            com.google.protobuf.bv r6 = r8.instance     // Catch:{ all -> 0x02e3 }
            com.google.common.o.a.co r6 = (com.google.common.p4552o.p4553a.C59518co) r6     // Catch:{ all -> 0x02e3 }
            com.google.protobuf.cq r7 = r6.f157922d     // Catch:{ all -> 0x02e3 }
            boolean r9 = r7.mo58948c()     // Catch:{ all -> 0x02e3 }
            if (r9 != 0) goto L_0x0285
            com.google.protobuf.cq r7 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r7)     // Catch:{ all -> 0x02e3 }
            r6.f157922d = r7     // Catch:{ all -> 0x02e3 }
        L_0x0285:
            com.google.protobuf.cq r6 = r6.f157922d     // Catch:{ all -> 0x02e3 }
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r3, (java.util.List) r6)     // Catch:{ all -> 0x02e3 }
            goto L_0x028f
        L_0x028b:
            r19 = r3
            r16 = 1
        L_0x028f:
            com.google.assistant.ad.d.b.ac r3 = r5.f311801b     // Catch:{ all -> 0x02e3 }
            int r3 = r3.f125803g     // Catch:{ all -> 0x02e3 }
            com.google.protobuf.bv r5 = r8.build()     // Catch:{ all -> 0x02e3 }
            com.google.common.o.a.co r5 = (com.google.common.p4552o.p4553a.C59518co) r5     // Catch:{ all -> 0x02e3 }
            r5.getClass()     // Catch:{ all -> 0x02e3 }
            r4.copyOnWrite()     // Catch:{ all -> 0x02e3 }
            com.google.protobuf.bv r6 = r4.instance     // Catch:{ all -> 0x02e3 }
            com.google.common.o.a.cr r6 = (com.google.common.p4552o.p4553a.C59521cr) r6     // Catch:{ all -> 0x02e3 }
            com.google.protobuf.dn r7 = r6.f157928c     // Catch:{ all -> 0x02e3 }
            boolean r8 = r7.f170058b     // Catch:{ all -> 0x02e3 }
            if (r8 != 0) goto L_0x02af
            com.google.protobuf.dn r7 = r7.mo58980a()     // Catch:{ all -> 0x02e3 }
            r6.f157928c = r7     // Catch:{ all -> 0x02e3 }
        L_0x02af:
            com.google.protobuf.dn r6 = r6.f157928c     // Catch:{ all -> 0x02e3 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x02e3 }
            r6.put(r3, r5)     // Catch:{ all -> 0x02e3 }
            r3 = r19
            r6 = 1
            r7 = 2
            goto L_0x0139
        L_0x02be:
            com.google.protobuf.bv r2 = r4.build()     // Catch:{ all -> 0x02e3 }
            r3 = r2
            com.google.common.o.a.cr r3 = (com.google.common.p4552o.p4553a.C59521cr) r3     // Catch:{ all -> 0x02e3 }
        L_0x02c5:
            r0.copyOnWrite()     // Catch:{ all -> 0x02e3 }
            com.google.protobuf.bv r2 = r0.instance     // Catch:{ all -> 0x02e3 }
            com.google.common.o.a.cz r2 = (com.google.common.p4552o.p4553a.C59529cz) r2     // Catch:{ all -> 0x02e3 }
            r3.getClass()     // Catch:{ all -> 0x02e3 }
            r2.f157968d = r3     // Catch:{ all -> 0x02e3 }
            int r3 = r2.f157965a     // Catch:{ all -> 0x02e3 }
            r4 = 2
            r3 = r3 | r4
            r2.f157965a = r3     // Catch:{ all -> 0x02e3 }
            goto L_0x02db
        L_0x02d8:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x02d8 }
            throw r0     // Catch:{ all -> 0x02e3 }
        L_0x02db:
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ all -> 0x02e3 }
            com.google.common.o.a.cz r0 = (com.google.common.p4552o.p4553a.C59529cz) r0     // Catch:{ all -> 0x02e3 }
            monitor-exit(r20)
            return r0
        L_0x02e3:
            r0 = move-exception
            monitor-exit(r20)
            goto L_0x02e7
        L_0x02e6:
            throw r0
        L_0x02e7:
            goto L_0x02e6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112685aw.mo99626a():com.google.common.o.a.cz");
    }

    /* renamed from: b */
    public final synchronized String mo99627b() {
        return this.f312351d.f312335j;
    }

    /* renamed from: c */
    public final synchronized void mo99628c(C59536df dfVar) {
        this.f312351d.f312334i.add(dfVar);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:36|37|56) */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r0 = f312349b.mo56226d();
        r0.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "TapasSessionState");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(27518)).mo56386p("Could not parse  GellerResponseContext");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d3, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x009a */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo99629d(com.google.android.apps.gsa.search.shared.service.ServiceEventData r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.Class<com.google.android.apps.gsa.shared.search.Query> r0 = com.google.android.apps.gsa.shared.search.Query.class
            boolean r0 = r4.mo81913d(r0)     // Catch:{ all -> 0x00d4 }
            if (r0 == 0) goto L_0x00d2
            java.lang.Class<com.google.android.apps.gsa.shared.search.Query> r0 = com.google.android.apps.gsa.shared.search.Query.class
            android.os.Parcelable r0 = r4.mo81912b(r0)     // Catch:{ all -> 0x00d4 }
            com.google.android.apps.gsa.shared.search.Query r0 = (com.google.android.apps.gsa.shared.search.Query) r0     // Catch:{ all -> 0x00d4 }
            java.lang.String r1 = "android.opa.extra.TRIGGERED_BY"
            int r0 = r0.mo84263a(r1)     // Catch:{ all -> 0x00d4 }
            com.google.android.apps.gsa.assistant.shared.l.e r1 = com.google.android.apps.gsa.assistant.shared.l.e.O     // Catch:{ all -> 0x00d4 }
            int r1 = r1.ca     // Catch:{ all -> 0x00d4 }
            if (r0 != r1) goto L_0x00d2
            com.google.protobuf.bt r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88041mz.f238074a     // Catch:{ all -> 0x00d4 }
            com.google.android.apps.gsa.search.shared.service.b.uo r1 = r4.f236959a     // Catch:{ all -> 0x00d4 }
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)     // Catch:{ all -> 0x00d4 }
            r1.mo58887l(r0)     // Catch:{ all -> 0x00d4 }
            com.google.protobuf.bf r1 = r1.f169962ag     // Catch:{ all -> 0x00d4 }
            com.google.protobuf.bs r0 = r0.f169971d     // Catch:{ all -> 0x00d4 }
            boolean r0 = r1.mo58857o(r0)     // Catch:{ all -> 0x00d4 }
            if (r0 != 0) goto L_0x0034
            goto L_0x00d2
        L_0x0034:
            com.google.protobuf.bt r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88041mz.f238074a     // Catch:{ all -> 0x00d4 }
            java.lang.Object r4 = r4.mo81918e(r0)     // Catch:{ all -> 0x00d4 }
            com.google.android.apps.gsa.search.shared.service.b.nb r4 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88044nb) r4     // Catch:{ all -> 0x00d4 }
            com.google.assistant.e.e.a.j r4 = r4.f238078b     // Catch:{ all -> 0x00d4 }
            if (r4 != 0) goto L_0x0042
            com.google.assistant.e.e.a.j r4 = com.google.assistant.p3897e.p3910e.p3911a.C51195j.f133264n     // Catch:{ all -> 0x00d4 }
        L_0x0042:
            int r0 = r4.f133266a     // Catch:{ all -> 0x00d4 }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0055
            com.google.assistant.e.j.en r4 = r4.f133275j     // Catch:{ all -> 0x00d4 }
            if (r4 != 0) goto L_0x004e
            com.google.assistant.e.j.en r4 = com.google.assistant.p3897e.p3921j.C52081en.f136679i     // Catch:{ all -> 0x00d4 }
        L_0x004e:
            com.google.assistant.e.j.ex r4 = r4.f136685e     // Catch:{ all -> 0x00d4 }
            if (r4 != 0) goto L_0x005b
            com.google.assistant.e.j.ex r4 = com.google.assistant.p3897e.p3921j.C52091ex.f136710b     // Catch:{ all -> 0x00d4 }
            goto L_0x005b
        L_0x0055:
            com.google.assistant.e.j.ex r4 = r4.f133273h     // Catch:{ all -> 0x00d4 }
            if (r4 != 0) goto L_0x005b
            com.google.assistant.e.j.ex r4 = com.google.assistant.p3897e.p3921j.C52091ex.f136710b     // Catch:{ all -> 0x00d4 }
        L_0x005b:
            com.google.protobuf.cq r4 = r4.f136712a     // Catch:{ all -> 0x00d4 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00d4 }
        L_0x0061:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x00d4 }
            if (r0 == 0) goto L_0x00af
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x00d4 }
            com.google.assistant.e.j.kc r0 = (com.google.assistant.p3897e.p3921j.C52232kc) r0     // Catch:{ all -> 0x00d4 }
            java.lang.String r1 = r0.f137065b     // Catch:{ all -> 0x00d4 }
            java.lang.String r2 = "asst.geller.response.context.params"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x00d4 }
            if (r1 == 0) goto L_0x0061
            com.google.assistant.e.j.ka r0 = r0.f137066c     // Catch:{ ct -> 0x009a }
            if (r0 != 0) goto L_0x007d
            com.google.assistant.e.j.ka r0 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d     // Catch:{ ct -> 0x009a }
        L_0x007d:
            com.google.protobuf.z r0 = r0.f137061c     // Catch:{ ct -> 0x009a }
            com.google.protobuf.ba r1 = com.google.protobuf.C62921ba.f169869a     // Catch:{ ct -> 0x009a }
            com.google.assistant.e.i.a.gw r2 = com.google.assistant.p3897e.p3917i.p3918a.C51415gw.f133920c     // Catch:{ ct -> 0x009a }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r2, (com.google.protobuf.C63088z) r0, (com.google.protobuf.C62921ba) r1)     // Catch:{ ct -> 0x009a }
            com.google.assistant.e.i.a.gw r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51415gw) r0     // Catch:{ ct -> 0x009a }
            int r1 = r0.f133922a     // Catch:{ ct -> 0x009a }
            r1 = r1 & 2
            if (r1 == 0) goto L_0x0061
            long r0 = r0.f133923b     // Catch:{ ct -> 0x009a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ ct -> 0x009a }
            j$.util.Optional r4 = p3186j$.util.Optional.m71637of(r0)     // Catch:{ ct -> 0x009a }
            goto L_0x00b3
        L_0x009a:
            com.google.common.f.e r0 = f312349b     // Catch:{ all -> 0x00d4 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x00d4 }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00d4 }
            java.lang.String r2 = "TapasSessionState"
            r0.mo56378ag(r1, r2)     // Catch:{ all -> 0x00d4 }
            java.lang.String r1 = "Could not parse  GellerResponseContext"
            r2 = 27518(0x6b7e, float:3.8561E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)     // Catch:{ all -> 0x00d4 }
            goto L_0x0061
        L_0x00af:
            j$.util.Optional r4 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x00d4 }
        L_0x00b3:
            boolean r0 = r4.isPresent()     // Catch:{ all -> 0x00d4 }
            if (r0 == 0) goto L_0x00d0
            dagger.a r0 = r3.f312352e     // Catch:{ all -> 0x00d4 }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ all -> 0x00d4 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.p.ay r0 = (com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p.C113050ay) r0     // Catch:{ all -> 0x00d4 }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x00d4 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ all -> 0x00d4 }
            long r1 = r4.longValue()     // Catch:{ all -> 0x00d4 }
            r0.mo99828e(r1)     // Catch:{ all -> 0x00d4 }
            monitor-exit(r3)
            return
        L_0x00d0:
            monitor-exit(r3)
            return
        L_0x00d2:
            monitor-exit(r3)
            return
        L_0x00d4:
            r4 = move-exception
            monitor-exit(r3)
            goto L_0x00d8
        L_0x00d7:
            throw r4
        L_0x00d8:
            goto L_0x00d7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112685aw.mo99629d(com.google.android.apps.gsa.search.shared.service.ServiceEventData):void");
    }

    /* renamed from: e */
    public final synchronized void mo99630e(long j, String str) {
        C58976aa aaVar = C58975e.f156826a;
        C59531da daVar = (C59531da) C59532db.f157973d.createBuilder();
        daVar.copyOnWrite();
        C59532db dbVar = (C59532db) daVar.instance;
        dbVar.f157975a |= 1;
        dbVar.f157976b = str;
        long b = this.f312354g.mo26870b();
        daVar.copyOnWrite();
        C59532db dbVar2 = (C59532db) daVar.instance;
        dbVar2.f157975a |= 2;
        dbVar2.f157977c = b;
        Map map = this.f312351d.f312330e;
        Long valueOf = Long.valueOf(j);
        List list = (List) Map.EL.getOrDefault(map, valueOf, new ArrayList());
        list.add((C59532db) daVar.build());
        this.f312351d.f312330e.put(valueOf, list);
    }

    /* renamed from: f */
    public final synchronized void mo99631f(long j, C48672ag agVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f312351d.f312331f.put(new C112662a(Long.valueOf(j), agVar), Long.valueOf(this.f312354g.mo26870b()));
    }

    /* renamed from: g */
    public final synchronized void mo99632g(List list) {
        this.f312351d.f312346u.addAll(list);
    }

    /* renamed from: h */
    public final synchronized void mo99633h(Optional optional) {
        ArrayList arrayList = this.f312351d.f312346u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C108253bx bxVar = (C108253bx) arrayList.get(i);
            if (optional.isPresent() && bxVar.f301143a.equals(optional.get())) {
                bxVar.f301146d = true;
            } else if (this.f312356i.mo79746e(C90029ch.f248255ap) && optional.isPresent() && bxVar.f301145c.f135317b.equals(optional.get())) {
                bxVar.f301146d = true;
            }
        }
    }

    /* renamed from: i */
    public final synchronized void mo99634i() {
        this.f312351d.f312337l = C90719ac.f253778a.f253779b.nextLong();
        C112684av avVar = this.f312351d;
        avVar.f312338m = 0;
        avVar.f312336k = Optional.empty();
        this.f312351d.f312340o = new ArrayList();
        this.f312351d.f312342q = new ArrayList();
        this.f312351d.f312344s = new ArrayList();
        this.f312351d.f312346u = new ArrayList();
        this.f312351d.f312345t = new ArrayList();
        this.f312351d.f312330e.clear();
        this.f312351d.f312332g.clear();
        this.f312351d.f312331f.clear();
        this.f312351d.f312333h.clear();
        m186481u(2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x011b, code lost:
        if ((r3 & 2) != 0) goto L_0x011d;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo99635j(com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es r9, p3186j$.util.Optional r10, com.google.common.p4552o.p4553a.C59514ck r11, com.google.common.p4552o.p4553a.C59509cf r12, java.util.List r13) {
        /*
            r8 = this;
            monitor-enter(r8)
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x019a }
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.av r0 = r8.f312351d     // Catch:{ all -> 0x019a }
            r0.f312336k = r10     // Catch:{ all -> 0x019a }
            java.util.ArrayList r10 = r0.f312326a     // Catch:{ all -> 0x019a }
            r10.clear()     // Catch:{ all -> 0x019a }
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.av r10 = r8.f312351d     // Catch:{ all -> 0x019a }
            java.util.HashMap r10 = r10.f312327b     // Catch:{ all -> 0x019a }
            r10.clear()     // Catch:{ all -> 0x019a }
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.av r10 = r8.f312351d     // Catch:{ all -> 0x019a }
            java.util.ArrayList r10 = r10.f312328c     // Catch:{ all -> 0x019a }
            r10.add(r11)     // Catch:{ all -> 0x019a }
            com.google.protobuf.ch r10 = r12.f157901b     // Catch:{ all -> 0x019a }
            int r10 = r10.size()     // Catch:{ all -> 0x019a }
            r11 = 0
            r0 = 1
            if (r10 <= 0) goto L_0x004a
            com.google.protobuf.ch r10 = r12.f157901b     // Catch:{ all -> 0x019a }
            int r10 = r10.size()     // Catch:{ all -> 0x019a }
            if (r10 <= r0) goto L_0x0040
            com.google.common.f.e r10 = f312349b     // Catch:{ all -> 0x019a }
            com.google.common.f.x r10 = r10.mo56226d()     // Catch:{ all -> 0x019a }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x019a }
            java.lang.String r2 = "TapasSessionState"
            r10.mo56378ag(r1, r2)     // Catch:{ all -> 0x019a }
            java.lang.String r1 = "Unexpected, ranking model version count > 1"
            r2 = 27526(0x6b86, float:3.8572E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r2)).mo56386p(r1)     // Catch:{ all -> 0x019a }
        L_0x0040:
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.av r10 = r8.f312351d     // Catch:{ all -> 0x019a }
            java.util.ArrayList r10 = r10.f312329d     // Catch:{ all -> 0x019a }
            com.google.protobuf.ch r1 = r12.f157901b     // Catch:{ all -> 0x019a }
            r10.addAll(r1)     // Catch:{ all -> 0x019a }
            goto L_0x0055
        L_0x004a:
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.av r10 = r8.f312351d     // Catch:{ all -> 0x019a }
            java.util.ArrayList r10 = r10.f312329d     // Catch:{ all -> 0x019a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x019a }
            r10.add(r1)     // Catch:{ all -> 0x019a }
        L_0x0055:
            int r10 = r12.f157900a     // Catch:{ all -> 0x019a }
            r10 = r10 & r0
            if (r10 == 0) goto L_0x006c
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.av r10 = r8.f312351d     // Catch:{ all -> 0x019a }
            int r12 = r12.f157902c     // Catch:{ all -> 0x019a }
            com.google.common.o.a.ce r12 = com.google.common.p4552o.p4553a.C59508ce.m92362a(r12)     // Catch:{ all -> 0x019a }
            if (r12 != 0) goto L_0x0066
            com.google.common.o.a.ce r12 = com.google.common.p4552o.p4553a.C59508ce.UNSPECIFIED_STATE     // Catch:{ all -> 0x019a }
        L_0x0066:
            j$.util.Optional r12 = p3186j$.util.Optional.m71637of(r12)     // Catch:{ all -> 0x019a }
            r10.f312343r = r12     // Catch:{ all -> 0x019a }
        L_0x006c:
            java.util.Iterator r10 = r13.iterator()     // Catch:{ all -> 0x019a }
        L_0x0070:
            boolean r12 = r10.hasNext()     // Catch:{ all -> 0x019a }
            if (r12 == 0) goto L_0x0154
            java.lang.Object r12 = r10.next()     // Catch:{ all -> 0x019a }
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.co r12 = (com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113344co) r12     // Catch:{ all -> 0x019a }
            r13 = 0
        L_0x007d:
            java.util.List r1 = r12.f313868b     // Catch:{ all -> 0x019a }
            int r1 = r1.size()     // Catch:{ all -> 0x019a }
            if (r13 >= r1) goto L_0x0070
            java.util.List r1 = r12.f313868b     // Catch:{ all -> 0x019a }
            java.lang.Object r1 = r1.get(r13)     // Catch:{ all -> 0x019a }
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ez r1 = (com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez) r1     // Catch:{ all -> 0x019a }
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.f r2 = r8.f312357j     // Catch:{ all -> 0x019a }
            com.google.common.o.a.cx r2 = r2.mo99664a(r1, r13)     // Catch:{ all -> 0x019a }
            com.google.protobuf.bn r2 = r2.toBuilder()     // Catch:{ all -> 0x019a }
            com.google.common.o.a.cv r2 = (com.google.common.p4552o.p4553a.C59525cv) r2     // Catch:{ all -> 0x019a }
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ff r3 = r8.f312353f     // Catch:{ all -> 0x019a }
            boolean r3 = r3.mo100139e()     // Catch:{ all -> 0x019a }
            if (r3 == 0) goto L_0x012f
            j$.util.Optional r3 = r1.mo100218r()     // Catch:{ all -> 0x019a }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x019a }
            if (r3 == 0) goto L_0x00ad
            goto L_0x012f
        L_0x00ad:
            j$.util.Optional r3 = r1.mo100218r()     // Catch:{ all -> 0x019a }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x019a }
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.n r3 = (com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113502n) r3     // Catch:{ all -> 0x019a }
            com.google.common.o.a.bq r4 = com.google.common.p4552o.p4553a.C59493bq.f157853d     // Catch:{ all -> 0x019a }
            com.google.protobuf.bn r4 = r4.createBuilder()     // Catch:{ all -> 0x019a }
            com.google.common.o.a.bp r4 = (com.google.common.p4552o.p4553a.C59492bp) r4     // Catch:{ all -> 0x019a }
            j$.util.Optional r5 = r3.mo100047j()     // Catch:{ all -> 0x019a }
            boolean r5 = r5.isPresent()     // Catch:{ all -> 0x019a }
            if (r5 == 0) goto L_0x00e4
            j$.util.Optional r5 = r3.mo100047j()     // Catch:{ all -> 0x019a }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x019a }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x019a }
            r4.copyOnWrite()     // Catch:{ all -> 0x019a }
            com.google.protobuf.bv r6 = r4.instance     // Catch:{ all -> 0x019a }
            com.google.common.o.a.bq r6 = (com.google.common.p4552o.p4553a.C59493bq) r6     // Catch:{ all -> 0x019a }
            r5.getClass()     // Catch:{ all -> 0x019a }
            int r7 = r6.f157856a     // Catch:{ all -> 0x019a }
            r7 = r7 | r0
            r6.f157856a = r7     // Catch:{ all -> 0x019a }
            r6.f157857b = r5     // Catch:{ all -> 0x019a }
        L_0x00e4:
            j$.util.Optional r5 = r3.mo100042f()     // Catch:{ all -> 0x019a }
            boolean r5 = r5.isPresent()     // Catch:{ all -> 0x019a }
            if (r5 == 0) goto L_0x010e
            j$.util.Optional r3 = r3.mo100042f()     // Catch:{ all -> 0x019a }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x019a }
            com.google.assistant.ad.d.b r3 = (com.google.assistant.p3781ad.p3789d.C48582b) r3     // Catch:{ all -> 0x019a }
            java.lang.String r3 = r3.name()     // Catch:{ all -> 0x019a }
            r4.copyOnWrite()     // Catch:{ all -> 0x019a }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ all -> 0x019a }
            com.google.common.o.a.bq r5 = (com.google.common.p4552o.p4553a.C59493bq) r5     // Catch:{ all -> 0x019a }
            r3.getClass()     // Catch:{ all -> 0x019a }
            int r6 = r5.f157856a     // Catch:{ all -> 0x019a }
            r6 = r6 | 2
            r5.f157856a = r6     // Catch:{ all -> 0x019a }
            r5.f157858c = r3     // Catch:{ all -> 0x019a }
        L_0x010e:
            com.google.protobuf.bv r3 = r4.instance     // Catch:{ all -> 0x019a }
            com.google.common.o.a.bq r3 = (com.google.common.p4552o.p4553a.C59493bq) r3     // Catch:{ all -> 0x019a }
            int r3 = r3.f157856a     // Catch:{ all -> 0x019a }
            r5 = r3 & 1
            if (r5 == 0) goto L_0x0119
            goto L_0x011d
        L_0x0119:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x0128
        L_0x011d:
            com.google.protobuf.bt r3 = com.google.common.p4552o.p4553a.C59493bq.f157854e     // Catch:{ all -> 0x019a }
            com.google.protobuf.bv r4 = r4.build()     // Catch:{ all -> 0x019a }
            com.google.common.o.a.bq r4 = (com.google.common.p4552o.p4553a.C59493bq) r4     // Catch:{ all -> 0x019a }
            r2.mo58885m(r3, r4)     // Catch:{ all -> 0x019a }
        L_0x0128:
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ all -> 0x019a }
            com.google.common.o.a.cx r2 = (com.google.common.p4552o.p4553a.C59527cx) r2     // Catch:{ all -> 0x019a }
            goto L_0x0135
        L_0x012f:
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ all -> 0x019a }
            com.google.common.o.a.cx r2 = (com.google.common.p4552o.p4553a.C59527cx) r2     // Catch:{ all -> 0x019a }
        L_0x0135:
            com.google.protobuf.bn r2 = r2.toBuilder()     // Catch:{ all -> 0x019a }
            com.google.common.o.a.cv r2 = (com.google.common.p4552o.p4553a.C59525cv) r2     // Catch:{ all -> 0x019a }
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.av r3 = r8.f312351d     // Catch:{ all -> 0x019a }
            java.util.HashMap r3 = r3.f312327b     // Catch:{ all -> 0x019a }
            r3.put(r1, r2)     // Catch:{ all -> 0x019a }
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.av r2 = r8.f312351d     // Catch:{ all -> 0x019a }
            java.util.ArrayList r2 = r2.f312326a     // Catch:{ all -> 0x019a }
            r2.add(r1)     // Catch:{ all -> 0x019a }
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.av r2 = r8.f312351d     // Catch:{ all -> 0x019a }
            java.util.ArrayList r2 = r2.f312342q     // Catch:{ all -> 0x019a }
            r2.add(r1)     // Catch:{ all -> 0x019a }
            int r13 = r13 + 1
            goto L_0x007d
        L_0x0154:
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ep r9 = r9.mo100118a()     // Catch:{ all -> 0x019a }
            long r9 = r9.mo100016a()     // Catch:{ all -> 0x019a }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x019a }
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.av r10 = r8.f312351d     // Catch:{ all -> 0x019a }
            java.util.ArrayList r11 = r10.f312345t     // Catch:{ all -> 0x019a }
            java.util.Map r10 = r10.f312330e     // Catch:{ all -> 0x019a }
            com.google.common.b.gu r12 = com.google.common.p4522b.C58485gu.m89845m()     // Catch:{ all -> 0x019a }
            java.lang.Object r10 = p3186j$.util.Map.EL.getOrDefault(r10, r9, r12)     // Catch:{ all -> 0x019a }
            java.util.Collection r10 = (java.util.Collection) r10     // Catch:{ all -> 0x019a }
            r11.addAll(r10)     // Catch:{ all -> 0x019a }
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.av r10 = r8.f312351d     // Catch:{ all -> 0x019a }
            java.util.ArrayList r11 = r10.f312344s     // Catch:{ all -> 0x019a }
            java.util.Map r10 = r10.f312333h     // Catch:{ all -> 0x019a }
            com.google.common.b.gu r12 = com.google.common.p4522b.C58485gu.m89845m()     // Catch:{ all -> 0x019a }
            java.lang.Object r10 = p3186j$.util.Map.EL.getOrDefault(r10, r9, r12)     // Catch:{ all -> 0x019a }
            java.util.Collection r10 = (java.util.Collection) r10     // Catch:{ all -> 0x019a }
            r11.addAll(r10)     // Catch:{ all -> 0x019a }
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.av r10 = r8.f312351d     // Catch:{ all -> 0x019a }
            java.util.Map r10 = r10.f312330e     // Catch:{ all -> 0x019a }
            r10.remove(r9)     // Catch:{ all -> 0x019a }
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.av r10 = r8.f312351d     // Catch:{ all -> 0x019a }
            java.util.Map r10 = r10.f312333h     // Catch:{ all -> 0x019a }
            r10.remove(r9)     // Catch:{ all -> 0x019a }
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.av r9 = r8.f312351d     // Catch:{ all -> 0x019a }
            r9.f312339n = r0     // Catch:{ all -> 0x019a }
            monitor-exit(r8)
            return
        L_0x019a:
            r9 = move-exception
            monitor-exit(r8)
            goto L_0x019e
        L_0x019d:
            throw r9
        L_0x019e:
            goto L_0x019d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112685aw.mo99635j(com.google.android.apps.gsa.staticplugins.opa.tapas.shared.es, j$.util.Optional, com.google.common.o.a.ck, com.google.common.o.a.cf, java.util.List):void");
    }

    /* renamed from: k */
    public final synchronized void mo99636k(C113415ez ezVar, Optional optional) {
        C58976aa aaVar = C58975e.f156826a;
        m186478r();
        m186481u(7);
        C59525cv cvVar = (C59525cv) this.f312351d.f312327b.get(ezVar);
        if (cvVar != null) {
            cvVar.copyOnWrite();
            C59527cx cxVar = (C59527cx) cvVar.instance;
            C59527cx cxVar2 = C59527cx.f157947n;
            cxVar.f157949a |= 8;
            cxVar.f157952d = true;
        } else {
            C59104x d = f312349b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TapasSessionState");
            ((C59052c) ((C59052c) d).mo56372aa(27529)).mo56386p("Unable to find Attention target from previously loaded suggestions.");
        }
        m186478r();
        m186480t(optional);
    }

    /* renamed from: l */
    public final synchronized void mo99637l() {
        C58976aa aaVar = C58975e.f156826a;
        m186478r();
        m186481u(8);
        m186478r();
    }

    /* renamed from: m */
    public final synchronized void mo99638m(C113415ez ezVar, Optional optional) {
        C58976aa aaVar = C58975e.f156826a;
        m186478r();
        m186481u(5);
        C59525cv cvVar = (C59525cv) this.f312351d.f312327b.get(ezVar);
        if (cvVar != null) {
            cvVar.copyOnWrite();
            C59527cx cxVar = (C59527cx) cvVar.instance;
            C59527cx cxVar2 = C59527cx.f157947n;
            cxVar.f157949a |= 8;
            cxVar.f157952d = true;
        } else {
            C59104x d = f312349b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TapasSessionState");
            ((C59052c) ((C59052c) d).mo56372aa(27532)).mo56386p("Unable to find TAP target from previously loaded suggestions.");
        }
        m186478r();
        m186480t(optional);
    }

    /* renamed from: n */
    public final synchronized void mo99639n(String str, int i, int i2) {
        C58976aa aaVar = C58975e.f156826a;
        if (!str.equals(this.f312351d.f312335j)) {
            m186478r();
            int i3 = 1;
            if (i2 - i == 1) {
                i3 = 3;
            } else if (i2 > 0) {
                i3 = 4;
            } else if (i <= 0 || i2 != 0) {
                C59104x d = f312349b.mo56226d();
                d.mo56378ag(C58975e.f156826a, "TapasSessionState");
                ((C59052c) ((C59052c) d).mo56372aa(27534)).mo56393w("Unexpected before / count combination. Before: %d, Count: %d", i, i2);
            } else {
                i3 = 6;
            }
            this.f312351d.f312335j = str;
            m186481u(i3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final synchronized void mo99640o() {
        C58976aa aaVar = C58975e.f156826a;
        ArrayList arrayList = this.f312351d.f312326a;
        int size = arrayList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            z |= C58890d.m90990e(((C113415ez) arrayList.get(i)).mo100199L(), this.f312351d.f312335j);
        }
        if (z) {
            f312350c.mo105240i("SuggestionShown:lastPage");
        }
        ArrayList arrayList2 = this.f312351d.f312342q;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            z |= C58890d.m90990e(((C113415ez) arrayList2.get(i2)).mo100199L(), this.f312351d.f312335j);
        }
        if (z) {
            f312350c.mo105240i("SuggestionShown:anyPage");
        } else {
            f312350c.mo105240i("SuggestionShown:false");
        }
    }

    /* renamed from: p */
    public final synchronized void mo99641p(long j, C48672ag agVar, int i, int i2) {
        C58976aa aaVar = C58975e.f156826a;
        Long valueOf = Long.valueOf(j);
        C112662a aVar = new C112662a(valueOf, agVar);
        Long l = (Long) Map.EL.getOrDefault(this.f312351d.f312331f, aVar, (Object) null);
        this.f312351d.f312331f.remove(aVar);
        if (l == null) {
            C59104x d = f312349b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TapasSessionState");
            ((C59052c) ((C59052c) d).mo56372aa(27522)).mo56351D("Start event not found for request id:%d source:%s", j, agVar.name());
            return;
        }
        List list = (List) Map.EL.getOrDefault(this.f312351d.f312333h, valueOf, new ArrayList());
        C59539di diVar = (C59539di) C59540dj.f157989g.createBuilder();
        int i3 = agVar.f125915O;
        diVar.copyOnWrite();
        C59540dj djVar = (C59540dj) diVar.instance;
        djVar.f157991a |= 1;
        djVar.f157992b = i3;
        long b = this.f312354g.mo26870b();
        long longValue = l.longValue();
        diVar.copyOnWrite();
        C59540dj djVar2 = (C59540dj) diVar.instance;
        djVar2.f157991a |= 2;
        djVar2.f157993c = (float) (b - longValue);
        diVar.copyOnWrite();
        C59540dj djVar3 = (C59540dj) diVar.instance;
        djVar3.f157994d = i - 1;
        djVar3.f157991a |= 4;
        Iterable iterable = (Iterable) Map.EL.getOrDefault(this.f312351d.f312332g, aVar, C58485gu.m89845m());
        diVar.copyOnWrite();
        C59540dj djVar4 = (C59540dj) diVar.instance;
        C62971cq cqVar = djVar4.f157996f;
        if (!cqVar.mo58948c()) {
            djVar4.f157996f = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) djVar4.f157996f);
        diVar.copyOnWrite();
        C59540dj djVar5 = (C59540dj) diVar.instance;
        djVar5.f157991a |= 8;
        djVar5.f157995e = i2;
        list.add((C59540dj) diVar.build());
        this.f312351d.f312333h.put(valueOf, list);
        this.f312351d.f312332g.remove(aVar);
    }
}
