package com.google.android.libraries.lens.view.onboarding;

import android.app.Activity;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import androidx.core.app.C1820g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2067ak.C25201ag;
import com.google.android.libraries.lens.view.p2067ak.C25215au;
import com.google.android.libraries.lens.view.p2067ak.C25225bd;
import com.google.android.libraries.lens.view.p2078at.C25504aj;
import com.google.android.libraries.lens.view.p2078at.C25537t;
import com.google.android.libraries.lens.view.p2078at.C25540w;
import com.google.android.libraries.lens.view.p2090ba.C25684e;
import com.google.android.libraries.lens.view.p2093d.C25758g;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.android.libraries.lens.view.sampleimages.C27701e;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.lens.p4711m.C62632i;
import com.google.net.p4726a.p4727a.C62722b;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.libraries.lens.view.onboarding.w */
/* compiled from: PG */
public final class C27525w {

    /* renamed from: a */
    public static final C58974d f75277a = C58974d.m91135i("OnboardingFragment");

    /* renamed from: b */
    final C25758g f75278b;

    /* renamed from: c */
    public final AccountId f75279c;

    /* renamed from: d */
    public final C27520r f75280d;

    /* renamed from: e */
    public final C46439e f75281e;

    /* renamed from: f */
    public final C25537t f75282f;

    /* renamed from: g */
    public final C37215b f75283g;

    /* renamed from: h */
    public final C25225bd f75284h;

    /* renamed from: i */
    public final C27232l f75285i;

    /* renamed from: j */
    public final C60888db f75286j;

    /* renamed from: k */
    public final C25540w f75287k;

    /* renamed from: l */
    public final boolean f75288l;

    /* renamed from: m */
    public final C25504aj f75289m;

    /* renamed from: n */
    public final C25684e f75290n;

    /* renamed from: o */
    public final C28306ab f75291o;

    /* renamed from: p */
    public final C46440f f75292p = new C27526a();

    /* renamed from: q */
    public boolean f75293q;

    /* renamed from: r */
    public boolean f75294r;

    /* renamed from: s */
    public C60870cx f75295s;

    /* renamed from: t */
    private final Activity f75296t;

    /* renamed from: u */
    private final C27522t f75297u;

    /* renamed from: v */
    private final C21370a f75298v;

    /* renamed from: com.google.android.libraries.lens.view.onboarding.w$a */
    /* compiled from: PG */
    final class C27526a implements C46440f {
        public C27526a() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            ((C58970a) ((C58970a) ((C58970a) C27525w.f75277a.mo56226d()).mo56382g(th)).mo56372aa(49794)).mo56386p("Failed to show the sample images post-result dialog.");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            C27525w wVar = C27525w.this;
            AccountId accountId = wVar.f75279c;
            String bool = Boolean.toString(wVar.mo33073p(wVar.f75289m.mo30532b()));
            C27701e eVar = new C27701e();
            C68324h.m98669f(eVar);
            C47247a.m84047b(eVar, accountId);
            C47243l.m84040b(eVar, bool);
            eVar.showNow(C27525w.this.f75280d.getChildFragmentManager(), "FALLBACK_SAMPLE_IMAGES_DIALOG");
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    public C27525w(AccountId accountId, Activity activity, C27522t tVar, C21370a aVar, C27520r rVar, C46439e eVar, C25537t tVar2, C37215b bVar, C25225bd bdVar, C27232l lVar, C60888db dbVar, C25540w wVar, C25758g gVar, boolean z, C25504aj ajVar, C25684e eVar2, C28306ab abVar) {
        this.f75279c = accountId;
        this.f75296t = activity;
        this.f75297u = tVar;
        this.f75298v = aVar;
        this.f75280d = rVar;
        this.f75281e = eVar;
        this.f75282f = tVar2;
        this.f75283g = bVar;
        this.f75284h = bdVar;
        this.f75285i = lVar;
        this.f75286j = dbVar;
        this.f75287k = wVar;
        this.f75278b = gVar;
        this.f75288l = z;
        this.f75289m = ajVar;
        this.f75290n = eVar2;
        this.f75291o = abVar;
    }

    /* renamed from: b */
    public static C27520r m51242b(AccountId accountId, boolean z) {
        C27521s sVar = (C27521s) C27522t.f75266c.createBuilder();
        sVar.copyOnWrite();
        C27522t tVar = (C27522t) sVar.instance;
        tVar.f75268a |= 1;
        tVar.f75269b = z;
        C27520r rVar = new C27520r();
        C68324h.m98669f(rVar);
        C47247a.m84047b(rVar, accountId);
        C47243l.m84039a(rVar, (C27522t) sVar.build());
        return rVar;
    }

    /* renamed from: a */
    public final Fragment mo33059a() {
        Fragment c = this.f75280d.getChildFragmentManager().f634a.mo671c("WARM_WELCOME_DIALOG");
        if (c != null) {
            return c;
        }
        Fragment c2 = this.f75280d.getChildFragmentManager().f634a.mo671c("FALLBACK_SAMPLE_IMAGES_DIALOG");
        if (c2 != null) {
            return c2;
        }
        return this.f75280d.getChildFragmentManager().f634a.mo670b(R.id.lens_onboarding_fragment);
    }

    /* renamed from: c */
    public final void mo33060c() {
        if (((C27473af) this.f75278b.mo3842a()).mo33010b()) {
            C25758g gVar = this.f75278b;
            C27472ae a = ((C27473af) gVar.mo3842a()).mo33009a();
            a.mo33008b(false);
            C27473af a2 = a.mo33007a();
            a2.getClass();
            gVar.mo5708l(a2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo33061d() {
        Fragment a = mo33059a();
        if (a instanceof C27701e) {
            ((C27701e) a).dismiss();
            this.f75280d.getChildFragmentManager().mo467ah();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo33062e() {
        Fragment a = mo33059a();
        if ((a instanceof C27476ai) || (a instanceof C27510h)) {
            mo33067j(a);
        }
    }

    /* renamed from: f */
    public final void mo33063f(C62722b bVar) {
        if (this.f75293q) {
            this.f75293q = false;
            if (this.f75288l && !C62632i.m94823h(this.f75285i.mo32701h())) {
                return;
            }
            if (mo33059a() instanceof C27485ar) {
                this.f75283g.mo19974a(C37194a.f98483at.mo40815i(bVar));
            } else {
                this.f75283g.mo19974a(C37194a.f98485av.mo40815i(bVar));
            }
        }
    }

    /* renamed from: g */
    public final void mo33064g() {
        if (!this.f75293q) {
            this.f75293q = true;
            if (this.f75288l && !C62632i.m94823h(this.f75285i.mo32701h())) {
                return;
            }
            if (mo33059a() instanceof C27485ar) {
                this.f75283g.mo19974a(C37194a.f98482as);
            } else {
                this.f75283g.mo19974a(C37194a.f98484au);
            }
        }
    }

    /* renamed from: h */
    public final void mo33065h() {
        if (this.f75284h.mo30345a() <= 0) {
            this.f75284h.f68662a.mo30363c(new C25201ag(this.f75298v.mo26870b()));
        }
        if (C62632i.m94823h(this.f75285i.mo32701h()) && this.f75284h.mo30346b() <= 0) {
            this.f75284h.f68662a.mo30363c(new C25215au(this.f75298v.mo26870b()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo33066i() {
        this.f75283g.mo19974a(C37194a.f98413C.mo40815i(C62722b.OK));
        this.f75284h.mo30355k(true);
    }

    /* renamed from: j */
    public final void mo33067j(Fragment fragment) {
        if (fragment != null) {
            C0154a aVar = new C0154a(this.f75280d.getChildFragmentManager());
            aVar.mo516m(fragment);
            aVar.mo509f();
        }
    }

    /* renamed from: k */
    public final void mo33068k(boolean z, boolean z2, int i) {
        if (!this.f75294r) {
            this.f75294r = true;
            this.f75289m.mo30533c("android.permission.CAMERA", new C27524v(this, z2, i, z), i);
        }
    }

    /* renamed from: l */
    public final void mo33069l(boolean z, int i) {
        if (!this.f75294r) {
            this.f75294r = true;
            C25504aj ajVar = this.f75289m;
            ajVar.mo30533c(ajVar.mo30532b(), new C27523u(this, z, i), i);
        }
    }

    /* renamed from: m */
    public final void mo33070m(int i) {
        if (!(mo33059a() instanceof C27510h)) {
            C0154a aVar = new C0154a(this.f75280d.getChildFragmentManager());
            AccountId accountId = this.f75279c;
            boolean p = mo33073p("android.permission.CAMERA");
            C27511i iVar = (C27511i) C27512j.f75231d.createBuilder();
            iVar.copyOnWrite();
            C27512j jVar = (C27512j) iVar.instance;
            jVar.f75233a |= 1;
            jVar.f75234b = p;
            iVar.copyOnWrite();
            C27512j jVar2 = (C27512j) iVar.instance;
            jVar2.f75233a |= 2;
            jVar2.f75235c = i;
            C27510h hVar = new C27510h();
            C68324h.m98669f(hVar);
            C47247a.m84047b(hVar, accountId);
            C47243l.m84039a(hVar, (C27512j) iVar.build());
            aVar.mo689v(R.id.lens_onboarding_fragment, hVar, (String) null);
            aVar.mo509f();
        }
    }

    /* renamed from: n */
    public final void mo33071n(int i) {
        if (!(mo33059a() instanceof C27476ai)) {
            C0154a aVar = new C0154a(this.f75280d.getChildFragmentManager());
            AccountId accountId = this.f75279c;
            String num = Integer.toString(i);
            C27476ai aiVar = new C27476ai();
            C68324h.m98669f(aiVar);
            C47247a.m84047b(aiVar, accountId);
            C47243l.m84040b(aiVar, num);
            aVar.mo689v(R.id.lens_onboarding_fragment, aiVar, (String) null);
            aVar.mo509f();
        }
    }

    /* renamed from: o */
    public final void mo33072o() {
        if (!(mo33059a() instanceof C27485ar)) {
            AccountId accountId = this.f75279c;
            C27485ar arVar = new C27485ar();
            C68324h.m98669f(arVar);
            C47247a.m84047b(arVar, accountId);
            arVar.showNow(this.f75280d.getChildFragmentManager(), "WARM_WELCOME_DIALOG");
        }
    }

    /* renamed from: p */
    public final boolean mo33073p(String str) {
        return this.f75289m.mo30537g(str) && !C1820g.m4992b(this.f75296t, str);
    }

    /* renamed from: q */
    public final boolean mo33074q() {
        if (!this.f75284h.mo30359o()) {
            return true;
        }
        if (C62632i.m94823h(this.f75285i.mo32701h()) && this.f75284h.mo30346b() <= 0) {
            return true;
        }
        if (!this.f75297u.f75269b || this.f75289m.mo30536f("android.permission.CAMERA")) {
            return false;
        }
        return true;
    }
}
