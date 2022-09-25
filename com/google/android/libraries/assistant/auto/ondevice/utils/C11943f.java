package com.google.android.libraries.assistant.auto.ondevice.utils;

import com.google.android.apps.gsa.nga.shared.p6320al.C80884a;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.p4152bb.p4153a.C55082fe;
import com.google.p4152bb.p4153a.C55090fm;
import com.google.p4152bb.p4153a.C55093fp;
import com.google.p4152bb.p4153a.C55096fs;
import com.google.p4152bb.p4153a.C55097ft;
import com.google.protos.p4850an.p4855d.p4856a.C63442ab;
import com.google.protos.p4850an.p4855d.p4856a.C63446af;
import com.google.protos.p4850an.p4855d.p4856a.C63448ah;
import com.google.protos.p4850an.p4855d.p4862g.C63565b;
import com.google.protos.p4985f.p4988b.p4993d.C64782b;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.utils.f */
/* compiled from: PG */
public final class C11943f {

    /* renamed from: a */
    private static final C58974d f38376a = C58974d.m91134h("ContactUtils");

    /* renamed from: a */
    public static C55082fe m27768a(C55093fp fpVar, String str) {
        if (str == null) {
            return null;
        }
        for (C55082fe feVar : fpVar.f144969c) {
            if (feVar.f144920g.equals(str)) {
                return feVar;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static C55093fp m27769c(C55093fp fpVar, Locale locale) {
        if (fpVar.f144969c.size() < 2) {
            return fpVar;
        }
        String str = fpVar.f144968b;
        for (C55082fe feVar : fpVar.f144969c) {
            if (m27773g(feVar.f144915b, str, locale)) {
                ((C58970a) ((C58970a) f38376a.mo56224b()).mo56372aa(43885)).mo56386p("Found an exactly matched contact in contact reference.");
                C55090fm fmVar = (C55090fm) fpVar.toBuilder();
                fmVar.copyOnWrite();
                ((C55093fp) fmVar.instance).f144969c = C55093fp.emptyProtobufList();
                fmVar.mo54192c(feVar);
                return (C55093fp) fmVar.build();
            }
        }
        return fpVar;
    }

    /* renamed from: d */
    public static String m27770d(C63446af afVar) {
        if ((afVar.f171463a & 16) != 0) {
            C63448ah ahVar = afVar.f171467e;
            if (ahVar == null) {
                ahVar = C63448ah.f171469b;
            }
            return ahVar.f171471a;
        }
        C63565b bVar = afVar.f171464b;
        if (bVar == null) {
            bVar = C63565b.f171933j;
        }
        if ((bVar.f171935a & 4) == 0) {
            return afVar.f171466d;
        }
        C63565b bVar2 = afVar.f171464b;
        if (bVar2 == null) {
            bVar2 = C63565b.f171933j;
        }
        return bVar2.f171938d;
    }

    /* renamed from: e */
    public static String m27771e(C55093fp fpVar, C64782b bVar) {
        C55082fe a = m27768a(fpVar, C11945h.m27783h(bVar, "client_entity_id"));
        if (a != null) {
            return a.f144915b;
        }
        return null;
    }

    /* renamed from: f */
    public static boolean m27772f(C55097ft ftVar, C63442ab abVar, boolean z, Locale locale) {
        int a = C55096fs.m87592a(ftVar.f144983b);
        String b = C80884a.m128737b((a == 0 || a == 1) ? "HOME" : a != 2 ? a != 3 ? a != 4 ? "OTHER" : "MAIN" : "MOBILE" : "WORK", locale);
        String b2 = C80884a.m128737b(ftVar.f144984c, locale);
        String b3 = C80884a.m128737b(abVar.f171457b, locale);
        String b4 = C80884a.m128737b(abVar.f171458c, locale);
        String b5 = C80884a.m128737b(abVar.f171459d, locale);
        loop0:
        for (String str : Arrays.asList(new String[]{b, b2})) {
            Iterator it = Arrays.asList(new String[]{b3, b4, b5}).iterator();
            while (true) {
                if (it.hasNext()) {
                    String upperCase = ((String) it.next()).toUpperCase(locale);
                    String upperCase2 = str.toUpperCase(locale);
                    if (!z) {
                        if (upperCase2.contains(upperCase) || upperCase.contains(upperCase2)) {
                            break loop0;
                        }
                    } else if (upperCase2.equals(upperCase)) {
                        break loop0;
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m27773g(String str, String str2, Locale locale) {
        return C80884a.m128737b(str, locale).equals(C80884a.m128737b(str2, locale));
    }

    /* renamed from: h */
    public static boolean m27774h(String str, String str2, Locale locale) {
        return C80884a.m128737b(str, locale).contains(C80884a.m128737b(str2, locale)) || C80884a.m128737b(str2, locale).contains(C80884a.m128737b(str, locale));
    }

    /* JADX WARNING: type inference failed for: r12v25, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.p4152bb.p4153a.C55093fp mo20316b(com.google.protos.p4850an.p4855d.p4856a.C63446af r11, java.util.List r12, java.lang.String r13, java.util.Locale r14) {
        /*
            r10 = this;
            java.lang.String r0 = m27770d(r11)
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto L_0x000c
            return r2
        L_0x000c:
            com.google.bb.a.fp r1 = com.google.p4152bb.p4153a.C55093fp.f144965l
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.bb.a.fm r1 = (com.google.p4152bb.p4153a.C55090fm) r1
            com.google.bb.a.fl r3 = com.google.p4152bb.p4153a.C55089fl.f144954j
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.bb.a.fk r3 = (com.google.p4152bb.p4153a.C55088fk) r3
            r3.mo54187b(r0)
            com.google.bb.a.fx r4 = com.google.p4152bb.p4153a.C55101fx.f144991c
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.bb.a.fw r4 = (com.google.p4152bb.p4153a.C55100fw) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.bb.a.fx r5 = (com.google.p4152bb.p4153a.C55101fx) r5
            r0.getClass()
            int r6 = r5.f144993a
            r7 = 1
            r6 = r6 | r7
            r5.f144993a = r6
            r5.f144994b = r0
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.bb.a.fl r5 = (com.google.p4152bb.p4153a.C55089fl) r5
            com.google.protobuf.bv r4 = r4.build()
            com.google.bb.a.fx r4 = (com.google.p4152bb.p4153a.C55101fx) r4
            r4.getClass()
            com.google.protobuf.cq r6 = r5.f144958c
            boolean r8 = r6.mo58948c()
            if (r8 != 0) goto L_0x0057
            com.google.protobuf.cq r6 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r6)
            r5.f144958c = r6
        L_0x0057:
            com.google.protobuf.cq r5 = r5.f144958c
            r5.add(r4)
            r3.mo54186a(r12)
            boolean r12 = r13.isEmpty()
            r4 = 5
            r5 = 0
            r6 = 2
            if (r12 == 0) goto L_0x006a
            goto L_0x00f1
        L_0x006a:
            com.google.bb.a.ft r12 = com.google.p4152bb.p4153a.C55097ft.f144980d
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.bb.a.fq r12 = (com.google.p4152bb.p4153a.C55094fq) r12
            java.lang.String r14 = r13.toUpperCase(r14)     // Catch:{ IllegalArgumentException -> 0x00d9 }
            int r2 = r14.hashCode()     // Catch:{ IllegalArgumentException -> 0x00d9 }
            r8 = 4
            r9 = 3
            switch(r2) {
                case -2015525726: goto L_0x00a8;
                case 2223327: goto L_0x009e;
                case 2358713: goto L_0x0094;
                case 2670353: goto L_0x008a;
                case 75532016: goto L_0x0080;
                default: goto L_0x007f;
            }
        L_0x007f:
            goto L_0x00b2
        L_0x0080:
            java.lang.String r2 = "OTHER"
            boolean r14 = r14.equals(r2)
            if (r14 == 0) goto L_0x00b2
            r14 = 4
            goto L_0x00b3
        L_0x008a:
            java.lang.String r2 = "WORK"
            boolean r14 = r14.equals(r2)
            if (r14 == 0) goto L_0x00b2
            r14 = 1
            goto L_0x00b3
        L_0x0094:
            java.lang.String r2 = "MAIN"
            boolean r14 = r14.equals(r2)
            if (r14 == 0) goto L_0x00b2
            r14 = 3
            goto L_0x00b3
        L_0x009e:
            java.lang.String r2 = "HOME"
            boolean r14 = r14.equals(r2)
            if (r14 == 0) goto L_0x00b2
            r14 = 0
            goto L_0x00b3
        L_0x00a8:
            java.lang.String r2 = "MOBILE"
            boolean r14 = r14.equals(r2)
            if (r14 == 0) goto L_0x00b2
            r14 = 2
            goto L_0x00b3
        L_0x00b2:
            r14 = -1
        L_0x00b3:
            if (r14 == 0) goto L_0x00c9
            if (r14 == r7) goto L_0x00c7
            if (r14 == r6) goto L_0x00c5
            if (r14 == r9) goto L_0x00ca
            if (r14 != r8) goto L_0x00bf
            r8 = 5
            goto L_0x00ca
        L_0x00bf:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x00d9 }
            r14.<init>()     // Catch:{ IllegalArgumentException -> 0x00d9 }
            throw r14     // Catch:{ IllegalArgumentException -> 0x00d9 }
        L_0x00c5:
            r8 = 3
            goto L_0x00ca
        L_0x00c7:
            r8 = 2
            goto L_0x00ca
        L_0x00c9:
            r8 = 1
        L_0x00ca:
            r12.copyOnWrite()     // Catch:{ IllegalArgumentException -> 0x00d9 }
            com.google.protobuf.bv r14 = r12.instance     // Catch:{ IllegalArgumentException -> 0x00d9 }
            com.google.bb.a.ft r14 = (com.google.p4152bb.p4153a.C55097ft) r14     // Catch:{ IllegalArgumentException -> 0x00d9 }
            r14.f144983b = r8     // Catch:{ IllegalArgumentException -> 0x00d9 }
            int r2 = r14.f144982a     // Catch:{ IllegalArgumentException -> 0x00d9 }
            r2 = r2 | r7
            r14.f144982a = r2     // Catch:{ IllegalArgumentException -> 0x00d9 }
            goto L_0x00ea
        L_0x00d9:
            r12.copyOnWrite()
            com.google.protobuf.bv r14 = r12.instance
            com.google.bb.a.ft r14 = (com.google.p4152bb.p4153a.C55097ft) r14
            r13.getClass()
            int r2 = r14.f144982a
            r2 = r2 | r6
            r14.f144982a = r2
            r14.f144984c = r13
        L_0x00ea:
            com.google.protobuf.bv r12 = r12.build()
            r2 = r12
            com.google.bb.a.ft r2 = (com.google.p4152bb.p4153a.C55097ft) r2
        L_0x00f1:
            if (r2 == 0) goto L_0x0101
            r3.copyOnWrite()
            com.google.protobuf.bv r12 = r3.instance
            com.google.bb.a.fl r12 = (com.google.p4152bb.p4153a.C55089fl) r12
            r12.f144961g = r2
            int r13 = r12.f144956a
            r13 = r13 | r6
            r12.f144956a = r13
        L_0x0101:
            com.google.protos.an.d.g.b r11 = r11.f171464b
            if (r11 != 0) goto L_0x0107
            com.google.protos.an.d.g.b r11 = com.google.protos.p4850an.p4855d.p4862g.C63565b.f171933j
        L_0x0107:
            com.google.protobuf.cq r12 = r11.f171941g
            int r12 = r12.size()
            if (r12 <= 0) goto L_0x0161
            com.google.protobuf.cq r12 = r11.f171941g
            java.lang.Object r12 = r12.get(r5)
            com.google.bp.g.n r12 = (com.google.p4242bp.p4266g.C56364n) r12
            int r12 = r12.f150313b
            int r12 = com.google.p4242bp.p4266g.C56363m.m87979a(r12)
            if (r12 != 0) goto L_0x0120
            goto L_0x0161
        L_0x0120:
            if (r12 != r4) goto L_0x0161
            r1.copyOnWrite()
            com.google.protobuf.bv r12 = r1.instance
            com.google.bb.a.fp r12 = (com.google.p4152bb.p4153a.C55093fp) r12
            r12.f144974h = r7
            int r13 = r12.f144967a
            r13 = r13 | 32
            r12.f144967a = r13
            java.lang.String r12 = r11.f171938d
            r1.copyOnWrite()
            com.google.protobuf.bv r13 = r1.instance
            com.google.bb.a.fp r13 = (com.google.p4152bb.p4153a.C55093fp) r13
            r12.getClass()
            int r14 = r13.f144967a
            r14 = r14 | 128(0x80, float:1.794E-43)
            r13.f144967a = r14
            r13.f144976j = r12
            com.google.protobuf.cq r11 = r11.f171941g
            java.lang.Object r11 = r11.get(r5)
            com.google.bp.g.n r11 = (com.google.p4242bp.p4266g.C56364n) r11
            java.lang.String r11 = r11.f150315d
            r1.copyOnWrite()
            com.google.protobuf.bv r12 = r1.instance
            com.google.bb.a.fp r12 = (com.google.p4152bb.p4153a.C55093fp) r12
            r11.getClass()
            int r13 = r12.f144967a
            r13 = r13 | 64
            r12.f144967a = r13
            r12.f144975i = r11
        L_0x0161:
            r3.build()
            r1.copyOnWrite()
            com.google.protobuf.bv r11 = r1.instance
            com.google.bb.a.fp r11 = (com.google.p4152bb.p4153a.C55093fp) r11
            com.google.protobuf.bv r12 = r3.build()
            com.google.bb.a.fl r12 = (com.google.p4152bb.p4153a.C55089fl) r12
            r12.getClass()
            r11.f144970d = r12
            int r12 = r11.f144967a
            r12 = r12 | r6
            r11.f144967a = r12
            r1.copyOnWrite()
            com.google.protobuf.bv r11 = r1.instance
            com.google.bb.a.fp r11 = (com.google.p4152bb.p4153a.C55093fp) r11
            r0.getClass()
            int r12 = r11.f144967a
            r12 = r12 | r7
            r11.f144967a = r12
            r11.f144968b = r0
            com.google.protobuf.bv r11 = r1.build()
            com.google.bb.a.fp r11 = (com.google.p4152bb.p4153a.C55093fp) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.ondevice.utils.C11943f.mo20316b(com.google.protos.an.d.a.af, java.util.List, java.lang.String, java.util.Locale):com.google.bb.a.fp");
    }
}
