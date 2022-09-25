package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.assistant.p3781ad.p3789d.C48578al;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.z */
/* compiled from: PG */
public final /* synthetic */ class C111745z implements Function {

    /* renamed from: a */
    public final /* synthetic */ C111695af f310623a;

    /* renamed from: b */
    public final /* synthetic */ String f310624b;

    public /* synthetic */ C111745z(C111695af afVar, String str) {
        this.f310623a = afVar;
        this.f310624b = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C111695af afVar = this.f310623a;
        String str = this.f310624b;
        C48578al alVar = (C48578al) obj;
        if (afVar.f310505c.mo79746e(C90063do.f249484eR)) {
            return afVar.f310504b.mo28202b("convertToTapasSuggestionWrapperList", new C111743x(afVar, alVar, str));
        }
        return afVar.mo99206a(alVar, str);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
