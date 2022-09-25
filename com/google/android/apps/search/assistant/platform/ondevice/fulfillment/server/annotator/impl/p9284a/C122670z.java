package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.p9284a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.TextAnnotatorConfigurator;
import com.google.common.base.C58817ah;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLib;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.a.z */
/* compiled from: PG */
public final /* synthetic */ class C122670z implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ TextClassifierLib f339921a;

    /* renamed from: b */
    public final /* synthetic */ C122659o f339922b;

    public /* synthetic */ C122670z(TextClassifierLib textClassifierLib, C122659o oVar) {
        this.f339921a = textClassifierLib;
        this.f339922b = oVar;
    }

    public final Object apply(Object obj) {
        TextClassifierLib textClassifierLib = this.f339921a;
        C122659o oVar = this.f339922b;
        TextClassifierLib textClassifierLib2 = (TextClassifierLib) obj;
        TextAnnotatorConfigurator.nativeUpdate(textClassifierLib);
        return Optional.m71637of(oVar);
    }
}
