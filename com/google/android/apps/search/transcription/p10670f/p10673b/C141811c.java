package com.google.android.apps.search.transcription.p10670f.p10673b;

import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.transcription.f.b.c */
/* compiled from: PG */
public final /* synthetic */ class C141811c implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f384869a;

    public /* synthetic */ C141811c(String str) {
        this.f384869a = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = this.f384869a;
        C141831w f = ((C141832x) obj).mo116778f();
        f.mo116768g(Locale.forLanguageTag(str).getDisplayName());
        return f.mo116762a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
