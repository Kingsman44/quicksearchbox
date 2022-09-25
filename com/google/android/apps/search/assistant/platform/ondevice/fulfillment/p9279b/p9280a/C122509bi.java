package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.p9280a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122412bd;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122413be;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122469x;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122470y;
import java.util.Locale;
import p3186j$.util.function.Function;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.b.a.bi */
/* compiled from: PG */
public final /* synthetic */ class C122509bi implements Function {

    /* renamed from: a */
    public final /* synthetic */ C122519bs f339613a;

    /* renamed from: b */
    public final /* synthetic */ Locale f339614b;

    public /* synthetic */ C122509bi(C122519bs bsVar, Locale locale) {
        this.f339613a = bsVar;
        this.f339614b = locale;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C122519bs bsVar = this.f339613a;
        Locale locale = this.f339614b;
        C122412bd bdVar = bsVar.f339629a;
        C122469x xVar = (C122469x) C122470y.f339529b.createBuilder();
        String languageTag = locale.toLanguageTag();
        xVar.copyOnWrite();
        languageTag.getClass();
        ((C122470y) xVar.instance).f339531a = languageTag;
        C122470y yVar = (C122470y) xVar.build();
        C70876o.m103763d(bdVar.f189039a.mo39510a(C122413be.m201876b(), bdVar.f189040b), yVar, (C70862aj) obj, false);
        return "OnDeviceNluFulfillmentServiceConnectionImpl.checkEligibility";
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
