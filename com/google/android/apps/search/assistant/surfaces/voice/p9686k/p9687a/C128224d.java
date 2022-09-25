package com.google.android.apps.search.assistant.surfaces.voice.p9686k.p9687a;

import android.view.translation.TranslationCapability;
import java.util.Locale;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.k.a.d */
/* compiled from: PG */
public final /* synthetic */ class C128224d implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C128224d f352709a = new C128224d();

    private /* synthetic */ C128224d() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        TranslationCapability translationCapability = (TranslationCapability) obj;
        int i = C128225e.f352710d;
        return Stream.CC.m71936of((T[]) new Locale[]{Locale.forLanguageTag(translationCapability.getTargetSpec().getLocale().toLanguageTag()), Locale.forLanguageTag(translationCapability.getSourceSpec().getLocale().toLanguageTag())});
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
