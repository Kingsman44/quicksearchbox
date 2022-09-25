package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9467c.p9469b;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125140dn;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125141do;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125142dp;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125143dq;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.C126088cz;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.C126107dr;
import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.c.b.d */
/* compiled from: PG */
public final /* synthetic */ class C126004d implements Function {

    /* renamed from: a */
    public final /* synthetic */ C126018r f347269a;

    /* renamed from: b */
    public final /* synthetic */ C126088cz f347270b;

    /* renamed from: c */
    public final /* synthetic */ Locale f347271c;

    public /* synthetic */ C126004d(C126018r rVar, C126088cz czVar, Locale locale) {
        this.f347269a = rVar;
        this.f347270b = czVar;
        this.f347271c = locale;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C126018r rVar = this.f347269a;
        C126088cz czVar = this.f347270b;
        Locale locale = this.f347271c;
        String str = (String) obj;
        C126107dr drVar = rVar.f347289a;
        C125142dp dpVar = (C125142dp) C125143dq.f345221c.createBuilder();
        dpVar.copyOnWrite();
        str.getClass();
        ((C125143dq) dpVar.instance).f345223a = str;
        C125140dn dnVar = (C125140dn) C125141do.f345217c.createBuilder();
        String str2 = czVar.f347501b;
        dnVar.copyOnWrite();
        str2.getClass();
        ((C125141do) dnVar.instance).f345219a = str2;
        dpVar.copyOnWrite();
        C125141do doVar = (C125141do) dnVar.build();
        doVar.getClass();
        ((C125143dq) dpVar.instance).f345224b = doVar;
        return drVar.mo107345d((C125143dq) dpVar.build(), false, locale);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
