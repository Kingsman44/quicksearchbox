package org.p5633c.p5634a.p5639e;

import java.util.Locale;
import java.util.Map;
import org.p5633c.p5634a.C72151ai;
import org.p5633c.p5634a.C72285i;
import org.p5633c.p5634a.C72288l;

/* renamed from: org.c.a.e.m */
/* compiled from: PG */
final class C72256m implements C72265v, C72261r {

    /* renamed from: a */
    private final int f192258a;

    public C72256m(int i) {
        this.f192258a = i;
    }

    /* renamed from: a */
    public final int mo63604a() {
        return this.f192258a == 1 ? 4 : 20;
    }

    /* renamed from: b */
    public final int mo63605b() {
        return this.f192258a == 1 ? 4 : 20;
    }

    /* renamed from: c */
    public final int mo63606c(C72264u uVar, String str, int i) {
        Map map = C72285i.f192411a;
        String substring = str.substring(i);
        String str2 = null;
        for (String str3 : map.keySet()) {
            if (substring.startsWith(str3) && (str2 == null || str3.length() > str2.length())) {
                str2 = str3;
            }
        }
        if (str2 == null) {
            return i ^ -1;
        }
        uVar.f192285h = null;
        uVar.f192279b = (C72288l) map.get(str2);
        return i + str2.length();
    }

    /* renamed from: d */
    public final void mo63607d(StringBuffer stringBuffer, C72151ai aiVar, Locale locale) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007f  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo63608e(java.lang.StringBuffer r4, long r5, org.p5633c.p5634a.C72132a r7, int r8, org.p5633c.p5634a.C72288l r9, java.util.Locale r10) {
        /*
            r3 = this;
            long r7 = (long) r8
            long r5 = r5 - r7
            if (r9 != 0) goto L_0x0008
            java.lang.String r5 = ""
            goto L_0x0089
        L_0x0008:
            int r7 = r3.f192258a
            r8 = 0
            if (r7 == 0) goto L_0x004b
            if (r10 != 0) goto L_0x0013
            java.util.Locale r10 = java.util.Locale.getDefault()
        L_0x0013:
            java.lang.String r7 = r9.mo37830g(r5)
            if (r7 != 0) goto L_0x001d
            java.lang.String r5 = r9.f192423d
            goto L_0x0089
        L_0x001d:
            org.c.a.f.h r0 = org.p5633c.p5634a.C72288l.f192418e
            boolean r1 = r0 instanceof org.p5633c.p5634a.p5640f.C72278h
            r2 = 0
            if (r1 == 0) goto L_0x0034
            java.lang.String r7 = r9.f192423d
            boolean r1 = r9.mo63665r(r5)
            java.lang.String[] r7 = r0.mo63660b(r10, r7, r1)
            if (r7 != 0) goto L_0x0031
            goto L_0x003c
        L_0x0031:
            r7 = r7[r2]
            goto L_0x0040
        L_0x0034:
            java.lang.String r1 = r9.f192423d
            java.lang.String[] r7 = r0.mo63659a(r10, r1, r7)
            if (r7 != 0) goto L_0x003e
        L_0x003c:
            r7 = r8
            goto L_0x0040
        L_0x003e:
            r7 = r7[r2]
        L_0x0040:
            if (r7 != 0) goto L_0x0088
            int r5 = r9.mo37823a(r5)
            java.lang.String r5 = org.p5633c.p5634a.C72288l.m106785l(r5)
            goto L_0x0089
        L_0x004b:
            if (r10 != 0) goto L_0x0051
            java.util.Locale r10 = java.util.Locale.getDefault()
        L_0x0051:
            java.lang.String r7 = r9.mo37830g(r5)
            if (r7 != 0) goto L_0x005a
            java.lang.String r5 = r9.f192423d
            goto L_0x0089
        L_0x005a:
            org.c.a.f.h r0 = org.p5633c.p5634a.C72288l.f192418e
            boolean r1 = r0 instanceof org.p5633c.p5634a.p5640f.C72278h
            r2 = 1
            if (r1 == 0) goto L_0x0071
            java.lang.String r7 = r9.f192423d
            boolean r1 = r9.mo63665r(r5)
            java.lang.String[] r7 = r0.mo63660b(r10, r7, r1)
            if (r7 != 0) goto L_0x006e
            goto L_0x0079
        L_0x006e:
            r7 = r7[r2]
            goto L_0x007d
        L_0x0071:
            java.lang.String r1 = r9.f192423d
            java.lang.String[] r7 = r0.mo63659a(r10, r1, r7)
            if (r7 != 0) goto L_0x007b
        L_0x0079:
            r7 = r8
            goto L_0x007d
        L_0x007b:
            r7 = r7[r2]
        L_0x007d:
            if (r7 != 0) goto L_0x0088
            int r5 = r9.mo37823a(r5)
            java.lang.String r5 = org.p5633c.p5634a.C72288l.m106785l(r5)
            goto L_0x0089
        L_0x0088:
            r5 = r7
        L_0x0089:
            r4.append(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p5633c.p5634a.p5639e.C72256m.mo63608e(java.lang.StringBuffer, long, org.c.a.a, int, org.c.a.l, java.util.Locale):void");
    }
}
