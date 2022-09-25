package com.google.android.libraries.assistant.p1363c.p1398g.p1444o.p1445a;

import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3897e.p3929l.p3930a.C52796x;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Locale;
import java.util.MissingResourceException;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.c.g.o.a.a */
/* compiled from: PG */
public final class C17574a {

    /* renamed from: a */
    private static final C59071e f50675a = C59071e.m91332i("com.google.android.libraries.assistant.c.g.o.a.a");

    /* renamed from: a */
    public static Optional m34861a(C52796x xVar) {
        if (xVar.f138520b.isEmpty()) {
            return Optional.empty();
        }
        return Optional.m71637of(m34862b(new Locale((String) xVar.f138520b.get(0))));
    }

    /* renamed from: b */
    public static Locale m34862b(Locale locale) {
        if (m34863c(locale).isEmpty()) {
            C59071e eVar = f50675a;
            C59104x d = eVar.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TTS");
            ((C59052c) ((C59052c) d).mo56372aa(42796)).mo56389s("Incoming locale %s is missing ISO3 country.", locale);
            Locale forLanguageTag = Locale.forLanguageTag(locale.toString().replace('_', '-'));
            if (!m34863c(forLanguageTag).isEmpty()) {
                return forLanguageTag;
            }
            C59104x d2 = eVar.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "TTS");
            ((C59052c) ((C59052c) d2).mo56372aa(42797)).mo56389s("Couldn't update locale %s to one with ISO3 country.", locale);
        }
        return locale;
    }

    /* renamed from: c */
    private static String m34863c(Locale locale) {
        try {
            return locale.getISO3Country();
        } catch (MissingResourceException unused) {
            return BuildConfig.FLAVOR;
        }
    }
}
