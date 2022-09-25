package com.google.android.apps.search.assistant.surfaces.dictation.service.p9432d.p9433a;

import com.google.common.p4526f.C59071e;
import java.util.Locale;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.d.a.h */
/* compiled from: PG */
public final /* synthetic */ class C125305h implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Locale f345666a;

    public /* synthetic */ C125305h(Locale locale) {
        this.f345666a = locale;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        Locale locale = this.f345666a;
        C59071e eVar = C125311n.f345675a;
        if (((String) obj).equals("punctuation_model.tflite")) {
            return true;
        }
        if (locale.toLanguageTag().startsWith("ja") || locale.toLanguageTag().startsWith("fr") || locale.toLanguageTag().startsWith("it") || locale.toLanguageTag().startsWith("es")) {
            return false;
        }
        return true;
    }
}
