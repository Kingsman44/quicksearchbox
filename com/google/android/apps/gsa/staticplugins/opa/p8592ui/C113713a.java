package com.google.android.apps.gsa.staticplugins.opa.p8592ui;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.widget.DatePicker;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.util.C113762ae;
import com.google.assistant.p3897e.p3902c.p3907c.C51015df;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52530vd;
import com.google.assistant.p3897e.p3921j.C52531ve;
import com.google.protobuf.C63088z;
import java.util.Calendar;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ui.a */
/* compiled from: PG */
public final class C113713a extends DialogFragment implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a */
    public C51016dg f314938a;

    /* renamed from: b */
    public C107698i f314939b;

    public final Dialog onCreateDialog(Bundle bundle) {
        Calendar instance = Calendar.getInstance();
        return new DatePickerDialog(getActivity(), this, instance.get(1), instance.get(2), instance.get(5));
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        C52530vd vdVar = (C52530vd) C52531ve.f137886c.createBuilder();
        Calendar instance = Calendar.getInstance();
        instance.clear();
        instance.set(i, i2, i3);
        long timeInMillis = instance.getTimeInMillis();
        vdVar.copyOnWrite();
        C52531ve veVar = (C52531ve) vdVar.instance;
        veVar.f137888a |= 1;
        veVar.f137889b = timeInMillis;
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_input.InstantInputParam";
        C63088z byteString = ((C52531ve) vdVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        C51805du duVar = this.f314938a.f132833e;
        if (duVar == null) {
            duVar = C51805du.f135924e;
        }
        C51803ds dsVar = (C51803ds) duVar.toBuilder();
        dsVar.mo53729a("instant_input", kaVar3);
        C51015df dfVar = (C51015df) this.f314938a.toBuilder();
        dfVar.copyOnWrite();
        C51016dg dgVar = (C51016dg) dfVar.instance;
        C51805du duVar2 = (C51805du) dsVar.build();
        duVar2.getClass();
        dgVar.f132833e = duVar2;
        dgVar.f132829a |= 8;
        this.f314939b.mo96219b((ClientEventData) C113762ae.m188327a((C51016dg) dfVar.build()).mo56107c());
    }
}
