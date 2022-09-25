package com.google.android.libraries.elements.p1708c.p1709a;

import android.app.Activity;
import android.app.TimePickerDialog;
import android.text.format.DateFormat;
import com.google.protos.youtube.elements.p5165a.C66024l;
import com.google.protos.youtube.elements.p5165a.C66036x;
import java.util.Calendar;
import p5488io.p5490b.C69807c;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69872g;

/* renamed from: com.google.android.libraries.elements.c.a.as */
/* compiled from: PG */
public final /* synthetic */ class C20718as implements C69807c {

    /* renamed from: a */
    public final /* synthetic */ C20720au f58030a;

    /* renamed from: b */
    public final /* synthetic */ C66036x f58031b;

    public /* synthetic */ C20718as(C20720au auVar, C66036x xVar) {
        this.f58030a = auVar;
        this.f58031b = xVar;
    }

    /* renamed from: a */
    public final void mo25806a(C69872g gVar) {
        int i;
        int i2;
        C20720au auVar = this.f58030a;
        C66036x xVar = this.f58031b;
        Calendar instance = Calendar.getInstance();
        C20719at atVar = new C20719at(auVar, instance, xVar);
        Activity activity = auVar.f58035a;
        if ((xVar.f179594a & 2) != 0) {
            C66024l lVar = xVar.f179596c;
            if (lVar == null) {
                lVar = C66024l.f179553e;
            }
            i = lVar.f179556b;
        } else {
            i = instance.get(11);
        }
        int i3 = i;
        if ((xVar.f179594a & 2) != 0) {
            C66024l lVar2 = xVar.f179596c;
            if (lVar2 == null) {
                lVar2 = C66024l.f179553e;
            }
            i2 = lVar2.f179557c;
        } else {
            i2 = instance.get(12);
        }
        TimePickerDialog timePickerDialog = new TimePickerDialog(activity, atVar, i3, i2, DateFormat.is24HourFormat(auVar.f58035a));
        timePickerDialog.setOnDismissListener(new C20717ar(gVar));
        timePickerDialog.show();
    }
}
