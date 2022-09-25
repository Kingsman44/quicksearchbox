package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.p10848a.C145163l;

/* renamed from: com.google.android.gms.measurement.internal.v */
/* compiled from: PG */
final class C145506v extends C145505u {

    /* renamed from: a */
    final /* synthetic */ C145507w f393423a;

    /* renamed from: h */
    private final C145163l f393424h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C145506v(C145507w wVar, String str, int i, C145163l lVar) {
        super(str, i);
        this.f393423a = wVar;
        this.f393424h = lVar;
    }

    /* renamed from: a */
    public final int mo121304a() {
        return this.f393424h.f392362b;
    }

    /* renamed from: b */
    public final boolean mo121305b() {
        return false;
    }

    /* renamed from: c */
    public final boolean mo121306c() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r5v10, types: [java.lang.Integer] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo121308d(java.lang.Long r11, java.lang.Long r12, com.google.android.gms.measurement.p10848a.C145142at r13, boolean r14) {
        /*
            r10 = this;
            boolean r0 = p5304e.p5305a.p5306a.p5390n.p5405h.p5406a.C68925s.m99952c()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001a
            com.google.android.gms.measurement.internal.w r0 = r10.f393423a
            com.google.android.gms.measurement.internal.ff r0 = r0.f393011w
            com.google.android.gms.measurement.internal.ab r0 = r0.f392937g
            java.lang.String r3 = r10.f393417b
            com.google.android.gms.measurement.internal.dk r4 = com.google.android.gms.measurement.internal.C145313dl.f392714U
            boolean r0 = r0.mo120776m(r3, r4)
            if (r0 == 0) goto L_0x001a
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            com.google.android.gms.measurement.a.l r3 = r10.f393424h
            boolean r4 = r3.f392365e
            boolean r5 = r3.f392366f
            boolean r6 = r3.f392367g
            if (r4 != 0) goto L_0x002c
            if (r5 != 0) goto L_0x002c
            if (r6 == 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r4 = 0
            goto L_0x002d
        L_0x002c:
            r4 = 1
        L_0x002d:
            r5 = 0
            if (r14 == 0) goto L_0x0055
            if (r4 != 0) goto L_0x0055
            com.google.android.gms.measurement.internal.w r11 = r10.f393423a
            com.google.android.gms.measurement.internal.ff r11 = r11.f393011w
            com.google.android.gms.measurement.internal.dx r11 = r11.mo120965ar()
            com.google.android.gms.measurement.internal.dv r11 = r11.f392803k
            int r12 = r10.f393418c
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            com.google.android.gms.measurement.a.l r13 = r10.f393424h
            int r14 = r13.f392361a
            r14 = r14 & r2
            if (r14 == 0) goto L_0x004f
            int r13 = r13.f392362b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
        L_0x004f:
            java.lang.String r13 = "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r11.mo120896c(r13, r12, r5)
            return r2
        L_0x0055:
            com.google.android.gms.measurement.a.f r3 = r3.f392364d
            if (r3 != 0) goto L_0x005b
            com.google.android.gms.measurement.a.f r3 = com.google.android.gms.measurement.p10848a.C145157f.f392343f
        L_0x005b:
            boolean r7 = r3.f392348d
            int r8 = r13.f392298a
            r9 = r8 & 8
            if (r9 == 0) goto L_0x0098
            int r8 = r3.f392345a
            r8 = r8 & 2
            if (r8 == 0) goto L_0x007b
            long r8 = r13.f392302e
            com.google.android.gms.measurement.a.j r3 = r3.f392347c
            if (r3 != 0) goto L_0x0071
            com.google.android.gms.measurement.a.j r3 = com.google.android.gms.measurement.p10848a.C145161j.f392351g
        L_0x0071:
            java.lang.Boolean r3 = m236557h(r8, r3)
            java.lang.Boolean r5 = m236559j(r3, r7)
            goto L_0x0166
        L_0x007b:
            com.google.android.gms.measurement.internal.w r3 = r10.f393423a
            com.google.android.gms.measurement.internal.ff r3 = r3.f393011w
            com.google.android.gms.measurement.internal.dx r3 = r3.mo120965ar()
            com.google.android.gms.measurement.internal.dv r3 = r3.f392798f
            com.google.android.gms.measurement.internal.w r7 = r10.f393423a
            com.google.android.gms.measurement.internal.ff r7 = r7.f393011w
            com.google.android.gms.measurement.internal.ds r7 = r7.f392942l
            java.lang.String r8 = r13.f392300c
            java.lang.String r7 = r7.mo120892e(r8)
            java.lang.String r8 = "No number filter for long property. property"
            r3.mo120895b(r8, r7)
            goto L_0x0166
        L_0x0098:
            r9 = r8 & 32
            if (r9 == 0) goto L_0x00d1
            int r8 = r3.f392345a
            r8 = r8 & 2
            if (r8 == 0) goto L_0x00b4
            double r8 = r13.f392303f
            com.google.android.gms.measurement.a.j r3 = r3.f392347c
            if (r3 != 0) goto L_0x00aa
            com.google.android.gms.measurement.a.j r3 = com.google.android.gms.measurement.p10848a.C145161j.f392351g
        L_0x00aa:
            java.lang.Boolean r3 = m236556g(r8, r3)
            java.lang.Boolean r5 = m236559j(r3, r7)
            goto L_0x0166
        L_0x00b4:
            com.google.android.gms.measurement.internal.w r3 = r10.f393423a
            com.google.android.gms.measurement.internal.ff r3 = r3.f393011w
            com.google.android.gms.measurement.internal.dx r3 = r3.mo120965ar()
            com.google.android.gms.measurement.internal.dv r3 = r3.f392798f
            com.google.android.gms.measurement.internal.w r7 = r10.f393423a
            com.google.android.gms.measurement.internal.ff r7 = r7.f393011w
            com.google.android.gms.measurement.internal.ds r7 = r7.f392942l
            java.lang.String r8 = r13.f392300c
            java.lang.String r7 = r7.mo120892e(r8)
            java.lang.String r8 = "No number filter for double property. property"
            r3.mo120895b(r8, r7)
            goto L_0x0166
        L_0x00d1:
            r8 = r8 & 4
            if (r8 == 0) goto L_0x014b
            int r8 = r3.f392345a
            r9 = r8 & 1
            if (r9 == 0) goto L_0x00f4
            java.lang.String r5 = r13.f392301d
            com.google.android.gms.measurement.a.p r3 = r3.f392346b
            if (r3 != 0) goto L_0x00e3
            com.google.android.gms.measurement.a.p r3 = com.google.android.gms.measurement.p10848a.C145167p.f392369f
        L_0x00e3:
            com.google.android.gms.measurement.internal.w r8 = r10.f393423a
            com.google.android.gms.measurement.internal.ff r8 = r8.f393011w
            com.google.android.gms.measurement.internal.dx r8 = r8.mo120965ar()
            java.lang.Boolean r3 = m236555f(r5, r3, r8)
            java.lang.Boolean r5 = m236559j(r3, r7)
            goto L_0x0166
        L_0x00f4:
            r8 = r8 & 2
            if (r8 == 0) goto L_0x012f
            java.lang.String r8 = r13.f392301d
            boolean r8 = com.google.android.gms.measurement.internal.C145491ka.m236461v(r8)
            if (r8 == 0) goto L_0x0111
            java.lang.String r5 = r13.f392301d
            com.google.android.gms.measurement.a.j r3 = r3.f392347c
            if (r3 != 0) goto L_0x0108
            com.google.android.gms.measurement.a.j r3 = com.google.android.gms.measurement.p10848a.C145161j.f392351g
        L_0x0108:
            java.lang.Boolean r3 = m236558i(r5, r3)
            java.lang.Boolean r5 = m236559j(r3, r7)
            goto L_0x0166
        L_0x0111:
            com.google.android.gms.measurement.internal.w r3 = r10.f393423a
            com.google.android.gms.measurement.internal.ff r3 = r3.f393011w
            com.google.android.gms.measurement.internal.dx r3 = r3.mo120965ar()
            com.google.android.gms.measurement.internal.dv r3 = r3.f392798f
            com.google.android.gms.measurement.internal.w r7 = r10.f393423a
            com.google.android.gms.measurement.internal.ff r7 = r7.f393011w
            com.google.android.gms.measurement.internal.ds r7 = r7.f392942l
            java.lang.String r8 = r13.f392300c
            java.lang.String r7 = r7.mo120892e(r8)
            java.lang.String r8 = r13.f392301d
            java.lang.String r9 = "Invalid user property value for Numeric number filter. property, value"
            r3.mo120896c(r9, r7, r8)
            goto L_0x0166
        L_0x012f:
            com.google.android.gms.measurement.internal.w r3 = r10.f393423a
            com.google.android.gms.measurement.internal.ff r3 = r3.f393011w
            com.google.android.gms.measurement.internal.dx r3 = r3.mo120965ar()
            com.google.android.gms.measurement.internal.dv r3 = r3.f392798f
            com.google.android.gms.measurement.internal.w r7 = r10.f393423a
            com.google.android.gms.measurement.internal.ff r7 = r7.f393011w
            com.google.android.gms.measurement.internal.ds r7 = r7.f392942l
            java.lang.String r8 = r13.f392300c
            java.lang.String r7 = r7.mo120892e(r8)
            java.lang.String r8 = "No string or number filter defined. property"
            r3.mo120895b(r8, r7)
            goto L_0x0166
        L_0x014b:
            com.google.android.gms.measurement.internal.w r3 = r10.f393423a
            com.google.android.gms.measurement.internal.ff r3 = r3.f393011w
            com.google.android.gms.measurement.internal.dx r3 = r3.mo120965ar()
            com.google.android.gms.measurement.internal.dv r3 = r3.f392798f
            com.google.android.gms.measurement.internal.w r7 = r10.f393423a
            com.google.android.gms.measurement.internal.ff r7 = r7.f393011w
            com.google.android.gms.measurement.internal.ds r7 = r7.f392942l
            java.lang.String r8 = r13.f392300c
            java.lang.String r7 = r7.mo120892e(r8)
            java.lang.String r8 = "User property has no value, property"
            r3.mo120895b(r8, r7)
        L_0x0166:
            com.google.android.gms.measurement.internal.w r3 = r10.f393423a
            com.google.android.gms.measurement.internal.ff r3 = r3.f393011w
            com.google.android.gms.measurement.internal.dx r3 = r3.mo120965ar()
            com.google.android.gms.measurement.internal.dv r3 = r3.f392803k
            if (r5 != 0) goto L_0x0175
            java.lang.String r7 = "null"
            goto L_0x0176
        L_0x0175:
            r7 = r5
        L_0x0176:
            java.lang.String r8 = "Property filter result"
            r3.mo120895b(r8, r7)
            if (r5 != 0) goto L_0x017e
            return r1
        L_0x017e:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r10.f393419d = r1
            if (r6 == 0) goto L_0x018e
            boolean r1 = r5.booleanValue()
            if (r1 == 0) goto L_0x018d
            goto L_0x018e
        L_0x018d:
            return r2
        L_0x018e:
            if (r14 == 0) goto L_0x0196
            com.google.android.gms.measurement.a.l r14 = r10.f393424h
            boolean r14 = r14.f392365e
            if (r14 == 0) goto L_0x0198
        L_0x0196:
            r10.f393420e = r5
        L_0x0198:
            boolean r14 = r5.booleanValue()
            if (r14 == 0) goto L_0x01d2
            if (r4 == 0) goto L_0x01d2
            int r14 = r13.f392298a
            r14 = r14 & r2
            if (r14 == 0) goto L_0x01d2
            long r13 = r13.f392299b
            if (r11 == 0) goto L_0x01ad
            long r13 = r11.longValue()
        L_0x01ad:
            if (r0 == 0) goto L_0x01bf
            com.google.android.gms.measurement.a.l r11 = r10.f393424h
            boolean r0 = r11.f392365e
            if (r0 == 0) goto L_0x01bf
            boolean r11 = r11.f392366f
            if (r11 != 0) goto L_0x01bf
            if (r12 == 0) goto L_0x01bf
            long r13 = r12.longValue()
        L_0x01bf:
            com.google.android.gms.measurement.a.l r11 = r10.f393424h
            boolean r11 = r11.f392366f
            if (r11 == 0) goto L_0x01cc
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f393422g = r11
            goto L_0x01d2
        L_0x01cc:
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f393421f = r11
        L_0x01d2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145506v.mo121308d(java.lang.Long, java.lang.Long, com.google.android.gms.measurement.a.at, boolean):boolean");
    }
}
