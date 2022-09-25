package com.google.android.apps.gsa.shared.search;

import java.util.Map;

/* renamed from: com.google.android.apps.gsa.shared.search.a */
/* compiled from: PG */
public final class C90482a extends C90503k {

    /* renamed from: a */
    public String f252841a;

    /* renamed from: b */
    public String f252842b;

    /* renamed from: c */
    public String f252843c;

    /* renamed from: d */
    public String f252844d;

    /* renamed from: e */
    public Map f252845e;

    /* renamed from: f */
    public String f252846f;

    /* renamed from: g */
    public String f252847g;

    /* renamed from: h */
    private int f252848h;

    /* renamed from: i */
    private boolean f252849i;

    /* renamed from: j */
    private boolean f252850j;

    /* renamed from: k */
    private boolean f252851k;

    /* renamed from: l */
    private byte f252852l;

    /* renamed from: a */
    public final C90504l mo84503a() {
        String str;
        String str2;
        Map map;
        if (this.f252852l == 15 && (str = this.f252841a) != null && (str2 = this.f252842b) != null && (map = this.f252845e) != null) {
            return new C90484b(str, str2, this.f252848h, this.f252843c, this.f252844d, map, this.f252846f, this.f252849i, this.f252850j, this.f252851k, this.f252847g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f252841a == null) {
            sb.append(" queryString");
        }
        if (this.f252842b == null) {
            sb.append(" corpusId");
        }
        if ((this.f252852l & 1) == 0) {
            sb.append(" resultIndex");
        }
        if (this.f252845e == null) {
            sb.append(" extraParameters");
        }
        if ((this.f252852l & 2) == 0) {
            sb.append(" isHtmlResponse");
        }
        if ((this.f252852l & 4) == 0) {
            sb.append(" isImmersivePane");
        }
        if ((this.f252852l & 8) == 0) {
            sb.append(" hideCorpusBar");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo84504b(Map map) {
        if (map != null) {
            this.f252845e = map;
            return;
        }
        throw new NullPointerException("Null extraParameters");
    }

    /* renamed from: c */
    public final void mo84505c(boolean z) {
        this.f252851k = z;
        this.f252852l = (byte) (this.f252852l | 8);
    }

    /* renamed from: d */
    public final void mo84506d(boolean z) {
        this.f252849i = z;
        this.f252852l = (byte) (this.f252852l | 2);
    }

    /* renamed from: e */
    public final void mo84507e(boolean z) {
        this.f252850j = z;
        this.f252852l = (byte) (this.f252852l | 4);
    }

    /* renamed from: f */
    public final void mo84508f(int i) {
        this.f252848h = i;
        this.f252852l = (byte) (this.f252852l | 1);
    }
}
