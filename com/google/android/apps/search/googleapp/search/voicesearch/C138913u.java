package com.google.android.apps.search.googleapp.search.voicesearch;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.search.googleapp.search.voicesearch.logoview.C138833f;
import com.google.android.apps.search.googleapp.search.voicesearch.logoview.C138835h;
import com.google.android.apps.search.googleapp.search.voicesearch.logoview.LogoView;
import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138771h;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.u */
/* compiled from: PG */
final class C138913u implements C138833f {

    /* renamed from: a */
    final /* synthetic */ C138859r f377845a;

    public C138913u(C138859r rVar) {
        this.f377845a = rVar;
    }

    /* renamed from: a */
    public final void mo114475a(int i) {
        if (i == 1) {
            View view = this.f377845a.f377709k.getView();
            view.getClass();
            ((TextView) view.findViewById(R.id.googleapp_voice_results_text)).setText(R.string.listening_text);
        } else if (i != 2) {
            if (i == 7) {
                this.f377845a.f377716r.mo114521d(0);
                this.f377845a.mo114607f();
                View view2 = this.f377845a.f377709k.getView();
                if (view2 == null) {
                    ((C59052c) ((C59052c) C138859r.f377691a.mo56226d()).mo56372aa(41283)).mo56386p("#onStateStarted failed, no root view");
                    return;
                } else {
                    ((LogoView) view2.findViewById(R.id.googleapp_logo_view)).setOnClickListener(new C47591co(this.f377845a.f377714p, "click the mic logo", new C138912t(this)));
                    return;
                }
            } else {
                return;
            }
        }
        View view3 = this.f377845a.f377709k.getView();
        view3.getClass();
        C138859r rVar = this.f377845a;
        C138771h hVar = new C138771h(rVar.f377717s);
        C138835h hVar2 = new C138835h();
        hVar2.f377682e = hVar;
        View view4 = rVar.f377709k.getView();
        view4.getClass();
        ((LogoView) view4.findViewById(R.id.googleapp_logo_view)).mo114548e(hVar2);
        ((LogoView) view3.findViewById(R.id.googleapp_logo_view)).setOnClickListener(new C47591co(this.f377845a.f377714p, "click the three dots", new C138863s(this)));
    }
}
