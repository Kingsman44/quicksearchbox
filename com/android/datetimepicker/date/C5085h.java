package com.android.datetimepicker.date;

import android.app.DialogFragment;
import java.util.Calendar;

/* renamed from: com.android.datetimepicker.date.h */
/* compiled from: PG */
public final class C5085h extends C5070a {

    /* renamed from: c */
    public final C5084g f16237c;

    /* renamed from: d */
    public DialogFragment f16238d;

    public C5085h(C5084g gVar) {
        this.f16237c = gVar;
    }

    /* renamed from: a */
    public final void mo10091a(int i, int i2, int i3) {
        DialogFragment dialogFragment = this.f16238d;
        if (dialogFragment != null) {
            dialogFragment.dismiss();
        }
        int firstDayOfWeek = Calendar.getInstance().getFirstDayOfWeek();
        C5082e eVar = new C5082e();
        eVar.setArguments(C5082e.m13956b(i, i2, i3));
        eVar.f16232a = new C5083f(this.f16237c);
        eVar.f16233b = -1;
        eVar.f16234c = -1;
        eVar.f16235d = firstDayOfWeek;
        this.f16238d = eVar;
    }
}
