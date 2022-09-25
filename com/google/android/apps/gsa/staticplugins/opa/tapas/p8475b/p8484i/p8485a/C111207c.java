package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8484i.p8485a;

import com.google.assistant.p3825an.p3830c.p3831a.C49266al;
import com.google.assistant.p3825an.p3830c.p3831a.C49267am;
import java.util.AbstractMap;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.i.a.c */
/* compiled from: PG */
public final /* synthetic */ class C111207c implements Function {

    /* renamed from: a */
    public final /* synthetic */ int f309504a;

    public /* synthetic */ C111207c(int i) {
        this.f309504a = i;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int i = this.f309504a;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = (AbstractMap.SimpleImmutableEntry) obj;
        C49266al alVar = (C49266al) C49267am.f127346f.createBuilder();
        String str = (String) simpleImmutableEntry.getKey();
        alVar.copyOnWrite();
        C49267am amVar = (C49267am) alVar.instance;
        str.getClass();
        amVar.f127348a |= 1;
        amVar.f127349b = str;
        String str2 = (String) simpleImmutableEntry.getValue();
        alVar.copyOnWrite();
        C49267am amVar2 = (C49267am) alVar.instance;
        str2.getClass();
        amVar2.f127348a |= 2;
        amVar2.f127350c = str2;
        alVar.copyOnWrite();
        C49267am amVar3 = (C49267am) alVar.instance;
        amVar3.f127348a |= 4;
        amVar3.f127351d = 1;
        alVar.copyOnWrite();
        C49267am amVar4 = (C49267am) alVar.instance;
        amVar4.f127348a |= 8;
        amVar4.f127352e = i;
        return (C49267am) alVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
