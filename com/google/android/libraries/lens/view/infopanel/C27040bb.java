package com.google.android.libraries.lens.view.infopanel;

import android.view.View;
import com.google.android.libraries.lens.view.p2096f.C25802e;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.libraries.lens.view.infopanel.bb */
/* compiled from: PG */
public final /* synthetic */ class C27040bb implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C27051bm f73698a;

    /* renamed from: b */
    public final /* synthetic */ View f73699b;

    public /* synthetic */ C27040bb(C27051bm bmVar, View view) {
        this.f73698a = bmVar;
        this.f73699b = view;
    }

    public final void onClick(View view) {
        C27051bm bmVar = this.f73698a;
        bmVar.f73724d.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(this.f73699b));
        bmVar.f73731k.mo32510a(C25802e.RECOGNIZE_SPEECH_SEARCH_BOX);
    }
}
