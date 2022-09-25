package com.google.android.apps.gsa.staticplugins.opa.appactions;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import com.google.android.apps.gsa.assistant.shared.appactions.b.u;
import com.google.android.apps.gsa.assistant.shared.appactions.b.v;
import com.google.android.apps.gsa.assistant.shared.appactions.p5803b.C73805b;
import com.google.android.apps.gsa.assistant.shared.appactions.p5805d.C73812a;
import com.google.android.apps.gsa.n.g.i;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8290c.C107274e;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8290c.C107275f;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8292e.C107298a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.q */
/* compiled from: PG */
public final class C107316q extends C107320u {

    /* renamed from: a */
    public final AppShortcutActivity f298656a;

    /* renamed from: b */
    public final FragmentManager f298657b;

    /* renamed from: c */
    public final C73812a f298658c;

    /* renamed from: d */
    public final C107298a f298659d;

    /* renamed from: e */
    public final C86054o f298660e;

    /* renamed from: f */
    public final C28310af f298661f;

    /* renamed from: g */
    public final u f298662g;

    public C107316q(AppShortcutActivity appShortcutActivity, C73812a aVar, C107298a aVar2, C86054o oVar, C28310af afVar, i iVar, C73805b bVar, v vVar) {
        this.f298656a = appShortcutActivity;
        this.f298657b = appShortcutActivity.f727a.f739a.f744e;
        this.f298658c = aVar;
        this.f298659d = aVar2;
        this.f298660e = oVar;
        this.f298661f = afVar;
        this.f298662g = vVar.a(iVar, bVar);
    }

    /* renamed from: a */
    public final void mo95907a(String str, boolean z) {
        C107274e eVar = (C107274e) C107275f.f298582d.createBuilder();
        eVar.copyOnWrite();
        C107275f fVar = (C107275f) eVar.instance;
        str.getClass();
        fVar.f298584a |= 1;
        fVar.f298585b = str;
        eVar.copyOnWrite();
        C107275f fVar2 = (C107275f) eVar.instance;
        fVar2.f298584a |= 2;
        fVar2.f298586c = z;
        C107266be beVar = new C107266be();
        C68324h.m98669f(beVar);
        C47243l.m84039a(beVar, (C107275f) eVar.build());
        mo95908b(beVar);
    }

    /* renamed from: b */
    public final void mo95908b(Fragment fragment) {
        C0154a aVar = new C0154a(this.f298657b);
        aVar.mo691x(R.anim.shortcut_overlay_slide_in, 0, 0, 0);
        aVar.mo689v(R.id.fragment_container, fragment, (String) null);
        aVar.mo509f();
    }
}
