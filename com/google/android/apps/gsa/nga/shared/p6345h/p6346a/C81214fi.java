package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.google.android.apps.gsa.nga.shared.p6362r.C81451b;
import com.google.common.p4522b.C58485gu;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.fi */
/* compiled from: PG */
public final class C81214fi {
    /* renamed from: a */
    public static final boolean m129201a(C58485gu guVar, String str) {
        if (guVar.size() > 1) {
            return false;
        }
        Locale locale = guVar.isEmpty() ? Locale.getDefault() : (Locale) guVar.get(0);
        if (C81451b.m129570a(locale, str)) {
            return true;
        }
        locale.toLanguageTag();
        return false;
    }
}
