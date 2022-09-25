package com.google.android.libraries.lens.view.p2059ah.p2060a.p2062b;

import android.view.translation.TranslationCapability;
import android.view.translation.TranslationManager;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24440ab;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24446ah;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24465t;
import com.google.android.libraries.lens.view.p2069am.C25327c;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p3186j$.util.Map;

/* renamed from: com.google.android.libraries.lens.view.ah.a.b.d */
/* compiled from: PG */
public final /* synthetic */ class C25124d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C25128h f68423a;

    public /* synthetic */ C25124d(C25128h hVar) {
        this.f68423a = hVar;
    }

    public final Object apply(Object obj) {
        C58495hd hdVar;
        C25327c cVar;
        C25128h hVar = this.f68423a;
        C58490gz gzVar = new C58490gz(4);
        for (C24440ab abVar : (List) obj) {
            C24465t tVar = abVar.f66920b;
            if (tVar == null) {
                tVar = C24465t.f66964f;
            }
            Locale forLanguageTag = Locale.forLanguageTag(tVar.f66969d);
            C24446ah a = C24446ah.m45519a(abVar.f66922d);
            if (a == null) {
                a = C24446ah.STATUS_UNKNOWN;
            }
            if (a.equals(C24446ah.STATUS_DOWNLOADED)) {
                gzVar.mo55429h(forLanguageTag, C25327c.DOWNLOADED);
            } else {
                C24446ah a2 = C24446ah.m45519a(abVar.f66922d);
                if (a2 == null) {
                    a2 = C24446ah.STATUS_UNKNOWN;
                }
                if (a2.equals(C24446ah.STATUS_SCHEDULED)) {
                    gzVar.mo55429h(forLanguageTag, C25327c.DOWNLOADING);
                }
            }
        }
        C58495hd f = gzVar.mo55427f(false);
        C58490gz gzVar2 = new C58490gz(4);
        TranslationManager translationManager = (TranslationManager) hVar.f68428b.getSystemService(TranslationManager.class);
        if (translationManager == null) {
            ((C58970a) ((C58970a) C25128h.f68427a.mo56226d()).mo56372aa(49811)).mo56386p("translationManager is NULL");
            hdVar = gzVar2.mo55427f(false);
        } else {
            Set<TranslationCapability> onDeviceTranslationCapabilities = translationManager.getOnDeviceTranslationCapabilities(1000, 1000);
            if (onDeviceTranslationCapabilities.isEmpty()) {
                ((C58970a) ((C58970a) C25128h.f68427a.mo56226d()).mo56372aa(49810)).mo56386p("TranslationManager did not return capabilities.");
                hdVar = gzVar2.mo55427f(false);
            } else {
                Locale locale = null;
                for (TranslationCapability translationCapability : onDeviceTranslationCapabilities) {
                    if (translationCapability.isUiTranslationEnabled() && locale == null) {
                        locale = Locale.forLanguageTag(translationCapability.getTargetSpec().getLocale().toLanguageTag());
                        gzVar2.mo55429h(locale, C25327c.DOWNLOADED);
                    }
                    Locale forLanguageTag2 = Locale.forLanguageTag(translationCapability.getSourceSpec().getLocale().toLanguageTag());
                    if (translationCapability == null) {
                        cVar = C25327c.UNKNOWN;
                    } else {
                        C25327c cVar2 = C25327c.UNKNOWN;
                        int state = translationCapability.getState();
                        cVar = state != 1 ? state != 2 ? state != 3 ? state != 4 ? state != 1000 ? cVar2 : C25327c.DELETED : C25327c.UNKNOWN : C25327c.DOWNLOADED : C25327c.DOWNLOADING : C25327c.DOWNLOADABLE;
                    }
                    gzVar2.mo55429h(forLanguageTag2, cVar);
                }
                hdVar = gzVar2.mo55427f(false);
            }
        }
        Map.EL.forEach(hdVar, new C25122b(hVar, f));
        return true;
    }
}
