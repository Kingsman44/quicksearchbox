package com.google.android.libraries.componentview.components.p1689c;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: com.google.android.libraries.componentview.components.c.ee */
/* compiled from: PG */
final class C20293ee implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ C20297ei f57005a;

    public C20293ee(C20297ei eiVar) {
        this.f57005a = eiVar;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C20297ei eiVar = this.f57005a;
        if (!eiVar.f57022j && eiVar.f57026u != i) {
            if (i == eiVar.f57027v) {
                eiVar.mo25343n();
            } else {
                eiVar.f57026u = i;
                eiVar.mo25344o();
            }
            this.f57005a.f57017e.mo25172o();
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
