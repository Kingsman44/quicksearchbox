package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8639a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.a.o */
/* compiled from: PG */
public final /* synthetic */ class C115106o implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C86124t f319505a;

    public /* synthetic */ C115106o(C86124t tVar) {
        this.f319505a = tVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r7) {
        /*
            r6 = this;
            com.google.android.apps.gsa.search.core.i.t r0 = r6.f319505a
            d.b.a.a.by r7 = (p5285d.p5290b.p5291a.p5292a.C68189by) r7
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90125fw.f250930i
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x0103
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getCountry()
            java.lang.String r0 = com.google.common.base.C58890d.m90988c(r0)
            int r1 = r0.hashCode()
            r2 = 3179(0xc6b, float:4.455E-42)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x003f
            r2 = 3331(0xd03, float:4.668E-42)
            if (r1 == r2) goto L_0x0035
            r2 = 3715(0xe83, float:5.206E-42)
            if (r1 == r2) goto L_0x002b
            goto L_0x0049
        L_0x002b:
            java.lang.String r1 = "tw"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0049
            r0 = 1
            goto L_0x004a
        L_0x0035:
            java.lang.String r1 = "hk"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0049
            r0 = 2
            goto L_0x004a
        L_0x003f:
            java.lang.String r1 = "cn"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0049
            r0 = 0
            goto L_0x004a
        L_0x0049:
            r0 = -1
        L_0x004a:
            if (r0 == 0) goto L_0x0061
            if (r0 == r4) goto L_0x005a
            if (r0 == r3) goto L_0x0053
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x0067
        L_0x0053:
            java.lang.String r0 = "jar"
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x0067
        L_0x005a:
            java.lang.String r0 = "cta-wavenet"
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x0067
        L_0x0061:
            java.lang.String r0 = "cca-wavenet"
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
        L_0x0067:
            boolean r1 = r0.mo56113h()
            if (r1 != 0) goto L_0x006f
            goto L_0x0103
        L_0x006f:
            com.google.protobuf.cq r1 = r7.f184507a
            j$.util.stream.Stream r1 = p3186j$.util.Collection.EL.stream(r1)
            com.google.android.apps.gsa.staticplugins.opamediaplayer.a.l r2 = com.google.android.apps.gsa.staticplugins.opamediaplayer.p8639a.C115103l.f319500a
            j$.util.stream.Stream r1 = r1.filter(r2)
            j$.util.stream.Collector r2 = p3186j$.util.stream.Collectors.toList()
            java.lang.Object r1 = r1.collect(r2)
            java.util.List r1 = (java.util.List) r1
            d.b.a.a.bs r2 = p5285d.p5290b.p5291a.p5292a.C68183bs.f184493c
            com.google.protobuf.bn r2 = r2.createBuilder()
            d.b.a.a.br r2 = (p5285d.p5290b.p5291a.p5292a.C68182br) r2
            d.b.a.a.bw r3 = p5285d.p5290b.p5291a.p5292a.C68187bw.f184502b
            com.google.protobuf.bn r3 = r3.createBuilder()
            d.b.a.a.bv r3 = (p5285d.p5290b.p5291a.p5292a.C68186bv) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            d.b.a.a.bw r4 = (p5285d.p5290b.p5291a.p5292a.C68187bw) r4
            java.lang.String r5 = "zh"
            r4.f184504a = r5
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            d.b.a.a.bs r4 = (p5285d.p5290b.p5291a.p5292a.C68183bs) r4
            com.google.protobuf.bv r3 = r3.build()
            d.b.a.a.bw r3 = (p5285d.p5290b.p5291a.p5292a.C68187bw) r3
            r3.getClass()
            r4.f184495a = r3
            d.b.a.a.bu r3 = p5285d.p5290b.p5291a.p5292a.C68185bu.f184497d
            com.google.protobuf.bn r3 = r3.createBuilder()
            d.b.a.a.bt r3 = (p5285d.p5290b.p5291a.p5292a.C68184bt) r3
            java.lang.Object r0 = r0.mo56107c()
            java.lang.String r0 = (java.lang.String) r0
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            d.b.a.a.bu r4 = (p5285d.p5290b.p5291a.p5292a.C68185bu) r4
            r0.getClass()
            r4.f184499a = r0
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            d.b.a.a.bs r0 = (p5285d.p5290b.p5291a.p5292a.C68183bs) r0
            com.google.protobuf.bv r3 = r3.build()
            d.b.a.a.bu r3 = (p5285d.p5290b.p5291a.p5292a.C68185bu) r3
            r3.getClass()
            r0.f184496b = r3
            com.google.protobuf.bv r0 = r2.build()
            d.b.a.a.bs r0 = (p5285d.p5290b.p5291a.p5292a.C68183bs) r0
            r1.add(r0)
            com.google.protobuf.bn r7 = r7.toBuilder()
            d.b.a.a.bx r7 = (p5285d.p5290b.p5291a.p5292a.C68188bx) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r0 = r7.instance
            d.b.a.a.by r0 = (p5285d.p5290b.p5291a.p5292a.C68189by) r0
            com.google.protobuf.cq r2 = p5285d.p5290b.p5291a.p5292a.C68189by.emptyProtobufList()
            r0.f184507a = r2
            r7.mo60283a(r1)
            com.google.protobuf.bv r7 = r7.build()
            d.b.a.a.by r7 = (p5285d.p5290b.p5291a.p5292a.C68189by) r7
        L_0x0103:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opamediaplayer.p8639a.C115106o.apply(java.lang.Object):java.lang.Object");
    }
}
