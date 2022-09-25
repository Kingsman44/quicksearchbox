package com.google.android.apps.gsa.staticplugins.accl.performers.p7346g;

import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.g.af */
/* compiled from: PG */
public final class C93084af extends C22538o {

    /* renamed from: a */
    private static final C59071e f259657a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.g.af");

    /* renamed from: b */
    private final C68214a f259658b;

    /* renamed from: c */
    private final C68214a f259659c;

    /* renamed from: d */
    private final C68214a f259660d;

    /* renamed from: e */
    private final C68214a f259661e;

    public C93084af(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4) {
        this.f259658b = aVar;
        this.f259659c = aVar2;
        this.f259660d = aVar3;
        this.f259661e = aVar4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x022c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo20765a(com.google.assistant.p3897e.p3921j.C51809dy r17, com.google.android.libraries.gsa.conversation.clientop.C22434e r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = r1.f135936b
            java.lang.String r3 = "media.ON_DEVICE_LOOKUP"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x04f9
            com.google.assistant.e.j.dw r1 = r1.f135938d
            if (r1 != 0) goto L_0x0014
            com.google.assistant.e.j.dw r1 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x0014:
            com.google.assistant.e.j.xs r2 = com.google.assistant.p3897e.p3921j.C52599xs.f138109b
            com.google.protobuf.eb r2 = r2.getParserForType()
            java.lang.String r3 = "media_on_device_lookup_args"
            com.google.protobuf.MessageLite r1 = m41992m(r1, r3, r2)
            com.google.assistant.e.j.xs r1 = (com.google.assistant.p3897e.p3921j.C52599xs) r1
            com.google.protobuf.cq r2 = r1.f138111a
            int r2 = r2.size()
            if (r2 != 0) goto L_0x0043
            com.google.common.f.e r1 = f259657a
            com.google.common.f.x r1 = r1.mo56225c()
            r2 = 13354(0x342a, float:1.8713E-41)
            java.lang.String r3 = "No media item in MediaOnDeviceLookupArgs."
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r2)).mo56386p(r3)
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            com.google.assistant.e.j.ec r1 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r1, r3)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x04f8
        L_0x0043:
            com.google.protobuf.cq r1 = r1.f138111a
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            com.google.assistant.e.j.xr r1 = (com.google.assistant.p3897e.p3921j.C52598xr) r1
            int r3 = r1.f138105a
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L_0x04e1
            com.google.assistant.e.c.c.gh r3 = r1.f138107c
            if (r3 != 0) goto L_0x0058
            com.google.assistant.e.c.c.gh r3 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x0058:
            java.lang.String r3 = com.google.android.apps.gsa.staticplugins.accl.performers.p7346g.C93094ap.m153165m(r3)
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 == 0) goto L_0x007b
            com.google.common.f.e r1 = f259657a
            com.google.common.f.x r1 = r1.mo56225c()
            r2 = 13352(0x3428, float:1.871E-41)
            java.lang.String r3 = "No Android app package name in MediaOnDeviceLookupArgs."
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r2)).mo56386p(r3)
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            com.google.assistant.e.j.ec r1 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r1, r3)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x04f8
        L_0x007b:
            com.google.assistant.e.j.wo r5 = r1.f138106b
            if (r5 != 0) goto L_0x0081
            com.google.assistant.e.j.wo r5 = com.google.assistant.p3897e.p3921j.C52568wo.f137992v
        L_0x0081:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.String r7 = r5.f137998e
            java.lang.String r8 = r5.f137999f
            java.lang.String r9 = r5.f138000g
            boolean r10 = android.text.TextUtils.isEmpty(r7)
            java.lang.String r11 = "artists"
            java.lang.String r12 = "albums"
            java.lang.String r14 = "songs"
            r15 = 2
            if (r10 == 0) goto L_0x00b5
            boolean r10 = android.text.TextUtils.isEmpty(r8)
            if (r10 == 0) goto L_0x00b5
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 == 0) goto L_0x00b5
            com.google.common.f.e r5 = f259657a
            com.google.common.f.x r5 = r5.mo56225c()
            java.lang.String r7 = "Failed to create IcingClientEntity; none of entity, artist, album is set."
            r8 = 13348(0x3424, float:1.8705E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r8)).mo56386p(r7)
        L_0x00b2:
            r2 = 0
            goto L_0x01b5
        L_0x00b5:
            int r10 = r5.f137994a
            r10 = r10 & 512(0x200, float:7.175E-43)
            if (r10 == 0) goto L_0x00e4
            int r5 = r5.f138003j
            com.google.assistant.e.j.wn r5 = com.google.assistant.p3897e.p3921j.C52567wn.m86649b(r5)
            if (r5 != 0) goto L_0x00c5
            com.google.assistant.e.j.wn r5 = com.google.assistant.p3897e.p3921j.C52567wn.UNKNOWN
        L_0x00c5:
            int r10 = r5.ordinal()
            if (r10 == r4) goto L_0x00e2
            if (r10 == r15) goto L_0x00e0
            r13 = 3
            if (r10 == r13) goto L_0x00de
            com.google.common.f.e r10 = f259657a
            com.google.common.f.x r10 = r10.mo56224b()
            java.lang.String r13 = "invalid type in MediaItemMetadata: %s"
            r2 = 13347(0x3423, float:1.8703E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r2)).mo56389s(r13, r5)
            goto L_0x00e4
        L_0x00de:
            r2 = r11
            goto L_0x00e6
        L_0x00e0:
            r2 = r12
            goto L_0x00e6
        L_0x00e2:
            r2 = r14
            goto L_0x00e6
        L_0x00e4:
            java.lang.String r2 = ""
        L_0x00e6:
            com.google.bb.a.di r5 = com.google.p4152bb.p4153a.C55032di.f144777j
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.bb.a.dh r5 = (com.google.p4152bb.p4153a.C55031dh) r5
            boolean r10 = android.text.TextUtils.isEmpty(r7)
            if (r10 != 0) goto L_0x010d
            boolean r8 = r2.equals(r14)
            if (r8 == 0) goto L_0x010b
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.bb.a.di r8 = (com.google.p4152bb.p4153a.C55032di) r8
            r7.getClass()
            int r9 = r8.f144779a
            r9 = r9 | r4
            r8.f144779a = r9
            r8.f144780b = r7
        L_0x010b:
            r8 = r7
            goto L_0x0114
        L_0x010d:
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 != 0) goto L_0x0114
            r8 = r9
        L_0x0114:
            boolean r9 = android.text.TextUtils.isEmpty(r2)
            if (r9 != 0) goto L_0x014b
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.bb.a.di r7 = (com.google.p4152bb.p4153a.C55032di) r7
            int r9 = r7.f144779a
            r9 = r9 | 4
            r7.f144779a = r9
            r7.f144782d = r2
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.bb.a.di r7 = (com.google.p4152bb.p4153a.C55032di) r7
            int r9 = r7.f144779a
            r9 = r9 | 32
            r7.f144779a = r9
            r7.f144785g = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.google.protobuf.bv r5 = r5.build()
            com.google.bb.a.di r5 = (com.google.p4152bb.p4153a.C55032di) r5
            r2.add(r5)
            android.util.Pair r2 = android.util.Pair.create(r2, r8)
            goto L_0x01b5
        L_0x014b:
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            if (r2 == 0) goto L_0x0160
            com.google.common.f.e r2 = f259657a
            com.google.common.f.x r2 = r2.mo56225c()
            java.lang.String r5 = "Failed to create IcingClientEntity; neither of corpus and entity-title is set."
            r7 = 13346(0x3422, float:1.8702E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r7)).mo56386p(r5)
            goto L_0x00b2
        L_0x0160:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89848p(r14, r12, r11)
            r7 = r5
            com.google.common.b.pq r7 = (com.google.common.p4522b.C58724pq) r7
            int r7 = r7.f156474d
            r9 = 0
        L_0x016f:
            if (r9 >= r7) goto L_0x01b1
            java.lang.Object r10 = r5.get(r9)
            java.lang.String r10 = (java.lang.String) r10
            com.google.bb.a.di r13 = com.google.p4152bb.p4153a.C55032di.f144777j
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.bb.a.dh r13 = (com.google.p4152bb.p4153a.C55031dh) r13
            r13.copyOnWrite()
            com.google.protobuf.bv r4 = r13.instance
            com.google.bb.a.di r4 = (com.google.p4152bb.p4153a.C55032di) r4
            r10.getClass()
            int r15 = r4.f144779a
            r15 = r15 | 32
            r4.f144779a = r15
            r4.f144785g = r10
            r13.copyOnWrite()
            com.google.protobuf.bv r4 = r13.instance
            com.google.bb.a.di r4 = (com.google.p4152bb.p4153a.C55032di) r4
            r10.getClass()
            int r15 = r4.f144779a
            r15 = r15 | 4
            r4.f144779a = r15
            r4.f144782d = r10
            com.google.protobuf.bv r4 = r13.build()
            com.google.bb.a.di r4 = (com.google.p4152bb.p4153a.C55032di) r4
            r2.add(r4)
            int r9 = r9 + 1
            r4 = 1
            r15 = 2
            goto L_0x016f
        L_0x01b1:
            android.util.Pair r2 = android.util.Pair.create(r2, r8)
        L_0x01b5:
            if (r2 != 0) goto L_0x01b8
            goto L_0x0218
        L_0x01b8:
            java.lang.Object r4 = r2.second
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r2.first
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x01c4:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0218
            java.lang.Object r5 = r2.next()
            com.google.bb.a.di r5 = (com.google.p4152bb.p4153a.C55032di) r5
            com.google.bb.a.dl r7 = com.google.p4152bb.p4153a.C55035dl.f144790f
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.bb.a.dg r7 = (com.google.p4152bb.p4153a.C55030dg) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.bb.a.dl r8 = (com.google.p4152bb.p4153a.C55035dl) r8
            r3.getClass()
            int r9 = r8.f144793a
            r10 = 2
            r9 = r9 | r10
            r8.f144793a = r9
            r8.f144795c = r3
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.bb.a.dl r8 = (com.google.p4152bb.p4153a.C55035dl) r8
            r4.getClass()
            int r9 = r8.f144793a
            r10 = 1
            r9 = r9 | r10
            r8.f144793a = r9
            r8.f144794b = r4
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.bb.a.dl r8 = (com.google.p4152bb.p4153a.C55035dl) r8
            r8.f144797e = r10
            int r9 = r8.f144793a
            r9 = r9 | 32
            r8.f144793a = r9
            r7.mo54171b(r5)
            com.google.protobuf.bv r5 = r7.build()
            com.google.bb.a.dl r5 = (com.google.p4152bb.p4153a.C55035dl) r5
            r6.add(r5)
            goto L_0x01c4
        L_0x0218:
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L_0x022c
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            java.lang.String r2 = "Failed to create Icing query."
            com.google.assistant.e.j.ec r1 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r1, r2)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x04f8
        L_0x022c:
            dagger.a r2 = r0.f259658b
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.search.core.ae.a.a r2 = (com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84418a) r2
            com.google.android.apps.gsa.search.core.ae.a.ag r2 = r2.mo77986c()
            if (r2 != 0) goto L_0x0253
            com.google.common.f.e r1 = f259657a
            com.google.common.f.x r1 = r1.mo56225c()
            r2 = 13351(0x3427, float:1.8709E-41)
            java.lang.String r3 = "Icing connection is null."
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r2)).mo56386p(r3)
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.UNAVAILABLE
            com.google.assistant.e.j.ec r1 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r1, r3)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x04f8
        L_0x0253:
            r4 = 1
            r2.mo77999f(r4)
            dagger.a r4 = r0.f259660d
            dagger.a r5 = r0.f259661e
            com.google.android.apps.gsa.search.core.ak.a.f r7 = new com.google.android.apps.gsa.search.core.ak.a.f
            r7.<init>((com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84425ag) r2, (dagger.C68214a) r4, (dagger.C68214a) r5)
            java.util.Iterator r2 = r6.iterator()
        L_0x0264:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0278
            java.lang.Object r4 = r2.next()
            com.google.bb.a.dl r4 = (com.google.p4152bb.p4153a.C55035dl) r4
            com.google.android.apps.gsa.search.core.ak.a.e r4 = r7.mo78340a(r4)
            if (r4 == 0) goto L_0x0264
            r13 = r4
            goto L_0x0279
        L_0x0278:
            r13 = 0
        L_0x0279:
            com.google.assistant.e.j.wo r2 = r1.f138106b
            if (r2 != 0) goto L_0x027f
            com.google.assistant.e.j.wo r2 = com.google.assistant.p3897e.p3921j.C52568wo.f137992v
        L_0x027f:
            com.google.assistant.e.c.c.gh r1 = r1.f138107c
            if (r1 != 0) goto L_0x0285
            com.google.assistant.e.c.c.gh r1 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x0285:
            if (r13 == 0) goto L_0x04c9
            java.lang.String r4 = r13.f230168d
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x0291
            goto L_0x04c9
        L_0x0291:
            com.google.assistant.e.j.xy r4 = com.google.assistant.p3897e.p3921j.C52605xy.f138123d
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.e.j.xx r4 = (com.google.assistant.p3897e.p3921j.C52604xx) r4
            com.google.assistant.e.j.wo r5 = com.google.assistant.p3897e.p3921j.C52568wo.f137992v
            com.google.protobuf.bn r2 = r5.createBuilder(r2)
            com.google.assistant.e.j.wj r2 = (com.google.assistant.p3897e.p3921j.C52563wj) r2
            java.lang.String r5 = r13.f230165a
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x02bd
            java.lang.String r5 = r13.f230165a
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            com.google.assistant.e.j.wo r6 = (com.google.assistant.p3897e.p3921j.C52568wo) r6
            r5.getClass()
            int r7 = r6.f137994a
            r8 = 1
            r7 = r7 | r8
            r6.f137994a = r7
            r6.f137998e = r5
        L_0x02bd:
            java.lang.String r5 = r13.f230166b
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x02d9
            java.lang.String r5 = r13.f230166b
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            com.google.assistant.e.j.wo r6 = (com.google.assistant.p3897e.p3921j.C52568wo) r6
            r5.getClass()
            int r7 = r6.f137994a
            r7 = r7 | 32
            r6.f137994a = r7
            r6.f138002i = r5
        L_0x02d9:
            java.lang.String r5 = r13.f230171g
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x036b
            java.lang.String r5 = r13.f230171g
            int r6 = r5.hashCode()
            r7 = -1415163932(0xffffffffaba64fe4, float:-1.1817184E-12)
            if (r6 == r7) goto L_0x0307
            r7 = -732362228(0xffffffffd4590a0c, float:-3.72870585E12)
            if (r6 == r7) goto L_0x02ff
            r7 = 109620734(0x688adfe, float:5.141317E-35)
            if (r6 == r7) goto L_0x02f7
            goto L_0x030f
        L_0x02f7:
            boolean r5 = r5.equals(r14)
            if (r5 == 0) goto L_0x030f
            r5 = 2
            goto L_0x0310
        L_0x02ff:
            boolean r5 = r5.equals(r11)
            if (r5 == 0) goto L_0x030f
            r5 = 1
            goto L_0x0310
        L_0x0307:
            boolean r5 = r5.equals(r12)
            if (r5 == 0) goto L_0x030f
            r5 = 0
            goto L_0x0310
        L_0x030f:
            r5 = -1
        L_0x0310:
            if (r5 == 0) goto L_0x0358
            r6 = 1
            if (r5 == r6) goto L_0x0344
            r6 = 2
            if (r5 == r6) goto L_0x0330
            com.google.common.f.e r5 = f259657a
            com.google.common.f.x r5 = r5.mo56226d()
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            r6 = 13350(0x3426, float:1.8707E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r6)
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            java.lang.String r6 = "Invalid type in IcingMatch: %s"
            java.lang.String r7 = r13.f230171g
            r5.mo56389s(r6, r7)
            goto L_0x036b
        L_0x0330:
            com.google.assistant.e.j.wn r5 = com.google.assistant.p3897e.p3921j.C52567wn.TRACK
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            com.google.assistant.e.j.wo r6 = (com.google.assistant.p3897e.p3921j.C52568wo) r6
            int r5 = r5.f137991y
            r6.f138003j = r5
            int r5 = r6.f137994a
            r5 = r5 | 512(0x200, float:7.175E-43)
            r6.f137994a = r5
            goto L_0x036b
        L_0x0344:
            com.google.assistant.e.j.wn r5 = com.google.assistant.p3897e.p3921j.C52567wn.ARTIST
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            com.google.assistant.e.j.wo r6 = (com.google.assistant.p3897e.p3921j.C52568wo) r6
            int r5 = r5.f137991y
            r6.f138003j = r5
            int r5 = r6.f137994a
            r5 = r5 | 512(0x200, float:7.175E-43)
            r6.f137994a = r5
            goto L_0x036b
        L_0x0358:
            com.google.assistant.e.j.wn r5 = com.google.assistant.p3897e.p3921j.C52567wn.ALBUM
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            com.google.assistant.e.j.wo r6 = (com.google.assistant.p3897e.p3921j.C52568wo) r6
            int r5 = r5.f137991y
            r6.f138003j = r5
            int r5 = r6.f137994a
            r5 = r5 | 512(0x200, float:7.175E-43)
            r6.f137994a = r5
        L_0x036b:
            com.google.assistant.e.j.xw r5 = com.google.assistant.p3897e.p3921j.C52603xw.f138117d
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.e.j.xv r5 = (com.google.assistant.p3897e.p3921j.C52602xv) r5
            java.lang.String r6 = r13.f230168d
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.assistant.e.j.xw r7 = (com.google.assistant.p3897e.p3921j.C52603xw) r7
            r6.getClass()
            int r8 = r7.f138119a
            r9 = 2
            r8 = r8 | r9
            r7.f138119a = r8
            r7.f138120b = r6
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.assistant.e.j.xw r6 = (com.google.assistant.p3897e.p3921j.C52603xw) r6
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.e.j.wo r2 = (com.google.assistant.p3897e.p3921j.C52568wo) r2
            r2.getClass()
            r6.f138121c = r2
            int r2 = r6.f138119a
            r2 = r2 | 4
            r6.f138119a = r2
            r4.copyOnWrite()
            com.google.protobuf.bv r2 = r4.instance
            com.google.assistant.e.j.xy r2 = (com.google.assistant.p3897e.p3921j.C52605xy) r2
            com.google.protobuf.bv r5 = r5.build()
            com.google.assistant.e.j.xw r5 = (com.google.assistant.p3897e.p3921j.C52603xw) r5
            r5.getClass()
            com.google.protobuf.cq r6 = r2.f138127c
            boolean r7 = r6.mo58948c()
            if (r7 != 0) goto L_0x03bd
            com.google.protobuf.cq r6 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r6)
            r2.f138127c = r6
        L_0x03bd:
            com.google.protobuf.cq r2 = r2.f138127c
            r2.add(r5)
            java.lang.String r2 = r13.f230170f
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0448
            java.lang.String r2 = r13.f230170f
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0448
            java.lang.String r1 = r13.f230170f
            com.google.assistant.e.c.c.ev r2 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.c.c.es r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51055es) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.assistant.e.c.c.ev r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r3
            r1.getClass()
            int r5 = r3.f132943a
            r6 = 1
            r5 = r5 | r6
            r3.f132943a = r5
            r3.f132944b = r1
            dagger.a r3 = r0.f259659c
            java.lang.Object r3 = r3.mo27525b()
            android.content.pm.PackageManager r3 = (android.content.pm.PackageManager) r3
            android.content.Intent r1 = r3.getLaunchIntentForPackage(r1)
            if (r1 == 0) goto L_0x0413
            r3 = 0
            java.lang.String r1 = r1.toUri(r3)
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.assistant.e.c.c.ev r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r3
            r1.getClass()
            int r5 = r3.f132943a
            r5 = r5 | 32
            r3.f132943a = r5
            r3.f132949g = r1
        L_0x0413:
            com.google.assistant.e.c.c.gh r1 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.c.c.gg r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51097gg) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.e.c.c.gh r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r3
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.e.c.c.ev r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r2
            r2.getClass()
            r3.f133013c = r2
            r2 = 1
            r3.f133012b = r2
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.e.c.c.gh r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r1
            r4.copyOnWrite()
            com.google.protobuf.bv r3 = r4.instance
            com.google.assistant.e.j.xy r3 = (com.google.assistant.p3897e.p3921j.C52605xy) r3
            r1.getClass()
            r3.f138126b = r1
            int r1 = r3.f138125a
            r1 = r1 | r2
            r3.f138125a = r1
            goto L_0x045a
        L_0x0448:
            r2 = 1
            r4.copyOnWrite()
            com.google.protobuf.bv r3 = r4.instance
            com.google.assistant.e.j.xy r3 = (com.google.assistant.p3897e.p3921j.C52605xy) r3
            r1.getClass()
            r3.f138126b = r1
            int r1 = r3.f138125a
            r1 = r1 | r2
            r3.f138125a = r1
        L_0x045a:
            com.google.assistant.e.j.xu r1 = com.google.assistant.p3897e.p3921j.C52601xu.f138113b
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.j.xt r1 = (com.google.assistant.p3897e.p3921j.C52600xt) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.e.j.xu r2 = (com.google.assistant.p3897e.p3921j.C52601xu) r2
            com.google.protobuf.bv r3 = r4.build()
            com.google.assistant.e.j.xy r3 = (com.google.assistant.p3897e.p3921j.C52605xy) r3
            r3.getClass()
            com.google.protobuf.cq r4 = r2.f138115a
            boolean r5 = r4.mo58948c()
            if (r5 != 0) goto L_0x0480
            com.google.protobuf.cq r4 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r4)
            r2.f138115a = r4
        L_0x0480:
            com.google.protobuf.cq r2 = r2.f138115a
            r2.add(r3)
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.e.j.xu r1 = (com.google.assistant.p3897e.p3921j.C52601xu) r1
            com.google.assistant.e.j.ec r2 = com.google.assistant.p3897e.p3921j.C52070ec.f136651d
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.j.dz r2 = (com.google.assistant.p3897e.p3921j.C51810dz) r2
            com.google.assistant.e.j.eb r3 = com.google.assistant.p3897e.p3921j.C52069eb.f136648b
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.e.j.ea r3 = (com.google.assistant.p3897e.p3921j.C52068ea) r3
            java.lang.String r4 = "assistant.api.client_op.MediaOnDeviceLookupOpResult"
            com.google.protobuf.z r1 = r1.toByteString()
            java.lang.String r5 = "media_on_device_lookup_op_result"
            com.google.assistant.e.j.kc r1 = com.google.android.apps.gsa.staticplugins.accl.performers.p7346g.C93094ap.m153163i(r5, r4, r1)
            r3.mo53780b(r1)
            r2.copyOnWrite()
            com.google.protobuf.bv r1 = r2.instance
            com.google.assistant.e.j.ec r1 = (com.google.assistant.p3897e.p3921j.C52070ec) r1
            com.google.protobuf.bv r3 = r3.build()
            com.google.assistant.e.j.eb r3 = (com.google.assistant.p3897e.p3921j.C52069eb) r3
            r3.getClass()
            r1.f136655c = r3
            int r3 = r1.f136653a
            r4 = 2
            r3 = r3 | r4
            r1.f136653a = r3
            com.google.protobuf.bv r1 = r2.build()
            com.google.assistant.e.j.ec r1 = (com.google.assistant.p3897e.p3921j.C52070ec) r1
            goto L_0x04dc
        L_0x04c9:
            com.google.common.f.e r1 = f259657a
            com.google.common.f.x r1 = r1.mo56226d()
            r2 = 13349(0x3425, float:1.8706E-41)
            java.lang.String r3 = "Failed to get matched result from Icing API."
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r2)).mo56386p(r3)
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.NOT_FOUND
            com.google.assistant.e.j.ec r1 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r1, r3)
        L_0x04dc:
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x04f8
        L_0x04e1:
            com.google.common.f.e r1 = f259657a
            com.google.common.f.x r1 = r1.mo56225c()
            r2 = 13353(0x3429, float:1.8712E-41)
            java.lang.String r3 = "No media meta data in MediaOnDeviceLookupArgs."
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r2)).mo56386p(r3)
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            com.google.assistant.e.j.ec r1 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r1, r3)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
        L_0x04f8:
            return r1
        L_0x04f9:
            com.google.android.libraries.gsa.conversation.clientop.d r2 = new com.google.android.libraries.gsa.conversation.clientop.d
            r2.<init>(r1)
            goto L_0x0500
        L_0x04ff:
            throw r2
        L_0x0500:
            goto L_0x04ff
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.accl.performers.p7346g.C93084af.mo20765a(com.google.assistant.e.j.dy, com.google.android.libraries.gsa.conversation.clientop.e):com.google.common.util.concurrent.cx");
    }
}
