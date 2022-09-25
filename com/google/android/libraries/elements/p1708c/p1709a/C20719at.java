package com.google.android.libraries.elements.p1708c.p1709a;

import android.app.TimePickerDialog;
import android.text.format.DateFormat;
import android.widget.TimePicker;
import com.google.android.libraries.elements.interfaces.C21232ab;
import com.google.protos.youtube.elements.p5165a.C66023k;
import com.google.protos.youtube.elements.p5165a.C66024l;
import com.google.protos.youtube.elements.p5165a.C66036x;
import java.util.Calendar;

/* renamed from: com.google.android.libraries.elements.c.a.at */
/* compiled from: PG */
final class C20719at implements TimePickerDialog.OnTimeSetListener {

    /* renamed from: a */
    final /* synthetic */ Calendar f58032a;

    /* renamed from: b */
    final /* synthetic */ C66036x f58033b;

    /* renamed from: c */
    final /* synthetic */ C20720au f58034c;

    public C20719at(C20720au auVar, Calendar calendar, C66036x xVar) {
        this.f58034c = auVar;
        this.f58032a = calendar;
        this.f58033b = xVar;
    }

    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        this.f58032a.set(11, i);
        this.f58032a.set(12, i2);
        C21232ab abVar = this.f58034c.f58036b;
        String str = this.f58033b.f179595b;
        C66023k kVar = (C66023k) C66024l.f179553e.createBuilder();
        kVar.copyOnWrite();
        C66024l lVar = (C66024l) kVar.instance;
        lVar.f179555a |= 1;
        lVar.f179556b = i;
        kVar.copyOnWrite();
        C66024l lVar2 = (C66024l) kVar.instance;
        lVar2.f179555a |= 2;
        lVar2.f179557c = i2;
        String format = DateFormat.getTimeFormat(this.f58034c.f58035a.getApplicationContext()).format(this.f58032a.getTime());
        kVar.copyOnWrite();
        C66024l lVar3 = (C66024l) kVar.instance;
        format.getClass();
        lVar3.f179555a |= 4;
        lVar3.f179558d = format;
        abVar.mo26140c(str, ((C66024l) kVar.build()).toByteArray());
    }
}
