package com.google.android.apps.search.googleapp.discover.p10238u;

import android.content.Context;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.u.cs */
/* compiled from: PG */
public final class C135017cs {
    /* renamed from: a */
    public static final Locale m218946a(Context context) {
        C69664n.m101061g(context, "context");
        Locale locale = context.getResources().getConfiguration().getLocales().get(0);
        C69664n.m101060f(locale, "context.resources.configuration.locales[0]");
        return locale;
    }

    /* renamed from: b */
    public static final String m218947b(Context context) {
        C69664n.m101061g(context, "context");
        String languageTag = m218946a(context).toLanguageTag();
        C69664n.m101060f(languageTag, "getLocale(context).toLanguageTag()");
        return languageTag;
    }
}
