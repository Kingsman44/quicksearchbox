package com.google.android.apps.search.googleapp.settingsui;

import android.support.p031v4.app.C0189bh;
import android.support.p031v4.app.FragmentManager;
import com.google.android.apps.search.googleapp.p10536x.C139873i;
import com.google.android.apps.search.googleapp.settingsui.p10483b.C139175b;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.bv */
/* compiled from: PG */
final class C139199bv implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C139198bu f378574a;

    public C139199bv(C139198bu buVar) {
        this.f378574a = buVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C139175b bVar2 = (C139175b) bVar;
        C139198bu buVar = this.f378574a;
        C69664n.m101061g(bVar2, "event");
        if (bVar2.f378508b) {
            FragmentManager childFragmentManager = buVar.f378570a.getChildFragmentManager();
            C69664n.m101060f(childFragmentManager, "twoPaneFragment.childFragmentManager");
            if (childFragmentManager.mo471b() <= 0) {
                throw new IllegalStateException("There should be an existing fragment in a detail pane when clicking Preference in the header pane.");
            } else if (!C69664n.m101066l(childFragmentManager.mo476i(0).mo507d(), "TOP_PAGE_ON_DETAIL_PANE")) {
                C0189bh i = childFragmentManager.mo476i(0);
                C69664n.m101060f(i, "childFragmentManager.getBackStackEntryAt(0)");
                childFragmentManager.mo469al(i.mo506c());
                buVar.mo114813a();
            } else if (childFragmentManager.mo471b() > 1) {
                C0189bh i2 = childFragmentManager.mo476i(1);
                C69664n.m101060f(i2, "childFragmentManager.getBackStackEntryAt(1)");
                childFragmentManager.mo469al(i2.mo506c());
            }
        }
        buVar.mo114814b(bVar2.f378507a, (C139873i) null);
        return C47392e.f123115a;
    }
}
