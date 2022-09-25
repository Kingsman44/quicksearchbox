package com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9707i;

import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35614ag;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35615ah;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35616ai;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35644e;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.p2737a.C35606g;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.m.i.l */
/* compiled from: PG */
public final /* synthetic */ class C128334l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C128335m f352961a;

    /* renamed from: b */
    public final /* synthetic */ C51809dy f352962b;

    public /* synthetic */ C128334l(C128335m mVar, C51809dy dyVar) {
        this.f352961a = mVar;
        this.f352962b = dyVar;
    }

    public final C60870cx apply(Object obj) {
        String str;
        C128335m mVar = this.f352961a;
        C51809dy dyVar = this.f352962b;
        Locale locale = (Locale) obj;
        C35616ai aiVar = mVar.f352965c;
        C35614ag g = C35615ah.m63986g();
        g.mo39742b(dyVar);
        C35606g gVar = mVar.f352963a;
        if (gVar != null) {
            C35644e eVar = (C35644e) g;
            eVar.f93507a = gVar;
            C69664n.m101061g(locale, "locale");
            String country = locale.getCountry();
            C69664n.m101060f(country, "locale.country");
            if (country.length() == 0) {
                String language = locale.getLanguage();
                C69664n.m101060f(language, "locale.language");
                Locale locale2 = Locale.US;
                C69664n.m101060f(locale2, "US");
                str = language.toLowerCase(locale2);
                C69664n.m101060f(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                String language2 = locale.getLanguage();
                C69664n.m101060f(language2, "locale.language");
                Locale locale3 = Locale.US;
                C69664n.m101060f(locale3, "US");
                String lowerCase = language2.toLowerCase(locale3);
                C69664n.m101060f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                String country2 = locale.getCountry();
                C69664n.m101060f(country2, "locale.country");
                Locale locale4 = Locale.US;
                C69664n.m101060f(locale4, "US");
                String upperCase = country2.toUpperCase(locale4);
                C69664n.m101060f(upperCase, "this as java.lang.String).toUpperCase(locale)");
                str = lowerCase + "-" + upperCase;
            }
            g.mo39743c(str);
            eVar.f93510d = mVar.f352966d;
            eVar.f93508b = mVar.f352964b;
            eVar.f93509c = true;
            return aiVar.mo39750a(g.mo39741a());
        }
        throw new NullPointerException("Null messageSnapshotCache");
    }
}
