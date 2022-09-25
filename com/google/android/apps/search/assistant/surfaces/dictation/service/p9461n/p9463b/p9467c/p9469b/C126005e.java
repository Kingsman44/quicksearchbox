package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9467c.p9469b;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125142dp;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125143dq;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.C126107dr;
import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.c.b.e */
/* compiled from: PG */
public final /* synthetic */ class C126005e implements Function {

    /* renamed from: a */
    public final /* synthetic */ C126018r f347272a;

    /* renamed from: b */
    public final /* synthetic */ Locale f347273b;

    public /* synthetic */ C126005e(C126018r rVar, Locale locale) {
        this.f347272a = rVar;
        this.f347273b = locale;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C126018r rVar = this.f347272a;
        Locale locale = this.f347273b;
        String str = (String) obj;
        C126107dr drVar = rVar.f347289a;
        C125142dp dpVar = (C125142dp) C125143dq.f345221c.createBuilder();
        dpVar.copyOnWrite();
        str.getClass();
        ((C125143dq) dpVar.instance).f345223a = str;
        return drVar.mo107345d((C125143dq) dpVar.build(), false, locale);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
