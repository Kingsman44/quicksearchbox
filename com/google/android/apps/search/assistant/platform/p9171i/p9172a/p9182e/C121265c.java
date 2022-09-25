package com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9182e;

import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.p5295b.C68283d;
import java.util.Map;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.assistant.platform.i.a.e.c */
/* compiled from: PG */
public final /* synthetic */ class C121265c implements Function {

    /* renamed from: a */
    public final /* synthetic */ Map f336831a;

    public /* synthetic */ C121265c(Map map) {
        this.f336831a = map;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Map map = this.f336831a;
        C48672ag agVar = (C48672ag) obj;
        if (map.containsKey(agVar)) {
            return Stream.CC.m71935of(((C68283d) map.get(agVar)).mo60297gq());
        }
        C59104x d = C121267e.f336833a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "CFPM");
        ((C59052c) ((C59052c) d).mo56372aa(35757)).mo56389s("Source %s is missing a producer module and will not be included in the TaskGraph!", agVar.name());
        return Stream.CC.empty();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
