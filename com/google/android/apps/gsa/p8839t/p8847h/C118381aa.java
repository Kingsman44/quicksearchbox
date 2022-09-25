package com.google.android.apps.gsa.p8839t.p8847h;

import android.content.ComponentName;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58837ba;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.t.h.aa */
/* compiled from: PG */
public final /* synthetic */ class C118381aa implements Function {

    /* renamed from: a */
    public final /* synthetic */ C118426bs f328602a;

    /* renamed from: b */
    public final /* synthetic */ C53306j f328603b;

    public /* synthetic */ C118381aa(C118426bs bsVar, C53306j jVar) {
        this.f328602a = bsVar;
        this.f328603b = jVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C118426bs bsVar = this.f328602a;
        ComponentName componentName = (ComponentName) obj;
        return bsVar.f328689j.mo76930e(C58837ba.m90858g(componentName.getPackageName()), C58837ba.m90858g(componentName.getClassName()), this.f328603b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
