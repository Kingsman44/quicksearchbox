package com.google.android.apps.search.assistant.surfaces.voice.p9686k.p9687a;

import android.view.translation.TranslationManager;
import androidx.core.p094f.C1888a;
import androidx.p104d.p105a.C2169h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58800sl;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Collection;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.k.a.a */
/* compiled from: PG */
public final /* synthetic */ class C128221a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C128225e f352706a;

    public /* synthetic */ C128221a(C128225e eVar) {
        this.f352706a = eVar;
    }

    public final Object apply(Object obj) {
        Collection collection;
        TranslationManager translationManager;
        C128225e eVar = this.f352706a;
        if (!((Boolean) obj).booleanValue()) {
            return false;
        }
        if (!C1888a.m5149c() || (translationManager = (TranslationManager) eVar.f352712a.getSystemService(TranslationManager.class)) == null) {
            collection = C58733pz.f156496a;
        } else {
            collection = translationManager.getOnDeviceTranslationCapabilities(1000, 1000);
        }
        C58800sl lA = ((C58528ij) Collection.EL.stream(collection).filter(C128223c.f352708a).flatMap(C128224d.f352709a).collect(C58370cn.f155947b)).iterator();
        while (lA.hasNext()) {
            String str = (String) eVar.f352714c.get(((Locale) lA.next()).toLanguageTag());
            if (str != null) {
                C128235o oVar = eVar.f352713b;
                Locale forLanguageTag = Locale.forLanguageTag(str);
                AtomicReference atomicReference = new AtomicReference();
                C60870cx a = C2169h.m6027a(new C128230j(oVar, atomicReference));
                C128231k kVar = new C128231k(oVar, forLanguageTag, atomicReference);
                C60870cx h = C60922j.m93045h(a, C47810es.m84966f(kVar), oVar.f352735c);
                C128232l lVar = new C128232l(forLanguageTag, atomicReference);
                C60856cj.m92911t(h, C47810es.m84974n(lVar), oVar.f352735c);
            }
        }
        return true;
    }
}
