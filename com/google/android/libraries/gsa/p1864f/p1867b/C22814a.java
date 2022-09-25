package com.google.android.libraries.gsa.p1864f.p1867b;

import com.google.common.base.C58887cx;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4552o.C59752ei;
import com.google.common.p4552o.C59753ej;
import com.google.common.p4552o.C59754ek;
import com.google.common.p4552o.C59755el;
import com.google.common.p4552o.C59756em;
import com.google.common.p4552o.C59757en;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.gsa.f.b.a */
/* compiled from: PG */
public final class C22814a {
    /* renamed from: a */
    public static C59753ej m42629a(int i, Throwable th) {
        C59752ei eiVar = (C59752ei) C59753ej.f161449e.createBuilder();
        eiVar.copyOnWrite();
        C59753ej ejVar = (C59753ej) eiVar.instance;
        ejVar.f161451a |= 1;
        ejVar.f161452b = i;
        return m42630b(eiVar, th, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    /* renamed from: b */
    public static C59753ej m42630b(C59752ei eiVar, Throwable th, int i, int i2) {
        if (th != null) {
            for (Throwable th2 : C58557jl.m90125f(C58887cx.m90978e(th), i)) {
                C59754ek ekVar = (C59754ek) C59755el.f161455d.createBuilder();
                StackTraceElement[] stackTrace = th2.getStackTrace();
                ekVar.copyOnWrite();
                ((C59755el) ekVar.instance).f161459c = C59755el.emptyProtobufList();
                for (StackTraceElement stackTraceElement : C58557jl.m90125f(Arrays.asList(stackTrace), i2)) {
                    C59756em emVar = (C59756em) C59757en.f161460f.createBuilder();
                    String className = stackTraceElement.getClassName();
                    emVar.copyOnWrite();
                    C59757en enVar = (C59757en) emVar.instance;
                    className.getClass();
                    enVar.f161462a |= 1;
                    enVar.f161463b = className;
                    String fileName = stackTraceElement.getFileName();
                    if (fileName != null) {
                        emVar.copyOnWrite();
                        C59757en enVar2 = (C59757en) emVar.instance;
                        enVar2.f161462a |= 4;
                        enVar2.f161465d = fileName;
                    }
                    String methodName = stackTraceElement.getMethodName();
                    if (methodName != null) {
                        emVar.copyOnWrite();
                        C59757en enVar3 = (C59757en) emVar.instance;
                        enVar3.f161462a |= 2;
                        enVar3.f161464c = methodName;
                    }
                    int lineNumber = stackTraceElement.getLineNumber();
                    emVar.copyOnWrite();
                    C59757en enVar4 = (C59757en) emVar.instance;
                    enVar4.f161462a |= 8;
                    enVar4.f161466e = lineNumber;
                    ekVar.copyOnWrite();
                    C59755el elVar = (C59755el) ekVar.instance;
                    C59757en enVar5 = (C59757en) emVar.build();
                    enVar5.getClass();
                    elVar.mo57055a();
                    elVar.f161459c.add(enVar5);
                }
                String canonicalName = th2.getClass().getCanonicalName();
                if (canonicalName != null) {
                    ekVar.copyOnWrite();
                    C59755el elVar2 = (C59755el) ekVar.instance;
                    elVar2.f161457a |= 1;
                    elVar2.f161458b = canonicalName;
                }
                C59755el elVar3 = (C59755el) ekVar.build();
                eiVar.copyOnWrite();
                C59753ej ejVar = (C59753ej) eiVar.instance;
                C59753ej ejVar2 = C59753ej.f161449e;
                elVar3.getClass();
                ejVar.mo57054a();
                ejVar.f161453c.add(elVar3);
            }
        }
        return (C59753ej) eiVar.build();
    }
}
