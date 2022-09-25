package com.android.recurrencepicker;

import android.os.Bundle;
import android.support.p031v4.app.C0260w;
import android.support.p031v4.app.FragmentManager;
import android.text.format.Time;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.datetimepicker.date.C5082e;
import com.android.datetimepicker.date.C5083f;
import com.android.datetimepicker.date.C5084g;
import com.android.datetimepicker.date.C5089l;
import com.android.datetimepicker.date.C5090m;
import com.android.datetimepicker.date.C5091n;
import com.android.datetimepicker.date.C5092o;
import java.util.Calendar;

/* renamed from: com.android.recurrencepicker.j */
/* compiled from: PG */
public class C5486j extends C0260w implements C5480d {

    /* renamed from: a */
    public final RecurrencePickerBaseDialog f16628a = new RecurrencePickerBaseDialog(this);

    /* renamed from: b */
    private C5091n f16629b;

    /* renamed from: a */
    public final void mo11809a(C5084g gVar, int i, Calendar calendar, Time time) {
        long j;
        C0260w wVar;
        C5091n nVar = this.f16629b;
        if (!(nVar == null || (wVar = nVar.f16245d) == null)) {
            wVar.dismiss();
        }
        C5091n nVar2 = new C5091n(gVar);
        this.f16629b = nVar2;
        nVar2.f16152b = i;
        nVar2.f16151a = calendar;
        int i2 = time.year;
        int i3 = time.month;
        int i4 = time.monthDay;
        C0260w wVar2 = nVar2.f16245d;
        if (wVar2 != null) {
            wVar2.dismiss();
        }
        int i5 = nVar2.f16152b;
        if (i5 == -1) {
            i5 = Calendar.getInstance().getFirstDayOfWeek();
        }
        C5089l lVar = new C5089l();
        lVar.setArguments(C5082e.m13956b(i2, i3, i4));
        lVar.f16239a = new C5083f(nVar2.f16244c);
        Calendar calendar2 = nVar2.f16151a;
        if (calendar2 == null) {
            j = -1;
        } else {
            j = calendar2.getTimeInMillis();
        }
        lVar.f16240b = j;
        lVar.f16241c = -1;
        lVar.f16242d = i5;
        nVar2.f16245d = lVar;
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            this.f16629b.f16245d.show(fragmentManager, "tag_date_picker_frag");
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C0260w wVar = (C0260w) getFragmentManager().f634a.mo671c("tag_date_picker_frag");
        if (wVar != null) {
            if (this.f16629b == null) {
                this.f16629b = new C5091n(this.f16628a);
            }
            C5091n nVar = this.f16629b;
            C0260w wVar2 = nVar.f16245d;
            if (wVar2 != null) {
                wVar2.dismiss();
            }
            if (wVar instanceof C5089l) {
                ((C5089l) wVar).f16239a = new C5083f(nVar.f16244c);
            } else if (wVar instanceof C5092o) {
                ((C5092o) wVar).f16246a = new C5090m(nVar.f16244c);
            }
            nVar.f16245d = wVar;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f16628a.mo11791b(getContext(), getArguments(), layoutInflater, viewGroup, bundle);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f16628a.mo11792c(bundle);
    }
}
