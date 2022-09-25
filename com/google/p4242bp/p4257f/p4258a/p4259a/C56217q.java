package com.google.p4242bp.p4257f.p4258a.p4259a;

import com.google.protos.p4887at.p4888a.p4889a.C63799b;
import com.google.protos.p4887at.p4888a.p4889a.C63801d;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* renamed from: com.google.bp.f.a.a.q */
/* compiled from: PG */
public final class C56217q {

    /* renamed from: a */
    public static volatile byte[] f149743a;

    /* renamed from: b */
    private static volatile Charset f149744b;

    /* renamed from: c */
    private static volatile Charset f149745c;

    /* renamed from: a */
    public static final Boolean m87935a(C63799b bVar, Boolean bool, ArrayList arrayList, ArrayList arrayList2) {
        for (C63801d b : bVar.f172565a) {
            bool = m87936b(b, bool, arrayList, arrayList2);
        }
        if (bVar.f172566b.size() > 0) {
            if (((C63801d) bVar.f172566b.get(0)).f172569a != 0) {
                bool = m87937c("=", bool, arrayList);
            }
            for (C63801d b2 : bVar.f172566b) {
                bool = m87936b(b2, bool, arrayList, arrayList2);
            }
        }
        return bool;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Boolean m87936b(com.google.protos.p4887at.p4888a.p4889a.C63801d r8, java.lang.Boolean r9, java.util.ArrayList r10, java.util.ArrayList r11) {
        /*
            int r0 = r8.f172569a
            java.lang.String r1 = ""
            r2 = 1
            r3 = 2
            if (r0 != r3) goto L_0x0172
            java.lang.Object r8 = r8.f172570b
            com.google.protos.at.a.a.n r8 = (com.google.protos.p4887at.p4888a.p4889a.C63811n) r8
            boolean r0 = r9.booleanValue()
            r4 = 0
            if (r0 != 0) goto L_0x0017
            r10.add(r1)
            goto L_0x001b
        L_0x0017:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r4)
        L_0x001b:
            java.lang.String r10 = r8.f172585c
            int r0 = r8.f172583a
            r1 = 3
            if (r0 == 0) goto L_0x0152
            if (r0 != r2) goto L_0x0132
            java.lang.Object r8 = r8.f172584b
            com.google.protos.at.a.a.m r8 = (com.google.protos.p4887at.p4888a.p4889a.C63810m) r8
            com.google.bp.f.a.a.c[] r0 = new com.google.p4242bp.p4257f.p4258a.p4259a.C56203c[r1]
            int r5 = r8.f172578c
            int r5 = com.google.protos.p4887at.p4888a.p4889a.C63805h.m96308a(r5)
            if (r5 != 0) goto L_0x0033
            r5 = 1
        L_0x0033:
            int r5 = r5 + -1
            if (r5 == 0) goto L_0x012a
            if (r5 == r2) goto L_0x003f
            com.google.bp.f.a.a.a r5 = new com.google.bp.f.a.a.a
            r5.<init>()
            goto L_0x0044
        L_0x003f:
            com.google.bp.f.a.a.d r5 = new com.google.bp.f.a.a.d
            r5.<init>()
        L_0x0044:
            r0[r4] = r5
            int r5 = r8.f172576a
            int r5 = com.google.protos.p4887at.p4888a.p4889a.C63807j.m96309a(r5)
            if (r5 != 0) goto L_0x004f
            r5 = 1
        L_0x004f:
            int r5 = r5 + -1
            if (r5 == 0) goto L_0x0122
            r6 = 45
            r7 = 43
            if (r5 == r2) goto L_0x007a
            if (r5 == r3) goto L_0x0074
            if (r5 == r1) goto L_0x006e
            r1 = 4
            if (r5 == r1) goto L_0x0066
            com.google.bp.f.a.a.l r1 = new com.google.bp.f.a.a.l
            r1.<init>()
            goto L_0x007f
        L_0x0066:
            com.google.bp.f.a.a.j r1 = new com.google.bp.f.a.a.j
            r5 = 95
            r1.<init>(r5)
            goto L_0x007f
        L_0x006e:
            com.google.bp.f.a.a.j r1 = new com.google.bp.f.a.a.j
            r1.<init>(r6)
            goto L_0x007f
        L_0x0074:
            com.google.bp.f.a.a.j r1 = new com.google.bp.f.a.a.j
            r1.<init>(r7)
            goto L_0x007f
        L_0x007a:
            com.google.bp.f.a.a.k r1 = new com.google.bp.f.a.a.k
            r1.<init>()
        L_0x007f:
            r0[r2] = r1
            int r1 = r8.f172579d
            int r1 = com.google.protos.p4887at.p4888a.p4889a.C63805h.m96308a(r1)
            if (r1 != 0) goto L_0x008a
            goto L_0x008d
        L_0x008a:
            if (r1 != r3) goto L_0x008d
            r4 = 1
        L_0x008d:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            int r8 = r8.f172577b
            int r8 = com.google.protos.p4887at.p4888a.p4889a.C63809l.m96310a(r8)
            if (r8 != 0) goto L_0x009a
            r8 = 1
        L_0x009a:
            int r8 = r8 + -1
            switch(r8) {
                case 0: goto L_0x0101;
                case 1: goto L_0x00ef;
                case 2: goto L_0x00dd;
                case 3: goto L_0x00c0;
                case 4: goto L_0x00ba;
                case 5: goto L_0x00b4;
                case 6: goto L_0x00ae;
                default: goto L_0x009f;
            }
        L_0x009f:
            com.google.bp.f.a.a.i r8 = new com.google.bp.f.a.a.i
            java.nio.charset.Charset r4 = f149745c
            if (r4 != 0) goto L_0x0109
            java.lang.String r4 = "Shift_JIS"
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)
            f149745c = r4
            goto L_0x0109
        L_0x00ae:
            com.google.bp.f.a.a.m r8 = new com.google.bp.f.a.a.m
            r8.<init>(r7)
            goto L_0x0117
        L_0x00b4:
            com.google.bp.f.a.a.m r8 = new com.google.bp.f.a.a.m
            r8.<init>(r6)
            goto L_0x0117
        L_0x00ba:
            com.google.bp.f.a.a.n r8 = new com.google.bp.f.a.a.n
            r8.<init>()
            goto L_0x0117
        L_0x00c0:
            com.google.bp.f.a.a.o r8 = new com.google.bp.f.a.a.o
            java.nio.charset.Charset r4 = f149744b
            if (r4 != 0) goto L_0x00ce
            java.lang.String r4 = "windows-1252"
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)
            f149744b = r4
        L_0x00ce:
            java.nio.charset.Charset r4 = f149744b
            boolean r1 = r1.booleanValue()
            r1 = r1 ^ r2
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r8.<init>(r4, r1)
            goto L_0x0117
        L_0x00dd:
            boolean r8 = r1.booleanValue()
            if (r8 == 0) goto L_0x00e9
            com.google.bp.f.a.a.g r8 = new com.google.bp.f.a.a.g
            r8.<init>()
            goto L_0x0117
        L_0x00e9:
            com.google.bp.f.a.a.f r8 = new com.google.bp.f.a.a.f
            r8.<init>()
            goto L_0x0117
        L_0x00ef:
            boolean r8 = r1.booleanValue()
            if (r8 == 0) goto L_0x00fb
            com.google.bp.f.a.a.h r8 = new com.google.bp.f.a.a.h
            r8.<init>()
            goto L_0x0117
        L_0x00fb:
            com.google.bp.f.a.a.e r8 = new com.google.bp.f.a.a.e
            r8.<init>()
            goto L_0x0117
        L_0x0101:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Unspecified special encoding"
            r8.<init>(r9)
            throw r8
        L_0x0109:
            java.nio.charset.Charset r4 = f149745c
            boolean r1 = r1.booleanValue()
            r1 = r1 ^ r2
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r8.<init>(r4, r1)
        L_0x0117:
            r0[r3] = r8
            com.google.bp.f.a.a.p r8 = new com.google.bp.f.a.a.p
            r8.<init>(r10, r0)
            r11.add(r8)
            goto L_0x017d
        L_0x0122:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Unspecified space encoding"
            r8.<init>(r9)
            throw r8
        L_0x012a:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Unspecified case handling"
            r8.<init>(r9)
            throw r8
        L_0x0132:
            com.google.bp.f.a.a.c[] r8 = new com.google.p4242bp.p4257f.p4258a.p4259a.C56203c[r1]
            com.google.bp.f.a.a.d r0 = new com.google.bp.f.a.a.d
            r0.<init>()
            r8[r4] = r0
            com.google.bp.f.a.a.d r0 = new com.google.bp.f.a.a.d
            r0.<init>()
            r8[r2] = r0
            com.google.bp.f.a.a.d r0 = new com.google.bp.f.a.a.d
            r0.<init>()
            r8[r3] = r0
            com.google.bp.f.a.a.p r0 = new com.google.bp.f.a.a.p
            r0.<init>(r10, r8)
            r11.add(r0)
            goto L_0x017d
        L_0x0152:
            com.google.bp.f.a.a.c[] r8 = new com.google.p4242bp.p4257f.p4258a.p4259a.C56203c[r1]
            com.google.bp.f.a.a.d r0 = new com.google.bp.f.a.a.d
            r0.<init>()
            r8[r4] = r0
            com.google.bp.f.a.a.d r0 = new com.google.bp.f.a.a.d
            r0.<init>()
            r8[r2] = r0
            com.google.bp.f.a.a.d r0 = new com.google.bp.f.a.a.d
            r0.<init>()
            r8[r3] = r0
            com.google.bp.f.a.a.p r0 = new com.google.bp.f.a.a.p
            r0.<init>(r10, r8)
            r11.add(r0)
            goto L_0x017d
        L_0x0172:
            if (r0 != r2) goto L_0x0179
            java.lang.Object r8 = r8.f172570b
            r1 = r8
            java.lang.String r1 = (java.lang.String) r1
        L_0x0179:
            java.lang.Boolean r9 = m87937c(r1, r9, r10)
        L_0x017d:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p4242bp.p4257f.p4258a.p4259a.C56217q.m87936b(com.google.protos.at.a.a.d, java.lang.Boolean, java.util.ArrayList, java.util.ArrayList):java.lang.Boolean");
    }

    /* renamed from: c */
    public static final Boolean m87937c(String str, Boolean bool, ArrayList arrayList) {
        if (!bool.booleanValue()) {
            arrayList.add(str);
            return true;
        }
        arrayList.add(String.valueOf((String) arrayList.remove(arrayList.size() - 1)).concat(String.valueOf(str)));
        return bool;
    }
}
