package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8060ui;

import android.support.p031v4.app.C0154a;
import android.transition.TransitionManager;
import android.view.ViewGroup;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80269x;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.ui.r */
/* compiled from: PG */
public final /* synthetic */ class C103180r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C103188z f287914a;

    public /* synthetic */ C103180r(C103188z zVar) {
        this.f287914a = zVar;
    }

    public final void run() {
        C103188z zVar = this.f287914a;
        ViewGroup viewGroup = zVar.f287932f;
        if (viewGroup != null) {
            TransitionManager.beginDelayedTransition(viewGroup);
        }
        C80269x xVar = zVar.f287927a.f220144f;
        if (xVar == null) {
            xVar = C80269x.f220270b;
        }
        C103137b a = C103137b.m171023a(xVar);
        C0154a aVar = new C0154a(zVar.f287928b.getParentFragmentManager());
        aVar.f814j = 0;
        aVar.mo689v(R.id.nga_pie_assist_shelf_content, a, (String) null);
        aVar.mo690w(new C103185w(zVar, a));
        aVar.mo505b(false);
    }
}
