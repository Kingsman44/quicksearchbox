package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.google.android.apps.gsa.nga.shared.p6362r.C81451b;
import com.google.common.p4522b.C58485gu;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.b */
/* compiled from: PG */
public final class C81097b {
    /* renamed from: a */
    public static final int m129038a(C58485gu guVar, boolean z, String str, String str2, String str3) {
        if (!z || !C81214fi.m129201a(guVar, str) || guVar.size() > 1) {
            return 1;
        }
        Locale locale = guVar.isEmpty() ? Locale.getDefault() : (Locale) guVar.get(0);
        if (C81451b.m129570a(locale, str3)) {
            return 2;
        }
        if (C81451b.m129570a(locale, str2)) {
            return 3;
        }
        locale.toLanguageTag();
        return 1;
    }
}
