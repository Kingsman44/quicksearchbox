package com.android.datetimepicker.time;

import android.app.TimePickerDialog;
import android.widget.TimePicker;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.TimeOfDayArgument;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93659p;
import com.google.p4152bb.p4153a.C55295nb;
import com.google.p4152bb.p4153a.C55296nc;
import com.google.p4152bb.p4153a.C55374q;
import com.google.p4152bb.p4153a.C55401r;

/* renamed from: com.android.datetimepicker.time.i */
/* compiled from: PG */
public final class C5113i implements TimePickerDialog.OnTimeSetListener {

    /* renamed from: a */
    private final C93659p f16304a;

    public C5113i(C93659p pVar) {
        this.f16304a = pVar;
    }

    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        TimeOfDayArgument timeOfDayArgument = this.f16304a.f261429a;
        C55374q qVar = (C55374q) C55401r.f145976e.createBuilder();
        qVar.copyOnWrite();
        C55401r rVar = (C55401r) qVar.instance;
        rVar.f145978a |= 1;
        rVar.f145979b = i;
        qVar.copyOnWrite();
        C55401r rVar2 = (C55401r) qVar.instance;
        rVar2.f145978a |= 2;
        rVar2.f145980c = i2;
        C55401r rVar3 = (C55401r) qVar.build();
        C55295nb nbVar = (C55295nb) C55296nc.f145663e.createBuilder();
        nbVar.copyOnWrite();
        C55296nc ncVar = (C55296nc) nbVar.instance;
        rVar3.getClass();
        ncVar.f145666b = rVar3;
        ncVar.f145665a |= 1;
        timeOfDayArgument.mo81334P((C55296nc) nbVar.build());
    }
}
