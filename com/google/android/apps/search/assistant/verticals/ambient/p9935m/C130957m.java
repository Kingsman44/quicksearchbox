package com.google.android.apps.search.assistant.verticals.ambient.p9935m;

import com.google.assistant.p3886c.p3889c.C50765c;
import com.google.assistant.p3886c.p3889c.C50770h;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.m.m */
/* compiled from: PG */
public final /* synthetic */ class C130957m implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C130957m f358311a = new C130957m();

    private /* synthetic */ C130957m() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C50770h hVar = (C50770h) obj;
        C59071e eVar = C130964t.f358314a;
        C50765c cVar = hVar.f132129d;
        if (cVar == null) {
            cVar = C50765c.f132101g;
        }
        C50765c cVar2 = hVar.f132130e;
        if (cVar2 == null) {
            cVar2 = C50765c.f132101g;
        }
        C50765c cVar3 = hVar.f132131f;
        if (cVar3 == null) {
            cVar3 = C50765c.f132101g;
        }
        return Collection.EL.stream(C58485gu.m89848p(cVar, cVar2, cVar3));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
