package com.google.android.libraries.componentview.components.p1689c;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: com.google.android.libraries.componentview.components.c.eh */
/* compiled from: PG */
final class C20296eh implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ C20297ei f57008a;

    public C20296eh(C20297ei eiVar) {
        this.f57008a = eiVar;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C20297ei eiVar = this.f57008a;
        if (!eiVar.f57024l && eiVar.f57027v != i) {
            if (i == eiVar.f57026u) {
                eiVar.mo25343n();
            } else {
                eiVar.f57027v = i;
                eiVar.mo25344o();
            }
            this.f57008a.f57018f.mo25172o();
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
