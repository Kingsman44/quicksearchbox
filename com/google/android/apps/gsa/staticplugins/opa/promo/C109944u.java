package com.google.android.apps.gsa.staticplugins.opa.promo;

import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.promo.u */
/* compiled from: PG */
public final /* synthetic */ class C109944u implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C109945v f306342a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f306343b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f306344c;

    public /* synthetic */ C109944u(C109945v vVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f306342a = vVar;
        this.f306343b = cxVar;
        this.f306344c = cxVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:200:0x070b  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0721  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x07fd  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0811  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r36 = this;
            r0 = r36
            com.google.android.apps.gsa.staticplugins.opa.promo.v r1 = r0.f306342a
            com.google.common.util.concurrent.cx r2 = r0.f306343b
            com.google.common.util.concurrent.cx r3 = r0.f306344c
            java.lang.Object r2 = com.google.common.util.concurrent.C60856cj.m92909r(r2)
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r3 = com.google.common.util.concurrent.C60856cj.m92909r(r3)
            com.google.common.base.ax r3 = (com.google.common.base.C58833ax) r3
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x001d:
            boolean r5 = r2.hasNext()
            r6 = 3
            r7 = 1
            if (r5 == 0) goto L_0x004c
            java.lang.Object r5 = r2.next()
            com.google.assistant.y.d.j r5 = (com.google.assistant.p4008y.p4013d.C53658j) r5
            int r8 = r5.f140835f
            int r8 = com.google.assistant.p4008y.p4013d.C53657i.m86881a(r8)
            if (r8 == 0) goto L_0x001d
            if (r8 != r6) goto L_0x001d
            int r6 = r5.f140831b
            if (r6 != r7) goto L_0x0042
            java.lang.Object r5 = r5.f140832c
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            goto L_0x0044
        L_0x0042:
            r5 = 0
        L_0x0044:
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r4.add(r5)
            goto L_0x001d
        L_0x004c:
            int r2 = r4.size()
            long r8 = (long) r2
            com.google.android.apps.gsa.search.core.i.t r2 = r1.f306347c
            com.google.android.apps.gsa.shared.m.f r5 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248475bC
            long r10 = r2.mo79743a(r5)
            r2 = 16
            r5 = 4
            r12 = 2
            int r14 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r14 < 0) goto L_0x0065
            com.google.common.base.b r8 = com.google.common.base.C58836b.f156633a
            goto L_0x03cf
        L_0x0065:
            com.google.android.apps.gsa.search.core.i.t r8 = r1.f306347c
            com.google.android.apps.gsa.shared.m.h r9 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248473bA
            com.google.common.b.gu r8 = r8.mo79750p(r9)
            int r9 = r8.size()
            r10 = 0
        L_0x0072:
            if (r10 >= r9) goto L_0x03cd
            java.lang.Object r11 = r8.get(r10)
            java.lang.Long r11 = (java.lang.Long) r11
            int r10 = r10 + 1
            boolean r14 = r4.contains(r11)
            if (r14 != 0) goto L_0x0072
            long r8 = r11.longValue()
            com.google.android.apps.gsa.staticplugins.opa.promo.ap r10 = com.google.android.apps.gsa.staticplugins.opa.promo.C109920ap.f306268h
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.apps.gsa.staticplugins.opa.promo.ao r10 = (com.google.android.apps.gsa.staticplugins.opa.promo.C109919ao) r10
            r14 = 1010300(0xf6a7c, double:4.991545E-318)
            r16 = 42440321(0x2879681, double:2.09683046E-316)
            r18 = 1010245(0xf6a45, double:4.991273E-318)
            r20 = 1010299(0xf6a7b, double:4.99154E-318)
            r22 = 42440320(0x2879680, double:2.0968304E-316)
            r24 = 1010244(0xf6a44, double:4.99127E-318)
            r26 = 1010298(0xf6a7a, double:4.991535E-318)
            r28 = 42440319(0x287967f, double:2.09683036E-316)
            r30 = 1010243(0xf6a43, double:4.991264E-318)
            r32 = 42440318(0x287967e, double:2.0968303E-316)
            r34 = 1010242(0xf6a42, double:4.99126E-318)
            int r11 = (r8 > r34 ? 1 : (r8 == r34 ? 0 : -1))
            if (r11 == 0) goto L_0x010c
            int r11 = (r8 > r32 ? 1 : (r8 == r32 ? 0 : -1))
            if (r11 != 0) goto L_0x00b8
            goto L_0x010c
        L_0x00b8:
            int r11 = (r8 > r30 ? 1 : (r8 == r30 ? 0 : -1))
            if (r11 == 0) goto L_0x00fe
            int r11 = (r8 > r28 ? 1 : (r8 == r28 ? 0 : -1))
            if (r11 == 0) goto L_0x00fe
            int r11 = (r8 > r26 ? 1 : (r8 == r26 ? 0 : -1))
            if (r11 != 0) goto L_0x00c5
            goto L_0x00fe
        L_0x00c5:
            int r11 = (r8 > r24 ? 1 : (r8 == r24 ? 0 : -1))
            if (r11 == 0) goto L_0x00f0
            int r11 = (r8 > r22 ? 1 : (r8 == r22 ? 0 : -1))
            if (r11 == 0) goto L_0x00f0
            int r11 = (r8 > r20 ? 1 : (r8 == r20 ? 0 : -1))
            if (r11 != 0) goto L_0x00d2
            goto L_0x00f0
        L_0x00d2:
            int r11 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r11 == 0) goto L_0x00e2
            int r11 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r11 == 0) goto L_0x00e2
            int r11 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r11 != 0) goto L_0x00df
            goto L_0x00e2
        L_0x00df:
            java.lang.String r11 = ""
            goto L_0x0119
        L_0x00e2:
            android.content.Context r11 = r1.f306350f
            android.content.res.Resources r11 = r11.getResources()
            r6 = 2132090668(0x7f151f2c, float:1.9821683E38)
            java.lang.String r11 = r11.getString(r6)
            goto L_0x0119
        L_0x00f0:
            android.content.Context r6 = r1.f306350f
            android.content.res.Resources r6 = r6.getResources()
            r11 = 2132090662(0x7f151f26, float:1.982167E38)
            java.lang.String r11 = r6.getString(r11)
            goto L_0x0119
        L_0x00fe:
            android.content.Context r6 = r1.f306350f
            android.content.res.Resources r6 = r6.getResources()
            r11 = 2132090664(0x7f151f28, float:1.9821674E38)
            java.lang.String r11 = r6.getString(r11)
            goto L_0x0119
        L_0x010c:
            android.content.Context r6 = r1.f306350f
            android.content.res.Resources r6 = r6.getResources()
            r11 = 2132090666(0x7f151f2a, float:1.9821678E38)
            java.lang.String r11 = r6.getString(r11)
        L_0x0119:
            r10.copyOnWrite()
            com.google.protobuf.bv r6 = r10.instance
            com.google.android.apps.gsa.staticplugins.opa.promo.ap r6 = (com.google.android.apps.gsa.staticplugins.opa.promo.C109920ap) r6
            r11.getClass()
            int r13 = r6.f306270a
            r13 = r13 | r7
            r6.f306270a = r13
            r6.f306271b = r11
            int r6 = (r8 > r34 ? 1 : (r8 == r34 ? 0 : -1))
            if (r6 == 0) goto L_0x0187
            int r6 = (r8 > r32 ? 1 : (r8 == r32 ? 0 : -1))
            if (r6 != 0) goto L_0x0133
            goto L_0x0187
        L_0x0133:
            int r6 = (r8 > r30 ? 1 : (r8 == r30 ? 0 : -1))
            if (r6 == 0) goto L_0x0179
            int r6 = (r8 > r28 ? 1 : (r8 == r28 ? 0 : -1))
            if (r6 == 0) goto L_0x0179
            int r6 = (r8 > r26 ? 1 : (r8 == r26 ? 0 : -1))
            if (r6 != 0) goto L_0x0140
            goto L_0x0179
        L_0x0140:
            int r6 = (r8 > r24 ? 1 : (r8 == r24 ? 0 : -1))
            if (r6 == 0) goto L_0x016b
            int r6 = (r8 > r22 ? 1 : (r8 == r22 ? 0 : -1))
            if (r6 == 0) goto L_0x016b
            int r6 = (r8 > r20 ? 1 : (r8 == r20 ? 0 : -1))
            if (r6 != 0) goto L_0x014d
            goto L_0x016b
        L_0x014d:
            int r6 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r6 == 0) goto L_0x015d
            int r6 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r6 == 0) goto L_0x015d
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 != 0) goto L_0x015a
            goto L_0x015d
        L_0x015a:
            java.lang.String r6 = ""
            goto L_0x0194
        L_0x015d:
            android.content.Context r6 = r1.f306350f
            android.content.res.Resources r6 = r6.getResources()
            r11 = 2132090667(0x7f151f2b, float:1.982168E38)
            java.lang.String r6 = r6.getString(r11)
            goto L_0x0194
        L_0x016b:
            android.content.Context r6 = r1.f306350f
            android.content.res.Resources r6 = r6.getResources()
            r11 = 2132090661(0x7f151f25, float:1.9821668E38)
            java.lang.String r6 = r6.getString(r11)
            goto L_0x0194
        L_0x0179:
            android.content.Context r6 = r1.f306350f
            android.content.res.Resources r6 = r6.getResources()
            r11 = 2132090663(0x7f151f27, float:1.9821672E38)
            java.lang.String r6 = r6.getString(r11)
            goto L_0x0194
        L_0x0187:
            android.content.Context r6 = r1.f306350f
            android.content.res.Resources r6 = r6.getResources()
            r11 = 2132090665(0x7f151f29, float:1.9821676E38)
            java.lang.String r6 = r6.getString(r11)
        L_0x0194:
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.android.apps.gsa.staticplugins.opa.promo.ap r11 = (com.google.android.apps.gsa.staticplugins.opa.promo.C109920ap) r11
            r6.getClass()
            int r13 = r11.f306270a
            r13 = r13 | r12
            r11.f306270a = r13
            r11.f306272c = r6
            r10.copyOnWrite()
            com.google.protobuf.bv r6 = r10.instance
            com.google.android.apps.gsa.staticplugins.opa.promo.ap r6 = (com.google.android.apps.gsa.staticplugins.opa.promo.C109920ap) r6
            int r11 = r6.f306270a
            r11 = r11 | 8
            r6.f306270a = r11
            r6.f306274e = r8
            com.google.android.apps.gsa.staticplugins.opa.promo.d r6 = com.google.android.apps.gsa.staticplugins.opa.promo.C109927d.f306290e
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.apps.gsa.staticplugins.opa.promo.a r6 = (com.google.android.apps.gsa.staticplugins.opa.promo.C109874a) r6
            int r11 = (r8 > r34 ? 1 : (r8 == r34 ? 0 : -1))
            if (r11 != 0) goto L_0x01d4
            com.google.android.apps.gsa.staticplugins.opa.promo.c r8 = com.google.android.apps.gsa.staticplugins.opa.promo.C109926c.SWIPE_DEMO
            r6.copyOnWrite()
            com.google.protobuf.bv r9 = r6.instance
            com.google.android.apps.gsa.staticplugins.opa.promo.d r9 = (com.google.android.apps.gsa.staticplugins.opa.promo.C109927d) r9
            int r8 = r8.f306289h
            r9.f306293b = r8
            int r8 = r9.f306292a
            r8 = r8 | r7
            r9.f306292a = r8
            goto L_0x034f
        L_0x01d4:
            int r11 = (r8 > r32 ? 1 : (r8 == r32 ? 0 : -1))
            if (r11 != 0) goto L_0x01ec
            com.google.android.apps.gsa.staticplugins.opa.promo.c r8 = com.google.android.apps.gsa.staticplugins.opa.promo.C109926c.NGA_PIE_SWIPE_DEMO
            r6.copyOnWrite()
            com.google.protobuf.bv r9 = r6.instance
            com.google.android.apps.gsa.staticplugins.opa.promo.d r9 = (com.google.android.apps.gsa.staticplugins.opa.promo.C109927d) r9
            int r8 = r8.f306289h
            r9.f306293b = r8
            int r8 = r9.f306292a
            r8 = r8 | r7
            r9.f306292a = r8
            goto L_0x034f
        L_0x01ec:
            int r11 = (r8 > r30 ? 1 : (r8 == r30 ? 0 : -1))
            if (r11 != 0) goto L_0x0214
            com.google.android.apps.gsa.staticplugins.opa.promo.c r8 = com.google.android.apps.gsa.staticplugins.opa.promo.C109926c.SUGGEST
            r6.copyOnWrite()
            com.google.protobuf.bv r9 = r6.instance
            com.google.android.apps.gsa.staticplugins.opa.promo.d r9 = (com.google.android.apps.gsa.staticplugins.opa.promo.C109927d) r9
            int r8 = r8.f306289h
            r9.f306293b = r8
            int r8 = r9.f306292a
            r8 = r8 | r7
            r9.f306292a = r8
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.android.apps.gsa.staticplugins.opa.promo.d r8 = (com.google.android.apps.gsa.staticplugins.opa.promo.C109927d) r8
            int r9 = r8.f306292a
            r9 = r9 | r5
            r8.f306292a = r9
            java.lang.String r9 = "Search for pizza in Google Maps"
            r8.f306295d = r9
            goto L_0x034f
        L_0x0214:
            int r11 = (r8 > r28 ? 1 : (r8 == r28 ? 0 : -1))
            if (r11 != 0) goto L_0x023c
            com.google.android.apps.gsa.staticplugins.opa.promo.c r8 = com.google.android.apps.gsa.staticplugins.opa.promo.C109926c.NGA_PIE_SUGGEST
            r6.copyOnWrite()
            com.google.protobuf.bv r9 = r6.instance
            com.google.android.apps.gsa.staticplugins.opa.promo.d r9 = (com.google.android.apps.gsa.staticplugins.opa.promo.C109927d) r9
            int r8 = r8.f306289h
            r9.f306293b = r8
            int r8 = r9.f306292a
            r8 = r8 | r7
            r9.f306292a = r8
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.android.apps.gsa.staticplugins.opa.promo.d r8 = (com.google.android.apps.gsa.staticplugins.opa.promo.C109927d) r8
            int r9 = r8.f306292a
            r9 = r9 | r5
            r8.f306292a = r9
            java.lang.String r9 = "Search for pizza in Google Maps"
            r8.f306295d = r9
            goto L_0x034f
        L_0x023c:
            int r11 = (r8 > r24 ? 1 : (r8 == r24 ? 0 : -1))
            if (r11 != 0) goto L_0x0264
            com.google.android.apps.gsa.staticplugins.opa.promo.c r8 = com.google.android.apps.gsa.staticplugins.opa.promo.C109926c.SUGGEST
            r6.copyOnWrite()
            com.google.protobuf.bv r9 = r6.instance
            com.google.android.apps.gsa.staticplugins.opa.promo.d r9 = (com.google.android.apps.gsa.staticplugins.opa.promo.C109927d) r9
            int r8 = r8.f306289h
            r9.f306293b = r8
            int r8 = r9.f306292a
            r8 = r8 | r7
            r9.f306292a = r8
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.android.apps.gsa.staticplugins.opa.promo.d r8 = (com.google.android.apps.gsa.staticplugins.opa.promo.C109927d) r8
            int r9 = r8.f306292a
            r9 = r9 | r5
            r8.f306292a = r9
            java.lang.String r9 = "Send a message"
            r8.f306295d = r9
            goto L_0x034f
        L_0x0264:
            int r11 = (r8 > r22 ? 1 : (r8 == r22 ? 0 : -1))
            if (r11 != 0) goto L_0x028c
            com.google.android.apps.gsa.staticplugins.opa.promo.c r8 = com.google.android.apps.gsa.staticplugins.opa.promo.C109926c.NGA_PIE_SUGGEST
            r6.copyOnWrite()
            com.google.protobuf.bv r9 = r6.instance
            com.google.android.apps.gsa.staticplugins.opa.promo.d r9 = (com.google.android.apps.gsa.staticplugins.opa.promo.C109927d) r9
            int r8 = r8.f306289h
            r9.f306293b = r8
            int r8 = r9.f306292a
            r8 = r8 | r7
            r9.f306292a = r8
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.android.apps.gsa.staticplugins.opa.promo.d r8 = (com.google.android.apps.gsa.staticplugins.opa.promo.C109927d) r8
            int r9 = r8.f306292a
            r9 = r9 | r5
            r8.f306292a = r9
            java.lang.String r9 = "Send a message"
            r8.f306295d = r9
            goto L_0x034f
        L_0x028c:
            int r11 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r11 != 0) goto L_0x02b4
            com.google.android.apps.gsa.staticplugins.opa.promo.c r8 = com.google.android.apps.gsa.staticplugins.opa.promo.C109926c.SUGGEST
            r6.copyOnWrite()
            com.google.protobuf.bv r9 = r6.instance
            com.google.android.apps.gsa.staticplugins.opa.promo.d r9 = (com.google.android.apps.gsa.staticplugins.opa.promo.C109927d) r9
            int r8 = r8.f306289h
            r9.f306293b = r8
            int r8 = r9.f306292a
            r8 = r8 | r7
            r9.f306292a = r8
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.android.apps.gsa.staticplugins.opa.promo.d r8 = (com.google.android.apps.gsa.staticplugins.opa.promo.C109927d) r8
            int r9 = r8.f306292a
            r9 = r9 | r5
            r8.f306292a = r9
            java.lang.String r9 = "Show my photos of food"
            r8.f306295d = r9
            goto L_0x034f
        L_0x02b4:
            int r11 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r11 != 0) goto L_0x02db
            com.google.android.apps.gsa.staticplugins.opa.promo.c r8 = com.google.android.apps.gsa.staticplugins.opa.promo.C109926c.NGA_PIE_SUGGEST
            r6.copyOnWrite()
            com.google.protobuf.bv r9 = r6.instance
            com.google.android.apps.gsa.staticplugins.opa.promo.d r9 = (com.google.android.apps.gsa.staticplugins.opa.promo.C109927d) r9
            int r8 = r8.f306289h
            r9.f306293b = r8
            int r8 = r9.f306292a
            r8 = r8 | r7
            r9.f306292a = r8
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.android.apps.gsa.staticplugins.opa.promo.d r8 = (com.google.android.apps.gsa.staticplugins.opa.promo.C109927d) r8
            int r9 = r8.f306292a
            r9 = r9 | r5
            r8.f306292a = r9
            java.lang.String r9 = "Show my photos of food"
            r8.f306295d = r9
            goto L_0x034f
        L_0x02db:
            int r11 = (r8 > r26 ? 1 : (r8 == r26 ? 0 : -1))
            if (r11 != 0) goto L_0x0302
            com.google.android.apps.gsa.staticplugins.opa.promo.c r8 = com.google.android.apps.gsa.staticplugins.opa.promo.C109926c.CUSTOM_URL
            r6.copyOnWrite()
            com.google.protobuf.bv r9 = r6.instance
            com.google.android.apps.gsa.staticplugins.opa.promo.d r9 = (com.google.android.apps.gsa.staticplugins.opa.promo.C109927d) r9
            int r8 = r8.f306289h
            r9.f306293b = r8
            int r8 = r9.f306292a
            r8 = r8 | r7
            r9.f306292a = r8
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.android.apps.gsa.staticplugins.opa.promo.d r8 = (com.google.android.apps.gsa.staticplugins.opa.promo.C109927d) r8
            int r9 = r8.f306292a
            r9 = r9 | r12
            r8.f306292a = r9
            java.lang.String r9 = "googleapp://deeplink/?data=CksBDb3mGzBEAiAqeUnTmLKX-H4XVIv8MUZldVI4C1rW-FHAl9luSbPKMwIgIA-pbwDjbgJ_gJ25_5X34F2y6y0dPJo3ObgRsofFY00SaAoGCMiavo8BEgMI8mcaLxItCAQSKeqKqPQEIwgBEh9zZWFyY2ggZm9yIHBpenphIGluIEdvb2dsZSBNYXBzIigKJmh0dHBzOi8vYXNzaXN0YW50Lmdvb2dsZS5jb20vP2hsPWVuX3Vz"
            r8.f306294c = r9
            goto L_0x034f
        L_0x0302:
            int r11 = (r8 > r20 ? 1 : (r8 == r20 ? 0 : -1))
            if (r11 != 0) goto L_0x0329
            com.google.android.apps.gsa.staticplugins.opa.promo.c r8 = com.google.android.apps.gsa.staticplugins.opa.promo.C109926c.CUSTOM_URL
            r6.copyOnWrite()
            com.google.protobuf.bv r9 = r6.instance
            com.google.android.apps.gsa.staticplugins.opa.promo.d r9 = (com.google.android.apps.gsa.staticplugins.opa.promo.C109927d) r9
            int r8 = r8.f306289h
            r9.f306293b = r8
            int r8 = r9.f306292a
            r8 = r8 | r7
            r9.f306292a = r8
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.android.apps.gsa.staticplugins.opa.promo.d r8 = (com.google.android.apps.gsa.staticplugins.opa.promo.C109927d) r8
            int r9 = r8.f306292a
            r9 = r9 | r12
            r8.f306292a = r9
            java.lang.String r9 = "googleapp://deeplink/?data=CksBDb3mGzBEAiA7vxY6xPj6qIIWCRMZN7ySvIqRUGBcnWgM_qwAz8YvIwIgamZc4qtAjQPrJ8INt_ctCmV3OGhi3VkcJXtbzCKYOWMSVwoGCMiavo8BEgMI82caHhIcCAQSGOqKqPQEEggBEg5TZW5kIGEgbWVzc2FnZSIoCiZodHRwczovL2Fzc2lzdGFudC5nb29nbGUuY29tLz9obD1lbl91cw"
            r8.f306294c = r9
            goto L_0x034f
        L_0x0329:
            int r11 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r11 != 0) goto L_0x034f
            com.google.android.apps.gsa.staticplugins.opa.promo.c r8 = com.google.android.apps.gsa.staticplugins.opa.promo.C109926c.CUSTOM_URL
            r6.copyOnWrite()
            com.google.protobuf.bv r9 = r6.instance
            com.google.android.apps.gsa.staticplugins.opa.promo.d r9 = (com.google.android.apps.gsa.staticplugins.opa.promo.C109927d) r9
            int r8 = r8.f306289h
            r9.f306293b = r8
            int r8 = r9.f306292a
            r8 = r8 | r7
            r9.f306292a = r8
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.android.apps.gsa.staticplugins.opa.promo.d r8 = (com.google.android.apps.gsa.staticplugins.opa.promo.C109927d) r8
            int r9 = r8.f306292a
            r9 = r9 | r12
            r8.f306292a = r9
            java.lang.String r9 = "googleapp://deeplink/?data=CkwBDb3mGzBFAiEAlQjitikCRkfPSZUojcaKNSKRm9fACGwhfoTrqKdzh_ICIBVawP_K2RON7MI3gt19iGyuKnFmjtfFw2kCdnlFopoIEl8KBgjImr6PARIDCPRnGiYSJAgEEiDqiqj0BBoIARIWU2hvdyBteSBwaG90b3Mgb2YgZm9vZCIoCiZodHRwczovL2Fzc2lzdGFudC5nb29nbGUuY29tLz9obD1lbl91cw"
            r8.f306294c = r9
        L_0x034f:
            com.google.protobuf.bv r6 = r6.build()
            com.google.android.apps.gsa.staticplugins.opa.promo.d r6 = (com.google.android.apps.gsa.staticplugins.opa.promo.C109927d) r6
            r10.copyOnWrite()
            com.google.protobuf.bv r8 = r10.instance
            com.google.android.apps.gsa.staticplugins.opa.promo.ap r8 = (com.google.android.apps.gsa.staticplugins.opa.promo.C109920ap) r8
            r6.getClass()
            r8.f306275f = r6
            int r6 = r8.f306270a
            r6 = r6 | r2
            r8.f306270a = r6
            com.google.android.apps.gsa.staticplugins.opa.promo.f r6 = com.google.android.apps.gsa.staticplugins.opa.promo.C109929f.f306296c
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.apps.gsa.staticplugins.opa.promo.e r6 = (com.google.android.apps.gsa.staticplugins.opa.promo.C109928e) r6
            com.google.android.apps.gsa.staticplugins.opa.promo.d r8 = com.google.android.apps.gsa.staticplugins.opa.promo.C109927d.f306290e
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.apps.gsa.staticplugins.opa.promo.a r8 = (com.google.android.apps.gsa.staticplugins.opa.promo.C109874a) r8
            com.google.android.apps.gsa.staticplugins.opa.promo.c r9 = com.google.android.apps.gsa.staticplugins.opa.promo.C109926c.TURN_OFF
            r8.copyOnWrite()
            com.google.protobuf.bv r11 = r8.instance
            com.google.android.apps.gsa.staticplugins.opa.promo.d r11 = (com.google.android.apps.gsa.staticplugins.opa.promo.C109927d) r11
            int r9 = r9.f306289h
            r11.f306293b = r9
            int r9 = r11.f306292a
            r9 = r9 | r7
            r11.f306292a = r9
            r6.copyOnWrite()
            com.google.protobuf.bv r9 = r6.instance
            com.google.android.apps.gsa.staticplugins.opa.promo.f r9 = (com.google.android.apps.gsa.staticplugins.opa.promo.C109929f) r9
            com.google.protobuf.bv r8 = r8.build()
            com.google.android.apps.gsa.staticplugins.opa.promo.d r8 = (com.google.android.apps.gsa.staticplugins.opa.promo.C109927d) r8
            r8.getClass()
            r9.f306299b = r8
            int r8 = r9.f306298a
            r8 = r8 | r7
            r9.f306298a = r8
            r10.copyOnWrite()
            com.google.protobuf.bv r8 = r10.instance
            com.google.android.apps.gsa.staticplugins.opa.promo.ap r8 = (com.google.android.apps.gsa.staticplugins.opa.promo.C109920ap) r8
            com.google.protobuf.bv r6 = r6.build()
            com.google.android.apps.gsa.staticplugins.opa.promo.f r6 = (com.google.android.apps.gsa.staticplugins.opa.promo.C109929f) r6
            r6.getClass()
            com.google.protobuf.cq r9 = r8.f306276g
            boolean r11 = r9.mo58948c()
            if (r11 != 0) goto L_0x03bd
            com.google.protobuf.cq r9 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r9)
            r8.f306276g = r9
        L_0x03bd:
            com.google.protobuf.cq r8 = r8.f306276g
            r8.add(r6)
            com.google.protobuf.bv r6 = r10.build()
            com.google.android.apps.gsa.staticplugins.opa.promo.ap r6 = (com.google.android.apps.gsa.staticplugins.opa.promo.C109920ap) r6
            com.google.common.base.ax r8 = com.google.common.base.C58833ax.m90834k(r6)
            goto L_0x03cf
        L_0x03cd:
            com.google.common.base.b r8 = com.google.common.base.C58836b.f156633a
        L_0x03cf:
            boolean r6 = r8.mo56113h()
            if (r6 != 0) goto L_0x03d9
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x0924
        L_0x03d9:
            java.lang.Object r6 = r8.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.promo.ap r6 = (com.google.android.apps.gsa.staticplugins.opa.promo.C109920ap) r6
            int r4 = r4.size()
            com.google.android.apps.gsa.search.core.i.t r8 = r1.f306347c
            com.google.android.apps.gsa.shared.m.f r9 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248475bC
            long r8 = r8.mo79743a(r9)
            int r9 = (int) r8
            int r9 = r9 + -1
            com.google.assistant.ag.c.c r8 = com.google.assistant.p3803ag.p3809c.C48980c.TYPE_OPA_MISC
            com.google.android.libraries.search.assistant.proactive.r r10 = r1.f306355k
            com.google.android.libraries.search.assistant.proactive.o r10 = r10.mo40115b(r8)
            com.google.android.apps.gsa.search.core.i.t r11 = r1.f306347c
            com.google.android.apps.gsa.shared.m.d r13 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248453ah
            boolean r11 = r11.mo79746e(r13)
            if (r11 != 0) goto L_0x0409
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.assistant.y.d.o r2 = com.google.assistant.p4008y.p4013d.C53663o.FEATURE_FLAG_DISABLED
            r1.mo98269e(r6, r8, r2)
            goto L_0x091d
        L_0x0409:
            com.google.android.apps.gsa.assistant.shared.bm r11 = r1.f306351g
            boolean r11 = r11.w()
            if (r11 != 0) goto L_0x041a
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.assistant.y.d.o r2 = com.google.assistant.p4008y.p4013d.C53663o.OPA_TURNED_OFF
            r1.mo98269e(r6, r8, r2)
            goto L_0x091d
        L_0x041a:
            com.google.common.base.ax r11 = r1.f306352h
            boolean r11 = r11.mo56113h()
            if (r11 == 0) goto L_0x0916
            com.google.common.base.ax r11 = r1.f306352h
            java.lang.Object r11 = r11.mo56107c()
            com.google.android.apps.gsa.nga.api.bn r11 = (com.google.android.apps.gsa.nga.api.C74713bn) r11
            boolean r11 = r11.mo71078c()
            if (r11 != 0) goto L_0x0432
            goto L_0x0916
        L_0x0432:
            java.lang.String r11 = r6.f306271b
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L_0x0904
            java.lang.String r11 = r6.f306272c
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L_0x0904
            long r13 = r6.f306274e
            r15 = 0
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 == 0) goto L_0x0904
            com.google.protobuf.cq r11 = r6.f306276g
            int r11 = r11.size()
            if (r11 == r7) goto L_0x0454
            goto L_0x0904
        L_0x0454:
            com.google.android.apps.gsa.search.core.i.t r11 = r1.f306347c
            boolean r3 = com.google.android.apps.gsa.staticplugins.opa.promo.C109945v.m183116f(r3, r11)
            if (r3 != 0) goto L_0x0465
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.assistant.y.d.o r2 = com.google.assistant.p4008y.p4013d.C53663o.CAMPAIGN_OPT_OUT
            r1.mo98269e(r6, r8, r2)
            goto L_0x091d
        L_0x0465:
            com.google.android.libraries.search.assistant.proactive.r r3 = r1.f306355k
            boolean r3 = r3.mo40120g()
            if (r3 != 0) goto L_0x0476
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.assistant.y.d.o r2 = com.google.assistant.p4008y.p4013d.C53663o.SYSTEM_OPT_OUT
            r1.mo98269e(r6, r8, r2)
            goto L_0x091d
        L_0x0476:
            com.google.android.libraries.search.assistant.proactive.r r3 = r1.f306355k
            boolean r3 = r3.mo40121h(r10)
            if (r3 != 0) goto L_0x0487
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.assistant.y.d.o r2 = com.google.assistant.p4008y.p4013d.C53663o.CHANNEL_OPT_OUT
            r1.mo98269e(r6, r8, r2)
            goto L_0x091d
        L_0x0487:
            com.google.common.b.ij r3 = com.google.android.apps.gsa.staticplugins.opa.promo.C109945v.f306346b
            com.google.android.apps.gsa.staticplugins.opa.promo.d r11 = r6.f306275f
            if (r11 != 0) goto L_0x048f
            com.google.android.apps.gsa.staticplugins.opa.promo.d r11 = com.google.android.apps.gsa.staticplugins.opa.promo.C109927d.f306290e
        L_0x048f:
            int r11 = r11.f306293b
            com.google.android.apps.gsa.staticplugins.opa.promo.c r11 = com.google.android.apps.gsa.staticplugins.opa.promo.C109926c.m183097a(r11)
            if (r11 != 0) goto L_0x0499
            com.google.android.apps.gsa.staticplugins.opa.promo.c r11 = com.google.android.apps.gsa.staticplugins.opa.promo.C109926c.UNKNOWN
        L_0x0499:
            boolean r3 = r3.contains(r11)
            if (r3 == 0) goto L_0x04c1
            com.google.common.base.ax r3 = r1.f306353i
            com.google.android.apps.gsa.staticplugins.opa.promo.t r11 = com.google.android.apps.gsa.staticplugins.opa.promo.C109943t.f306341a
            com.google.common.base.ax r3 = r3.mo56106b(r11)
            r11 = 0
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r11)
            java.lang.Object r3 = r3.mo56109e(r13)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x04c1
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.assistant.y.d.o r2 = com.google.assistant.p4008y.p4013d.C53663o.NGA_PIE_NOT_ELIGIBLE
            r1.mo98269e(r6, r8, r2)
            goto L_0x091d
        L_0x04c1:
            com.google.android.libraries.logging.j r3 = new com.google.android.libraries.logging.j
            r11 = 46142(0xb43e, float:6.4659E-41)
            r3.<init>(r11)
            r11 = 5
            r3.mo33795i(r11)
            r13 = 22
            r3.mo33795i(r13)
            com.google.android.apps.gsa.search.core.i.t r13 = r1.f306347c
            com.google.android.apps.gsa.shared.m.d r14 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248452ag
            boolean r13 = r13.mo79746e(r14)
            if (r7 == r13) goto L_0x04de
            r13 = 1
            goto L_0x04df
        L_0x04de:
            r13 = 3
        L_0x04df:
            r3.mo33794h(r13)
            com.google.android.libraries.logging.j r13 = new com.google.android.libraries.logging.j
            r14 = 46143(0xb43f, float:6.466E-41)
            r13.<init>(r14)
            r13.mo33795i(r11)
            com.google.common.o.aqp r14 = r13.f76974b
            r14.copyOnWrite()
            com.google.protobuf.bv r14 = r14.instance
            com.google.common.o.aqs r14 = (com.google.common.p4552o.aqs) r14
            com.google.common.o.aqs r15 = com.google.common.p4552o.aqs.f159780k
            int r15 = r14.f159782a
            r15 = r15 | r12
            r14.f159782a = r15
            r14.f159784c = r7
            com.google.android.apps.gsa.search.core.i.t r14 = r1.f306347c
            com.google.android.apps.gsa.shared.m.d r15 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248452ag
            boolean r14 = r14.mo79746e(r15)
            if (r7 == r14) goto L_0x050b
            r14 = 1
            goto L_0x050c
        L_0x050b:
            r14 = 3
        L_0x050c:
            r13.mo33794h(r14)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r15 = 0
            com.google.android.libraries.logging.k[] r12 = new com.google.android.libraries.logging.C28293k[r15]
            com.google.android.libraries.logging.k r12 = com.google.android.libraries.logging.C28293k.m52908e(r3, r12)
            r14.add(r12)
            com.google.android.libraries.logging.k[] r12 = new com.google.android.libraries.logging.C28293k[r15]
            com.google.android.libraries.logging.k r12 = com.google.android.libraries.logging.C28293k.m52908e(r13, r12)
            r14.add(r12)
            com.google.android.libraries.logging.j r12 = new com.google.android.libraries.logging.j
            r15 = 47411(0xb933, float:6.6437E-41)
            r12.<init>(r15)
            com.google.android.libraries.logging.k r12 = com.google.android.libraries.logging.C28293k.m52907d(r12, r14)
            com.google.android.apps.gsa.search.core.i.t r14 = r1.f306347c
            com.google.android.apps.gsa.shared.m.d r15 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248452ag
            boolean r14 = r14.mo79746e(r15)
            if (r7 == r14) goto L_0x053f
            r14 = 1
            goto L_0x0540
        L_0x053f:
            r14 = 3
        L_0x0540:
            r15 = 47411(0xb933, float:6.6437E-41)
            com.google.common.o.oe r12 = com.google.android.libraries.logging.C28285c.m52875b(r12, r15)
            java.lang.String r15 = "OpaNgaPromoTask"
            if (r12 == 0) goto L_0x0640
            com.google.protobuf.cq r11 = r12.f163228c
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L_0x0640
            com.google.common.o.ait r11 = com.google.common.p4552o.ait.f158838e
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.common.o.ais r11 = (com.google.common.p4552o.ais) r11
            r19 = r3
            long r2 = r6.f306274e
            r11.copyOnWrite()
            com.google.protobuf.bv r5 = r11.instance
            com.google.common.o.ait r5 = (com.google.common.p4552o.ait) r5
            int r0 = r5.f158841a
            r0 = r0 | r7
            r5.f158841a = r0
            r5.f158842b = r2
            com.google.common.o.ajz r0 = com.google.common.p4552o.ajz.f158928q
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.common.o.ajw r0 = (com.google.common.p4552o.ajw) r0
            com.google.android.apps.gsa.shared.ae.c r2 = com.google.android.apps.gsa.shared.p6974ae.C89094c.OPA_FEATURE_PROMO
            java.lang.String r2 = r2.name()
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.common.o.ajz r3 = (com.google.common.p4552o.ajz) r3
            r2.getClass()
            int r5 = r3.f158932a
            r5 = r5 | r7
            r3.f158932a = r5
            r3.f158933b = r2
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.common.o.ajz r2 = (com.google.common.p4552o.ajz) r2
            int r3 = r2.f158932a
            r3 = r3 | 8
            r2.f158932a = r3
            r3 = 25
            r2.f158936e = r3
            com.google.common.o.ajy r2 = com.google.common.p4552o.ajy.CLIENT_GENERATED
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.common.o.ajz r3 = (com.google.common.p4552o.ajz) r3
            int r2 = r2.f158927f
            r3.f158939h = r2
            int r2 = r3.f158932a
            r2 = r2 | 64
            r3.f158932a = r2
            java.lang.String r2 = r6.f306271b
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.common.o.ajz r3 = (com.google.common.p4552o.ajz) r3
            r2.getClass()
            int r5 = r3.f158932a
            r5 = r5 | 128(0x80, float:1.794E-43)
            r3.f158932a = r5
            r3.f158940i = r2
            java.lang.String r2 = r6.f306272c
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.common.o.ajz r3 = (com.google.common.p4552o.ajz) r3
            r2.getClass()
            int r5 = r3.f158932a
            r5 = r5 | 256(0x100, float:3.59E-43)
            r3.f158932a = r5
            r3.f158941j = r2
            r2 = 55
            int r2 = com.google.protos.p4985f.p5036r.C65316b.m96665b(r2)
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.common.o.ajz r3 = (com.google.common.p4552o.ajz) r3
            int r5 = r3.f158932a
            r18 = 16
            r5 = r5 | 16
            r3.f158932a = r5
            r3.f158937f = r2
            com.google.protobuf.bv r0 = r0.build()
            com.google.common.o.ajz r0 = (com.google.common.p4552o.ajz) r0
            com.google.protobuf.cq r2 = r12.f163228c
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            com.google.common.o.aqs r2 = (com.google.common.p4552o.aqs) r2
            com.google.protobuf.bn r2 = r2.toBuilder()
            com.google.common.o.aqp r2 = (com.google.common.p4552o.aqp) r2
            com.google.protobuf.bt r3 = com.google.common.p4552o.ait.f158839f
            com.google.protobuf.bv r5 = r11.build()
            com.google.common.o.ait r5 = (com.google.common.p4552o.ait) r5
            r2.mo58885m(r3, r5)
            com.google.protobuf.bt r3 = com.google.common.p4552o.ajz.f158929r
            r2.mo58885m(r3, r0)
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.common.o.aqs r0 = (com.google.common.p4552o.aqs) r0
            int r14 = r14 + -1
            r0.f159789h = r14
            int r3 = r0.f159782a
            r3 = r3 | 32
            r0.f159782a = r3
            com.google.protobuf.bv r0 = r2.build()
            com.google.common.o.aqs r0 = (com.google.common.p4552o.aqs) r0
            com.google.protobuf.bn r2 = r12.toBuilder()
            com.google.common.o.od r2 = (com.google.common.p4552o.C60320od) r2
            r3 = 0
            r2.mo57084d(r3, r0)
            com.google.protobuf.bv r0 = r2.build()
            com.google.common.o.oe r0 = (com.google.common.p4552o.C60321oe) r0
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x0656
        L_0x0640:
            r19 = r3
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.opa.promo.C109945v.f306345a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r2, r15)
            java.lang.String r2 = "Unable to create client VE."
            r3 = 25413(0x6345, float:3.5611E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x0656:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            android.content.Context r3 = r1.f306350f
            java.lang.String r5 = "com.google.android.apps.gsa.search.core.service.SearchService"
            android.content.Intent r2 = r2.setClassName(r3, r5)
            java.lang.String r3 = "com.google.android.search.core.action.OPA_NOTIFICATION_TAPPED"
            android.content.Intent r2 = r2.setAction(r3)
            com.google.android.apps.gsa.staticplugins.opa.promo.d r3 = r6.f306275f
            if (r3 != 0) goto L_0x066f
            com.google.android.apps.gsa.staticplugins.opa.promo.d r3 = com.google.android.apps.gsa.staticplugins.opa.promo.C109927d.f306290e
        L_0x066f:
            int r3 = r3.f306293b
            com.google.android.apps.gsa.staticplugins.opa.promo.c r3 = com.google.android.apps.gsa.staticplugins.opa.promo.C109926c.m183097a(r3)
            if (r3 != 0) goto L_0x0679
            com.google.android.apps.gsa.staticplugins.opa.promo.c r3 = com.google.android.apps.gsa.staticplugins.opa.promo.C109926c.UNKNOWN
        L_0x0679:
            int r3 = r3.ordinal()
            r11 = 0
            if (r3 == r7) goto L_0x06f4
            r12 = 3
            if (r3 == r12) goto L_0x06ab
            r12 = 4
            if (r3 == r12) goto L_0x069d
            r12 = 5
            if (r3 == r12) goto L_0x0697
            r12 = 6
            if (r3 == r12) goto L_0x0691
            r2 = r11
            r3 = r19
            goto L_0x0709
        L_0x0691:
            java.lang.String r3 = "nga-pie-suggest"
            r2.putExtra(r3, r7)
            goto L_0x069d
        L_0x0697:
            java.lang.String r3 = "nga-pie-swipe-education"
            r2.putExtra(r3, r7)
            goto L_0x06ab
        L_0x069d:
            com.google.android.apps.gsa.staticplugins.opa.promo.d r3 = r6.f306275f
            if (r3 != 0) goto L_0x06a3
            com.google.android.apps.gsa.staticplugins.opa.promo.d r3 = com.google.android.apps.gsa.staticplugins.opa.promo.C109927d.f306290e
        L_0x06a3:
            java.lang.String r12 = "nga-promo-query"
            java.lang.String r3 = r3.f306295d
            r2.putExtra(r12, r3)
            goto L_0x06f1
        L_0x06ab:
            com.google.android.apps.gsa.opaonboarding.am r3 = com.google.android.apps.gsa.opaonboarding.C83880an.m133553o()
            r12 = r3
            com.google.android.apps.gsa.opaonboarding.g r12 = (com.google.android.apps.gsa.opaonboarding.C83940g) r12
            java.lang.String r14 = "opa_android:swipe_demo"
            r12.f228605a = r14
            com.google.android.apps.gsa.opaonboarding.e r14 = new com.google.android.apps.gsa.opaonboarding.e
            r7 = 0
            r14.<init>(r7, r11, r11)
            r12.f228607c = r14
            com.google.common.o.a.w r7 = com.google.common.p4552o.p4553a.C59567w.f158058g
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.common.o.a.v r7 = (com.google.common.p4552o.p4553a.C59566v) r7
            com.google.android.apps.gsa.assistant.shared.l.e r12 = com.google.android.apps.gsa.assistant.shared.l.e.bi
            r7.copyOnWrite()
            com.google.protobuf.bv r14 = r7.instance
            com.google.common.o.a.w r14 = (com.google.common.p4552o.p4553a.C59567w) r14
            int r12 = r12.ca
            r14.f158064e = r12
            int r12 = r14.f158060a
            r18 = 16
            r12 = r12 | 16
            r14.f158060a = r12
            com.google.protobuf.bv r7 = r7.build()
            com.google.common.o.a.w r7 = (com.google.common.p4552o.p4553a.C59567w) r7
            r3.mo77222b(r7)
            com.google.android.apps.gsa.opaonboarding.an r3 = r3.mo77221a()
            android.content.Intent r3 = r3.mo77240n()
            java.lang.String r7 = "opa-nga-target-intent"
            r2.putExtra(r7, r3)
        L_0x06f1:
            r3 = r19
            goto L_0x0706
        L_0x06f4:
            com.google.android.apps.gsa.staticplugins.opa.promo.d r3 = r6.f306275f
            if (r3 != 0) goto L_0x06fa
            com.google.android.apps.gsa.staticplugins.opa.promo.d r3 = com.google.android.apps.gsa.staticplugins.opa.promo.C109927d.f306290e
        L_0x06fa:
            java.lang.String r3 = r3.f306294c
            android.content.Intent r3 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142325x(r3)
            java.lang.String r7 = "opa-nga-target-intent"
            r2.putExtra(r7, r3)
            goto L_0x06f1
        L_0x0706:
            com.google.android.apps.gsa.staticplugins.opa.promo.C109945v.m183115c(r2, r3)
        L_0x0709:
            if (r2 != 0) goto L_0x0721
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.opa.promo.C109945v.f306345a
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r3, r15)
            java.lang.String r3 = "Click intent is not defined for the notification"
            r5 = 25415(0x6347, float:3.5614E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56386p(r3)
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
            goto L_0x07f7
        L_0x0721:
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            android.content.Context r12 = r1.f306350f
            android.content.Intent r7 = r7.setClassName(r12, r5)
            java.lang.String r12 = "com.google.android.search.core.action.OPA_NOTIFICATION_DISMISSED"
            android.content.Intent r7 = r7.setAction(r12)
            com.google.android.apps.gsa.staticplugins.opa.promo.C109945v.m183115c(r7, r3)
            r3 = 1
            android.app.PendingIntent r2 = r1.mo98267b(r2, r6, r8, r3)
            r3 = 2
            android.app.PendingIntent r7 = r1.mo98267b(r7, r6, r8, r3)
            android.content.Context r3 = r1.f306350f
            androidx.core.app.z r3 = com.google.android.apps.gsa.shared.p6974ae.C89095d.m144923a(r3, r11)
            android.app.Notification r12 = r3.f5679J
            r14 = 2131232436(0x7f0806b4, float:1.8080981E38)
            r12.icon = r14
            android.content.Context r12 = r1.f306350f
            android.content.res.Resources r12 = r12.getResources()
            r14 = 2131101684(0x7f0607f4, float:1.7815785E38)
            int r12 = r12.getColor(r14)
            r3.f5670A = r12
            r12 = 1
            r3.f5671B = r12
            java.lang.String r12 = r6.f306271b
            java.lang.CharSequence r12 = androidx.core.app.C1839z.m5037c(r12)
            r3.f5685e = r12
            java.lang.String r12 = r6.f306272c
            java.lang.CharSequence r12 = androidx.core.app.C1839z.m5037c(r12)
            r3.f5686f = r12
            r3.f5687g = r2
            android.app.Notification r2 = r3.f5679J
            r2.deleteIntent = r7
            java.lang.String r2 = r10.f94887a
            r3.f5675F = r2
            int r2 = r10.f94889c
            r3.f5690j = r2
            r2 = 16
            r7 = 1
            r3.mo5015d(r2, r7)
            com.google.protobuf.cq r2 = r6.f306276g
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x07c2
            com.google.protobuf.cq r2 = r6.f306276g
            r7 = 0
            java.lang.Object r2 = r2.get(r7)
            com.google.android.apps.gsa.staticplugins.opa.promo.f r2 = (com.google.android.apps.gsa.staticplugins.opa.promo.C109929f) r2
            com.google.android.apps.gsa.staticplugins.opa.promo.d r2 = r2.f306299b
            if (r2 != 0) goto L_0x0799
            com.google.android.apps.gsa.staticplugins.opa.promo.d r2 = com.google.android.apps.gsa.staticplugins.opa.promo.C109927d.f306290e
        L_0x0799:
            int r2 = r2.f306293b
            com.google.android.apps.gsa.staticplugins.opa.promo.c r2 = com.google.android.apps.gsa.staticplugins.opa.promo.C109926c.m183097a(r2)
            if (r2 != 0) goto L_0x07a3
            com.google.android.apps.gsa.staticplugins.opa.promo.c r2 = com.google.android.apps.gsa.staticplugins.opa.promo.C109926c.UNKNOWN
        L_0x07a3:
            com.google.android.apps.gsa.staticplugins.opa.promo.c r7 = com.google.android.apps.gsa.staticplugins.opa.promo.C109926c.TURN_OFF
            if (r2 != r7) goto L_0x07c2
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            android.content.Context r7 = r1.f306350f
            android.content.Intent r2 = r2.setClassName(r7, r5)
            java.lang.String r5 = "com.google.android.search.core.action.OPA_NOTIFICATION_ACTION_PRESSED"
            android.content.Intent r2 = r2.setAction(r5)
            java.lang.String r5 = "com.google.android.search.core.extra.NOTIFICATION_ACTION_FLAG"
            r7 = 1
            android.content.Intent r11 = r2.putExtra(r5, r7)
            com.google.android.apps.gsa.staticplugins.opa.promo.C109945v.m183115c(r11, r13)
        L_0x07c2:
            if (r11 != 0) goto L_0x07d9
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.opa.promo.C109945v.f306345a
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r3, r15)
            java.lang.String r3 = "Turn off intent is not defined for the notification"
            r5 = 25414(0x6346, float:3.5613E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56386p(r3)
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
            goto L_0x07f7
        L_0x07d9:
            r2 = 3
            android.app.PendingIntent r2 = r1.mo98267b(r11, r6, r8, r2)
            android.content.Context r5 = r1.f306350f
            android.content.res.Resources r5 = r5.getResources()
            r7 = 2132090789(0x7f151fa5, float:1.9821928E38)
            java.lang.String r5 = r5.getString(r7)
            r7 = 0
            r3.mo5016e(r7, r5, r2)
            android.app.Notification r2 = r3.mo5013a()
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
        L_0x07f7:
            boolean r3 = r2.mo56113h()
            if (r3 != 0) goto L_0x0811
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.opa.promo.C109945v.f306345a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r15)
            java.lang.String r1 = "It was not possible to create the notification content."
            r2 = 25420(0x634c, float:3.5621E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            goto L_0x0924
        L_0x0811:
            boolean r3 = r0.mo56113h()
            if (r3 == 0) goto L_0x0821
            java.lang.Object r0 = r0.mo56107c()
            com.google.common.o.oe r0 = (com.google.common.p4552o.C60321oe) r0
            r3 = 0
            com.google.android.apps.gsa.shared.logger.C89949q.m146521e(r0, r3)
        L_0x0821:
            com.google.assistant.y.d.j r0 = com.google.assistant.p4008y.p4013d.C53658j.f140828i
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.y.d.g r0 = (com.google.assistant.p4008y.p4013d.C53655g) r0
            long r5 = r6.f306274e
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.assistant.y.d.j r3 = (com.google.assistant.p4008y.p4013d.C53658j) r3
            r7 = 1
            r3.f140831b = r7
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r3.f140832c = r5
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.assistant.y.d.j r3 = (com.google.assistant.p4008y.p4013d.C53658j) r3
            r5 = 2
            r3.f140835f = r5
            int r6 = r3.f140830a
            r6 = r6 | r5
            r3.f140830a = r6
            com.google.assistant.ag.c.d r3 = com.google.assistant.p3803ag.p3809c.C49007d.f126766b
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.ag.c.a r3 = (com.google.assistant.p3803ag.p3809c.C48926a) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.assistant.ag.c.d r5 = (com.google.assistant.p3803ag.p3809c.C49007d) r5
            int r6 = r8.getNumber()
            r5.f126768a = r6
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.assistant.y.d.j r5 = (com.google.assistant.p4008y.p4013d.C53658j) r5
            com.google.protobuf.bv r3 = r3.build()
            com.google.assistant.ag.c.d r3 = (com.google.assistant.p3803ag.p3809c.C49007d) r3
            r3.getClass()
            r5.f140837h = r3
            int r3 = r5.f140830a
            r3 = r3 | 8
            r5.f140830a = r3
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.y.d.j r0 = (com.google.assistant.p4008y.p4013d.C53658j) r0
            r1.mo98268d(r0)
            if (r4 < r9) goto L_0x0888
            com.google.android.apps.gsa.assistant.shared.bo r0 = r1.f306348d
            r0.j()
            goto L_0x08e6
        L_0x0888:
            com.google.android.apps.gsa.tasks.t r0 = r1.f306354j
            com.google.android.apps.gsa.tasks.by r3 = com.google.android.apps.gsa.tasks.C118522by.OPA_NGA_PROMO_NOTIFICATION
            com.google.android.apps.gsa.tasks.ag r4 = com.google.android.apps.gsa.tasks.C118472ag.f328819i
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.apps.gsa.tasks.af r4 = (com.google.android.apps.gsa.tasks.C118471af) r4
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            com.google.android.apps.gsa.search.core.i.t r6 = r1.f306347c
            com.google.android.apps.gsa.shared.m.f r7 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248476bD
            long r6 = r6.mo79743a(r7)
            long r5 = r5.toMillis(r6)
            r4.copyOnWrite()
            com.google.protobuf.bv r7 = r4.instance
            com.google.android.apps.gsa.tasks.ag r7 = (com.google.android.apps.gsa.tasks.C118472ag) r7
            int r8 = r7.f328821a
            r9 = 1
            r8 = r8 | r9
            r7.f328821a = r8
            r7.f328822b = r5
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MINUTES
            r6 = 10
            long r5 = r5.toMillis(r6)
            r4.copyOnWrite()
            com.google.protobuf.bv r7 = r4.instance
            com.google.android.apps.gsa.tasks.ag r7 = (com.google.android.apps.gsa.tasks.C118472ag) r7
            int r8 = r7.f328821a
            r9 = 2
            r8 = r8 | r9
            r7.f328821a = r8
            r7.f328823c = r5
            com.google.protobuf.bv r4 = r4.build()
            com.google.android.apps.gsa.tasks.ag r4 = (com.google.android.apps.gsa.tasks.C118472ag) r4
            boolean r0 = r0.mo103754e(r3, r4)
            if (r0 != 0) goto L_0x08e6
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.opa.promo.C109945v.f306345a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r3, r15)
            java.lang.String r3 = "Failed to schedule exclusive background task: OPA_NGA_PROMO_NOTIFICATION"
            r4 = 25418(0x634a, float:3.5618E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56386p(r3)
        L_0x08e6:
            com.google.android.apps.gsa.search.core.i.t r0 = r1.f306347c
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248452ag
            boolean r0 = r0.mo79746e(r3)
            if (r0 == 0) goto L_0x08f3
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x0924
        L_0x08f3:
            androidx.core.app.aq r0 = r1.f306349e
            java.lang.Object r1 = r2.mo56107c()
            android.app.Notification r1 = (android.app.Notification) r1
            java.lang.String r2 = "op"
            r3 = 327686(0x50006, float:4.59186E-40)
            r0.mo5003b(r2, r3, r1)
            goto L_0x0924
        L_0x0904:
            com.google.assistant.ag.c.d r0 = com.google.assistant.p3803ag.p3809c.C49007d.f126766b
            int r0 = r0.f126768a
            com.google.assistant.ag.c.c r0 = com.google.assistant.p3803ag.p3809c.C48980c.m85331a(r0)
            if (r0 != 0) goto L_0x0910
            com.google.assistant.ag.c.c r0 = com.google.assistant.p3803ag.p3809c.C48980c.UNRECOGNIZED
        L_0x0910:
            com.google.assistant.y.d.o r2 = com.google.assistant.p4008y.p4013d.C53663o.INVALID_PAYLOAD
            r1.mo98269e(r6, r0, r2)
            goto L_0x091d
        L_0x0916:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.assistant.y.d.o r0 = com.google.assistant.p4008y.p4013d.C53663o.NGA_NOT_ELIGIBLE
            r1.mo98269e(r6, r8, r0)
        L_0x091d:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.assistant.shared.bo r0 = r1.f306348d
            r0.k()
        L_0x0924:
            com.google.android.apps.gsa.x.c r0 = com.google.android.apps.gsa.p8883x.C118826c.f331422a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.promo.C109944u.call():java.lang.Object");
    }
}
