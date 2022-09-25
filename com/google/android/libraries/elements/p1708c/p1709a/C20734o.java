package com.google.android.libraries.elements.p1708c.p1709a;

import android.app.DatePickerDialog;
import android.text.format.DateFormat;
import android.widget.DatePicker;
import com.google.android.libraries.elements.interfaces.C21232ab;
import com.google.protos.youtube.elements.p5165a.C66020h;
import com.google.protos.youtube.elements.p5165a.C66021i;
import com.google.protos.youtube.elements.p5165a.C66022j;
import java.util.Calendar;

/* renamed from: com.google.android.libraries.elements.c.a.o */
/* compiled from: PG */
final class C20734o implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a */
    final /* synthetic */ C66020h f58052a;

    /* renamed from: b */
    final /* synthetic */ C20735p f58053b;

    public C20734o(C20735p pVar, C66020h hVar) {
        this.f58053b = pVar;
        this.f58052a = hVar;
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        Calendar instance = Calendar.getInstance();
        instance.set(i, i2, i3);
        C21232ab abVar = this.f58053b.f58055b;
        String str = this.f58052a.f179544b;
        C66021i iVar = (C66021i) C66022j.f179546f.createBuilder();
        iVar.copyOnWrite();
        C66022j jVar = (C66022j) iVar.instance;
        jVar.f179548a |= 1;
        jVar.f179549b = i;
        iVar.copyOnWrite();
        C66022j jVar2 = (C66022j) iVar.instance;
        jVar2.f179548a |= 2;
        jVar2.f179550c = i2 + 1;
        iVar.copyOnWrite();
        C66022j jVar3 = (C66022j) iVar.instance;
        jVar3.f179548a |= 4;
        jVar3.f179551d = i3;
        String format = DateFormat.getDateFormat(this.f58053b.f58054a.getApplicationContext()).format(instance.getTime());
        iVar.copyOnWrite();
        C66022j jVar4 = (C66022j) iVar.instance;
        format.getClass();
        jVar4.f179548a |= 8;
        jVar4.f179552e = format;
        abVar.mo26140c(str, ((C66022j) iVar.build()).toByteArray());
    }
}
