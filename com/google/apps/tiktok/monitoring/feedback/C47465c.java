package com.google.apps.tiktok.monitoring.feedback;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;

/* renamed from: com.google.apps.tiktok.monitoring.feedback.c */
/* compiled from: PG */
public final class C47465c extends C47474k {

    /* renamed from: a */
    public String f123249a;

    /* renamed from: b */
    public C58833ax f123250b;

    /* renamed from: c */
    public C58833ax f123251c;

    /* renamed from: d */
    public int f123252d;

    /* renamed from: e */
    private C58490gz f123253e;

    /* renamed from: f */
    private C58495hd f123254f;

    /* renamed from: g */
    private boolean f123255g;

    /* renamed from: h */
    private byte f123256h;

    public C47465c() {
        C58836b bVar = C58836b.f156633a;
        this.f123250b = bVar;
        this.f123251c = bVar;
    }

    /* renamed from: a */
    public final C47475l mo51307a() {
        String str;
        int i;
        C58490gz gzVar = this.f123253e;
        if (gzVar != null) {
            this.f123254f = gzVar.mo55427f(true);
        } else if (this.f123254f == null) {
            this.f123254f = C58729pv.f156485a;
        }
        if (this.f123256h == 1 && (str = this.f123249a) != null && (i = this.f123252d) != 0) {
            return new C47466d(str, this.f123250b, this.f123254f, this.f123255g, this.f123251c, i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f123249a == null) {
            sb.append(" categoryTag");
        }
        if (this.f123256h == 0) {
            sb.append(" includeScreenshot");
        }
        if (this.f123252d == 0) {
            sb.append(" colorTheme");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final C58490gz mo51308b() {
        if (this.f123253e == null) {
            this.f123253e = new C58490gz(4);
        }
        return this.f123253e;
    }

    /* renamed from: c */
    public final void mo51309c(String str) {
        if (str != null) {
            this.f123249a = str;
            return;
        }
        throw new NullPointerException("Null categoryTag");
    }

    /* renamed from: d */
    public final void mo51310d(boolean z) {
        this.f123255g = z;
        this.f123256h = 1;
    }
}
