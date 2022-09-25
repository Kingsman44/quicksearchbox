package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayDeque;
import p3186j$.util.function.Function;
import p3186j$.util.function.UnaryOperator;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.au */
/* compiled from: PG */
public final /* synthetic */ class C125963au implements UnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ C51809dy f347183a;

    public /* synthetic */ C125963au(C51809dy dyVar) {
        this.f347183a = dyVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C51809dy dyVar = this.f347183a;
        ArrayDeque arrayDeque = new ArrayDeque((C58485gu) obj);
        arrayDeque.addFirst(dyVar);
        while (arrayDeque.size() > 2) {
            arrayDeque.removeLast();
        }
        return C58485gu.m89842j(arrayDeque);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
