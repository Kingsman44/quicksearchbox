package com.google.android.apps.search.googleapp.config;

import android.os.Build;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.config.p10148a.C133662b;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58817ah;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.config.b */
/* compiled from: PG */
public final /* synthetic */ class C133663b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C133665d f364076a;

    public /* synthetic */ C133663b(C133665d dVar) {
        this.f364076a = dVar;
    }

    public final Object apply(Object obj) {
        String str;
        C133665d dVar = this.f364076a;
        C133662b bVar = (C133662b) obj;
        if ((bVar.f364074a & 1) != 0) {
            str = bVar.f364075b;
        } else {
            Locale locale = Locale.getDefault();
            StringBuilder sb = new StringBuilder();
            String str2 = Build.VERSION.RELEASE;
            if (str2.length() <= 0) {
                sb.append("1.0");
            } else if (Character.isDigit(str2.charAt(0))) {
                sb.append(str2);
            } else {
                sb.append("10.0");
            }
            sb.append("; ");
            String language = locale.getLanguage();
            if (language != null) {
                if ("iw".equals(language)) {
                    language = "he";
                } else if ("in".equals(language)) {
                    language = "id";
                } else if ("ji".equals(language)) {
                    language = "yi";
                }
                sb.append(language);
                String country = locale.getCountry();
                if (country != null) {
                    sb.append("-");
                    sb.append(country.toLowerCase(Locale.US));
                }
            } else {
                sb.append("en");
            }
            sb.append(";");
            if ("REL".equals(Build.VERSION.CODENAME)) {
                String str3 = Build.MODEL;
                if (str3.length() > 0) {
                    sb.append(" ");
                    sb.append(str3);
                }
            }
            String str4 = Build.ID;
            if (str4.length() > 0) {
                sb.append(" Build/");
                sb.append(str4);
            }
            str = String.format(Locale.US, "Mozilla/5.0 (Linux; Android %s; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 %sSafari/537.36", new Object[]{sb, true != dVar.f364079b.getResources().getBoolean(R.bool.googleapp_is_large_screen) ? "Mobile " : BuildConfig.FLAVOR});
        }
        return dVar.mo111321b(str);
    }
}
