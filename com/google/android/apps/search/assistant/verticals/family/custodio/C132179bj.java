package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.app.TimePickerDialog;
import android.widget.TextView;
import android.widget.TimePicker;
import com.google.p4479cg.C58080l;
import com.google.p4479cg.C58081m;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.bj */
/* compiled from: PG */
public final /* synthetic */ class C132179bj implements TimePickerDialog.OnTimeSetListener {

    /* renamed from: a */
    public final /* synthetic */ C132181bl f360774a;

    /* renamed from: b */
    public final /* synthetic */ C58080l f360775b;

    /* renamed from: c */
    public final /* synthetic */ TextView f360776c;

    /* renamed from: d */
    public final /* synthetic */ TextView f360777d;

    public /* synthetic */ C132179bj(C132181bl blVar, C58080l lVar, TextView textView, TextView textView2) {
        this.f360774a = blVar;
        this.f360775b = lVar;
        this.f360776c = textView;
        this.f360777d = textView2;
    }

    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        C132181bl blVar = this.f360774a;
        C58080l lVar = this.f360775b;
        TextView textView = this.f360776c;
        TextView textView2 = this.f360777d;
        ((CustodioDowntimeTimePickerViewModel) Objects.requireNonNull(blVar.f360789k)).f360536b = true;
        lVar.copyOnWrite();
        C58081m mVar = C58081m.f155254e;
        ((C58081m) lVar.instance).f155256a = i;
        lVar.copyOnWrite();
        ((C58081m) lVar.instance).f155257b = i2;
        blVar.mo110524c(textView, textView2, lVar);
    }
}
