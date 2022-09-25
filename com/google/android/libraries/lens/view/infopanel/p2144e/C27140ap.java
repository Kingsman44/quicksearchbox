package com.google.android.libraries.lens.view.infopanel.p2144e;

import android.view.View;
import android.widget.Button;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.infopanel.e.ap */
/* compiled from: PG */
public final /* synthetic */ class C27140ap implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C27143as f74159a;

    /* renamed from: b */
    public final /* synthetic */ Button f74160b;

    /* renamed from: c */
    public final /* synthetic */ Locale f74161c;

    public /* synthetic */ C27140ap(C27143as asVar, Button button, Locale locale) {
        this.f74159a = asVar;
        this.f74160b = button;
        this.f74161c = locale;
    }

    public final void onClick(View view) {
        C27143as asVar = this.f74159a;
        Button button = this.f74160b;
        Locale locale = this.f74161c;
        asVar.f74167c.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(button));
        asVar.f74168d.mo31260o(locale);
    }
}
