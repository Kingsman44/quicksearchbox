package com.google.android.apps.search.googleapp.compliance;

import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.apps.search.googleapp.compliance.at */
/* compiled from: PG */
final class C133595at implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C133593ar f363960a;

    public C133595at(C133593ar arVar) {
        this.f363960a = arVar;
    }

    public final void onClick(View view) {
        C133593ar arVar = this.f363960a;
        arVar.f363954i.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        arVar.mo111284a("https://policies.google.com/technologies/cookies/embedded");
    }
}
