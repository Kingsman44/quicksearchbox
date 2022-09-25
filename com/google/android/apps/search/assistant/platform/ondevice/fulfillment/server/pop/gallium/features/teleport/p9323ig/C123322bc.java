package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.evernote.android.state.BuildConfig;
import com.google.common.p4522b.C58485gu;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.bc */
/* compiled from: PG */
public final class C123322bc {
    /* renamed from: a */
    public static String m202694a(String str, C58485gu guVar, Locale locale) {
        Optional findFirst = Collection.EL.stream(guVar).filter(new C123321bb(str)).findFirst();
        if (findFirst.isPresent()) {
            return ((C123320ba) findFirst.get()).mo105954b();
        }
        String lowerCase = str.toLowerCase(locale);
        if (!lowerCase.startsWith("www") && !lowerCase.startsWith("http") && !lowerCase.startsWith("m.")) {
            return str;
        }
        try {
            if (!lowerCase.startsWith("http")) {
                lowerCase = "http://" + lowerCase;
            }
            String host = new URL(lowerCase).getHost();
            if (host.startsWith("www.")) {
                return host.replaceFirst("www.", BuildConfig.FLAVOR);
            }
            return host.startsWith("m.") ? host.replaceFirst("m.", BuildConfig.FLAVOR) : host;
        } catch (MalformedURLException unused) {
            return str;
        }
    }
}
