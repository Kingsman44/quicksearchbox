package com.google.android.apps.gsa.nga.engine.education.p6016a;

import com.google.common.p4522b.C58528ij;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.a.e */
/* compiled from: PG */
public final class C75654e extends C75644ac {

    /* renamed from: a */
    public Optional f209995a = Optional.empty();

    /* renamed from: b */
    public String f209996b;

    /* renamed from: c */
    public C75649ah f209997c;

    /* renamed from: d */
    public C75649ah f209998d;

    /* renamed from: e */
    public Optional f209999e = Optional.empty();

    /* renamed from: f */
    public C58528ij f210000f;

    /* renamed from: g */
    public String f210001g;

    /* renamed from: h */
    private Locale f210002h;

    /* renamed from: i */
    private C58528ij f210003i;

    /* renamed from: j */
    private Optional f210004j = Optional.empty();

    /* renamed from: k */
    private C75646ae f210005k;

    /* renamed from: a */
    public final C75650ai mo71784a() {
        C75649ah ahVar;
        C75649ah ahVar2;
        Locale locale;
        C58528ij ijVar;
        C58528ij ijVar2;
        C75646ae aeVar;
        String str = this.f209996b;
        if (str != null && (ahVar = this.f209997c) != null && (ahVar2 = this.f209998d) != null && (locale = this.f210002h) != null && (ijVar = this.f210003i) != null && (ijVar2 = this.f210000f) != null && (aeVar = this.f210005k) != null) {
            return new C75655f(this.f209995a, str, ahVar, ahVar2, locale, ijVar, this.f209999e, ijVar2, this.f210004j, this.f210001g, aeVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f209996b == null) {
            sb.append(" id");
        }
        if (this.f209997c == null) {
            sb.append(" hint");
        }
        if (this.f209998d == null) {
            sb.append(" query");
        }
        if (this.f210002h == null) {
            sb.append(" locale");
        }
        if (this.f210003i == null) {
            sb.append(" displayedIn");
        }
        if (this.f210000f == null) {
            sb.append(" showsInPackages");
        }
        if (this.f210005k == null) {
            sb.append(" disclosureInfo");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo71785b(C75646ae aeVar) {
        if (aeVar != null) {
            this.f210005k = aeVar;
            return;
        }
        throw new NullPointerException("Null disclosureInfo");
    }

    /* renamed from: c */
    public final void mo71786c(C58528ij ijVar) {
        if (ijVar != null) {
            this.f210003i = ijVar;
            return;
        }
        throw new NullPointerException("Null displayedIn");
    }

    /* renamed from: d */
    public final void mo71787d(String str) {
        if (str != null) {
            this.f209996b = str;
            return;
        }
        throw new NullPointerException("Null id");
    }

    /* renamed from: e */
    public final void mo71788e(Locale locale) {
        if (locale != null) {
            this.f210002h = locale;
            return;
        }
        throw new NullPointerException("Null locale");
    }

    /* renamed from: f */
    public final void mo71789f(C58528ij ijVar) {
        if (ijVar != null) {
            this.f210000f = ijVar;
            return;
        }
        throw new NullPointerException("Null showsInPackages");
    }

    /* renamed from: g */
    public final void mo71790g(Optional optional) {
        if (optional != null) {
            this.f210004j = optional;
            return;
        }
        throw new NullPointerException("Null suggestionLogInfo");
    }
}
