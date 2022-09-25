package com.google.android.apps.search.googleapp.compliance;

import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.apps.search.googleapp.compliance.av */
/* compiled from: PG */
final class C133597av implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C133593ar f363962a;

    public C133597av(C133593ar arVar) {
        this.f363962a = arVar;
    }

    public final void onClick(View view) {
        C133593ar arVar = this.f363962a;
        arVar.f363954i.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        arVar.mo111284a("https://policies.google.com/terms/embedded");
    }
}
