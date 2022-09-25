package com.google.android.libraries.search.assistant.p2497ab;

import com.google.common.util.concurrent.C60804al;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.libraries.search.assistant.ab.z */
/* compiled from: PG */
public final /* synthetic */ class C32431z implements C60804al {

    /* renamed from: a */
    public final /* synthetic */ Locale f86898a;

    /* renamed from: b */
    public final /* synthetic */ Map f86899b;

    /* renamed from: c */
    public final /* synthetic */ long f86900c;

    /* renamed from: d */
    public final /* synthetic */ Map f86901d;

    public /* synthetic */ C32431z(Locale locale, Map map, long j, Map map2) {
        this.f86898a = locale;
        this.f86899b = map;
        this.f86900c = j;
        this.f86901d = map2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo20085a(com.google.common.util.concurrent.C60812at r21, java.lang.Object r22) {
        /*
            r20 = this;
            r0 = r20
            java.util.Locale r1 = r0.f86898a
            java.util.Map r2 = r0.f86899b
            long r3 = r0.f86900c
            java.util.Map r5 = r0.f86901d
            r6 = r22
            android.database.Cursor r6 = (android.database.Cursor) r6
            com.google.common.f.e r7 = com.google.android.libraries.search.assistant.p2497ab.C32359aa.f86743a
            if (r6 == 0) goto L_0x0257
            int r7 = r6.getCount()
            if (r7 != 0) goto L_0x001a
            goto L_0x0257
        L_0x001a:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x001f:
            boolean r8 = r6.moveToNext()
            if (r8 == 0) goto L_0x023e
            java.lang.String r8 = "address"
            java.lang.String r8 = com.google.android.libraries.search.assistant.p2497ab.C32359aa.m60171d(r6, r8)
            java.lang.String r9 = ""
            java.lang.Object r10 = p3186j$.util.Map.EL.getOrDefault(r5, r8, r9)
            java.lang.String r10 = (java.lang.String) r10
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 == 0) goto L_0x0048
            java.lang.String r10 = r1.getCountry()
            java.lang.String r8 = android.telephony.PhoneNumberUtils.formatNumberToE164(r8, r10)
            java.lang.Object r8 = p3186j$.util.Map.EL.getOrDefault(r5, r8, r9)
            r10 = r8
            java.lang.String r10 = (java.lang.String) r10
        L_0x0048:
            boolean r8 = android.text.TextUtils.isEmpty(r10)
            if (r8 != 0) goto L_0x023a
            j$.util.Optional r8 = com.google.android.libraries.search.assistant.p2497ab.C32359aa.m60172e(r6)
            java.lang.String r9 = "date"
            j$.util.Optional r9 = com.google.android.libraries.search.assistant.p2497ab.C32359aa.m60170c(r6, r9)
            java.lang.String r11 = "body"
            java.lang.String r11 = com.google.android.libraries.search.assistant.p2497ab.C32359aa.m60171d(r6, r11)
            int r11 = r11.length()
            double r11 = (double) r11
            boolean r13 = r8.isEmpty()
            r15 = 1
            r14 = 2
            if (r13 == 0) goto L_0x006e
        L_0x006b:
            r8 = 3
        L_0x006c:
            r13 = 3
            goto L_0x0081
        L_0x006e:
            java.lang.Object r8 = r8.get()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 == r15) goto L_0x007f
            if (r8 == r14) goto L_0x007d
            goto L_0x006b
        L_0x007d:
            r8 = 2
            goto L_0x006c
        L_0x007f:
            r8 = 1
            goto L_0x006c
        L_0x0081:
            if (r8 == r13) goto L_0x023a
            boolean r13 = r9.isEmpty()
            if (r13 != 0) goto L_0x023a
            boolean r13 = android.text.TextUtils.isEmpty(r10)
            if (r13 != 0) goto L_0x023a
            boolean r13 = r2.containsKey(r10)
            if (r13 == 0) goto L_0x023a
            java.lang.Object r9 = r9.get()
            java.lang.Long r9 = (java.lang.Long) r9
            long r16 = r9.longValue()
            long r16 = r3 - r16
            j$.time.Duration r9 = p3186j$.time.Duration.ofMillis(r16)
            java.lang.Object r10 = r2.get(r10)
            com.google.android.libraries.search.assistant.ab.ag r10 = (com.google.android.libraries.search.assistant.p2497ab.C32365ag) r10
            j$.time.Duration r13 = com.google.android.libraries.search.assistant.p2497ab.C32359aa.f86744b
            int r13 = r9.compareTo((p3186j$.time.Duration) r13)
            if (r13 < 0) goto L_0x00bb
            j$.util.Optional r8 = p3186j$.util.Optional.empty()
            r19 = r1
            goto L_0x0229
        L_0x00bb:
            double[] r13 = com.google.android.libraries.search.assistant.p2497ab.C32359aa.f86748f
            long r14 = r9.toDays()
            int r15 = (int) r14
            r14 = r13[r15]
            java.lang.Double.isNaN(r11)
            double r11 = r11 * r14
            int r8 = r8 + -1
            r16 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            r18 = 32768(0x8000, float:4.5918E-41)
            if (r8 == 0) goto L_0x019e
            com.google.android.libraries.search.assistant.ab.bm r8 = com.google.android.libraries.search.assistant.p2497ab.C32398bm.f86831r
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.libraries.search.assistant.ab.bl r8 = (com.google.android.libraries.search.assistant.p2497ab.C32397bl) r8
            java.lang.String r13 = r10.f86761b
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.android.libraries.search.assistant.ab.bm r0 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r0
            r13.getClass()
            r19 = r1
            int r1 = r0.f86833a
            r1 = r1 | 2048(0x800, float:2.87E-42)
            r0.f86833a = r1
            r0.f86844l = r13
            boolean r0 = r10.f86763d
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.android.libraries.search.assistant.ab.bm r1 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r1
            int r10 = r1.f86833a
            r10 = r10 | 512(0x200, float:7.175E-43)
            r1.f86833a = r10
            r1.f86843k = r0
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.android.libraries.search.assistant.ab.bm r0 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r0
            r1 = 2
            r0.f86834b = r1
            int r10 = r0.f86833a
            r13 = 1
            r10 = r10 | r13
            r0.f86833a = r10
            long r9 = r9.toMillis()
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.android.libraries.search.assistant.ab.bm r0 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r0
            int r13 = r0.f86833a
            r1 = r1 | r13
            r0.f86833a = r1
            r0.f86835c = r9
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.android.libraries.search.assistant.ab.bm r0 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r0
            int r1 = r0.f86833a
            r1 = r1 | r18
            r0.f86833a = r1
            r0.f86848p = r14
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.android.libraries.search.assistant.ab.bm r0 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r0
            int r1 = r0.f86833a
            r1 = r1 | 4096(0x1000, float:5.74E-42)
            r0.f86833a = r1
            r0.f86845m = r14
            double r14 = r14 * r16
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.android.libraries.search.assistant.ab.bm r0 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r0
            int r1 = r0.f86833a
            r1 = r1 | 128(0x80, float:1.794E-43)
            r0.f86833a = r1
            r0.f86841i = r14
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.android.libraries.search.assistant.ab.bm r0 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r0
            int r1 = r0.f86833a
            r1 = r1 | 256(0x100, float:3.59E-43)
            r0.f86833a = r1
            r0.f86842j = r14
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.android.libraries.search.assistant.ab.bm r0 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r0
            int r1 = r0.f86833a
            r1 = r1 | 16384(0x4000, float:2.2959E-41)
            r0.f86833a = r1
            r0.f86847o = r11
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.android.libraries.search.assistant.ab.bm r0 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r0
            int r1 = r0.f86833a
            r1 = r1 | 8192(0x2000, float:1.14794E-41)
            r0.f86833a = r1
            r0.f86846n = r11
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.android.libraries.search.assistant.ab.bm r0 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r0
            int r1 = r0.f86833a
            r9 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 | r9
            r0.f86833a = r1
            r0.f86849q = r11
            com.google.protobuf.bv r0 = r8.build()
            com.google.android.libraries.search.assistant.ab.bm r0 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r0
            j$.util.Optional r8 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x0229
        L_0x019e:
            r19 = r1
            com.google.android.libraries.search.assistant.ab.bm r0 = com.google.android.libraries.search.assistant.p2497ab.C32398bm.f86831r
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.libraries.search.assistant.ab.bl r0 = (com.google.android.libraries.search.assistant.p2497ab.C32397bl) r0
            java.lang.String r1 = r10.f86761b
            r0.copyOnWrite()
            com.google.protobuf.bv r8 = r0.instance
            com.google.android.libraries.search.assistant.ab.bm r8 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r8
            r1.getClass()
            int r13 = r8.f86833a
            r13 = r13 | 2048(0x800, float:2.87E-42)
            r8.f86833a = r13
            r8.f86844l = r1
            boolean r1 = r10.f86763d
            r0.copyOnWrite()
            com.google.protobuf.bv r8 = r0.instance
            com.google.android.libraries.search.assistant.ab.bm r8 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r8
            int r10 = r8.f86833a
            r10 = r10 | 512(0x200, float:7.175E-43)
            r8.f86833a = r10
            r8.f86843k = r1
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.libraries.search.assistant.ab.bm r1 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r1
            r8 = 2
            r1.f86834b = r8
            int r10 = r1.f86833a
            r13 = 1
            r10 = r10 | r13
            r1.f86833a = r10
            long r9 = r9.toMillis()
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.libraries.search.assistant.ab.bm r1 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r1
            int r13 = r1.f86833a
            r8 = r8 | r13
            r1.f86833a = r8
            r1.f86835c = r9
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.libraries.search.assistant.ab.bm r1 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r1
            int r8 = r1.f86833a
            r8 = r8 | r18
            r1.f86833a = r8
            r1.f86848p = r14
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.libraries.search.assistant.ab.bm r1 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r1
            int r8 = r1.f86833a
            r8 = r8 | 256(0x100, float:3.59E-43)
            r1.f86833a = r8
            double r14 = r14 * r16
            r1.f86842j = r14
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.libraries.search.assistant.ab.bm r1 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r1
            int r8 = r1.f86833a
            r9 = 65536(0x10000, float:9.18355E-41)
            r8 = r8 | r9
            r1.f86833a = r8
            r1.f86849q = r11
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.libraries.search.assistant.ab.bm r0 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r0
            j$.util.Optional r8 = p3186j$.util.Optional.m71637of(r0)
        L_0x0229:
            p3186j$.util.Objects.requireNonNull(r7)
            com.google.android.libraries.search.assistant.ab.f r0 = new com.google.android.libraries.search.assistant.ab.f
            r0.<init>(r7)
            r8.ifPresent(r0)
            r0 = r20
            r1 = r19
            goto L_0x001f
        L_0x023a:
            r0 = r20
            goto L_0x001f
        L_0x023e:
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0252
            com.google.common.f.e r0 = com.google.android.libraries.search.assistant.p2497ab.C32359aa.f86743a
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r1 = "Unable to obtain SMS signals."
            r2 = 52608(0xcd80, float:7.372E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
        L_0x0252:
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89842j(r7)
            goto L_0x0269
        L_0x0257:
            com.google.common.f.e r0 = com.google.android.libraries.search.assistant.p2497ab.C32359aa.f86743a
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r1 = "Invalid cursor obtained"
            r2 = 52607(0xcd7f, float:7.3718E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89845m()
        L_0x0269:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2497ab.C32431z.mo20085a(com.google.common.util.concurrent.at, java.lang.Object):java.lang.Object");
    }
}
