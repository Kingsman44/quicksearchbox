package com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a;

import com.google.common.p4535g.C59203do;
import java.util.Comparator;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.y.s.a.ae */
/* compiled from: PG */
public final class C37095ae {

    /* renamed from: a */
    public static final Comparator f96612a = new C37144y(new C37143x(new C37142w(new C37141v(new C37137r()))));

    /* renamed from: b */
    public static final Comparator f96613b = new C37093ac(new C37092ab(new C37091aa(new C37145z(new C37138s()))));

    /* renamed from: c */
    public static final Comparator f96614c = new C37140u(new C37094ad(new C37139t()));

    /* renamed from: o */
    private static final double f96615o = Math.log(46.0d);

    /* renamed from: d */
    public final double f96616d;

    /* renamed from: e */
    public final double f96617e;

    /* renamed from: f */
    public final double f96618f;

    /* renamed from: g */
    public final double f96619g;

    /* renamed from: h */
    public final double f96620h;

    /* renamed from: i */
    public final double f96621i;

    /* renamed from: j */
    public final double f96622j;

    /* renamed from: k */
    public final double f96623k;

    /* renamed from: l */
    public final double f96624l;

    /* renamed from: m */
    public final double f96625m;

    /* renamed from: n */
    public final boolean f96626n;

    public C37095ae(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, boolean z) {
        this.f96616d = d;
        this.f96617e = d2;
        this.f96618f = d3;
        this.f96619g = d4;
        this.f96620h = d5;
        this.f96621i = d6;
        this.f96622j = d7;
        this.f96623k = d8;
        this.f96624l = d9;
        this.f96625m = d10;
        this.f96626n = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C37095ae(double r24, double r26, double r28, double r30, double r32, double r34, double r36, double r38, double r40, double r42, boolean r44, int r45) {
        /*
            r23 = this;
            r0 = r45
            r1 = r0 & 1
            r2 = 0
            r4 = 1
            if (r4 == r1) goto L_0x000c
            r5 = r24
            goto L_0x000d
        L_0x000c:
            r5 = r2
        L_0x000d:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0013
            r7 = r2
            goto L_0x0015
        L_0x0013:
            r7 = r26
        L_0x0015:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x001b
            r9 = r2
            goto L_0x001d
        L_0x001b:
            r9 = r28
        L_0x001d:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0023
            r11 = r2
            goto L_0x0025
        L_0x0023:
            r11 = r30
        L_0x0025:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x002b
            r13 = r2
            goto L_0x002d
        L_0x002b:
            r13 = r32
        L_0x002d:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0033
            r15 = r2
            goto L_0x0035
        L_0x0033:
            r15 = r34
        L_0x0035:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x003c
            r17 = r2
            goto L_0x003e
        L_0x003c:
            r17 = r36
        L_0x003e:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0045
            r19 = r2
            goto L_0x0047
        L_0x0045:
            r19 = r38
        L_0x0047:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x004e
            r21 = r2
            goto L_0x0050
        L_0x004e:
            r21 = r40
        L_0x0050:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r2 = r42
        L_0x0057:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x005c
            r4 = 0
        L_0x005c:
            r0 = r4 & r44
            r45 = r0
            r24 = r23
            r25 = r5
            r27 = r7
            r29 = r9
            r31 = r11
            r33 = r13
            r35 = r15
            r37 = r17
            r39 = r19
            r41 = r21
            r43 = r2
            r24.<init>(r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.C37095ae.<init>(double, double, double, double, double, double, double, double, double, double, boolean, int):void");
    }

    /* renamed from: a */
    public final double mo40622a(double d, double d2) {
        return Math.log(Math.exp(d + f96615o) + Math.exp(d2));
    }

    /* renamed from: b */
    public final double mo40623b(double d, double d2, boolean z) {
        long min = Math.min((long) d, 8388607) << (true != z ? (char) 22 : 23);
        int i = 0;
        if (z && this.f96626n) {
            i = 4194304;
        }
        return Math.log1p(Math.max(C59203do.f157270a, (double) (min + ((long) i) + Math.min((long) d2, 8388607))));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37095ae)) {
            return false;
        }
        C37095ae aeVar = (C37095ae) obj;
        return C69664n.m101066l(Double.valueOf(this.f96616d), Double.valueOf(aeVar.f96616d)) && C69664n.m101066l(Double.valueOf(this.f96617e), Double.valueOf(aeVar.f96617e)) && C69664n.m101066l(Double.valueOf(this.f96618f), Double.valueOf(aeVar.f96618f)) && C69664n.m101066l(Double.valueOf(this.f96619g), Double.valueOf(aeVar.f96619g)) && C69664n.m101066l(Double.valueOf(this.f96620h), Double.valueOf(aeVar.f96620h)) && C69664n.m101066l(Double.valueOf(this.f96621i), Double.valueOf(aeVar.f96621i)) && C69664n.m101066l(Double.valueOf(this.f96622j), Double.valueOf(aeVar.f96622j)) && C69664n.m101066l(Double.valueOf(this.f96623k), Double.valueOf(aeVar.f96623k)) && C69664n.m101066l(Double.valueOf(this.f96624l), Double.valueOf(aeVar.f96624l)) && C69664n.m101066l(Double.valueOf(this.f96625m), Double.valueOf(aeVar.f96625m)) && this.f96626n == aeVar.f96626n;
    }

    public final int hashCode() {
        return (((((((((((((((((((Double.doubleToLongBits(this.f96616d) * 31) + Double.doubleToLongBits(this.f96617e)) * 31) + Double.doubleToLongBits(this.f96618f)) * 31) + Double.doubleToLongBits(this.f96619g)) * 31) + Double.doubleToLongBits(this.f96620h)) * 31) + Double.doubleToLongBits(this.f96621i)) * 31) + Double.doubleToLongBits(this.f96622j)) * 31) + Double.doubleToLongBits(this.f96623k)) * 31) + Double.doubleToLongBits(this.f96624l)) * 31) + Double.doubleToLongBits(this.f96625m)) * 31) + (this.f96626n ? 1 : 0);
    }

    public final String toString() {
        double d = this.f96616d;
        double d2 = this.f96617e;
        double d3 = this.f96618f;
        double d4 = this.f96619g;
        double d5 = this.f96620h;
        double d6 = this.f96621i;
        double d7 = this.f96622j;
        double d8 = this.f96623k;
        double d9 = this.f96624l;
        double d10 = this.f96625m;
        return "TopContactScores(outgoingCallCountScore=" + d + ", outgoingCallDurationScore=" + d2 + ", bidirectionalCallCountScore=" + d3 + ", bidirectionalCallDurationScore=" + d4 + ", outgoingTextCountScore=" + d5 + ", outgoingTextLengthScore=" + d6 + ", bidirectionalTextCountScore=" + d7 + ", bidirectionalTextLengthScore=" + d8 + ", outgoingInteractionCountScore=" + d9 + ", bidirectionalInteractionCountScore=" + d10 + ", isStarred=" + this.f96626n + ")";
    }
}
