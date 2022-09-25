package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.DesugarTimeZone;

/* renamed from: com.google.android.material.datepicker.au */
/* compiled from: PG */
public final class C44625au {

    /* renamed from: a */
    static final AtomicReference f116265a = new AtomicReference();

    /* renamed from: a */
    static long m79080a(long j) {
        Calendar g = m79086g((Calendar) null);
        g.setTimeInMillis(j);
        return m79084e(g).getTimeInMillis();
    }

    /* renamed from: b */
    public static DateFormat m79081b(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        return instanceForSkeleton;
    }

    /* renamed from: c */
    static String m79082c(Resources resources, SimpleDateFormat simpleDateFormat) {
        String pattern = simpleDateFormat.toPattern();
        String string = resources.getString(R.string.mtrl_picker_text_input_year_abbr);
        String string2 = resources.getString(R.string.mtrl_picker_text_input_month_abbr);
        String string3 = resources.getString(R.string.mtrl_picker_text_input_day_abbr);
        if (pattern.replaceAll("[^y]", BuildConfig.FLAVOR).length() == 1) {
            pattern = pattern.replace("y", "yyyy");
        }
        return pattern.replace("d", string3).replace("M", string2).replace("y", string);
    }

    /* renamed from: d */
    static SimpleDateFormat m79083d() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toPattern().replaceAll("\\s+", BuildConfig.FLAVOR), Locale.getDefault());
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    /* renamed from: e */
    static Calendar m79084e(Calendar calendar) {
        Calendar g = m79086g(calendar);
        Calendar g2 = m79086g((Calendar) null);
        g2.set(g.get(1), g.get(2), g.get(5));
        return g2;
    }

    /* renamed from: f */
    public static Calendar m79085f() {
        C44624at atVar = (C44624at) f116265a.get();
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        instance.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return instance;
    }

    /* renamed from: g */
    static Calendar m79086g(Calendar calendar) {
        Calendar instance = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }
}
