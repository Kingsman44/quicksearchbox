package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.p9280a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122404aw;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122405ax;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122412bd;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122413be;
import java.util.Locale;
import p3186j$.util.function.Function;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.b.a.bj */
/* compiled from: PG */
public final /* synthetic */ class C122510bj implements Function {

    /* renamed from: a */
    public final /* synthetic */ C122519bs f339615a;

    /* renamed from: b */
    public final /* synthetic */ String f339616b;

    /* renamed from: c */
    public final /* synthetic */ Locale f339617c;

    public /* synthetic */ C122510bj(C122519bs bsVar, String str, Locale locale) {
        this.f339615a = bsVar;
        this.f339616b = str;
        this.f339617c = locale;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C122519bs bsVar = this.f339615a;
        String str = this.f339616b;
        Locale locale = this.f339617c;
        C122412bd bdVar = bsVar.f339629a;
        C122404aw awVar = (C122404aw) C122405ax.f339349c.createBuilder();
        awVar.copyOnWrite();
        str.getClass();
        ((C122405ax) awVar.instance).f339351a = str;
        String languageTag = locale.toLanguageTag();
        awVar.copyOnWrite();
        languageTag.getClass();
        ((C122405ax) awVar.instance).f339352b = languageTag;
        C122405ax axVar = (C122405ax) awVar.build();
        C70876o.m103763d(bdVar.f189039a.mo39510a(C122413be.m201877c(), bdVar.f189040b), axVar, (C70862aj) obj, false);
        return "OnDeviceNluFulfillmentServiceConnectionImpl.lookupMid";
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
