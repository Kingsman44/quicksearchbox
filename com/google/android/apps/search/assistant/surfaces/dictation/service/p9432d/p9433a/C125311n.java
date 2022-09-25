package com.google.android.apps.search.assistant.surfaces.dictation.service.p9432d.p9433a;

import android.content.Context;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9432d.C125297a;
import com.google.android.libraries.assistant.p1363c.p1371b.p1372a.C16994a;
import com.google.android.libraries.assistant.p1363c.p1371b.p1372a.p1373a.C17009f;
import com.google.android.libraries.assistant.p1363c.p1371b.p1372a.p1373a.C17011h;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17035ab;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17036ac;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17039af;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17043aj;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17044ak;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17058c;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.d.a.n */
/* compiled from: PG */
public final class C125311n implements C125297a {

    /* renamed from: a */
    public static final C59071e f345675a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.dictation.service.d.a.n");

    /* renamed from: b */
    public static final C58485gu f345676b = C58485gu.m89851s("punctuation_model.tflite", "capitalization_model.tflite", "capitalization_vocab.txt", "spoken_punctuation_model.tflite", "spoken_punctuation_config.binarypb", "spoken_emojis_patterns.binarypb");

    /* renamed from: c */
    public static final C58485gu f345677c = C58485gu.m89846n("corrections_query_alternatives");

    /* renamed from: d */
    public final C17011h f345678d;

    /* renamed from: e */
    public final C17009f f345679e;

    /* renamed from: f */
    public final C17058c f345680f;

    /* renamed from: g */
    public final Context f345681g;

    /* renamed from: h */
    public final C60887da f345682h;

    /* renamed from: i */
    private final C17039af f345683i;

    public C125311n(C17039af afVar, C17058c cVar, C17009f fVar, C17011h hVar, Context context, C60887da daVar) {
        this.f345683i = afVar;
        this.f345680f = cVar;
        this.f345679e = fVar;
        this.f345678d = hVar;
        this.f345681g = context;
        this.f345682h = daVar;
    }

    /* renamed from: j */
    private final C47633f m205241j(Locale locale, String str, C17035ab abVar, String str2) {
        C17039af afVar = this.f345683i;
        C17043aj ajVar = (C17043aj) C17044ak.f49650c.createBuilder();
        String languageTag = locale.toLanguageTag();
        abVar.copyOnWrite();
        C17036ac acVar = (C17036ac) abVar.instance;
        C17036ac acVar2 = C17036ac.f49640d;
        languageTag.getClass();
        acVar.f49642a |= 2;
        acVar.f49644c = languageTag;
        ajVar.copyOnWrite();
        C17044ak akVar = (C17044ak) ajVar.instance;
        C17036ac acVar3 = (C17036ac) abVar.build();
        acVar3.getClass();
        akVar.f49653b = acVar3;
        akVar.f49652a |= 1;
        return C47633f.m84733g(afVar.mo23172b((C17044ak) ajVar.build())).mo51515h(new C125307j(str2, str, locale), this.f345682h);
    }

    /* renamed from: a */
    public final C60870cx mo106902a(Locale locale) {
        return mo106911i(locale, this.f345678d, "capitalization_model.tflite");
    }

    /* renamed from: b */
    public final C60870cx mo106903b(Locale locale) {
        return mo106911i(locale, this.f345678d, "capitalization_vocab.txt");
    }

    /* renamed from: c */
    public final C60870cx mo106904c(Locale locale) {
        return mo106911i(locale, this.f345678d, "punctuation_model.tflite");
    }

    /* renamed from: d */
    public final C60870cx mo106905d(Locale locale) {
        return mo106910h(locale, this.f345679e, "corrections_query_alternatives");
    }

    /* renamed from: e */
    public final C60870cx mo106906e(Locale locale) {
        return mo106911i(locale, this.f345678d, "spoken_emojis_patterns.binarypb");
    }

    /* renamed from: f */
    public final C60870cx mo106907f(Locale locale) {
        return mo106911i(locale, this.f345678d, "spoken_punctuation_config.binarypb");
    }

    /* renamed from: g */
    public final C60870cx mo106908g(Locale locale) {
        return mo106911i(locale, this.f345678d, "spoken_punctuation_model.tflite");
    }

    /* renamed from: h */
    public final C47633f mo106910h(Locale locale, C17009f fVar, String str) {
        return m205241j(locale, "apa_corrections", C16994a.m34087a(fVar), str);
    }

    /* renamed from: i */
    public final C47633f mo106911i(Locale locale, C17011h hVar, String str) {
        return m205241j(locale, "apa_dictation_formatting", C16994a.m34087a(hVar), str);
    }
}
