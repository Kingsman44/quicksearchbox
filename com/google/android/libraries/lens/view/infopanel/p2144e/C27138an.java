package com.google.android.libraries.lens.view.infopanel.p2144e;

import android.view.View;
import android.widget.Button;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.common.p4522b.C58485gu;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.infopanel.e.an */
/* compiled from: PG */
public final /* synthetic */ class C27138an implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C27143as f74153a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f74154b;

    /* renamed from: c */
    public final /* synthetic */ Button f74155c;

    public /* synthetic */ C27138an(C27143as asVar, C58485gu guVar, Button button) {
        this.f74153a = asVar;
        this.f74154b = guVar;
        this.f74155c = button;
    }

    public final void onClick(View view) {
        C27143as asVar = this.f74153a;
        C58485gu guVar = this.f74154b;
        Button button = this.f74155c;
        if (!guVar.isEmpty()) {
            asVar.f74167c.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(button));
            asVar.f74168d.f70834x.mo5706i((Locale) guVar.get(0));
        }
    }
}
