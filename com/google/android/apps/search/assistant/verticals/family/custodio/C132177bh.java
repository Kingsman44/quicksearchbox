package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.view.View;
import android.widget.TextView;
import com.google.p4479cg.C58080l;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.bh */
/* compiled from: PG */
public final /* synthetic */ class C132177bh implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C132181bl f360768a;

    /* renamed from: b */
    public final /* synthetic */ TextView f360769b;

    /* renamed from: c */
    public final /* synthetic */ TextView f360770c;

    public /* synthetic */ C132177bh(C132181bl blVar, TextView textView, TextView textView2) {
        this.f360768a = blVar;
        this.f360769b = textView;
        this.f360770c = textView2;
    }

    public final void onClick(View view) {
        C132181bl blVar = this.f360768a;
        blVar.mo110525d(this.f360769b, this.f360770c, (C58080l) Objects.requireNonNull(((CustodioDowntimeTimePickerViewModel) Objects.requireNonNull(blVar.f360789k)).f360537c));
    }
}
