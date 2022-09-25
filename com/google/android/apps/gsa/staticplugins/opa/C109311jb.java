package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.shared.p6976ag.p6980d.C89126b;
import com.google.android.apps.gsa.shared.p6976ag.p6980d.C89128d;
import com.google.assistant.p3745ab.C48305dd;
import com.google.assistant.p3897e.p3921j.p3926e.C51992gr;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.jb */
/* compiled from: PG */
public final /* synthetic */ class C109311jb implements Function {

    /* renamed from: a */
    public final /* synthetic */ C48305dd f304495a;

    public /* synthetic */ C109311jb(C48305dd ddVar) {
        this.f304495a = ddVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C48305dd ddVar = this.f304495a;
        C59071e eVar = C109317jh.f304501a;
        return C89128d.m144984d((C51992gr) obj, C89126b.CONVERSATION_STARTER, ddVar);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
