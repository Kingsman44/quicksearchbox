package com.google.android.apps.search.googleapp.discover.streamui.impl;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.View;
import com.google.android.apps.search.googleapp.notificationsurvey.C136811b;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.af */
/* compiled from: PG */
final class C134812af implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C134904m f367056a;

    public C134812af(C134904m mVar) {
        this.f367056a = mVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C136811b bVar2 = (C136811b) bVar;
        C134904m mVar = this.f367056a;
        Fragment c = mVar.f367327t.getChildFragmentManager().f634a.mo671c("notificationSurvey");
        if (c != null) {
            FragmentManager childFragmentManager = mVar.f367327t.getChildFragmentManager();
            C69664n.m101060f(childFragmentManager, "discoverStreamFragment.childFragmentManager");
            C0154a aVar = new C0154a(childFragmentManager);
            aVar.mo516m(c);
            aVar.mo509f();
        }
        View o = mVar.mo112058o();
        if (o != null) {
            o.setVisibility(8);
        }
        return C47392e.f123115a;
    }
}
