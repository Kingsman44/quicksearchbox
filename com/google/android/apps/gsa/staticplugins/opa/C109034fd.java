package com.google.android.apps.gsa.staticplugins.opa;

import android.view.View;
import android.view.ViewStub;
import com.google.android.apps.gsa.staticplugins.opa.p8282ap.C107147n;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.material.progress.MaterialProgressBar;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.fd */
/* compiled from: PG */
public final /* synthetic */ class C109034fd implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C109036ff f303198a;

    /* renamed from: b */
    public final /* synthetic */ C107147n f303199b;

    public /* synthetic */ C109034fd(C109036ff ffVar, C107147n nVar) {
        this.f303198a = ffVar;
        this.f303199b = nVar;
    }

    public final void run() {
        C109036ff ffVar = this.f303198a;
        C107147n nVar = this.f303199b;
        View view = ffVar.f303202a;
        if (view == null) {
            ffVar.f303202a = ((ViewStub) ffVar.f303204c.f303449n.findViewById(R.id.progress_bar_view_stub)).inflate();
        } else {
            view.setVisibility(0);
        }
        ffVar.f303203b = (MaterialProgressBar) ffVar.f303202a.findViewById(R.id.load_indicator_progress_bar);
        ffVar.f303202a.setOnClickListener(new C109031fa(nVar));
    }
}
