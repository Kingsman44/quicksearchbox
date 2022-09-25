package com.google.android.apps.gsa.staticplugins.opa.translator.offline;

import android.os.CancellationSignal;
import android.view.translation.TranslationRequest;
import android.view.translation.TranslationRequestValue;
import android.view.translation.Translator;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.offline.u */
/* compiled from: PG */
public final /* synthetic */ class C113642u implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C113620ae f314698a;

    /* renamed from: b */
    public final /* synthetic */ String f314699b;

    /* renamed from: c */
    public final /* synthetic */ Translator f314700c;

    public /* synthetic */ C113642u(C113620ae aeVar, String str, Translator translator) {
        this.f314698a = aeVar;
        this.f314699b = str;
        this.f314700c = translator;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C113620ae aeVar = this.f314698a;
        String str = this.f314699b;
        this.f314700c.translate(new TranslationRequest.Builder().setTranslationRequestValues(C58485gu.m89846n(TranslationRequestValue.forText(str))).build(), (CancellationSignal) null, aeVar.f314619a, Consumer.Wrapper.convert(new C113644w(cVar)));
        return null;
    }
}
