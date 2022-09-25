package com.google.android.libraries.lens.view.utils;

import android.view.View;
import android.widget.Button;
import com.google.android.libraries.lens.view.p2096f.C25801d;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.libraries.lens.view.utils.l */
/* compiled from: PG */
public final /* synthetic */ class C28123l implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C28128q f76520a;

    /* renamed from: b */
    public final /* synthetic */ Button f76521b;

    public /* synthetic */ C28123l(C28128q qVar, Button button) {
        this.f76520a = qVar;
        this.f76521b = button;
    }

    public final void onClick(View view) {
        C28128q qVar = this.f76520a;
        qVar.f76542e.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(this.f76521b));
        qVar.mo33576b(C25801d.FEEDBACK_CARD);
    }
}
