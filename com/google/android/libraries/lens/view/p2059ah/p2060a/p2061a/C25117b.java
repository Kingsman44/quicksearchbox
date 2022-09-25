package com.google.android.libraries.lens.view.p2059ah.p2060a.p2061a;

import android.content.Context;
import android.view.translation.TranslationCapability;
import android.view.translation.TranslationManager;
import com.google.android.libraries.lens.view.p2059ah.p2060a.C25115a;
import com.google.android.libraries.lens.view.p2059ah.p2060a.C25120b;
import com.google.android.libraries.lens.view.p2069am.C25327c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60888db;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.lens.view.ah.a.a.b */
/* compiled from: PG */
public final class C25117b implements C25120b {

    /* renamed from: b */
    public static final /* synthetic */ int f68414b = 0;

    /* renamed from: c */
    private static final C58974d f68415c = C58974d.m91135i("TranslateCapabilitySyncManagerImpl");

    /* renamed from: a */
    final C60888db f68416a;

    /* renamed from: d */
    private final TranslationManager f68417d;

    /* renamed from: e */
    private final Set f68418e = Collections.newSetFromMap(new ConcurrentHashMap());

    public C25117b(Context context, C60888db dbVar) {
        this.f68416a = dbVar;
        this.f68417d = (TranslationManager) context.getSystemService(TranslationManager.class);
    }

    /* renamed from: a */
    public final void mo30269a(C25115a aVar) {
        ((C58970a) ((C58970a) f68415c.mo56224b()).mo56372aa(49795)).mo56386p("addSystemLanguageSettingsChangeListener");
        this.f68418e.add(aVar);
    }

    /* renamed from: b */
    public final void mo30270b() {
        C25327c cVar;
        C58974d dVar = f68415c;
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(49798)).mo56386p("syncToGlobalSettings");
        TranslationManager translationManager = this.f68417d;
        if (translationManager == null) {
            ((C58970a) ((C58970a) dVar.mo56226d()).mo56372aa(49800)).mo56386p("TranslationManager is null.");
            return;
        }
        Set<TranslationCapability> onDeviceTranslationCapabilities = translationManager.getOnDeviceTranslationCapabilities(1000, 1000);
        if (onDeviceTranslationCapabilities.isEmpty()) {
            ((C58970a) ((C58970a) dVar.mo56226d()).mo56372aa(49799)).mo56386p("TranslationManager did not return capabilities.");
            return;
        }
        HashMap hashMap = new HashMap();
        Locale locale = null;
        boolean z = false;
        for (TranslationCapability translationCapability : onDeviceTranslationCapabilities) {
            if (translationCapability.isUiTranslationEnabled() && locale == null) {
                locale = Locale.forLanguageTag(translationCapability.getTargetSpec().getLocale().toLanguageTag());
                hashMap.put(locale, C25327c.DOWNLOADED);
            }
            z |= !(translationCapability.getState() != 1000);
            Locale forLanguageTag = Locale.forLanguageTag(translationCapability.getSourceSpec().getLocale().toLanguageTag());
            if (translationCapability == null) {
                cVar = C25327c.UNKNOWN;
            } else {
                C25327c cVar2 = C25327c.UNKNOWN;
                int state = translationCapability.getState();
                cVar = state != 1 ? state != 2 ? state != 3 ? state != 4 ? state != 1000 ? cVar2 : C25327c.DELETED : C25327c.UNKNOWN : C25327c.DOWNLOADED : C25327c.DOWNLOADING : C25327c.DOWNLOADABLE;
            }
            hashMap.put(forLanguageTag, cVar);
        }
        if (locale != null || z) {
            C58833ax j = C58833ax.m90833j(locale);
            ((C58970a) ((C58970a) f68415c.mo56224b()).mo56372aa(49796)).mo56386p("notify settings synced");
            for (C25115a aVar : this.f68418e) {
                ((C58970a) ((C58970a) f68415c.mo56224b()).mo56372aa(49797)).mo56389s("execute listener %s", aVar);
                this.f68416a.execute(C47810es.m84977q(new C25116a(aVar, j, hashMap)));
            }
        }
    }
}
