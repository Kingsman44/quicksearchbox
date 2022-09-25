package com.google.android.apps.gsa.opaonboarding;

import com.google.android.apps.gsa.opaonboarding.p6462d.C83925l;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.opaonboarding.k */
/* compiled from: PG */
public final class C83944k extends C83883aq {

    /* renamed from: a */
    public C58833ax f228634a;

    /* renamed from: b */
    public C58833ax f228635b;

    /* renamed from: c */
    public int f228636c;

    /* renamed from: d */
    public int f228637d;

    /* renamed from: e */
    public int f228638e;

    /* renamed from: f */
    private int f228639f;

    /* renamed from: g */
    private boolean f228640g;

    /* renamed from: h */
    private boolean f228641h;

    /* renamed from: i */
    private boolean f228642i;

    /* renamed from: j */
    private C83925l f228643j;

    /* renamed from: k */
    private boolean f228644k;

    /* renamed from: l */
    private int f228645l;

    /* renamed from: m */
    private boolean f228646m;

    /* renamed from: n */
    private byte f228647n;

    /* renamed from: o */
    private int f228648o;

    public C83944k() {
        C58836b bVar = C58836b.f156633a;
        this.f228634a = bVar;
        this.f228635b = bVar;
    }

    /* renamed from: a */
    public final C83884ar mo77246a() {
        int i;
        int i2;
        int i3;
        C83925l lVar;
        int i4;
        if (this.f228647n == Byte.MAX_VALUE && (i = this.f228636c) != 0 && (i2 = this.f228648o) != 0 && (i3 = this.f228637d) != 0 && (lVar = this.f228643j) != null && (i4 = this.f228638e) != 0) {
            return new C83945l(i, i2, this.f228639f, this.f228634a, i3, this.f228640g, this.f228641h, this.f228642i, lVar, this.f228644k, this.f228645l, this.f228646m, this.f228635b, i4);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f228636c == 0) {
            sb.append(" omniconsentScope");
        }
        if (this.f228648o == 0) {
            sb.append(" flowId");
        }
        if ((this.f228647n & 1) == 0) {
            sb.append(" valuePropId");
        }
        if (this.f228637d == 0) {
            sb.append(" assistantSurface");
        }
        if ((this.f228647n & 2) == 0) {
            sb.append(" shouldShowValueProp");
        }
        if ((this.f228647n & 4) == 0) {
            sb.append(" shouldShowUdc");
        }
        if ((this.f228647n & 8) == 0) {
            sb.append(" shouldShowDisclosures");
        }
        if (this.f228643j == null) {
            sb.append(" disclosuresContent");
        }
        if ((this.f228647n & 16) == 0) {
            sb.append(" shouldShowConfirmRejectFragment");
        }
        if ((this.f228647n & 32) == 0) {
            sb.append(" udcRequired");
        }
        if ((this.f228647n & 64) == 0) {
            sb.append(" shouldHandlePageLoadErrors");
        }
        if (this.f228638e == 0) {
            sb.append(" omniconsentUserType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo77247b(C83925l lVar) {
        if (lVar != null) {
            this.f228643j = lVar;
            return;
        }
        throw new NullPointerException("Null disclosuresContent");
    }

    /* renamed from: c */
    public final void mo77248c(boolean z) {
        this.f228646m = z;
        this.f228647n = (byte) (this.f228647n | 64);
    }

    /* renamed from: d */
    public final void mo77249d(boolean z) {
        this.f228644k = z;
        this.f228647n = (byte) (this.f228647n | 16);
    }

    /* renamed from: e */
    public final void mo77250e(boolean z) {
        this.f228642i = z;
        this.f228647n = (byte) (this.f228647n | 8);
    }

    /* renamed from: f */
    public final void mo77251f(boolean z) {
        this.f228641h = z;
        this.f228647n = (byte) (this.f228647n | 4);
    }

    /* renamed from: g */
    public final void mo77252g(boolean z) {
        this.f228640g = z;
        this.f228647n = (byte) (this.f228647n | 2);
    }

    /* renamed from: h */
    public final void mo77253h(int i) {
        this.f228645l = i;
        this.f228647n = (byte) (this.f228647n | 32);
    }

    /* renamed from: i */
    public final void mo77254i(int i) {
        this.f228639f = i;
        this.f228647n = (byte) (this.f228647n | 1);
    }

    /* renamed from: j */
    public final void mo77255j(int i) {
        if (i != 0) {
            this.f228648o = i;
            return;
        }
        throw new NullPointerException("Null flowId");
    }
}
