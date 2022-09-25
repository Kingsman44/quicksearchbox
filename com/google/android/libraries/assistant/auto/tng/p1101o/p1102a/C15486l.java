package com.google.android.libraries.assistant.auto.tng.p1101o.p1102a;

import com.google.common.p4552o.C59756em;
import com.google.common.p4552o.C59757en;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.o.a.l */
/* compiled from: PG */
public final /* synthetic */ class C15486l implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C15486l f46433a = new C15486l();

    private /* synthetic */ C15486l() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        StackTraceElement stackTraceElement = (StackTraceElement) obj;
        C59756em emVar = (C59756em) C59757en.f161460f.createBuilder();
        int lineNumber = stackTraceElement.getLineNumber();
        emVar.copyOnWrite();
        C59757en enVar = (C59757en) emVar.instance;
        enVar.f161462a |= 8;
        enVar.f161466e = lineNumber;
        String className = stackTraceElement.getClassName();
        if (className != null) {
            emVar.copyOnWrite();
            C59757en enVar2 = (C59757en) emVar.instance;
            enVar2.f161462a |= 1;
            enVar2.f161463b = className;
        }
        String methodName = stackTraceElement.getMethodName();
        if (methodName != null) {
            emVar.copyOnWrite();
            C59757en enVar3 = (C59757en) emVar.instance;
            enVar3.f161462a |= 2;
            enVar3.f161464c = methodName;
        }
        String fileName = stackTraceElement.getFileName();
        if (fileName != null) {
            emVar.copyOnWrite();
            C59757en enVar4 = (C59757en) emVar.instance;
            enVar4.f161462a |= 4;
            enVar4.f161465d = fileName;
        }
        return (C59757en) emVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
