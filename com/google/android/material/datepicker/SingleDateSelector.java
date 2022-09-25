package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.internal.C44741bm;
import com.google.android.material.p3512i.C44693c;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

/* compiled from: PG */
public class SingleDateSelector implements DateSelector {
    public static final Parcelable.Creator CREATOR = new C44621aq();

    /* renamed from: a */
    public Long f116205a;

    /* renamed from: a */
    public final int mo47799a(Context context) {
        return C44693c.m79227c(context, R.attr.materialCalendarTheme, C44608ad.class.getCanonicalName()).data;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo47800b() {
        return this.f116205a;
    }

    /* renamed from: c */
    public final String mo47801c(Context context) {
        Resources resources = context.getResources();
        Long l = this.f116205a;
        if (l == null) {
            return resources.getString(R.string.mtrl_picker_date_header_unselected);
        }
        return resources.getString(R.string.mtrl_picker_date_header_selected, new Object[]{C44636i.m79094a(l.longValue(), Locale.getDefault())});
    }

    /* renamed from: d */
    public final Collection mo47802d() {
        ArrayList arrayList = new ArrayList();
        Long l = this.f116205a;
        if (l != null) {
            arrayList.add(l);
        }
        return arrayList;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Collection mo47803e() {
        return new ArrayList();
    }

    /* renamed from: f */
    public final void mo47804f(long j) {
        this.f116205a = Long.valueOf(j);
    }

    /* renamed from: g */
    public final boolean mo47805g() {
        return this.f116205a != null;
    }

    /* renamed from: h */
    public final View mo47806h(LayoutInflater layoutInflater, ViewGroup viewGroup, CalendarConstraints calendarConstraints, C44617am amVar) {
        View inflate = layoutInflater.inflate(R.layout.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R.id.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.f117309c;
        if (Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("lge") || Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("samsung")) {
            editText.setInputType(17);
        }
        SimpleDateFormat d = C44625au.m79083d();
        String c = C44625au.m79082c(inflate.getResources(), d);
        textInputLayout.mo48480n(c);
        Long l = this.f116205a;
        if (l != null) {
            editText.setText(d.format(l));
        }
        editText.addTextChangedListener(new C44620ap(this, c, d, textInputLayout, calendarConstraints, amVar));
        EditText[] editTextArr = {editText};
        C44635h hVar = new C44635h(editTextArr);
        for (int i = 0; i <= 0; i++) {
            editTextArr[i].setOnFocusChangeListener(hVar);
        }
        C44741bm.m79316i(editTextArr[0]);
        return inflate;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f116205a);
    }
}
