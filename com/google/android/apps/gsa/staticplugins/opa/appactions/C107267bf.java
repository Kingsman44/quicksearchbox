package com.google.android.apps.gsa.staticplugins.opa.appactions;

import android.view.View;
import com.google.android.apps.gsa.assistant.shared.appactions.C73834z;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.bf */
/* compiled from: PG */
final class C107267bf implements C73834z {

    /* renamed from: a */
    final /* synthetic */ C107268bg f298560a;

    public C107267bf(C107268bg bgVar) {
        this.f298560a = bgVar;
    }

    /* renamed from: b */
    public final void mo18364b(View view) {
        this.f298560a.f298565e.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        this.f298560a.f298563c.mo65296c(C89849ae.APP_ACTIONS_SHORTCUTS_CONFIRMATION_PAGE_EXPLORE_CLICKED);
        C107266be beVar = this.f298560a.f298561a;
        C18509a c = C18522b.m35986c();
        ((C18523c) c).f52492a = "app_actions";
        beVar.startActivityForResult(c.mo24020b().mo24031a(), 0);
    }

    /* renamed from: c */
    public final void mo18365c(View view) {
        this.f298560a.f298564d.f76997b.mo33800a(C28427h.m53115a(105811)).mo33811d(view);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo18366d(View view) {
    }

    /* renamed from: e */
    public final /* synthetic */ void mo18367e(View view) {
    }
}
