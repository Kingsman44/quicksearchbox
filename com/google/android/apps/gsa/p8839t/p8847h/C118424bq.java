package com.google.android.apps.gsa.p8839t.p8847h;

import android.content.ComponentName;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58837ba;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.t.h.bq */
/* compiled from: PG */
public final /* synthetic */ class C118424bq implements Function {

    /* renamed from: a */
    public final /* synthetic */ C118426bs f328676a;

    /* renamed from: b */
    public final /* synthetic */ C53306j f328677b;

    public /* synthetic */ C118424bq(C118426bs bsVar, C53306j jVar) {
        this.f328676a = bsVar;
        this.f328677b = jVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C118426bs bsVar = this.f328676a;
        ComponentName componentName = (ComponentName) obj;
        return bsVar.f328689j.mo76930e(C58837ba.m90858g(componentName.getPackageName()), C58837ba.m90858g(componentName.getClassName()), this.f328677b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
