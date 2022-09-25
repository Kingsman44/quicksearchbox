package androidx.constraintlayout.p079a.p080a.p081a;

/* renamed from: androidx.constraintlayout.a.a.a.f */
/* compiled from: PG */
public class C1596f {

    /* renamed from: e */
    static final C1596f f4398e = new C1596f();

    /* renamed from: f */
    public static final String[] f4399f = {"standard", "accelerate", "decelerate", "linear"};

    /* renamed from: g */
    String f4400g = "identity";

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.constraintlayout.p079a.p080a.p081a.C1596f m4246c(java.lang.String r6) {
        /*
            if (r6 != 0) goto L_0x0004
            r6 = 0
            return r6
        L_0x0004:
            java.lang.String r0 = "cubic"
            boolean r0 = r6.startsWith(r0)
            if (r0 == 0) goto L_0x0012
            androidx.constraintlayout.a.a.a.e r0 = new androidx.constraintlayout.a.a.a.e
            r0.<init>(r6)
            return r0
        L_0x0012:
            java.lang.String r0 = "spline"
            boolean r0 = r6.startsWith(r0)
            if (r0 == 0) goto L_0x0020
            androidx.constraintlayout.a.a.a.s r0 = new androidx.constraintlayout.a.a.a.s
            r0.<init>(r6)
            return r0
        L_0x0020:
            java.lang.String r0 = "Schlick"
            boolean r0 = r6.startsWith(r0)
            if (r0 == 0) goto L_0x002e
            androidx.constraintlayout.a.a.a.o r0 = new androidx.constraintlayout.a.a.a.o
            r0.<init>(r6)
            return r0
        L_0x002e:
            int r0 = r6.hashCode()
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r0) {
                case -1354466595: goto L_0x006d;
                case -1263948740: goto L_0x0063;
                case -1197605014: goto L_0x0059;
                case -1102672091: goto L_0x004f;
                case -749065269: goto L_0x0045;
                case 1312628413: goto L_0x003b;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x0077
        L_0x003b:
            java.lang.String r0 = "standard"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0077
            r6 = 0
            goto L_0x0078
        L_0x0045:
            java.lang.String r0 = "overshoot"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0077
            r6 = 5
            goto L_0x0078
        L_0x004f:
            java.lang.String r0 = "linear"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0077
            r6 = 3
            goto L_0x0078
        L_0x0059:
            java.lang.String r0 = "anticipate"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0077
            r6 = 4
            goto L_0x0078
        L_0x0063:
            java.lang.String r0 = "decelerate"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0077
            r6 = 2
            goto L_0x0078
        L_0x006d:
            java.lang.String r0 = "accelerate"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0077
            r6 = 1
            goto L_0x0078
        L_0x0077:
            r6 = -1
        L_0x0078:
            if (r6 == 0) goto L_0x00c4
            if (r6 == r5) goto L_0x00bc
            if (r6 == r4) goto L_0x00b4
            if (r6 == r3) goto L_0x00ac
            if (r6 == r2) goto L_0x00a4
            if (r6 == r1) goto L_0x009c
            java.io.PrintStream r6 = java.lang.System.err
            java.lang.String[] r0 = f4399f
            java.lang.String r0 = java.util.Arrays.toString(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or "
            java.lang.String r0 = r1.concat(r0)
            r6.println(r0)
            androidx.constraintlayout.a.a.a.f r6 = f4398e
            return r6
        L_0x009c:
            androidx.constraintlayout.a.a.a.e r6 = new androidx.constraintlayout.a.a.a.e
            java.lang.String r0 = "cubic(0.34, 1.56, 0.64, 1)"
            r6.<init>(r0)
            return r6
        L_0x00a4:
            androidx.constraintlayout.a.a.a.e r6 = new androidx.constraintlayout.a.a.a.e
            java.lang.String r0 = "cubic(0.36, 0, 0.66, -0.56)"
            r6.<init>(r0)
            return r6
        L_0x00ac:
            androidx.constraintlayout.a.a.a.e r6 = new androidx.constraintlayout.a.a.a.e
            java.lang.String r0 = "cubic(1, 1, 0, 0)"
            r6.<init>(r0)
            return r6
        L_0x00b4:
            androidx.constraintlayout.a.a.a.e r6 = new androidx.constraintlayout.a.a.a.e
            java.lang.String r0 = "cubic(0.0, 0.0, 0.2, 0.95)"
            r6.<init>(r0)
            return r6
        L_0x00bc:
            androidx.constraintlayout.a.a.a.e r6 = new androidx.constraintlayout.a.a.a.e
            java.lang.String r0 = "cubic(0.4, 0.05, 0.8, 0.7)"
            r6.<init>(r0)
            return r6
        L_0x00c4:
            androidx.constraintlayout.a.a.a.e r6 = new androidx.constraintlayout.a.a.a.e
            java.lang.String r0 = "cubic(0.4, 0.0, 0.2, 1)"
            r6.<init>(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.p079a.p080a.p081a.C1596f.m4246c(java.lang.String):androidx.constraintlayout.a.a.a.f");
    }

    /* renamed from: a */
    public double mo4521a(double d) {
        return d;
    }

    /* renamed from: b */
    public double mo4522b(double d) {
        return 1.0d;
    }

    public final String toString() {
        return this.f4400g;
    }
}
