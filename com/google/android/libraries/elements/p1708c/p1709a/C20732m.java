package com.google.android.libraries.elements.p1708c.p1709a;

import android.app.Activity;
import android.app.DatePickerDialog;
import com.google.protos.youtube.elements.p5165a.C66020h;
import com.google.protos.youtube.elements.p5165a.C66022j;
import java.util.Calendar;
import p5488io.p5490b.C69807c;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69872g;

/* renamed from: com.google.android.libraries.elements.c.a.m */
/* compiled from: PG */
public final /* synthetic */ class C20732m implements C69807c {

    /* renamed from: a */
    public final /* synthetic */ C20735p f58049a;

    /* renamed from: b */
    public final /* synthetic */ C66020h f58050b;

    public /* synthetic */ C20732m(C20735p pVar, C66020h hVar) {
        this.f58049a = pVar;
        this.f58050b = hVar;
    }

    /* renamed from: a */
    public final void mo25806a(C69872g gVar) {
        int i;
        int i2;
        int i3;
        C20735p pVar = this.f58049a;
        C66020h hVar = this.f58050b;
        Calendar instance = Calendar.getInstance();
        C20734o oVar = new C20734o(pVar, hVar);
        Activity activity = pVar.f58054a;
        if ((hVar.f179543a & 2) != 0) {
            C66022j jVar = hVar.f179545c;
            if (jVar == null) {
                jVar = C66022j.f179546f;
            }
            i = jVar.f179549b;
        } else {
            i = instance.get(1);
        }
        int i4 = i;
        if ((hVar.f179543a & 2) != 0) {
            C66022j jVar2 = hVar.f179545c;
            if (jVar2 == null) {
                jVar2 = C66022j.f179546f;
            }
            i2 = jVar2.f179550c - 1;
        } else {
            i2 = instance.get(2);
        }
        int i5 = i2;
        if ((hVar.f179543a & 2) != 0) {
            C66022j jVar3 = hVar.f179545c;
            if (jVar3 == null) {
                jVar3 = C66022j.f179546f;
            }
            i3 = jVar3.f179551d;
        } else {
            i3 = instance.get(5);
        }
        DatePickerDialog datePickerDialog = new DatePickerDialog(activity, oVar, i4, i5, i3);
        datePickerDialog.setOnDismissListener(new C20733n(gVar));
        datePickerDialog.show();
    }
}
