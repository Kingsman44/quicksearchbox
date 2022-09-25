package com.google.android.apps.gsa.staticplugins.opa.ambient.p8276j.p8277a;

import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.assistant.p3886c.C50701am;
import com.google.assistant.p3886c.C50738bc;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.j.a.t */
/* compiled from: PG */
public final /* synthetic */ class C107117t implements Function {

    /* renamed from: a */
    public final /* synthetic */ C107097an f298193a;

    public /* synthetic */ C107117t(C107097an anVar) {
        this.f298193a = anVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C107097an anVar = this.f298193a;
        C50738bc bcVar = (C50738bc) obj;
        C58970a aVar = (C58970a) ((C58970a) anVar.f298159c.mo56224b()).mo56372aa(23502);
        String str = bcVar.f132037d;
        C50701am a = C50701am.m85887a(bcVar.f132040g);
        if (a == null) {
            a = C50701am.UNKNOWN;
        }
        aVar.mo56359L("sending chip: %s, %s, %s", str, a.name(), bcVar.f132038e);
        C60870cx g = anVar.f298160d.mo77125g(bcVar);
        C80905at.m128763g(g, new C107087ad(anVar, bcVar));
        return g;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
