package com.google.android.apps.gsa.searchnow;

import android.view.ViewGroup;
import com.google.android.apps.gsa.shared.monet.C90163ad;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
import com.google.android.apps.gsa.shared.monet.p7070b.p7106w.C90297b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;

/* renamed from: com.google.android.apps.gsa.searchnow.ae */
/* compiled from: PG */
final class C88853ae extends C90163ad {

    /* renamed from: a */
    final /* synthetic */ ViewGroup f240561a;

    /* renamed from: b */
    final /* synthetic */ C88861am f240562b;

    public C88853ae(C88861am amVar, ViewGroup viewGroup) {
        this.f240562b = amVar;
        this.f240561a = viewGroup;
    }

    /* renamed from: a */
    public final void mo76767a(C22939d dVar) {
        this.f240561a.addView(dVar.mo28297il());
        this.f240561a.setVisibility(0);
        C88861am amVar = this.f240562b;
        amVar.f240587Q = (C90297b) dVar;
        C90208n nVar = amVar.f240583M;
        if (nVar == null || nVar != C90208n.INTERESTS_TAB) {
            amVar.f240587Q.mo83993b(R.id.clear_or_voice_button);
        } else {
            amVar.f240587Q.mo83993b(R.id.lens_button);
        }
    }

    /* renamed from: b */
    public final void mo76768b(C22939d dVar) {
        this.f240561a.setVisibility(8);
        this.f240561a.removeView(dVar.mo28297il());
        this.f240562b.f240587Q = null;
    }
}
