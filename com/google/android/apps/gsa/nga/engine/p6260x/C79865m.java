package com.google.android.apps.gsa.nga.engine.p6260x;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82816bm;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82817bn;
import com.google.common.base.C58837ba;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.m */
/* compiled from: PG */
public final /* synthetic */ class C79865m implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C79865m f218930a = new C79865m();

    private /* synthetic */ C79865m() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        StackTraceElement stackTraceElement = (StackTraceElement) obj;
        C79877y yVar = C79878z.f218943a;
        C82816bm bmVar = (C82816bm) C82817bn.f225668e.createBuilder();
        String g = C58837ba.m90858g(stackTraceElement.getFileName());
        bmVar.copyOnWrite();
        ((C82817bn) bmVar.instance).f225670a = g;
        String className = stackTraceElement.getClassName();
        bmVar.copyOnWrite();
        ((C82817bn) bmVar.instance).f225671b = C58837ba.m90858g(className);
        String methodName = stackTraceElement.getMethodName();
        bmVar.copyOnWrite();
        ((C82817bn) bmVar.instance).f225672c = C58837ba.m90858g(methodName);
        int lineNumber = stackTraceElement.getLineNumber();
        bmVar.copyOnWrite();
        ((C82817bn) bmVar.instance).f225673d = lineNumber;
        return (C82817bn) bmVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
