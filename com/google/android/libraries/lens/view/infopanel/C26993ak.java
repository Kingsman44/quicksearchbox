package com.google.android.libraries.lens.view.infopanel;

import android.view.View;
import com.google.android.libraries.lens.view.p2096f.C25802e;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.libraries.lens.view.infopanel.ak */
/* compiled from: PG */
public final /* synthetic */ class C26993ak implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C26994al f73604a;

    /* renamed from: b */
    public final /* synthetic */ View f73605b;

    public /* synthetic */ C26993ak(C26994al alVar, View view) {
        this.f73604a = alVar;
        this.f73605b = view;
    }

    public final void onClick(View view) {
        C26994al alVar = this.f73604a;
        alVar.f73606a.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(this.f73605b));
        alVar.f73607b.mo32510a(C25802e.RECOGNIZE_SPEECH_CHIP);
    }
}
