package com.google.android.apps.gsa.staticplugins.opa.p8369hq;

import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50638an;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50659v;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.hq.a */
/* compiled from: PG */
public final class C109211a extends C109245s {

    /* renamed from: a */
    public int f304114a;

    /* renamed from: b */
    public int f304115b;

    /* renamed from: c */
    public int f304116c;

    /* renamed from: d */
    public int f304117d;

    /* renamed from: e */
    public C50659v f304118e;

    /* renamed from: f */
    public C50638an f304119f;

    /* renamed from: g */
    public byte f304120g;

    /* renamed from: h */
    public int f304121h;

    /* renamed from: i */
    private boolean f304122i;

    /* renamed from: j */
    private boolean f304123j;

    /* renamed from: a */
    public final C109246t mo97670a() {
        if (this.f304120g == 63) {
            return new C109228b(this.f304122i, this.f304123j, this.f304114a, this.f304115b, this.f304116c, this.f304117d, this.f304118e, this.f304119f, this.f304121h);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f304120g & 1) == 0) {
            sb.append(" launchedFromDockMode");
        }
        if ((this.f304120g & 2) == 0) {
            sb.append(" launchedFromBadge");
        }
        if ((this.f304120g & 4) == 0) {
            sb.append(" launchEnterTransition");
        }
        if ((this.f304120g & 8) == 0) {
            sb.append(" launchExitTransition");
        }
        if ((this.f304120g & 16) == 0) {
            sb.append(" closeEnterTransition");
        }
        if ((this.f304120g & 32) == 0) {
            sb.append(" closeExitTransition");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo97671b(boolean z) {
        this.f304123j = z;
        this.f304120g = (byte) (this.f304120g | 2);
    }

    /* renamed from: c */
    public final void mo97672c(boolean z) {
        this.f304122i = z;
        this.f304120g = (byte) (this.f304120g | 1);
    }
}
