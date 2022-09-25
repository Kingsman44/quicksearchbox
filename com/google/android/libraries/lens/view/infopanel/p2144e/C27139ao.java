package com.google.android.libraries.lens.view.infopanel.p2144e;

import android.support.p031v4.app.FragmentManager;
import android.view.View;
import android.widget.Button;
import com.google.android.libraries.lens.view.filters.translation.languagepicker.C26149ar;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.libraries.lens.view.infopanel.e.ao */
/* compiled from: PG */
public final /* synthetic */ class C27139ao implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C27143as f74156a;

    /* renamed from: b */
    public final /* synthetic */ View f74157b;

    /* renamed from: c */
    public final /* synthetic */ Button f74158c;

    public /* synthetic */ C27139ao(C27143as asVar, View view, Button button) {
        this.f74156a = asVar;
        this.f74157b = view;
        this.f74158c = button;
    }

    public final void onClick(View view) {
        C27143as asVar = this.f74156a;
        View view2 = this.f74157b;
        asVar.f74167c.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(this.f74158c));
        C26149ar.m48291a(asVar.f74166a, Boolean.toString(view2.getLayoutDirection() == 0)).showNow((FragmentManager) asVar.f74169e.mo27525b(), "LensTranslateLanguagePicker");
    }
}
