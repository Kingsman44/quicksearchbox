package com.google.android.apps.gsa.staticplugins.opa.p8592ui;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.TimePicker;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.util.C113762ae;
import com.google.assistant.p3897e.p3902c.p3907c.C51015df;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.anc;
import com.google.assistant.p3897e.p3921j.and;
import com.google.protobuf.C63088z;
import org.p5633c.p5634a.C72210d;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ui.r */
/* compiled from: PG */
public final class C113731r extends DialogFragment implements TimePickerDialog.OnTimeSetListener {

    /* renamed from: a */
    public C51016dg f314963a;

    /* renamed from: b */
    public C107698i f314964b;

    public final Dialog onCreateDialog(Bundle bundle) {
        C72210d dVar = new C72210d();
        return new TimePickerDialog(getActivity(), this, dVar.mo63372k(), dVar.mo63373l(), false);
    }

    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        anc anc = (anc) and.f135419d.createBuilder();
        anc.copyOnWrite();
        and and = (and) anc.instance;
        and.f135421a |= 1;
        and.f135422b = (long) i;
        anc.copyOnWrite();
        and and2 = (and) anc.instance;
        and2.f135421a |= 2;
        and2.f135423c = (long) i2;
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_input.TimeInputParam";
        C63088z byteString = ((and) anc.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        C51805du duVar = this.f314963a.f132833e;
        if (duVar == null) {
            duVar = C51805du.f135924e;
        }
        C51803ds dsVar = (C51803ds) duVar.toBuilder();
        dsVar.mo53729a("time_input", kaVar3);
        C51015df dfVar = (C51015df) this.f314963a.toBuilder();
        dfVar.copyOnWrite();
        C51016dg dgVar = (C51016dg) dfVar.instance;
        C51805du duVar2 = (C51805du) dsVar.build();
        duVar2.getClass();
        dgVar.f132833e = duVar2;
        dgVar.f132829a |= 8;
        this.f314964b.mo96219b((ClientEventData) C113762ae.m188327a((C51016dg) dfVar.build()).mo56107c());
    }
}
