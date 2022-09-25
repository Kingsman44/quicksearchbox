package com.google.android.gms.languageprofile;

import com.google.android.gms.common.Feature;

/* renamed from: com.google.android.gms.languageprofile.b */
/* compiled from: PG */
public final class C144442b {

    /* renamed from: a */
    public static final Feature f391055a;

    /* renamed from: b */
    public static final Feature f391056b;

    /* renamed from: c */
    public static final Feature[] f391057c;

    static {
        Feature feature = new Feature("set_language_settings_api", 1);
        f391055a = feature;
        Feature feature2 = new Feature("get_application_locale_suggestions_api", 1);
        f391056b = feature2;
        f391057c = new Feature[]{feature, feature2};
    }
}
