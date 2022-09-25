package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8455f;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3994s.p3995a.C53175ed;
import com.google.assistant.p3994s.p3995a.C53194ew;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.f.r */
/* compiled from: PG */
final class C110684r {

    /* renamed from: a */
    private static final C59071e f308421a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.smartspace.f.r");

    /* renamed from: a */
    public static String m184382a(C53175ed edVar) {
        Locale locale = Locale.getDefault();
        if (!m184384c(locale, edVar)) {
            return BuildConfig.FLAVOR;
        }
        Optional findAny = Collection.EL.stream(edVar.f139363e).filter(new C110683q(locale)).findAny();
        if (findAny.isPresent()) {
            return ((C53194ew) findAny.get()).f139419b;
        }
        C59104x c = f308421a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "EvtSuggsUtils");
        ((C59052c) ((C59052c) c).mo56372aa(26656)).mo56354G("localizedEntityName for [%s] not found for event: %s", locale.getLanguage(), edVar.f139360b);
        return BuildConfig.FLAVOR;
    }

    /* renamed from: b */
    public static boolean m184383b(C53175ed edVar) {
        Locale locale = Locale.getDefault();
        if (!m184384c(locale, edVar)) {
            return false;
        }
        boolean anyMatch = Collection.EL.stream(edVar.f139363e).anyMatch(new C110682p(locale));
        if (!anyMatch) {
            C59104x c = f308421a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "EvtSuggsUtils");
            ((C59052c) ((C59052c) c).mo56372aa(26657)).mo56354G("localizedEntityName for [%s] not found for event: %s", locale.getLanguage(), edVar.f139360b);
        }
        return anyMatch;
    }

    /* renamed from: c */
    private static boolean m184384c(Locale locale, C53175ed edVar) {
        if (TextUtils.isEmpty(locale.getLanguage())) {
            C59104x c = f308421a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "EvtSuggsUtils");
            ((C59052c) ((C59052c) c).mo56372aa(26659)).mo56386p("defaultLocale.getLanguage() is empty.");
            return false;
        } else if (edVar.f139363e.size() != 0) {
            return true;
        } else {
            C59104x c2 = f308421a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "EvtSuggsUtils");
            ((C59052c) ((C59052c) c2).mo56372aa(26658)).mo56386p("holidayInfo doesn't have localized entity names.");
            return false;
        }
    }
}
