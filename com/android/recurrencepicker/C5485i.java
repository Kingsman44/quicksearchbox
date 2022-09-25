package com.android.recurrencepicker;

import android.app.DialogFragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.text.format.Time;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.datetimepicker.date.C5082e;
import com.android.datetimepicker.date.C5083f;
import com.android.datetimepicker.date.C5084g;
import com.android.datetimepicker.date.C5085h;
import com.android.datetimepicker.date.C5088k;
import java.util.Calendar;

/* renamed from: com.android.recurrencepicker.i */
/* compiled from: PG */
public class C5485i extends DialogFragment implements C5480d {

    /* renamed from: a */
    public final RecurrencePickerBaseDialog f16626a = new RecurrencePickerBaseDialog(this);

    /* renamed from: b */
    private C5085h f16627b;

    /* renamed from: a */
    public final void mo11809a(C5084g gVar, int i, Calendar calendar, Time time) {
        DialogFragment dialogFragment;
        C5085h hVar = this.f16627b;
        if (!(hVar == null || (dialogFragment = hVar.f16238d) == null)) {
            dialogFragment.dismiss();
        }
        C5085h hVar2 = new C5085h(gVar);
        this.f16627b = hVar2;
        hVar2.f16152b = i;
        hVar2.f16151a = calendar;
        hVar2.mo10091a(time.year, time.month, time.monthDay);
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            this.f16627b.f16238d.show(fragmentManager, "tag_date_picker_frag");
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        DialogFragment dialogFragment = (DialogFragment) getFragmentManager().findFragmentByTag("tag_date_picker_frag");
        if (dialogFragment != null) {
            if (this.f16627b == null) {
                this.f16627b = new C5085h(this.f16626a);
            }
            C5085h hVar = this.f16627b;
            DialogFragment dialogFragment2 = hVar.f16238d;
            if (dialogFragment2 != null) {
                dialogFragment2.dismiss();
            }
            if (dialogFragment instanceof C5082e) {
                ((C5082e) dialogFragment).f16232a = new C5083f(hVar.f16237c);
            } else if (dialogFragment instanceof C5088k) {
                C5088k kVar = (C5088k) dialogFragment;
                C5084g gVar = hVar.f16237c;
            }
            hVar.f16238d = dialogFragment;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f16626a.mo11791b(getContext(), getArguments(), layoutInflater, viewGroup, bundle);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f16626a.mo11792c(bundle);
    }
}
