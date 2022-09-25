package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.p9280a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122412bd;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122413be;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122422bn;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122423bo;
import java.util.Locale;
import p3186j$.util.function.Function;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.b.a.bl */
/* compiled from: PG */
public final /* synthetic */ class C122512bl implements Function {

    /* renamed from: a */
    public final /* synthetic */ C122519bs f339619a;

    /* renamed from: b */
    public final /* synthetic */ Locale f339620b;

    public /* synthetic */ C122512bl(C122519bs bsVar, Locale locale) {
        this.f339619a = bsVar;
        this.f339620b = locale;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C122519bs bsVar = this.f339619a;
        Locale locale = this.f339620b;
        C122412bd bdVar = bsVar.f339629a;
        C122422bn bnVar = (C122422bn) C122423bo.f339406b.createBuilder();
        String languageTag = locale.toLanguageTag();
        bnVar.copyOnWrite();
        languageTag.getClass();
        ((C122423bo) bnVar.instance).f339408a = languageTag;
        C122423bo boVar = (C122423bo) bnVar.build();
        C70876o.m103763d(bdVar.f189039a.mo39510a(C122413be.m201880f(), bdVar.f189040b), boVar, (C70862aj) obj, false);
        return "OnDeviceNluFulfillmentServiceConnectionImpl.prewarm";
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
