package com.google.android.apps.gsa.staticplugins.opa.appactions;

import com.google.assistant.p3825an.p3830c.p3831a.C49255aa;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4522b.C58758qx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.ai */
/* compiled from: PG */
final class C107240ai extends C107308i {

    /* renamed from: a */
    public final Optional f298478a;

    /* renamed from: b */
    public final Optional f298479b;

    /* renamed from: c */
    public final Optional f298480c;

    /* renamed from: d */
    public final Optional f298481d;

    /* renamed from: e */
    public final Optional f298482e;

    /* renamed from: f */
    public final C58495hd f298483f;

    /* renamed from: g */
    public final Optional f298484g;

    /* renamed from: h */
    public final Optional f298485h;

    /* renamed from: i */
    public final Optional f298486i;

    /* renamed from: j */
    public final Optional f298487j;

    /* renamed from: k */
    public final Optional f298488k;

    /* renamed from: l */
    public final Optional f298489l;

    /* renamed from: m */
    public final Optional f298490m;

    /* renamed from: n */
    public final int f298491n;

    public C107240ai(Optional optional, int i, Optional optional2, Optional optional3, Optional optional4, Optional optional5, C58495hd hdVar, Optional optional6, Optional optional7, Optional optional8, Optional optional9, Optional optional10, Optional optional11, Optional optional12) {
        this.f298478a = optional;
        this.f298491n = i;
        this.f298479b = optional2;
        this.f298480c = optional3;
        this.f298481d = optional4;
        this.f298482e = optional5;
        this.f298483f = hdVar;
        this.f298484g = optional6;
        this.f298485h = optional7;
        this.f298486i = optional8;
        this.f298487j = optional9;
        this.f298488k = optional10;
        this.f298489l = optional11;
        this.f298490m = optional12;
    }

    /* renamed from: b */
    public final C107307h mo95850b() {
        return new C107239ah(this);
    }

    /* renamed from: c */
    public final C58495hd mo95851c() {
        return this.f298483f;
    }

    /* renamed from: d */
    public final Optional mo95852d() {
        return this.f298481d;
    }

    /* renamed from: e */
    public final Optional mo95853e() {
        return this.f298478a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C107308i) {
            C107308i iVar = (C107308i) obj;
            return this.f298478a.equals(iVar.mo95853e()) && this.f298491n == iVar.mo95866p() && this.f298479b.equals(iVar.mo95865o()) && this.f298480c.equals(iVar.mo95857h()) && this.f298481d.equals(iVar.mo95852d()) && this.f298482e.equals(iVar.mo95862l()) && C58662ni.m90356o(this.f298483f, iVar.mo95851c()) && this.f298484g.equals(iVar.mo95855f()) && this.f298485h.equals(iVar.mo95856g()) && this.f298486i.equals(iVar.mo95860j()) && this.f298487j.equals(iVar.mo95859i()) && this.f298488k.equals(iVar.mo95861k()) && this.f298489l.equals(iVar.mo95864n()) && this.f298490m.equals(iVar.mo95863m());
        }
    }

    /* renamed from: f */
    public final Optional mo95855f() {
        return this.f298484g;
    }

    /* renamed from: g */
    public final Optional mo95856g() {
        return this.f298485h;
    }

    /* renamed from: h */
    public final Optional mo95857h() {
        return this.f298480c;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((this.f298478a.hashCode() ^ 1000003) * 1000003) ^ this.f298491n) * 1000003) ^ this.f298479b.hashCode()) * 1000003) ^ this.f298480c.hashCode()) * 1000003) ^ this.f298481d.hashCode()) * 1000003) ^ this.f298482e.hashCode()) * 1000003) ^ C58758qx.m90643a(this.f298483f.entrySet())) * 1000003) ^ this.f298484g.hashCode()) * 1000003) ^ this.f298485h.hashCode()) * 1000003) ^ this.f298486i.hashCode()) * 1000003) ^ this.f298487j.hashCode()) * 1000003) ^ this.f298488k.hashCode()) * 1000003) ^ this.f298489l.hashCode()) * 1000003) ^ this.f298490m.hashCode();
    }

    /* renamed from: i */
    public final Optional mo95859i() {
        return this.f298487j;
    }

    /* renamed from: j */
    public final Optional mo95860j() {
        return this.f298486i;
    }

    /* renamed from: k */
    public final Optional mo95861k() {
        return this.f298488k;
    }

    /* renamed from: l */
    public final Optional mo95862l() {
        return this.f298482e;
    }

    /* renamed from: m */
    public final Optional mo95863m() {
        return this.f298490m;
    }

    /* renamed from: n */
    public final Optional mo95864n() {
        return this.f298489l;
    }

    /* renamed from: o */
    public final Optional mo95865o() {
        return this.f298479b;
    }

    /* renamed from: p */
    public final int mo95866p() {
        return this.f298491n;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f298478a);
        String num = Integer.toString(C49255aa.m85392a(this.f298491n));
        String valueOf2 = String.valueOf(this.f298479b);
        String valueOf3 = String.valueOf(this.f298480c);
        String valueOf4 = String.valueOf(this.f298481d);
        String valueOf5 = String.valueOf(this.f298482e);
        String i = C58662ni.m90350i(this.f298483f);
        String valueOf6 = String.valueOf(this.f298484g);
        String valueOf7 = String.valueOf(this.f298485h);
        String valueOf8 = String.valueOf(this.f298486i);
        String valueOf9 = String.valueOf(this.f298487j);
        String valueOf10 = String.valueOf(this.f298488k);
        String valueOf11 = String.valueOf(this.f298489l);
        String valueOf12 = String.valueOf(this.f298490m);
        return "AppShortcut{agentUrlSuffix=" + valueOf + ", shortcutEnumType=" + num + ", opaqueToken=" + valueOf2 + ", command=" + valueOf3 + ", actionQuery=" + valueOf4 + ", intentName=" + valueOf5 + ", intentArguments=" + i + ", appPackageName=" + valueOf6 + ", clientContext=" + valueOf7 + ", dynamicShortcutMatch=" + valueOf8 + ", donatedShortcutData=" + valueOf9 + ", intentCategory=" + valueOf10 + ", isShortcutQueryEditable=" + valueOf11 + ", isEligibleForQuickDelete=" + valueOf12 + "}";
    }
}
