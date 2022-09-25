package com.google.android.apps.gsa.search.core.p6507ag.p6509b;

import com.google.android.apps.gsa.p6427o.C83559c;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84469a;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.search.googleapp.p10310h.C136139t;
import com.google.android.libraries.search.integrations.p3019d.p3020a.C38510a;
import com.google.android.libraries.web.weblayer.p3448b.C44127c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.ag.b.a */
/* compiled from: PG */
public final class C84486a implements C90991b {

    /* renamed from: a */
    public final C68214a f229939a;

    /* renamed from: b */
    private final C68214a f229940b;

    /* renamed from: c */
    private final C68214a f229941c;

    /* renamed from: d */
    private final C68214a f229942d;

    /* renamed from: e */
    private final C68214a f229943e;

    public C84486a(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5) {
        this.f229939a = aVar;
        this.f229940b = aVar2;
        this.f229941c = aVar3;
        this.f229942d = aVar4;
        this.f229943e = aVar5;
    }

    /* renamed from: a */
    public final C38510a mo78195a() {
        return ((C136139t) this.f229943e.mo27525b()).mo112792a();
    }

    /* renamed from: b */
    public final C60870cx mo78196b() {
        if (!((C84474e) this.f229939a.mo27525b()).mo78087aa() || ((C84474e) this.f229939a.mo27525b()).mo78129r() || ((C83559c) this.f229940b.mo27525b()).mo76895f() || !mo78207n()) {
            return C60856cj.m92900i(false);
        }
        return ((C44127c) this.f229941c.mo27525b()).mo47087a();
    }

    /* renamed from: c */
    public final boolean mo78197c(boolean z) {
        C38510a a = ((C136139t) this.f229943e.mo27525b()).mo112792a();
        if (a == C38510a.OPT_OUT) {
            return false;
        }
        if (a == C38510a.OPT_IN) {
            return true;
        }
        return z;
    }

    /* renamed from: e */
    public final boolean mo78198e() {
        return ((C84474e) this.f229939a.mo27525b()).mo78063H();
    }

    /* renamed from: f */
    public final boolean mo78199f() {
        return mo78197c(((C84474e) this.f229939a.mo27525b()).mo78093ag());
    }

    /* renamed from: g */
    public final boolean mo78200g() {
        return mo78208o() && ((C84474e) this.f229939a.mo27525b()).mo78105as();
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("TngExperienceChecker");
        fVar.mo85279c("Test pre-release").mo85276a(C90752i.m148230d(Integer.valueOf(mo78195a().ordinal())));
        fVar.mo85279c("Search enabled").mo85276a(C90752i.m148228b(Boolean.valueOf(mo78207n())));
        fVar.mo85279c("HS enabled").mo85276a(C90752i.m148228b(Boolean.valueOf(mo78205l())));
        fVar.mo85279c("-1 enabled").mo85276a(C90752i.m148228b(Boolean.valueOf(mo78206m())));
        fVar.mo85279c("Acetone enabled").mo85276a(C90752i.m148228b(Boolean.valueOf(mo78203j())));
        fVar.mo85279c("Deprecate refresh").mo85276a(C90752i.m148228b(Boolean.valueOf(mo78201h())));
        fVar.mo85279c("Deprecate watchdog").mo85276a(C90752i.m148228b(Boolean.valueOf(mo78202i())));
    }

    /* renamed from: h */
    public final boolean mo78201h() {
        return mo78197c(((C84474e) this.f229939a.mo27525b()).mo78137z());
    }

    /* renamed from: i */
    public final boolean mo78202i() {
        return mo78197c(((C84474e) this.f229939a.mo27525b()).mo78060E());
    }

    /* renamed from: j */
    public final boolean mo78203j() {
        return mo78197c(((C84474e) this.f229939a.mo27525b()).mo78088ab());
    }

    /* renamed from: k */
    public final boolean mo78204k() {
        return mo78197c(((C84474e) this.f229939a.mo27525b()).mo78090ad());
    }

    /* renamed from: l */
    public final boolean mo78205l() {
        return mo78203j() || mo78197c(((C84474e) this.f229939a.mo27525b()).mo78091ae());
    }

    /* renamed from: m */
    public final boolean mo78206m() {
        return mo78197c(((C84474e) this.f229939a.mo27525b()).mo78094ah());
    }

    /* renamed from: n */
    public final boolean mo78207n() {
        return mo78197c(((C84474e) this.f229939a.mo27525b()).mo78097ak());
    }

    /* renamed from: o */
    public final boolean mo78208o() {
        return mo78207n() && mo78197c(((C84474e) this.f229939a.mo27525b()).mo78100an()) && mo78197c(((C84469a) this.f229942d.mo27525b()).mo78036j());
    }
}
