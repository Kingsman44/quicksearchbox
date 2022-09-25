package com.google.android.apps.gsa.assistant.settings.features.appactions;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import com.google.android.apps.gsa.assistant.settings.base.C9511m;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10257b;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10267l;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10277v;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p568d.C10311c;
import com.google.android.apps.gsa.assistant.shared.appactions.p5805d.C73812a;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.util.p7159c.C90892az;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.d */
/* compiled from: PG */
public final class C10308d {

    /* renamed from: a */
    public final C10221b f34922a;

    /* renamed from: b */
    public final C10257b f34923b;

    /* renamed from: c */
    public final C10311c f34924c;

    /* renamed from: d */
    public final C73812a f34925d;

    /* renamed from: e */
    public final C90021c f34926e;

    public C10308d(C10221b bVar, C10311c cVar, C73812a aVar, C90021c cVar2, C10257b bVar2) {
        this.f34922a = bVar;
        this.f34924c = cVar;
        this.f34925d = aVar;
        this.f34926e = cVar2;
        this.f34923b = bVar2;
    }

    /* renamed from: d */
    public static void m25229d(FragmentManager fragmentManager, Fragment fragment) {
        C0154a aVar = new C0154a(fragmentManager);
        aVar.mo689v(R.id.app_actions_settings_content_container, fragment, (String) null);
        aVar.mo686s((String) null);
        aVar.mo505b(false);
        fragmentManager.mo467ah();
    }

    /* renamed from: a */
    public final void mo18404a() {
        ((C9511m) this.f34922a.getActivity()).mo17824D(new C90892az("backPressListener", new C10251c(this)));
    }

    /* renamed from: b */
    public final void mo18405b() {
        FragmentManager childFragmentManager = this.f34922a.getChildFragmentManager();
        if (childFragmentManager.mo471b() > 1) {
            childFragmentManager.mo442I();
            childFragmentManager.mo467ah();
            return;
        }
        ((C9511m) this.f34922a.getActivity()).mo17823B();
    }

    /* renamed from: c */
    public final void mo18406c(C10267l lVar) {
        FragmentManager childFragmentManager = this.f34922a.getChildFragmentManager();
        C10201ag agVar = new C10201ag();
        C68324h.m98669f(agVar);
        C47243l.m84039a(agVar, lVar);
        m25229d(childFragmentManager, agVar);
    }

    /* renamed from: e */
    public final void mo18407e(C10277v vVar) {
        FragmentManager childFragmentManager = this.f34922a.getChildFragmentManager();
        C10291cj cjVar = new C10291cj();
        C68324h.m98669f(cjVar);
        C47243l.m84039a(cjVar, vVar);
        m25229d(childFragmentManager, cjVar);
    }
}
