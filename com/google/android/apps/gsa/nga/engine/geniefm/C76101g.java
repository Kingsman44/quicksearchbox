package com.google.android.apps.gsa.nga.engine.geniefm;

import com.google.android.apps.gsa.nga.engine.ar.cu;
import com.google.android.libraries.mdi.C29690f;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.geniefm.g */
/* compiled from: PG */
public final /* synthetic */ class C76101g implements Function {

    /* renamed from: a */
    public final /* synthetic */ C76103i f210986a;

    public /* synthetic */ C76101g(C76103i iVar) {
        this.f210986a = iVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C29690f fVar = (C29690f) obj;
        return this.f210986a.f210995g.a(cu.a(fVar), fVar.f80414e);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
