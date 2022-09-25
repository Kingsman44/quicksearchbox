package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import com.google.common.base.C58835az;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.br */
/* compiled from: PG */
public final /* synthetic */ class C111021br implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f309203a;

    /* renamed from: b */
    public final /* synthetic */ Map.Entry f309204b;

    public /* synthetic */ C111021br(String str, Map.Entry entry) {
        this.f309203a = str;
        this.f309204b = entry;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = this.f309203a;
        Map.Entry entry = this.f309204b;
        return new C58835az((String) obj, Double.valueOf((double) (((float) str.length()) / ((float) ((String) entry.getKey()).length()))));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
