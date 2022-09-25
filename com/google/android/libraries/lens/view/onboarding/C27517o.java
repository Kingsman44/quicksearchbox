package com.google.android.libraries.lens.view.onboarding;

import android.app.Activity;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import com.google.android.libraries.lens.view.p2056af.C25043ao;
import com.google.android.libraries.lens.view.p2056af.C25070bo;
import com.google.android.libraries.lens.view.p2067ak.C25225bd;
import com.google.android.libraries.lens.view.p2078at.C25504aj;
import com.google.android.libraries.lens.view.p2078at.C25543z;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.lens.p4711m.C62632i;
import dagger.C68214a;

/* renamed from: com.google.android.libraries.lens.view.onboarding.o */
/* compiled from: PG */
public final class C27517o {

    /* renamed from: a */
    public final AccountId f75247a;

    /* renamed from: b */
    public final C25504aj f75248b;

    /* renamed from: c */
    public final C25225bd f75249c;

    /* renamed from: d */
    public final Activity f75250d;

    /* renamed from: e */
    public final C68214a f75251e;

    /* renamed from: f */
    public final C25070bo f75252f;

    /* renamed from: g */
    public final C25043ao f75253g;

    /* renamed from: h */
    public final boolean f75254h;

    /* renamed from: i */
    public final boolean f75255i;

    /* renamed from: j */
    public final boolean f75256j;

    /* renamed from: k */
    public boolean f75257k;

    /* renamed from: l */
    private final C25543z f75258l;

    /* renamed from: m */
    private final C27232l f75259m;

    /* renamed from: n */
    private final boolean f75260n;

    static {
        C58974d.m91135i("LensOnboarding");
    }

    public C27517o(AccountId accountId, C25543z zVar, C25504aj ajVar, C25225bd bdVar, Activity activity, C68214a aVar, C25070bo boVar, C25043ao aoVar, C27232l lVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f75247a = accountId;
        this.f75258l = zVar;
        this.f75248b = ajVar;
        this.f75249c = bdVar;
        this.f75250d = activity;
        this.f75251e = aVar;
        this.f75252f = boVar;
        this.f75260n = z4;
        this.f75253g = aoVar;
        this.f75254h = z;
        this.f75259m = lVar;
        this.f75255i = z2;
        this.f75256j = z3;
    }

    /* renamed from: a */
    public final Fragment mo33054a() {
        return ((FragmentManager) this.f75251e.mo27525b()).f634a.mo671c("ONBOARDING_FRAGMENT");
    }

    /* renamed from: b */
    public final void mo33055b() {
        Fragment a = mo33054a();
        if (a != null) {
            C27520r rVar = (C27520r) a;
            if (!rVar.mo17754z().f75294r) {
                rVar.mo17754z().mo33066i();
                C0154a aVar = new C0154a((FragmentManager) this.f75251e.mo27525b());
                aVar.f814j = 4099;
                aVar.mo516m(a);
                aVar.mo509f();
            }
        }
    }

    /* renamed from: c */
    public final void mo33056c() {
        Fragment a = mo33054a();
        if (a != null) {
            ((C27520r) a).mo17754z().mo33062e();
        }
    }

    /* renamed from: d */
    public final boolean mo33057d() {
        if (this.f75260n || !this.f75258l.mo30591a()) {
            return false;
        }
        C25504aj ajVar = this.f75248b;
        if (!ajVar.mo30536f(ajVar.mo30532b()) || !this.f75248b.mo30536f("android.permission.CAMERA") || !this.f75249c.mo30359o()) {
            return true;
        }
        if (!C62632i.m94823h(this.f75259m.mo32701h()) || this.f75249c.mo30346b() > 0) {
            return false;
        }
        return true;
    }
}
