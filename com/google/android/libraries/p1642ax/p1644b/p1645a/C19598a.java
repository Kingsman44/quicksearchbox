package com.google.android.libraries.p1642ax.p1644b.p1645a;

import android.content.Context;
import android.content.res.Configuration;
import com.google.android.libraries.p1642ax.p1643a.C19597a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.util.Locale;

/* renamed from: com.google.android.libraries.ax.b.a.a */
/* compiled from: PG */
public final class C19598a {
    /* renamed from: a */
    public static String m37353a(Context context, String str, String str2) {
        C58833ax axVar;
        C58833ax axVar2;
        int identifier = context.getResources().getIdentifier(String.format("twslang_%s", new Object[]{str.replace('-', '_')}), "string", context.getPackageName());
        if (identifier > 0) {
            axVar = C58833ax.m90834k(Integer.valueOf(identifier));
        } else {
            axVar = C58836b.f156633a;
        }
        if (axVar.mo56113h()) {
            int intValue = ((Integer) axVar.mo56107c()).intValue();
            String format = String.format("%s-%s", new Object[]{Locale.getDefault().getLanguage(), Locale.getDefault().getCountry()});
            Object[] objArr = new Object[0];
            String b = m37354b(context, intValue, format, objArr);
            if (C19597a.m37352a(format).equals("en")) {
                axVar2 = C58833ax.m90834k(b);
            } else {
                axVar2 = !b.equals(m37354b(context, intValue, "en", objArr)) ? C58833ax.m90834k(b) : C58836b.f156633a;
            }
            if (axVar2.mo56113h()) {
                return (String) axVar2.mo56107c();
            }
        }
        return str2;
    }

    /* renamed from: b */
    public static String m37354b(Context context, int i, String str, Object... objArr) {
        Locale locale;
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        int indexOf = str.indexOf(45);
        if (indexOf == -1) {
            locale = new Locale(str);
        } else {
            locale = new Locale(str.substring(0, indexOf), str.substring(indexOf + 1));
        }
        configuration.setLocale(locale);
        return context.createConfigurationContext(configuration).getResources().getString(i, objArr);
    }
}
