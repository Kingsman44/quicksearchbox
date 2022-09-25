package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.view.View;
import android.widget.TextView;
import com.google.p4479cg.C58080l;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.bi */
/* compiled from: PG */
public final /* synthetic */ class C132178bi implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C132181bl f360771a;

    /* renamed from: b */
    public final /* synthetic */ TextView f360772b;

    /* renamed from: c */
    public final /* synthetic */ TextView f360773c;

    public /* synthetic */ C132178bi(C132181bl blVar, TextView textView, TextView textView2) {
        this.f360771a = blVar;
        this.f360772b = textView;
        this.f360773c = textView2;
    }

    public final void onClick(View view) {
        C132181bl blVar = this.f360771a;
        blVar.mo110525d(this.f360772b, this.f360773c, (C58080l) Objects.requireNonNull(((CustodioDowntimeTimePickerViewModel) Objects.requireNonNull(blVar.f360789k)).f360538d));
    }
}
