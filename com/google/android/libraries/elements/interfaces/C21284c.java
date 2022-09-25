package com.google.android.libraries.elements.interfaces;

import android.view.View;
import com.facebook.litho.p329g.p331b.C6308j;
import com.google.android.libraries.elements.p1708c.p1710b.C20747a;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.p5497e.p5498a.C69826b;

/* renamed from: com.google.android.libraries.elements.interfaces.c */
/* compiled from: PG */
public final class C21284c extends C21318y {

    /* renamed from: a */
    public View f59603a;

    /* renamed from: b */
    public C21290cf f59604b;

    /* renamed from: c */
    public C6308j f59605c;

    /* renamed from: d */
    public StringBuilder f59606d;

    /* renamed from: e */
    public String f59607e;

    /* renamed from: f */
    public String f59608f;

    /* renamed from: g */
    public C21261bd f59609g;

    /* renamed from: h */
    public C21256az f59610h;

    /* renamed from: i */
    public byte f59611i;

    /* renamed from: j */
    public C20747a f59612j;

    /* renamed from: k */
    private C69826b f59613k;

    /* renamed from: l */
    private boolean f59614l;

    /* renamed from: m */
    private WeakReference f59615m;

    /* renamed from: n */
    private WeakReference f59616n;

    /* renamed from: o */
    private C21238ah f59617o;

    /* renamed from: p */
    private String f59618p;

    /* renamed from: q */
    private String f59619q;

    /* renamed from: r */
    private boolean f59620r;

    /* renamed from: s */
    private boolean f59621s;

    /* renamed from: t */
    private int f59622t;

    /* renamed from: u */
    private AtomicReference f59623u;

    public C21284c() {
    }

    public C21284c(C21319z zVar) {
        C21297d dVar = (C21297d) zVar;
        this.f59603a = dVar.f59628a;
        this.f59604b = dVar.f59629b;
        this.f59613k = dVar.f59630c;
        this.f59612j = dVar.f59647t;
        this.f59614l = dVar.f59631d;
        this.f59605c = dVar.f59632e;
        this.f59606d = dVar.f59633f;
        this.f59607e = dVar.f59634g;
        this.f59608f = dVar.f59635h;
        this.f59615m = dVar.f59636i;
        this.f59616n = dVar.f59637j;
        this.f59609g = dVar.f59638k;
        this.f59617o = dVar.f59639l;
        this.f59618p = dVar.f59640m;
        this.f59619q = dVar.f59641n;
        this.f59620r = dVar.f59642o;
        this.f59610h = dVar.f59643p;
        this.f59621s = dVar.f59644q;
        this.f59622t = dVar.f59645r;
        this.f59623u = dVar.f59646s;
        this.f59611i = 63;
    }

    /* renamed from: a */
    public final C21319z mo26778a() {
        if (this.f59611i != 63 || this.f59607e == null || this.f59608f == null) {
            StringBuilder sb = new StringBuilder();
            if ((this.f59611i & 1) == 0) {
                sb.append(" imagePrefetchRangeRatio");
            }
            if ((this.f59611i & 2) == 0) {
                sb.append(" useIncrementalMountOnChildrenInternal");
            }
            if ((this.f59611i & 4) == 0) {
                sb.append(" useLegacyVisibleInternal");
            }
            if (this.f59607e == null) {
                sb.append(" elementId");
            }
            if (this.f59608f == null) {
                sb.append(" identifierProperty");
            }
            if ((this.f59611i & 8) == 0) {
                sb.append(" shouldAddDebuggerViewTags");
            }
            if ((this.f59611i & 16) == 0) {
                sb.append(" couldOverlapWithElementsConfig");
            }
            if ((this.f59611i & 32) == 0) {
                sb.append(" elementDepthInTree");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        C21297d dVar = r2;
        C21297d dVar2 = new C21297d(this.f59603a, this.f59604b, this.f59613k, this.f59612j, this.f59614l, this.f59605c, this.f59606d, this.f59607e, this.f59608f, this.f59615m, this.f59616n, this.f59609g, this.f59617o, this.f59618p, this.f59619q, this.f59620r, this.f59610h, this.f59621s, this.f59622t, this.f59623u);
        return dVar;
    }

    /* renamed from: b */
    public final void mo26779b(boolean z) {
        this.f59621s = z;
        this.f59611i = (byte) (this.f59611i | 16);
    }

    /* renamed from: c */
    public final void mo26780c(String str) {
        this.f59618p = str;
    }

    /* renamed from: d */
    public final void mo26781d(C21238ah ahVar) {
        this.f59617o = ahVar;
    }

    /* renamed from: e */
    public final void mo26782e(int i) {
        this.f59622t = i;
        this.f59611i = (byte) (this.f59611i | 32);
    }

    /* renamed from: f */
    public final void mo26783f(String str) {
        this.f59607e = str;
    }

    /* renamed from: g */
    public final void mo26784g(String str) {
        this.f59608f = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo26785h(WeakReference weakReference) {
        this.f59615m = weakReference;
    }

    /* renamed from: i */
    public final void mo26786i(WeakReference weakReference) {
        this.f59616n = weakReference;
    }

    /* renamed from: j */
    public final void mo26787j(StringBuilder sb) {
        this.f59606d = sb;
    }

    /* renamed from: k */
    public final void mo26788k(C69826b bVar) {
        this.f59613k = bVar;
    }

    /* renamed from: l */
    public final void mo26789l(AtomicReference atomicReference) {
        this.f59623u = atomicReference;
    }

    /* renamed from: m */
    public final void mo26790m(boolean z) {
        this.f59620r = z;
        this.f59611i = (byte) (this.f59611i | 8);
    }

    /* renamed from: n */
    public final void mo26791n(String str) {
        this.f59619q = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo26792o(boolean z) {
        this.f59614l = z;
        this.f59611i = (byte) (this.f59611i | 2);
    }
}
