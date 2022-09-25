package com.google.android.apps.search.assistant.platform.ondevice.datadownload;

import com.google.android.libraries.mdi.download.C28740br;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.ap */
/* compiled from: PG */
public final /* synthetic */ class C122168ap implements Function {

    /* renamed from: a */
    public final /* synthetic */ C122174av f338849a;

    /* renamed from: b */
    public final /* synthetic */ C28740br f338850b;

    public /* synthetic */ C122168ap(C122174av avVar, C28740br brVar) {
        this.f338849a = avVar;
        this.f338850b = brVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C122174av avVar = this.f338849a;
        C28740br brVar = this.f338850b;
        Long l = (Long) obj;
        if (l.longValue() > avVar.f338854a) {
            return C60856cj.m92899h(new C122171as(brVar, l.longValue(), avVar.f338854a));
        }
        return C60866ct.f164955a;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
