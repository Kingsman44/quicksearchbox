package com.google.android.libraries.gsa.imageviewer;

import com.google.protos.p5146w.p5147a.p5148a.C65926d;

/* renamed from: com.google.android.libraries.gsa.imageviewer.a */
/* compiled from: PG */
public final class C22821a extends C22827e {

    /* renamed from: a */
    public String f62833a;

    /* renamed from: b */
    public String f62834b;

    /* renamed from: c */
    public String f62835c;

    /* renamed from: d */
    private int f62836d;

    /* renamed from: e */
    private boolean f62837e;

    /* renamed from: f */
    private boolean f62838f;

    /* renamed from: g */
    private boolean f62839g;

    /* renamed from: h */
    private C65926d f62840h;

    /* renamed from: i */
    private byte f62841i;

    /* renamed from: a */
    public final C22828f mo28160a() {
        C65926d dVar;
        if (this.f62841i == 31 && (dVar = this.f62840h) != null) {
            return new C22824b(this.f62833a, this.f62836d, this.f62837e, this.f62838f, this.f62839g, dVar, this.f62834b, this.f62835c);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f62841i & 1) == 0) {
            sb.append(" index");
        }
        if ((this.f62841i & 2) == 0) {
            sb.append(" fetchMoreResults");
        }
        if ((this.f62841i & 4) == 0) {
            sb.append(" showRichContent");
        }
        if ((this.f62841i & 8) == 0) {
            sb.append(" fromIpa");
        }
        if ((this.f62841i & 16) == 0) {
            sb.append(" presentationMode");
        }
        if (this.f62840h == null) {
            sb.append(" imageGroup");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo28161b(boolean z) {
        this.f62837e = z;
        this.f62841i = (byte) (this.f62841i | 2);
    }

    /* renamed from: c */
    public final void mo28162c() {
        this.f62841i = (byte) (this.f62841i | 8);
    }

    /* renamed from: d */
    public final void mo28163d(C65926d dVar) {
        if (dVar != null) {
            this.f62840h = dVar;
            return;
        }
        throw new NullPointerException("Null imageGroup");
    }

    /* renamed from: e */
    public final void mo28164e(int i) {
        this.f62836d = i;
        this.f62841i = (byte) (this.f62841i | 1);
    }

    /* renamed from: f */
    public final void mo28165f(boolean z) {
        this.f62839g = z;
        this.f62841i = (byte) (this.f62841i | 16);
    }

    /* renamed from: g */
    public final void mo28166g(boolean z) {
        this.f62838f = z;
        this.f62841i = (byte) (this.f62841i | 4);
    }
}
