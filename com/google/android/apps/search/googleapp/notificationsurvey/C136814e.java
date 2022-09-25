package com.google.android.apps.search.googleapp.notificationsurvey;

import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28440j;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.p375ai.p378b.C8178yk;

/* renamed from: com.google.android.apps.search.googleapp.notificationsurvey.e */
/* compiled from: PG */
public final /* synthetic */ class C136814e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C136817h f372405a;

    public /* synthetic */ C136814e(C136817h hVar) {
        this.f372405a = hVar;
    }

    public final void onClick(View view) {
        C136817h hVar = this.f372405a;
        C8178yk ykVar = hVar.f372415g.f26849f;
        if (ykVar == null) {
            ykVar = C8178yk.f28736g;
        }
        if (C136817h.m222496b(ykVar)) {
            C28443m mVar = hVar.f372412d;
            C28440j h = C28442l.m53142h();
            h.mo33895b(C136810a.m222487a(hVar.f372414f));
            mVar.mo33853c(h.mo33894a(), C28485y.m53234a(view));
        }
        hVar.mo113387a();
    }
}
