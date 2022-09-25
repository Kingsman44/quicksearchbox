package com.google.android.apps.search.assistant.platform.ondevice.datadownload;

import android.content.Context;
import com.google.android.libraries.assistant.p1363c.p1371b.p1379f.C17136an;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.a */
/* compiled from: PG */
public final class C122150a {

    /* renamed from: a */
    public final C39141kp f338818a;

    /* renamed from: b */
    public final String f338819b;

    public C122150a(C39141kp kpVar, Context context) {
        this.f338818a = kpVar;
        this.f338819b = C17136an.m34275j(context);
    }

    /* renamed from: a */
    public static String m201694a(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        return language + "-" + country;
    }

    /* renamed from: b */
    public final void mo105547b(Locale locale, String str) {
        C39141kp kpVar = this.f338818a;
        ((C19567d) kpVar.f102811V.mo6453a()).mo24822a(1, this.f338819b, m201694a(locale), str);
    }
}
