package com.google.android.apps.search.googleapp.p10257g;

import android.content.Intent;
import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.apps.search.googleapp.g.p */
/* compiled from: PG */
final class C135443p implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C135435j f369002a;

    /* renamed from: b */
    final /* synthetic */ C135413ad f369003b;

    public C135443p(C135435j jVar, C135413ad adVar) {
        this.f369002a = jVar;
        this.f369003b = adVar;
    }

    public final void onClick(View view) {
        this.f369002a.f368982j.mo33853c(C28442l.m53137c().mo33894a(), C28485y.m53234a(view));
        Intent intent = new Intent();
        C135413ad adVar = this.f369003b;
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.SUBJECT", adVar.f368926a);
        intent.putExtra("android.intent.extra.TEXT", adVar.f368927b);
        intent.setType("text/plain");
        this.f369002a.f368979g.startActivity(Intent.createChooser(intent, this.f369003b.f368926a));
    }
}
