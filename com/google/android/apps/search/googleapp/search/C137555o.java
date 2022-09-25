package com.google.android.apps.search.googleapp.search;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.android.apps.search.googleapp.search.voicesearch.C138705aj;
import com.google.android.apps.search.googleapp.search.voicesearch.C138711ao;
import com.google.android.apps.search.googleapp.search.voicesearch.p10472d.C138793d;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;

/* renamed from: com.google.android.apps.search.googleapp.search.o */
/* compiled from: PG */
final class C137555o implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C137553n f374164a;

    public C137555o(C137553n nVar) {
        this.f374164a = nVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C138793d dVar = (C138793d) bVar;
        C137553n nVar = this.f374164a;
        C138711ao n = nVar.mo113813n();
        n.getClass();
        C138705aj a = n.mo17754z().mo114495b().mo17754z();
        a.mo114483i(7);
        a.mo114479d();
        if (a.f377251p.mo114520c()) {
            a.f377251p.mo114521d(7);
        } else {
            a.f377238c.mo83702b(C89849ae.VOICE_PLATE_MIC_TAP);
            a.f377253r.mo115181h();
            View view = a.f377245j.getView();
            view.getClass();
            ((TextView) view.findViewById(R.id.googleapp_sbt_error_text)).setVisibility(8);
            nVar.mo113821v(C137418g.f373767r);
        }
        return C47392e.f123115a;
    }
}
