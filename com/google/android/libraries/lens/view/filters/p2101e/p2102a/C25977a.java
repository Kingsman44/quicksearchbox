package com.google.android.libraries.lens.view.filters.p2101e.p2102a;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.lens.view.filters.e.a.a */
/* compiled from: PG */
final class C25977a extends C25979c {

    /* renamed from: a */
    public C25980d f70594a;

    /* renamed from: b */
    private String f70595b;

    /* renamed from: c */
    private String f70596c;

    /* renamed from: d */
    private String f70597d;

    /* renamed from: e */
    private int f70598e;

    /* renamed from: f */
    private int f70599f;

    /* renamed from: g */
    private C58833ax f70600g = C58836b.f156633a;

    /* renamed from: h */
    private int f70601h;

    /* renamed from: i */
    private boolean f70602i;

    /* renamed from: j */
    private boolean f70603j;

    /* renamed from: k */
    private boolean f70604k;

    /* renamed from: l */
    private boolean f70605l;

    /* renamed from: m */
    private boolean f70606m;

    /* renamed from: n */
    private boolean f70607n;

    /* renamed from: o */
    private short f70608o;

    /* renamed from: a */
    public final C25981e mo31168a() {
        C25980d dVar;
        String str;
        String str2;
        String str3;
        if (this.f70608o != 511 || (dVar = this.f70594a) == null || (str = this.f70595b) == null || (str2 = this.f70596c) == null || (str3 = this.f70597d) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f70594a == null) {
                sb.append(" type");
            }
            if (this.f70595b == null) {
                sb.append(" name");
            }
            if (this.f70596c == null) {
                sb.append(" liveModeGuidanceMessage");
            }
            if (this.f70597d == null) {
                sb.append(" filtersInHomeGuidanceMessage");
            }
            if ((this.f70608o & 1) == 0) {
                sb.append(" itemViewResourceId");
            }
            if ((this.f70608o & 2) == 0) {
                sb.append(" vectorIcon");
            }
            if ((this.f70608o & 4) == 0) {
                sb.append(" filtersInHomeVeId");
            }
            if ((this.f70608o & 8) == 0) {
                sb.append(" supportsRegionInteractions");
            }
            if ((this.f70608o & 16) == 0) {
                sb.append(" discardsRegionSearchOcr");
            }
            if ((this.f70608o & 32) == 0) {
                sb.append(" supportsReticle");
            }
            if ((this.f70608o & 64) == 0) {
                sb.append(" supportsReticleRegion");
            }
            if ((this.f70608o & 128) == 0) {
                sb.append(" supportsMultimodalQueries");
            }
            if ((this.f70608o & 256) == 0) {
                sb.append(" supportsTextInteractions");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new C25978b(dVar, str, str2, str3, this.f70598e, this.f70599f, this.f70600g, this.f70601h, this.f70602i, this.f70603j, this.f70604k, this.f70605l, this.f70606m, this.f70607n);
    }

    /* renamed from: b */
    public final void mo31169b(boolean z) {
        this.f70603j = z;
        this.f70608o = (short) (this.f70608o | 16);
    }

    /* renamed from: c */
    public final void mo31170c(String str) {
        if (str != null) {
            this.f70597d = str;
            return;
        }
        throw new NullPointerException("Null filtersInHomeGuidanceMessage");
    }

    /* renamed from: d */
    public final void mo31171d(int i) {
        this.f70601h = i;
        this.f70608o = (short) (this.f70608o | 4);
    }

    /* renamed from: e */
    public final void mo31172e(int i) {
        this.f70598e = i;
        this.f70608o = (short) (this.f70608o | 1);
    }

    /* renamed from: f */
    public final void mo31173f(String str) {
        if (str != null) {
            this.f70596c = str;
            return;
        }
        throw new NullPointerException("Null liveModeGuidanceMessage");
    }

    /* renamed from: g */
    public final void mo31174g(String str) {
        if (str != null) {
            this.f70595b = str;
            return;
        }
        throw new NullPointerException("Null name");
    }

    /* renamed from: h */
    public final void mo31175h(boolean z) {
        this.f70606m = z;
        this.f70608o = (short) (this.f70608o | 128);
    }

    /* renamed from: i */
    public final void mo31176i(boolean z) {
        this.f70602i = z;
        this.f70608o = (short) (this.f70608o | 8);
    }

    /* renamed from: j */
    public final void mo31177j(boolean z) {
        this.f70604k = z;
        this.f70608o = (short) (this.f70608o | 32);
    }

    /* renamed from: k */
    public final void mo31178k(boolean z) {
        this.f70605l = z;
        this.f70608o = (short) (this.f70608o | 64);
    }

    /* renamed from: l */
    public final void mo31179l(boolean z) {
        this.f70607n = z;
        this.f70608o = (short) (this.f70608o | 256);
    }

    /* renamed from: m */
    public final void mo31180m(int i) {
        this.f70600g = C58833ax.m90834k(Integer.valueOf(i));
    }

    /* renamed from: n */
    public final void mo31181n(int i) {
        this.f70599f = i;
        this.f70608o = (short) (this.f70608o | 2);
    }
}
