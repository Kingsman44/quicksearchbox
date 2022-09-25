package com.google.android.libraries.elements.interfaces;

import android.support.p033v7.widget.C0657fs;
import android.view.View;
import com.facebook.litho.p329g.p331b.C6308j;
import com.google.android.libraries.elements.p1708c.p1710b.C20747a;
import com.google.common.p4522b.C58485gu;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.p5497e.p5498a.C69826b;

/* renamed from: com.google.android.libraries.elements.interfaces.d */
/* compiled from: PG */
final class C21297d extends C21319z {

    /* renamed from: a */
    public final View f59628a;

    /* renamed from: b */
    public final C21290cf f59629b;

    /* renamed from: c */
    public final C69826b f59630c;

    /* renamed from: d */
    public final boolean f59631d;

    /* renamed from: e */
    public final C6308j f59632e;

    /* renamed from: f */
    public final StringBuilder f59633f;

    /* renamed from: g */
    public final String f59634g;

    /* renamed from: h */
    public final String f59635h;

    /* renamed from: i */
    public final WeakReference f59636i;

    /* renamed from: j */
    public final WeakReference f59637j;

    /* renamed from: k */
    public final C21261bd f59638k;

    /* renamed from: l */
    public final C21238ah f59639l;

    /* renamed from: m */
    public final String f59640m;

    /* renamed from: n */
    public final String f59641n;

    /* renamed from: o */
    public final boolean f59642o;

    /* renamed from: p */
    public final C21256az f59643p;

    /* renamed from: q */
    public final boolean f59644q;

    /* renamed from: r */
    public final int f59645r;

    /* renamed from: s */
    public final AtomicReference f59646s;

    /* renamed from: t */
    public final C20747a f59647t;

    public C21297d(View view, C21290cf cfVar, C69826b bVar, C20747a aVar, boolean z, C6308j jVar, StringBuilder sb, String str, String str2, WeakReference weakReference, WeakReference weakReference2, C21261bd bdVar, C21238ah ahVar, String str3, String str4, boolean z2, C21256az azVar, boolean z3, int i, AtomicReference atomicReference) {
        this.f59628a = view;
        this.f59629b = cfVar;
        this.f59630c = bVar;
        this.f59647t = aVar;
        this.f59631d = z;
        this.f59632e = jVar;
        this.f59633f = sb;
        this.f59634g = str;
        this.f59635h = str2;
        this.f59636i = weakReference;
        this.f59637j = weakReference2;
        this.f59638k = bdVar;
        this.f59639l = ahVar;
        this.f59640m = str3;
        this.f59641n = str4;
        this.f59642o = z2;
        this.f59643p = azVar;
        this.f59644q = z3;
        this.f59645r = i;
        this.f59646s = atomicReference;
    }

    /* renamed from: A */
    public final C20747a mo26797A() {
        return this.f59647t;
    }

    /* renamed from: a */
    public final float mo26798a() {
        return 0.0f;
    }

    /* renamed from: b */
    public final int mo26799b() {
        return this.f59645r;
    }

    /* renamed from: c */
    public final C0657fs mo26800c() {
        return null;
    }

    /* renamed from: d */
    public final View mo26801d() {
        return this.f59628a;
    }

    @Deprecated
    /* renamed from: e */
    public final C6308j mo26802e() {
        return this.f59632e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0181, code lost:
        r1 = r4.f59646s;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        r1 = r4.f59629b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        r1 = r4.f59630c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0065, code lost:
        r1 = r4.f59647t;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008e, code lost:
        r1 = r4.f59632e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a3, code lost:
        r1 = r4.f59633f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d0, code lost:
        r1 = r4.f59636i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e5, code lost:
        r1 = r4.f59637j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00fa, code lost:
        r1 = r4.f59638k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0115, code lost:
        r1 = r4.f59639l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x012a, code lost:
        r1 = r4.f59640m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x013f, code lost:
        r1 = r4.f59641n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x015c, code lost:
        r1 = r4.f59643p;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.elements.interfaces.C21319z
            r2 = 0
            if (r1 == 0) goto L_0x0198
            com.google.android.libraries.elements.interfaces.z r5 = (com.google.android.libraries.elements.interfaces.C21319z) r5
            android.view.View r1 = r4.f59628a
            if (r1 != 0) goto L_0x0016
            android.view.View r1 = r5.mo26801d()
            if (r1 != 0) goto L_0x0198
            goto L_0x0020
        L_0x0016:
            android.view.View r3 = r5.mo26801d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0198
        L_0x0020:
            java.lang.Integer r1 = r5.mo26813n()
            if (r1 != 0) goto L_0x0198
            java.lang.Integer r1 = r5.mo26812m()
            if (r1 != 0) goto L_0x0198
            com.google.android.libraries.elements.interfaces.cf r1 = r4.f59629b
            if (r1 != 0) goto L_0x0037
            com.google.android.libraries.elements.interfaces.cf r1 = r5.mo26809j()
            if (r1 != 0) goto L_0x0198
            goto L_0x0041
        L_0x0037:
            com.google.android.libraries.elements.interfaces.cf r3 = r5.mo26809j()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0198
        L_0x0041:
            io.b.e.a.b r1 = r4.f59630c
            if (r1 != 0) goto L_0x004c
            io.b.e.a.b r1 = r5.mo26811l()
            if (r1 != 0) goto L_0x0198
            goto L_0x0056
        L_0x004c:
            io.b.e.a.b r3 = r5.mo26811l()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0198
        L_0x0056:
            r1 = 0
            int r1 = java.lang.Float.floatToIntBits(r1)
            float r3 = r5.mo26798a()
            int r3 = java.lang.Float.floatToIntBits(r3)
            if (r1 != r3) goto L_0x0198
            com.google.android.libraries.elements.c.b.a r1 = r4.f59647t
            if (r1 != 0) goto L_0x0070
            com.google.android.libraries.elements.c.b.a r1 = r5.mo26797A()
            if (r1 != 0) goto L_0x0198
            goto L_0x007a
        L_0x0070:
            com.google.android.libraries.elements.c.b.a r3 = r5.mo26797A()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0198
        L_0x007a:
            android.support.v7.widget.fs r1 = r5.mo26800c()
            if (r1 != 0) goto L_0x0198
            boolean r1 = r4.f59631d
            boolean r3 = r5.mo26825y()
            if (r1 != r3) goto L_0x0198
            boolean r1 = r5.mo26826z()
            if (r1 != 0) goto L_0x0198
            com.facebook.litho.g.b.j r1 = r4.f59632e
            if (r1 != 0) goto L_0x0099
            com.facebook.litho.g.b.j r1 = r5.mo26802e()
            if (r1 != 0) goto L_0x0198
            goto L_0x00a3
        L_0x0099:
            com.facebook.litho.g.b.j r3 = r5.mo26802e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0198
        L_0x00a3:
            java.lang.StringBuilder r1 = r4.f59633f
            if (r1 != 0) goto L_0x00ae
            java.lang.StringBuilder r1 = r5.mo26818s()
            if (r1 != 0) goto L_0x0198
            goto L_0x00b8
        L_0x00ae:
            java.lang.StringBuilder r3 = r5.mo26818s()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0198
        L_0x00b8:
            java.lang.String r1 = r4.f59634g
            java.lang.String r3 = r5.mo26815p()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0198
            java.lang.String r1 = r4.f59635h
            java.lang.String r3 = r5.mo26816q()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0198
            java.lang.ref.WeakReference r1 = r4.f59636i
            if (r1 != 0) goto L_0x00db
            java.lang.ref.WeakReference r1 = r5.mo26819t()
            if (r1 != 0) goto L_0x0198
            goto L_0x00e5
        L_0x00db:
            java.lang.ref.WeakReference r3 = r5.mo26819t()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0198
        L_0x00e5:
            java.lang.ref.WeakReference r1 = r4.f59637j
            if (r1 != 0) goto L_0x00f0
            java.lang.ref.WeakReference r1 = r5.mo26821u()
            if (r1 != 0) goto L_0x0198
            goto L_0x00fa
        L_0x00f0:
            java.lang.ref.WeakReference r3 = r5.mo26821u()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0198
        L_0x00fa:
            com.google.android.libraries.elements.interfaces.bd r1 = r4.f59638k
            if (r1 != 0) goto L_0x0105
            com.google.android.libraries.elements.interfaces.bd r1 = r5.mo26808i()
            if (r1 != 0) goto L_0x0198
            goto L_0x010f
        L_0x0105:
            com.google.android.libraries.elements.interfaces.bd r3 = r5.mo26808i()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0198
        L_0x010f:
            com.google.common.b.gu r1 = r5.mo26810k()
            if (r1 != 0) goto L_0x0198
            com.google.android.libraries.elements.interfaces.ah r1 = r4.f59639l
            if (r1 != 0) goto L_0x0120
            com.google.android.libraries.elements.interfaces.ah r1 = r5.mo26805g()
            if (r1 != 0) goto L_0x0198
            goto L_0x012a
        L_0x0120:
            com.google.android.libraries.elements.interfaces.ah r3 = r5.mo26805g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0198
        L_0x012a:
            java.lang.String r1 = r4.f59640m
            if (r1 != 0) goto L_0x0135
            java.lang.String r1 = r5.mo26814o()
            if (r1 != 0) goto L_0x0198
            goto L_0x013f
        L_0x0135:
            java.lang.String r3 = r5.mo26814o()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0198
        L_0x013f:
            java.lang.String r1 = r4.f59641n
            if (r1 != 0) goto L_0x014a
            java.lang.String r1 = r5.mo26817r()
            if (r1 != 0) goto L_0x0198
            goto L_0x0154
        L_0x014a:
            java.lang.String r3 = r5.mo26817r()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0198
        L_0x0154:
            boolean r1 = r4.f59642o
            boolean r3 = r5.mo26824x()
            if (r1 != r3) goto L_0x0198
            com.google.android.libraries.elements.interfaces.az r1 = r4.f59643p
            if (r1 != 0) goto L_0x0167
            com.google.android.libraries.elements.interfaces.az r1 = r5.mo26806h()
            if (r1 != 0) goto L_0x0198
            goto L_0x0171
        L_0x0167:
            com.google.android.libraries.elements.interfaces.az r3 = r5.mo26806h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0198
        L_0x0171:
            boolean r1 = r4.f59644q
            boolean r3 = r5.mo26823w()
            if (r1 != r3) goto L_0x0198
            int r1 = r4.f59645r
            int r3 = r5.mo26799b()
            if (r1 != r3) goto L_0x0198
            java.util.concurrent.atomic.AtomicReference r1 = r4.f59646s
            if (r1 != 0) goto L_0x018c
            java.util.concurrent.atomic.AtomicReference r5 = r5.mo26822v()
            if (r5 != 0) goto L_0x0198
            goto L_0x0197
        L_0x018c:
            java.util.concurrent.atomic.AtomicReference r5 = r5.mo26822v()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0197
            goto L_0x0198
        L_0x0197:
            return r0
        L_0x0198:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.interfaces.C21297d.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final C21318y mo26804f() {
        return new C21284c(this);
    }

    /* renamed from: g */
    public final C21238ah mo26805g() {
        return this.f59639l;
    }

    /* renamed from: h */
    public final C21256az mo26806h() {
        return this.f59643p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C21261bd mo26808i() {
        return this.f59638k;
    }

    /* renamed from: j */
    public final C21290cf mo26809j() {
        return this.f59629b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final C58485gu mo26810k() {
        return null;
    }

    /* renamed from: l */
    public final C69826b mo26811l() {
        return this.f59630c;
    }

    /* renamed from: m */
    public final Integer mo26812m() {
        return null;
    }

    /* renamed from: n */
    public final Integer mo26813n() {
        return null;
    }

    /* renamed from: o */
    public final String mo26814o() {
        return this.f59640m;
    }

    /* renamed from: p */
    public final String mo26815p() {
        return this.f59634g;
    }

    /* renamed from: q */
    public final String mo26816q() {
        return this.f59635h;
    }

    /* renamed from: r */
    public final String mo26817r() {
        return this.f59641n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final StringBuilder mo26818s() {
        return this.f59633f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final WeakReference mo26819t() {
        return this.f59636i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f59628a);
        String valueOf2 = String.valueOf(this.f59629b);
        String valueOf3 = String.valueOf(this.f59630c);
        String valueOf4 = String.valueOf(this.f59647t);
        boolean z = this.f59631d;
        String valueOf5 = String.valueOf(this.f59632e);
        String valueOf6 = String.valueOf(this.f59633f);
        String str = this.f59634g;
        String str2 = this.f59635h;
        String valueOf7 = String.valueOf(this.f59636i);
        String valueOf8 = String.valueOf(this.f59637j);
        String valueOf9 = String.valueOf(this.f59638k);
        String valueOf10 = String.valueOf(this.f59639l);
        String str3 = this.f59640m;
        String str4 = this.f59641n;
        boolean z2 = this.f59642o;
        String valueOf11 = String.valueOf(this.f59643p);
        boolean z3 = this.f59644q;
        int i = this.f59645r;
        return "ConversionContext{container=" + valueOf + ", widthConstraint=null, heightConstraint=null, templateLoggerFactory=" + valueOf2 + ", rootDisposableContainer=" + valueOf3 + ", imagePrefetchRangeRatio=0.0, horizontalCollectionTouchInterceptor=" + valueOf4 + ", horizontalCollectionSwipeProtector=null, useIncrementalMountOnChildrenInternal=" + z + ", useLegacyVisibleInternal=false, recyclerBinderConfiguration=" + valueOf5 + ", pathBuilder=" + valueOf6 + ", elementId=" + str + ", identifierProperty=" + str2 + ", loggingNodeInternal=" + valueOf7 + ", parentLoggingNodeInternal=" + valueOf8 + ", elementsInteractionLoggerInternal=" + valueOf9 + ", globalCommandDataDecoratorsInternal=null, decoratingElementBuilder=" + valueOf10 + ", debugId=" + str3 + ", treeDebugId=" + str4 + ", shouldAddDebuggerViewTags=" + z2 + ", elementsConfig=" + valueOf11 + ", couldOverlapWithElementsConfig=" + z3 + ", elementDepthInTree=" + i + ", scrollStrategyListenerHolder=" + String.valueOf(this.f59646s) + "}";
    }

    /* renamed from: u */
    public final WeakReference mo26821u() {
        return this.f59637j;
    }

    /* renamed from: v */
    public final AtomicReference mo26822v() {
        return this.f59646s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final boolean mo26823w() {
        return this.f59644q;
    }

    /* renamed from: x */
    public final boolean mo26824x() {
        return this.f59642o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo26825y() {
        return this.f59631d;
    }

    /* renamed from: z */
    public final boolean mo26826z() {
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        View view = this.f59628a;
        int i14 = 0;
        if (view == null) {
            i = 0;
        } else {
            i = view.hashCode();
        }
        int i15 = (i ^ 1000003) * 583896283;
        C21290cf cfVar = this.f59629b;
        if (cfVar == null) {
            i2 = 0;
        } else {
            i2 = cfVar.hashCode();
        }
        int i16 = (i15 ^ i2) * 1000003;
        C69826b bVar = this.f59630c;
        if (bVar == null) {
            i3 = 0;
        } else {
            i3 = bVar.hashCode();
        }
        int floatToIntBits = (((i16 ^ i3) * 1000003) ^ Float.floatToIntBits(0.0f)) * 1000003;
        C20747a aVar = this.f59647t;
        if (aVar == null) {
            i4 = 0;
        } else {
            i4 = aVar.hashCode();
        }
        int i17 = 1231;
        int i18 = (((((floatToIntBits ^ i4) * -721379959) ^ (true != this.f59631d ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003;
        C6308j jVar = this.f59632e;
        if (jVar == null) {
            i5 = 0;
        } else {
            i5 = jVar.hashCode();
        }
        int i19 = (i18 ^ i5) * 1000003;
        StringBuilder sb = this.f59633f;
        if (sb == null) {
            i6 = 0;
        } else {
            i6 = sb.hashCode();
        }
        int hashCode = (((((i19 ^ i6) * 1000003) ^ this.f59634g.hashCode()) * 1000003) ^ this.f59635h.hashCode()) * 1000003;
        WeakReference weakReference = this.f59636i;
        if (weakReference == null) {
            i7 = 0;
        } else {
            i7 = weakReference.hashCode();
        }
        int i20 = (hashCode ^ i7) * 1000003;
        WeakReference weakReference2 = this.f59637j;
        if (weakReference2 == null) {
            i8 = 0;
        } else {
            i8 = weakReference2.hashCode();
        }
        int i21 = (i20 ^ i8) * 1000003;
        C21261bd bdVar = this.f59638k;
        if (bdVar == null) {
            i9 = 0;
        } else {
            i9 = bdVar.hashCode();
        }
        int i22 = (i21 ^ i9) * -721379959;
        C21238ah ahVar = this.f59639l;
        if (ahVar == null) {
            i10 = 0;
        } else {
            i10 = ahVar.hashCode();
        }
        int i23 = (i22 ^ i10) * 1000003;
        String str = this.f59640m;
        if (str == null) {
            i11 = 0;
        } else {
            i11 = str.hashCode();
        }
        int i24 = (i23 ^ i11) * 1000003;
        String str2 = this.f59641n;
        if (str2 == null) {
            i12 = 0;
        } else {
            i12 = str2.hashCode();
        }
        int i25 = (((i24 ^ i12) * 1000003) ^ (true != this.f59642o ? 1237 : 1231)) * 1000003;
        C21256az azVar = this.f59643p;
        if (azVar == null) {
            i13 = 0;
        } else {
            i13 = azVar.hashCode();
        }
        int i26 = (i25 ^ i13) * 1000003;
        if (true != this.f59644q) {
            i17 = 1237;
        }
        int i27 = (((i26 ^ i17) * 1000003) ^ this.f59645r) * 1000003;
        AtomicReference atomicReference = this.f59646s;
        if (atomicReference != null) {
            i14 = atomicReference.hashCode();
        }
        return i27 ^ i14;
    }
}
