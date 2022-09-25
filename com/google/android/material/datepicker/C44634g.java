package com.google.android.material.datepicker;

import android.text.TextUtils;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.internal.C44732bd;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/* renamed from: com.google.android.material.datepicker.g */
/* compiled from: PG */
abstract class C44634g extends C44732bd {

    /* renamed from: a */
    public final TextInputLayout f116291a;

    /* renamed from: b */
    public final DateFormat f116292b;

    /* renamed from: c */
    public final String f116293c;

    /* renamed from: d */
    private final CalendarConstraints f116294d;

    /* renamed from: e */
    private final Runnable f116295e;

    /* renamed from: f */
    private Runnable f116296f;

    public C44634g(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f116292b = dateFormat;
        this.f116291a = textInputLayout;
        this.f116294d = calendarConstraints;
        this.f116293c = textInputLayout.getContext().getString(R.string.mtrl_picker_out_of_range);
        this.f116295e = new C44632e(this, str);
    }

    /* renamed from: c */
    public static final String m79091c(String str) {
        return str.replace(' ', 160);
    }

    /* renamed from: a */
    public void mo47860a() {
        throw null;
    }

    /* renamed from: b */
    public abstract void mo47861b(Long l);

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f116291a.removeCallbacks(this.f116295e);
        this.f116291a.removeCallbacks(this.f116296f);
        this.f116291a.mo48470e((CharSequence) null);
        mo47861b((Long) null);
        if (!TextUtils.isEmpty(charSequence)) {
            try {
                Date parse = this.f116292b.parse(charSequence.toString());
                this.f116291a.mo48470e((CharSequence) null);
                long time = parse.getTime();
                if (this.f116294d.f116190c.mo47798a(time)) {
                    CalendarConstraints calendarConstraints = this.f116294d;
                    if (calendarConstraints.f116188a.mo47823c(1) <= time) {
                        Month month = calendarConstraints.f116189b;
                        if (time <= month.mo47823c(month.f116202e)) {
                            mo47861b(Long.valueOf(parse.getTime()));
                            return;
                        }
                    }
                }
                C44633f fVar = new C44633f(this, time);
                this.f116296f = fVar;
                this.f116291a.postDelayed(fVar, 1000);
            } catch (ParseException unused) {
                this.f116291a.postDelayed(this.f116295e, 1000);
            }
        }
    }
}
