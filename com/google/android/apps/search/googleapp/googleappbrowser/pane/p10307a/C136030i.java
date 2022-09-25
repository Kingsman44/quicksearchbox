package com.google.android.apps.search.googleapp.googleappbrowser.pane.p10307a;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.google.android.apps.search.googleapp.googleappbrowser.p10306h.C136012b;
import com.google.android.apps.search.googleapp.googleappbrowser.p10306h.C136013c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.pane.a.i */
/* compiled from: PG */
public final class C136030i {

    /* renamed from: a */
    public static final long f370472a = Duration.ofSeconds(1).toMillis();

    /* renamed from: b */
    public static final C59071e f370473b = C59071e.m91332i("com.google.android.apps.search.googleapp.googleappbrowser.pane.a.i");

    /* renamed from: c */
    public final AccountId f370474c;

    /* renamed from: d */
    public final C136029h f370475d;

    /* renamed from: e */
    public final C43377v f370476e;

    /* renamed from: f */
    public final C46801dp f370477f;

    /* renamed from: g */
    public final C46792di f370478g = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C136030i.f370473b.mo56226d()).mo56382g(th)).mo56372aa(40671)).mo56386p("Failed to fetch WebState.");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C43376u uVar = (C43376u) obj;
            if (C136030i.this.f370475d.requireView().findViewById(R.id.googleapp_browser_topbar_superg).getVisibility() == 0 && C136013c.m220822a(uVar)) {
                C136030i.this.f370479h.cancel();
                C136030i iVar = C136030i.this;
                iVar.mo112704c();
                iVar.mo112703b();
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    /* renamed from: h */
    public final ValueAnimator f370479h;

    /* renamed from: i */
    public final Animator.AnimatorListener f370480i = new C136032j(this);

    /* renamed from: j */
    public final C136012b f370481j;

    /* renamed from: k */
    public final C47770dh f370482k;

    /* renamed from: l */
    public final C136012b f370483l;

    /* renamed from: m */
    public final C136012b f370484m;

    public C136030i(AccountId accountId, C136029h hVar, C43377v vVar, C46801dp dpVar, C136012b bVar, C136012b bVar2, C136012b bVar3, C47770dh dhVar) {
        this.f370474c = accountId;
        this.f370475d = hVar;
        this.f370476e = vVar;
        this.f370477f = dpVar;
        this.f370479h = ValueAnimator.ofInt(new int[]{0, 1});
        this.f370481j = bVar;
        this.f370482k = dhVar;
        this.f370483l = bVar2;
        this.f370484m = bVar3;
    }

    /* renamed from: a */
    public static C136029h m220881a(AccountId accountId) {
        C136029h hVar = new C136029h();
        C68324h.m98669f(hVar);
        C47247a.m84047b(hVar, accountId);
        return hVar;
    }

    /* renamed from: b */
    public final void mo112703b() {
        this.f370475d.requireView().findViewById(R.id.googleapp_browser_topbar_superg).setVisibility(8);
    }

    /* renamed from: c */
    public final void mo112704c() {
        this.f370475d.requireView().findViewById(R.id.googleapp_browser_topbar_urlbar).setVisibility(0);
    }
}
