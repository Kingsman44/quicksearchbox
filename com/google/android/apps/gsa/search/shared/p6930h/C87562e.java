package com.google.android.apps.gsa.search.shared.p6930h;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.p10905k.C146606e;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.search.shared.h.e */
/* compiled from: PG */
public final class C87562e {
    /* renamed from: a */
    public static Uri m142218a(Context context, String str) {
        String concat = "gqsb_".concat(String.valueOf(str));
        if (!TextUtils.isEmpty(concat)) {
            String c = C146606e.m238841c(context.getContentResolver(), "context_sensitive_help_url", "https://support.google.com/mobile/?hl=%locale%");
            if (c.contains("%locale%")) {
                Locale locale = Locale.getDefault();
                c = c.replace("%locale%", locale.getLanguage() + "-" + locale.getCountry().toLowerCase(locale));
            }
            Uri.Builder buildUpon = Uri.parse(c).buildUpon();
            buildUpon.appendQueryParameter("p", concat);
            try {
                buildUpon.appendQueryParameter("version", String.valueOf(context.getPackageManager().getPackageInfo(context.getApplicationInfo().packageName, 0).versionCode));
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("HelpUrl", "Error finding package ".concat(String.valueOf(context.getApplicationInfo().packageName)));
            }
            return buildUpon.build();
        }
        throw new IllegalArgumentException("getHelpUrl(): fromWhere must be non-empty");
    }
}
