package com.google.android.apps.gsa.staticplugins.opa.appactions;

import com.google.common.p4522b.C58495hd;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.ah */
/* compiled from: PG */
public final class C107239ah extends C107307h {

    /* renamed from: a */
    public Optional f298464a = Optional.empty();

    /* renamed from: b */
    public Optional f298465b = Optional.empty();

    /* renamed from: c */
    public Optional f298466c = Optional.empty();

    /* renamed from: d */
    public Optional f298467d = Optional.empty();

    /* renamed from: e */
    public Optional f298468e = Optional.empty();

    /* renamed from: f */
    public C58495hd f298469f;

    /* renamed from: g */
    public Optional f298470g = Optional.empty();

    /* renamed from: h */
    public Optional f298471h = Optional.empty();

    /* renamed from: i */
    public Optional f298472i = Optional.empty();

    /* renamed from: j */
    public Optional f298473j = Optional.empty();

    /* renamed from: k */
    public Optional f298474k = Optional.empty();

    /* renamed from: l */
    public int f298475l;

    /* renamed from: m */
    private Optional f298476m = Optional.empty();

    /* renamed from: n */
    private Optional f298477n = Optional.empty();

    public C107239ah() {
    }

    /* renamed from: a */
    public final C107308i mo95845a() {
        C58495hd hdVar;
        int i = this.f298475l;
        if (i != 0 && (hdVar = this.f298469f) != null) {
            return new C107240ai(this.f298464a, i, this.f298465b, this.f298466c, this.f298467d, this.f298468e, hdVar, this.f298470g, this.f298471h, this.f298476m, this.f298477n, this.f298472i, this.f298473j, this.f298474k);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f298475l == 0) {
            sb.append(" shortcutEnumType");
        }
        if (this.f298469f == null) {
            sb.append(" intentArguments");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo95846b(String str) {
        this.f298470g = Optional.m71637of(str);
    }

    /* renamed from: c */
    public final void mo95847c(String str) {
        this.f298466c = Optional.m71637of(str);
    }

    /* renamed from: d */
    public final void mo95848d(Optional optional) {
        if (optional != null) {
            this.f298477n = optional;
            return;
        }
        throw new NullPointerException("Null donatedShortcutData");
    }

    /* renamed from: e */
    public final void mo95849e(Optional optional) {
        if (optional != null) {
            this.f298476m = optional;
            return;
        }
        throw new NullPointerException("Null dynamicShortcutMatch");
    }

    public C107239ah(C107308i iVar) {
        C107240ai aiVar = (C107240ai) iVar;
        this.f298464a = aiVar.f298478a;
        this.f298475l = aiVar.f298491n;
        this.f298465b = aiVar.f298479b;
        this.f298466c = aiVar.f298480c;
        this.f298467d = aiVar.f298481d;
        this.f298468e = aiVar.f298482e;
        this.f298469f = aiVar.f298483f;
        this.f298470g = aiVar.f298484g;
        this.f298471h = aiVar.f298485h;
        this.f298476m = aiVar.f298486i;
        this.f298477n = aiVar.f298487j;
        this.f298472i = aiVar.f298488k;
        this.f298473j = aiVar.f298489l;
        this.f298474k = aiVar.f298490m;
    }
}
