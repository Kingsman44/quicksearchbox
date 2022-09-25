package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8060ui;

import android.view.View;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.ui.m */
/* compiled from: PG */
public final /* synthetic */ class C103175m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C103188z f287907a;

    /* renamed from: b */
    public final /* synthetic */ C103137b f287908b;

    public /* synthetic */ C103175m(C103188z zVar, C103137b bVar) {
        this.f287907a = zVar;
        this.f287908b = bVar;
    }

    public final void run() {
        C103188z zVar = this.f287907a;
        C103137b bVar = this.f287908b;
        bVar.mo17754z().mo93682a(new C103174l(zVar), new C103178p(zVar), new C103179q(zVar));
        C103171i b = bVar.mo17754z();
        View view = b.f287898c.getView();
        if (view != null) {
            View findViewById = view.findViewById(R.id.nga_pie_assist_shelf_success_finish_button);
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(new C103167e(b));
            view.findViewById(R.id.nga_pie_assist_shelf_followup_mic).setVisibility(8);
        }
    }
}
