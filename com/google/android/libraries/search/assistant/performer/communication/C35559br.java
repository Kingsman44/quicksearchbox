package com.google.android.libraries.search.assistant.performer.communication;

import android.telephony.PhoneNumberUtils;
import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3897e.p3921j.C52625yr;
import com.google.assistant.p3897e.p3921j.C52628yu;
import com.google.assistant.p3897e.p3921j.C52629yv;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.br */
/* compiled from: PG */
public final /* synthetic */ class C35559br implements Function {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f93375a;

    public /* synthetic */ C35559br(C58528ij ijVar) {
        this.f93375a = ijVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C58528ij ijVar = this.f93375a;
        C52629yv yvVar = (C52629yv) obj;
        C52625yr yrVar = C35573cb.f93393a;
        if (!ijVar.contains(PhoneNumberUtils.normalizeNumber(yvVar.f138184c).replace("+", BuildConfig.FLAVOR))) {
            return yvVar;
        }
        C52628yu yuVar = (C52628yu) yvVar.toBuilder();
        C52625yr yrVar2 = C35573cb.f93393a;
        yuVar.copyOnWrite();
        C52629yv yvVar2 = (C52629yv) yuVar.instance;
        yrVar2.getClass();
        yvVar2.f138183b = yrVar2;
        yvVar2.f138182a |= 1;
        return (C52629yv) yuVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
