package com.google.android.apps.gsa.speech.p7311n;

import android.database.DataSetObserver;

/* renamed from: com.google.android.apps.gsa.speech.n.b */
/* compiled from: PG */
final class C92534b extends DataSetObserver {

    /* renamed from: a */
    final /* synthetic */ C92536d f258234a;

    public C92534b(C92536d dVar) {
        this.f258234a = dVar;
    }

    public final void onChanged() {
        C92536d dVar = this.f258234a;
        if (dVar.f258242b != null && dVar.f258243c != null) {
            dVar.mo87313aT();
        }
    }
}
