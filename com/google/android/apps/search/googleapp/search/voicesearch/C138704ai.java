package com.google.android.apps.search.googleapp.search.voicesearch;

import android.view.View;
import com.google.android.apps.search.googleapp.search.voicesearch.logoview.C138833f;
import com.google.android.apps.search.googleapp.search.voicesearch.logoview.C138835h;
import com.google.android.apps.search.googleapp.search.voicesearch.logoview.LogoView;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138771h;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.tracing.C47591co;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.ai */
/* compiled from: PG */
final class C138704ai implements C138833f {

    /* renamed from: a */
    final /* synthetic */ C138705aj f377235a;

    public C138704ai(C138705aj ajVar) {
        this.f377235a = ajVar;
    }

    /* renamed from: a */
    public final void mo114475a(int i) {
        if (i == 1) {
            this.f377235a.mo114479d();
        } else if (i != 2) {
            if (i == 7) {
                this.f377235a.f377251p.mo114521d(0);
                this.f377235a.mo114481f();
                View view = this.f377235a.f377245j.getView();
                view.getClass();
                C138705aj ajVar = this.f377235a;
                ((LogoView) view.findViewById(R.id.googleapp_logo_view)).setOnClickListener(new C47591co(ajVar.f377248m, "click the mic logo", new C138703ah(ajVar)));
                return;
            }
            return;
        }
        View view2 = this.f377235a.f377245j.getView();
        view2.getClass();
        C138705aj ajVar2 = this.f377235a;
        C138771h hVar = new C138771h(ajVar2.f377252q);
        C138835h hVar2 = new C138835h();
        hVar2.f377682e = hVar;
        View view3 = ajVar2.f377245j.getView();
        view3.getClass();
        ((LogoView) view3.findViewById(R.id.googleapp_logo_view)).mo114548e(hVar2);
        ((LogoView) view2.findViewById(R.id.googleapp_logo_view)).setOnClickListener(new C47591co(this.f377235a.f377248m, "click the three dots", new C138702ag(this)));
    }
}
