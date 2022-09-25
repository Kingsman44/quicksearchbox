package com.google.android.libraries.social.licenses;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: com.google.android.libraries.social.licenses.c */
/* compiled from: PG */
public final /* synthetic */ class C41955c implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ C41957e f109508a;

    public /* synthetic */ C41955c(C41957e eVar) {
        this.f109508a = eVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C41957e eVar = this.f109508a;
        License license = (License) adapterView.getItemAtPosition(i);
        C41956d dVar = eVar.f109510b;
        if (dVar != null) {
            dVar.mo44397a(license);
        }
    }
}
