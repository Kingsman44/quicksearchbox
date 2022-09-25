package com.google.android.apps.search.googleapp.search.voicesearch;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.search.googleapp.search.voicesearch.p10472d.C138790a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.ah */
/* compiled from: PG */
public final /* synthetic */ class C138703ah implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C138705aj f377234a;

    public /* synthetic */ C138703ah(C138705aj ajVar) {
        this.f377234a = ajVar;
    }

    public final void onClick(View view) {
        C138705aj ajVar = this.f377234a;
        ajVar.mo114479d();
        ajVar.f377243h.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        if (ajVar.f377251p.mo114520c()) {
            ajVar.f377251p.mo114521d(1);
            return;
        }
        ajVar.f377238c.mo83702b(C89849ae.VOICE_PLATE_MIC_TAP);
        ajVar.f377253r.mo115181h();
        View view2 = ajVar.f377245j.getView();
        view2.getClass();
        ((TextView) view2.findViewById(R.id.googleapp_sbt_error_text)).setVisibility(8);
        C47393f.m84237h(C138790a.f377543a, view);
    }
}
