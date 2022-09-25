package com.google.android.apps.gsa.staticplugins.opa.translator.offline;

import android.icu.util.ULocale;
import android.view.translation.TranslationContext;
import android.view.translation.TranslationManager;
import android.view.translation.TranslationSpec;
import androidx.core.p094f.C1888a;
import androidx.p104d.p105a.C2164c;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import p3186j$.util.Objects;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.offline.ae */
/* compiled from: PG */
public final class C113620ae {

    /* renamed from: a */
    public final C60887da f314619a;

    /* renamed from: b */
    public final C22871g f314620b;

    /* renamed from: c */
    public C60870cx f314621c;

    /* renamed from: d */
    public C60870cx f314622d;

    /* renamed from: e */
    public String f314623e;

    /* renamed from: f */
    public String f314624f;

    /* renamed from: g */
    private final C113621af f314625g;

    public C113620ae(C113621af afVar, C60887da daVar, C90821bm bmVar) {
        this.f314625g = afVar;
        this.f314619a = daVar;
        this.f314620b = bmVar.mo85163a(C113619ad.class);
    }

    /* renamed from: a */
    public final void mo100356a(String str, String str2, C2164c cVar) {
        TranslationManager translationManager;
        TranslationContext build = new TranslationContext.Builder(new TranslationSpec(ULocale.forLanguageTag(str), 1), new TranslationSpec(ULocale.forLanguageTag(str2), 1)).build();
        Objects.requireNonNull(cVar);
        C113645x xVar = new C113645x(cVar);
        C113621af afVar = this.f314625g;
        C60887da daVar = this.f314619a;
        if (!C1888a.m5149c() || (translationManager = (TranslationManager) afVar.f314626a.getSystemService(TranslationManager.class)) == null) {
            xVar.accept(null);
        } else {
            translationManager.createOnDeviceTranslator(build, daVar, Consumer.Wrapper.convert(xVar));
        }
    }
}
