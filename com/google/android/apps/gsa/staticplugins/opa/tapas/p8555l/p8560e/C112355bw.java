package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4552o.p4553a.C59515cl;
import com.google.common.p4552o.p4553a.C59516cm;
import java.util.Map;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.bw */
/* compiled from: PG */
public final /* synthetic */ class C112355bw implements Function {

    /* renamed from: a */
    public final /* synthetic */ C112360ca f311756a;

    public /* synthetic */ C112355bw(C112360ca caVar) {
        this.f311756a = caVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C112360ca caVar = this.f311756a;
        Map.Entry entry = (Map.Entry) obj;
        C59515cl clVar = (C59515cl) C59516cm.f157913c.createBuilder();
        float floatValue = ((Float) ((C58495hd) caVar.f311772i.getOrDefault(entry.getKey(), C58729pv.f156485a)).getOrDefault(((Optional) entry.getValue()).get(), Float.valueOf(1.0E-5f))).floatValue();
        clVar.copyOnWrite();
        C59516cm cmVar = (C59516cm) clVar.instance;
        cmVar.f157915a |= 1;
        cmVar.f157916b = (double) floatValue;
        return (C59516cm) clVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
