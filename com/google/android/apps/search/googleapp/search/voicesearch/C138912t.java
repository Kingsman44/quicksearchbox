package com.google.android.apps.search.googleapp.search.voicesearch;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.search.googleapp.search.voicesearch.p10472d.C138790a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.t */
/* compiled from: PG */
public final /* synthetic */ class C138912t implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C138913u f377844a;

    public /* synthetic */ C138912t(C138913u uVar) {
        this.f377844a = uVar;
    }

    public final void onClick(View view) {
        C138913u uVar = this.f377844a;
        uVar.f377845a.f377707i.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        if (uVar.f377845a.f377716r.mo114520c()) {
            uVar.f377845a.f377716r.mo114521d(1);
            return;
        }
        uVar.f377845a.f377701c.mo83702b(C89849ae.VOICE_PLATE_MIC_TAP);
        uVar.f377845a.f377718t.mo115181h();
        View view2 = uVar.f377845a.f377709k.getView();
        view2.getClass();
        ((TextView) view2.findViewById(R.id.googleapp_voice_results_text)).setText(R.string.listening_text);
        C47393f.m84237h(C138790a.f377543a, view);
    }
}
