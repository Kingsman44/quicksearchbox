package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import com.google.assistant.p3890d.p3893b.p3894a.p3895a.p3896a.C50862b;
import com.google.common.p4522b.C58495hd;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.ak */
/* compiled from: PG */
public final /* synthetic */ class C110973ak implements Function {

    /* renamed from: a */
    public final /* synthetic */ Map f309150a;

    public /* synthetic */ C110973ak(Map map) {
        this.f309150a = map;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Map map = this.f309150a;
        String str = ((C50862b) obj).f132435a;
        for (Map.Entry entry : ((C58495hd) map).entrySet()) {
            str = str.replace(String.format("%s%s%s", new Object[]{"{", entry.getKey(), "}"}), (CharSequence) entry.getValue());
        }
        return str;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
