package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.p646c;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.p031v4.app.C0167am;
import android.widget.DatePicker;
import java.util.Calendar;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.c.e */
/* compiled from: PG */
public final class C11317e extends DialogFragment implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a */
    private C11316d f36772a;

    /* renamed from: b */
    private C0167am f36773b;

    /* renamed from: c */
    private int f36774c;

    /* renamed from: d */
    private int f36775d;

    /* renamed from: e */
    private int f36776e;

    /* renamed from: a */
    public static C11317e m26930a(C0167am amVar, C11316d dVar) {
        Calendar instance = Calendar.getInstance();
        return m26931b(amVar, dVar, instance.get(1), instance.get(2) + 1, instance.get(5));
    }

    /* renamed from: b */
    public static C11317e m26931b(C0167am amVar, C11316d dVar, int i, int i2, int i3) {
        C11317e eVar = new C11317e();
        eVar.f36773b = amVar;
        eVar.f36772a = dVar;
        eVar.f36774c = i;
        eVar.f36775d = i2;
        eVar.f36776e = i3;
        return eVar;
    }

    /* renamed from: c */
    public final void mo19752c() {
        show(this.f36773b.getFragmentManager(), "datePicker");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        return new DatePickerDialog(getActivity(), this, this.f36774c, this.f36775d - 1, this.f36776e);
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        this.f36772a.mo19751a(i, i2 + 1, i3);
    }
}
