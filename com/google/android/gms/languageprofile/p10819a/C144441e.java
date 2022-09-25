package com.google.android.gms.languageprofile.p10819a;

import com.evernote.android.state.BuildConfig;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.languageprofile.a.e */
/* compiled from: PG */
public final class C144441e {
    static {
        Pattern.compile(" *([A-Za-z]{2,3})(?:-([A-Za-z]{4}))?(?:-([A-Za-z]{2}|[0-9]{3}))?(?:-((?:[A-Za-z0-9]{5,8}|[0-9][A-Za-z0-9]{3})(?:-(?:[A-Za-z0-9]{5,8}|[0-9][A-Za-z0-9]{3}))*))?(?:-(?:[0-9A-WY-Za-wy-z](?:-[A-Za-z0-9]{2,8})+))?(?:-(?:x(?:-[A-Za-z0-9]{1,8})+))? *");
    }

    /* renamed from: a */
    public static String m234701a(Locale locale) {
        String languageTag = locale.toLanguageTag();
        return languageTag != null ? languageTag : "und";
    }

    /* renamed from: b */
    public static Locale m234702b(String str) {
        Locale forLanguageTag = Locale.forLanguageTag(str);
        if (forLanguageTag != null) {
            return forLanguageTag;
        }
        return new Locale(BuildConfig.FLAVOR);
    }
}
