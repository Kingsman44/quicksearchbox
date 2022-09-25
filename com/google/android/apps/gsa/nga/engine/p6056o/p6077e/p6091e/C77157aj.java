package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.android.apps.gsa.nga.engine.am.c.a.q;
import com.google.android.apps.gsa.nga.engine.p5913am.p5917c.C74886bd;
import com.google.assistant.p3897e.p3917i.p3918a.C51446i;
import com.google.assistant.p3897e.p3917i.p3918a.C51473j;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.aj */
/* compiled from: PG */
public final /* synthetic */ class C77157aj implements Function {

    /* renamed from: a */
    public final /* synthetic */ C77160am f212931a;

    /* renamed from: b */
    public final /* synthetic */ C74886bd f212932b;

    public /* synthetic */ C77157aj(C77160am amVar, C74886bd bdVar) {
        this.f212931a = amVar;
        this.f212932b = bdVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C77160am amVar = this.f212931a;
        C51446i iVar = (C51446i) obj;
        if (this.f212932b.mo71267f()) {
            String uri = q.a.buildUpon().appendPath(amVar.f212937c.b.mo75083a().toString()).build().toString();
            iVar.copyOnWrite();
            C51473j jVar = (C51473j) iVar.instance;
            C51473j jVar2 = C51473j.f134090i;
            uri.getClass();
            jVar.f134092a |= 1;
            jVar.f134095d = uri;
        }
        return iVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
