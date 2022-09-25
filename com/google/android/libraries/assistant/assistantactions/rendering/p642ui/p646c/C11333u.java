package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.p646c;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.p031v4.app.C0167am;
import android.text.format.DateFormat;
import android.widget.TimePicker;
import org.p5633c.p5634a.C72210d;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.c.u */
/* compiled from: PG */
public final class C11333u extends DialogFragment implements TimePickerDialog.OnTimeSetListener {

    /* renamed from: a */
    private C11332t f36811a;

    /* renamed from: b */
    private C0167am f36812b;

    /* renamed from: c */
    private int f36813c;

    /* renamed from: d */
    private int f36814d;

    /* renamed from: a */
    public static C11333u m26945a(C0167am amVar, C11332t tVar) {
        C72210d dVar = new C72210d();
        return m26946b(amVar, tVar, dVar.mo63372k(), dVar.mo63373l());
    }

    /* renamed from: b */
    public static C11333u m26946b(C0167am amVar, C11332t tVar, int i, int i2) {
        C11333u uVar = new C11333u();
        uVar.f36812b = amVar;
        uVar.f36811a = tVar;
        uVar.f36813c = i;
        uVar.f36814d = i2;
        return uVar;
    }

    /* renamed from: c */
    public final void mo19765c() {
        show(this.f36812b.getFragmentManager(), "timePicker");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        C0167am amVar = this.f36812b;
        return new TimePickerDialog(amVar, this, this.f36813c, this.f36814d, DateFormat.is24HourFormat(amVar.getApplicationContext()));
    }

    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        this.f36811a.mo19764d(i, i2);
    }
}
