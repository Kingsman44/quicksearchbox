package com.google.android.libraries.lens.ondevice.p2030g;

import com.google.android.libraries.lens.ondevice.p2037n.C24792c;
import com.google.android.libraries.lens.ondevice.p2037n.C24793d;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.ondevice.g.a */
/* compiled from: PG */
public final /* synthetic */ class C24496a implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C24496a f67027a = new C24496a();

    private /* synthetic */ C24496a() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = (String) obj;
        C58974d dVar = C24500e.f67033a;
        C24792c cVar = (C24792c) C24793d.f67743c.createBuilder();
        cVar.copyOnWrite();
        C24793d dVar2 = (C24793d) cVar.instance;
        str.getClass();
        dVar2.f67745a |= 2;
        dVar2.f67746b = str;
        return (C24793d) cVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
