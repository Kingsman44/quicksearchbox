package com.google.android.libraries.componentview.components.p1689c;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: com.google.android.libraries.componentview.components.c.y */
/* compiled from: PG */
final class C20323y implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ C20324z f57111a;

    public C20323y(C20324z zVar) {
        this.f57111a = zVar;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C20324z zVar = this.f57111a;
        if (!zVar.f57119h && !zVar.f57112a.mo25271k(i).equals(this.f57111a.f57112a.mo25270j())) {
            this.f57111a.mo25369i();
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
