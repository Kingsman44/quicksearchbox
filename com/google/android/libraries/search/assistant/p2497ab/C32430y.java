package com.google.android.libraries.search.assistant.p2497ab;

import com.google.common.util.concurrent.C60804al;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.libraries.search.assistant.ab.y */
/* compiled from: PG */
public final /* synthetic */ class C32430y implements C60804al {

    /* renamed from: a */
    public final /* synthetic */ Locale f86894a;

    /* renamed from: b */
    public final /* synthetic */ Map f86895b;

    /* renamed from: c */
    public final /* synthetic */ long f86896c;

    /* renamed from: d */
    public final /* synthetic */ Map f86897d;

    public /* synthetic */ C32430y(Locale locale, Map map, long j, Map map2) {
        this.f86894a = locale;
        this.f86895b = map;
        this.f86896c = j;
        this.f86897d = map2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo20085a(com.google.common.util.concurrent.C60812at r21, java.lang.Object r22) {
        /*
            r20 = this;
            r0 = r20
            java.util.Locale r1 = r0.f86894a
            java.util.Map r2 = r0.f86895b
            long r3 = r0.f86896c
            java.util.Map r5 = r0.f86897d
            r6 = r22
            android.database.Cursor r6 = (android.database.Cursor) r6
            com.google.common.f.e r7 = com.google.android.libraries.search.assistant.p2497ab.C32359aa.f86743a
            if (r6 == 0) goto L_0x02d4
            int r7 = r6.getCount()
            if (r7 != 0) goto L_0x001a
            goto L_0x02d4
        L_0x001a:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x001f:
            boolean r8 = r6.moveToNext()
            if (r8 == 0) goto L_0x02bb
            java.lang.String r8 = "normalized_number"
            java.lang.String r8 = com.google.android.libraries.search.assistant.p2497ab.C32359aa.m60171d(r6, r8)
            j$.util.Optional r9 = com.google.android.libraries.search.assistant.p2497ab.C32359aa.m60172e(r6)
            java.lang.String r10 = "date"
            j$.util.Optional r10 = com.google.android.libraries.search.assistant.p2497ab.C32359aa.m60170c(r6, r10)
            java.lang.String r11 = "duration"
            j$.util.Optional r11 = com.google.android.libraries.search.assistant.p2497ab.C32359aa.m60170c(r6, r11)
            boolean r12 = r9.isEmpty()
            r14 = 2
            r15 = 1
            if (r12 == 0) goto L_0x0045
        L_0x0043:
            r12 = 1
            goto L_0x005a
        L_0x0045:
            java.lang.Object r9 = r9.get()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            if (r9 == r15) goto L_0x0059
            r12 = 3
            if (r9 == r14) goto L_0x005a
            if (r9 == r12) goto L_0x0057
            goto L_0x0043
        L_0x0057:
            r12 = 4
            goto L_0x005a
        L_0x0059:
            r12 = 2
        L_0x005a:
            if (r12 == r15) goto L_0x02b7
            boolean r9 = r11.isEmpty()
            if (r9 != 0) goto L_0x02b7
            boolean r9 = r10.isEmpty()
            if (r9 != 0) goto L_0x02b7
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 == 0) goto L_0x0074
            java.lang.String r8 = "number"
            java.lang.String r8 = com.google.android.libraries.search.assistant.p2497ab.C32359aa.m60171d(r6, r8)
        L_0x0074:
            java.lang.String r9 = ""
            java.lang.Object r16 = p3186j$.util.Map.EL.getOrDefault(r5, r8, r9)
            java.lang.String r16 = (java.lang.String) r16
            boolean r16 = android.text.TextUtils.isEmpty(r16)
            if (r16 == 0) goto L_0x008a
            java.lang.String r13 = r1.getCountry()
            java.lang.String r8 = android.telephony.PhoneNumberUtils.formatNumberToE164(r8, r13)
        L_0x008a:
            java.lang.Object r8 = p3186j$.util.Map.EL.getOrDefault(r5, r8, r9)
            java.lang.String r8 = (java.lang.String) r8
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 != 0) goto L_0x02b7
            boolean r9 = r2.containsKey(r8)
            if (r9 == 0) goto L_0x02b7
            java.lang.Object r9 = r10.get()
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            long r9 = r3 - r9
            j$.time.Duration r9 = p3186j$.time.Duration.ofMillis(r9)
            java.lang.Object r8 = r2.get(r8)
            com.google.android.libraries.search.assistant.ab.ag r8 = (com.google.android.libraries.search.assistant.p2497ab.C32365ag) r8
            java.lang.Object r10 = r11.get()
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            double r10 = (double) r10
            j$.time.Duration r13 = com.google.android.libraries.search.assistant.p2497ab.C32359aa.f86744b
            int r13 = r9.compareTo((p3186j$.time.Duration) r13)
            if (r13 < 0) goto L_0x00cd
            j$.util.Optional r8 = p3186j$.util.Optional.empty()
        L_0x00c9:
            r19 = r1
            goto L_0x02a6
        L_0x00cd:
            double[] r13 = com.google.android.libraries.search.assistant.p2497ab.C32359aa.f86748f
            long r14 = r9.toDays()
            int r15 = (int) r14
            r14 = r13[r15]
            java.lang.Double.isNaN(r10)
            double r10 = r10 * r14
            int r12 = r12 + -1
            r17 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            r13 = 1
            if (r12 == r13) goto L_0x021c
            r13 = 2
            if (r12 == r13) goto L_0x0163
            com.google.android.libraries.search.assistant.ab.bm r10 = com.google.android.libraries.search.assistant.p2497ab.C32398bm.f86831r
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.libraries.search.assistant.ab.bl r10 = (com.google.android.libraries.search.assistant.p2497ab.C32397bl) r10
            java.lang.String r11 = r8.f86761b
            r10.copyOnWrite()
            com.google.protobuf.bv r12 = r10.instance
            com.google.android.libraries.search.assistant.ab.bm r12 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r12
            r11.getClass()
            int r13 = r12.f86833a
            r13 = r13 | 2048(0x800, float:2.87E-42)
            r12.f86833a = r13
            r12.f86844l = r11
            boolean r8 = r8.f86763d
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.android.libraries.search.assistant.ab.bm r11 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r11
            int r12 = r11.f86833a
            r12 = r12 | 512(0x200, float:7.175E-43)
            r11.f86833a = r12
            r11.f86843k = r8
            r10.copyOnWrite()
            com.google.protobuf.bv r8 = r10.instance
            com.google.android.libraries.search.assistant.ab.bm r8 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r8
            r11 = 1
            r8.f86834b = r11
            int r12 = r8.f86833a
            r11 = r11 | r12
            r8.f86833a = r11
            long r8 = r9.toMillis()
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.android.libraries.search.assistant.ab.bm r11 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r11
            int r12 = r11.f86833a
            r13 = 2
            r12 = r12 | r13
            r11.f86833a = r12
            r11.f86835c = r8
            r10.copyOnWrite()
            com.google.protobuf.bv r8 = r10.instance
            com.google.android.libraries.search.assistant.ab.bm r8 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r8
            int r9 = r8.f86833a
            r9 = r9 | 16
            r8.f86833a = r9
            r8.f86838f = r14
            r10.copyOnWrite()
            com.google.protobuf.bv r8 = r10.instance
            com.google.android.libraries.search.assistant.ab.bm r8 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r8
            int r9 = r8.f86833a
            r9 = r9 | 256(0x100, float:3.59E-43)
            r8.f86833a = r9
            double r14 = r14 * r17
            r8.f86842j = r14
            com.google.protobuf.bv r8 = r10.build()
            com.google.android.libraries.search.assistant.ab.bm r8 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r8
            j$.util.Optional r8 = p3186j$.util.Optional.m71637of(r8)
            goto L_0x00c9
        L_0x0163:
            com.google.android.libraries.search.assistant.ab.bm r12 = com.google.android.libraries.search.assistant.p2497ab.C32398bm.f86831r
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.android.libraries.search.assistant.ab.bl r12 = (com.google.android.libraries.search.assistant.p2497ab.C32397bl) r12
            java.lang.String r13 = r8.f86761b
            r12.copyOnWrite()
            com.google.protobuf.bv r0 = r12.instance
            com.google.android.libraries.search.assistant.ab.bm r0 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r0
            r13.getClass()
            r19 = r1
            int r1 = r0.f86833a
            r1 = r1 | 2048(0x800, float:2.87E-42)
            r0.f86833a = r1
            r0.f86844l = r13
            boolean r0 = r8.f86763d
            r12.copyOnWrite()
            com.google.protobuf.bv r1 = r12.instance
            com.google.android.libraries.search.assistant.ab.bm r1 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r1
            int r8 = r1.f86833a
            r8 = r8 | 512(0x200, float:7.175E-43)
            r1.f86833a = r8
            r1.f86843k = r0
            r12.copyOnWrite()
            com.google.protobuf.bv r0 = r12.instance
            com.google.android.libraries.search.assistant.ab.bm r0 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r0
            r1 = 1
            r0.f86834b = r1
            int r8 = r0.f86833a
            r1 = r1 | r8
            r0.f86833a = r1
            long r0 = r9.toMillis()
            r12.copyOnWrite()
            com.google.protobuf.bv r8 = r12.instance
            com.google.android.libraries.search.assistant.ab.bm r8 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r8
            int r9 = r8.f86833a
            r13 = 2
            r9 = r9 | r13
            r8.f86833a = r9
            r8.f86835c = r0
            r12.copyOnWrite()
            com.google.protobuf.bv r0 = r12.instance
            com.google.android.libraries.search.assistant.ab.bm r0 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r0
            int r1 = r0.f86833a
            r1 = r1 | 16
            r0.f86833a = r1
            r0.f86838f = r14
            r12.copyOnWrite()
            com.google.protobuf.bv r0 = r12.instance
            com.google.android.libraries.search.assistant.ab.bm r0 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r0
            int r1 = r0.f86833a
            r8 = 4
            r1 = r1 | r8
            r0.f86833a = r1
            r0.f86836d = r14
            double r14 = r14 * r17
            r12.copyOnWrite()
            com.google.protobuf.bv r0 = r12.instance
            com.google.android.libraries.search.assistant.ab.bm r0 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r0
            int r1 = r0.f86833a
            r1 = r1 | 128(0x80, float:1.794E-43)
            r0.f86833a = r1
            r0.f86841i = r14
            r12.copyOnWrite()
            com.google.protobuf.bv r0 = r12.instance
            com.google.android.libraries.search.assistant.ab.bm r0 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r0
            int r1 = r0.f86833a
            r1 = r1 | 256(0x100, float:3.59E-43)
            r0.f86833a = r1
            r0.f86842j = r14
            r12.copyOnWrite()
            com.google.protobuf.bv r0 = r12.instance
            com.google.android.libraries.search.assistant.ab.bm r0 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r0
            int r1 = r0.f86833a
            r1 = r1 | 8
            r0.f86833a = r1
            r0.f86837e = r10
            r12.copyOnWrite()
            com.google.protobuf.bv r0 = r12.instance
            com.google.android.libraries.search.assistant.ab.bm r0 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r0
            int r1 = r0.f86833a
            r1 = r1 | 32
            r0.f86833a = r1
            r0.f86839g = r10
            com.google.protobuf.bv r0 = r12.build()
            com.google.android.libraries.search.assistant.ab.bm r0 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r0
            j$.util.Optional r8 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x02a6
        L_0x021c:
            r19 = r1
            com.google.android.libraries.search.assistant.ab.bm r0 = com.google.android.libraries.search.assistant.p2497ab.C32398bm.f86831r
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.libraries.search.assistant.ab.bl r0 = (com.google.android.libraries.search.assistant.p2497ab.C32397bl) r0
            java.lang.String r1 = r8.f86761b
            r0.copyOnWrite()
            com.google.protobuf.bv r12 = r0.instance
            com.google.android.libraries.search.assistant.ab.bm r12 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r12
            r1.getClass()
            int r13 = r12.f86833a
            r13 = r13 | 2048(0x800, float:2.87E-42)
            r12.f86833a = r13
            r12.f86844l = r1
            boolean r1 = r8.f86763d
            r0.copyOnWrite()
            com.google.protobuf.bv r8 = r0.instance
            com.google.android.libraries.search.assistant.ab.bm r8 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r8
            int r12 = r8.f86833a
            r12 = r12 | 512(0x200, float:7.175E-43)
            r8.f86833a = r12
            r8.f86843k = r1
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.libraries.search.assistant.ab.bm r1 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r1
            r8 = 1
            r1.f86834b = r8
            int r12 = r1.f86833a
            r8 = r8 | r12
            r1.f86833a = r8
            long r8 = r9.toMillis()
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.libraries.search.assistant.ab.bm r1 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r1
            int r12 = r1.f86833a
            r13 = 2
            r12 = r12 | r13
            r1.f86833a = r12
            r1.f86835c = r8
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.libraries.search.assistant.ab.bm r1 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r1
            int r8 = r1.f86833a
            r8 = r8 | 16
            r1.f86833a = r8
            r1.f86838f = r14
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.libraries.search.assistant.ab.bm r1 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r1
            int r8 = r1.f86833a
            r8 = r8 | 256(0x100, float:3.59E-43)
            r1.f86833a = r8
            double r14 = r14 * r17
            r1.f86842j = r14
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.libraries.search.assistant.ab.bm r1 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r1
            int r8 = r1.f86833a
            r8 = r8 | 32
            r1.f86833a = r8
            r1.f86839g = r10
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.libraries.search.assistant.ab.bm r0 = (com.google.android.libraries.search.assistant.p2497ab.C32398bm) r0
            j$.util.Optional r8 = p3186j$.util.Optional.m71637of(r0)
        L_0x02a6:
            p3186j$.util.Objects.requireNonNull(r7)
            com.google.android.libraries.search.assistant.ab.f r0 = new com.google.android.libraries.search.assistant.ab.f
            r0.<init>(r7)
            r8.ifPresent(r0)
            r0 = r20
            r1 = r19
            goto L_0x001f
        L_0x02b7:
            r0 = r20
            goto L_0x001f
        L_0x02bb:
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x02cf
            com.google.common.f.e r0 = com.google.android.libraries.search.assistant.p2497ab.C32359aa.f86743a
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r1 = "Unable to obtain CALL signals."
            r2 = 52603(0xcd7b, float:7.3713E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
        L_0x02cf:
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89842j(r7)
            goto L_0x02e6
        L_0x02d4:
            com.google.common.f.e r0 = com.google.android.libraries.search.assistant.p2497ab.C32359aa.f86743a
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r1 = "Invalid cursor obtained"
            r2 = 52602(0xcd7a, float:7.3711E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89845m()
        L_0x02e6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2497ab.C32430y.mo20085a(com.google.common.util.concurrent.at, java.lang.Object):java.lang.Object");
    }
}
