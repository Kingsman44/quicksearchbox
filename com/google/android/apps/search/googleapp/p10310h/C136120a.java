package com.google.android.apps.search.googleapp.p10310h;

import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.h.a */
/* compiled from: PG */
public final class C136120a extends C136128i {

    /* renamed from: a */
    public C58833ax f370720a = C58836b.f156633a;

    /* renamed from: b */
    private C139779t f370721b;

    /* renamed from: c */
    private boolean f370722c;

    /* renamed from: d */
    private boolean f370723d;

    /* renamed from: e */
    private boolean f370724e;

    /* renamed from: f */
    private Optional f370725f = Optional.empty();

    /* renamed from: g */
    private Optional f370726g = Optional.empty();

    /* renamed from: h */
    private Optional f370727h = Optional.empty();

    /* renamed from: i */
    private Optional f370728i = Optional.empty();

    /* renamed from: j */
    private Optional f370729j = Optional.empty();

    /* renamed from: k */
    private Optional f370730k = Optional.empty();

    /* renamed from: l */
    private byte f370731l;

    /* renamed from: a */
    public final C136129j mo112766a() {
        C139779t tVar;
        if (this.f370731l == 7 && (tVar = this.f370721b) != null) {
            return new C136121b(tVar, this.f370722c, this.f370723d, this.f370724e, this.f370725f, this.f370720a, this.f370726g, this.f370727h, this.f370728i, this.f370729j, this.f370730k);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f370721b == null) {
            sb.append(" tabType");
        }
        if ((this.f370731l & 1) == 0) {
            sb.append(" clearTask");
        }
        if ((this.f370731l & 2) == 0) {
            sb.append(" goBackToDiscoverFeedFromSrp");
        }
        if ((this.f370731l & 4) == 0) {
            sb.append(" openAccountMenuOnStart");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo112767b(boolean z) {
        this.f370722c = z;
        this.f370731l = (byte) (this.f370731l | 1);
    }

    /* renamed from: c */
    public final void mo112768c(Optional optional) {
        if (optional != null) {
            this.f370727h = optional;
            return;
        }
        throw new NullPointerException("Null collectionsIntentOptions");
    }

    /* renamed from: d */
    public final void mo112769d(boolean z) {
        this.f370723d = z;
        this.f370731l = (byte) (this.f370731l | 2);
    }

    /* renamed from: e */
    public final void mo112770e(Optional optional) {
        if (optional != null) {
            this.f370728i = optional;
            return;
        }
        throw new NullPointerException("Null googleAppBrowserIntentOptions");
    }

    /* renamed from: f */
    public final void mo112771f(boolean z) {
        this.f370724e = z;
        this.f370731l = (byte) (this.f370731l | 4);
    }

    /* renamed from: g */
    public final void mo112772g(Optional optional) {
        if (optional != null) {
            this.f370726g = optional;
            return;
        }
        throw new NullPointerException("Null persistenceIdOptional");
    }

    /* renamed from: h */
    public final void mo112773h(Optional optional) {
        if (optional != null) {
            this.f370729j = optional;
            return;
        }
        throw new NullPointerException("Null pixelLauncherDataOptional");
    }

    /* renamed from: i */
    public final void mo112774i(Optional optional) {
        if (optional != null) {
            this.f370730k = optional;
            return;
        }
        throw new NullPointerException("Null promotionOptionsOptional");
    }

    /* renamed from: j */
    public final void mo112775j(Optional optional) {
        if (optional != null) {
            this.f370725f = optional;
            return;
        }
        throw new NullPointerException("Null queryOptionsOptional");
    }

    /* renamed from: k */
    public final void mo112776k(C139779t tVar) {
        if (tVar != null) {
            this.f370721b = tVar;
            return;
        }
        throw new NullPointerException("Null tabType");
    }
}
