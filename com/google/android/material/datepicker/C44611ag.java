package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.google.android.material.datepicker.ag */
/* compiled from: PG */
public final class C44611ag extends C44618an {

    /* renamed from: a */
    private int f116240a;

    /* renamed from: b */
    private DateSelector f116241b;

    /* renamed from: c */
    private CalendarConstraints f116242c;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f116240a = bundle.getInt("THEME_RES_ID_KEY");
        this.f116241b = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f116242c = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f116241b.mo47806h(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f116240a)), viewGroup, this.f116242c, new C44610af(this));
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f116240a);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f116241b);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f116242c);
    }
}
