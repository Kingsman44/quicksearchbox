package com.google.common.p4552o.p4568n;

import com.google.common.p4552o.p4566l.C60111ac;
import com.google.common.p4552o.p4566l.C60112ad;
import com.google.common.p4552o.p4566l.C60113ae;
import com.google.common.p4552o.p4566l.C60114af;
import com.google.common.p4552o.p4566l.C60115ag;
import com.google.common.p4552o.p4566l.C60118aj;
import com.google.common.p4552o.p4566l.C60119ak;
import com.google.common.p4552o.p4566l.C60120al;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.common.o.n.a */
/* compiled from: PG */
public final class C60287a {
    /* renamed from: a */
    public static C60118aj m92558a(Throwable th) {
        C60118aj ajVar = (C60118aj) C60119ak.f162585e.createBuilder();
        C60111ac c = m92560c(th, true);
        ajVar.copyOnWrite();
        C60119ak akVar = (C60119ak) ajVar.instance;
        C60114af afVar = (C60114af) c.build();
        afVar.getClass();
        akVar.f162588b = afVar;
        akVar.f162587a |= 1;
        return ajVar;
    }

    /* renamed from: b */
    public static C60115ag m92559b(Throwable th) {
        C60115ag agVar = (C60115ag) C60120al.f162592f.createBuilder();
        C60111ac c = m92560c(th, false);
        agVar.copyOnWrite();
        C60120al alVar = (C60120al) agVar.instance;
        C60114af afVar = (C60114af) c.build();
        afVar.getClass();
        alVar.f162597d = afVar;
        alVar.f162594a |= 1;
        while (true) {
            th = th.getCause();
            if (th == null) {
                return agVar;
            }
            C60111ac c2 = m92560c(th, false);
            agVar.copyOnWrite();
            C60120al alVar2 = (C60120al) agVar.instance;
            C60114af afVar2 = (C60114af) c2.build();
            afVar2.getClass();
            alVar2.mo57069a();
            alVar2.f162598e.add(afVar2);
        }
    }

    /* renamed from: c */
    private static C60111ac m92560c(Throwable th, boolean z) {
        StackTraceElement[] stackTraceElementArr;
        C60111ac acVar = (C60111ac) C60114af.f162573f.createBuilder();
        String name = th.getClass().getName();
        acVar.copyOnWrite();
        C60114af afVar = (C60114af) acVar.instance;
        name.getClass();
        afVar.f162575a |= 1;
        afVar.f162576b = name;
        if (z && th.getMessage() != null) {
            String message = th.getMessage();
            acVar.copyOnWrite();
            C60114af afVar2 = (C60114af) acVar.instance;
            message.getClass();
            afVar2.f162575a |= 2;
            afVar2.f162577c = message;
        }
        try {
            stackTraceElementArr = th.getStackTrace();
        } catch (NullPointerException unused) {
            stackTraceElementArr = null;
        }
        if (stackTraceElementArr != null) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                C60112ad adVar = (C60112ad) C60113ae.f162565f.createBuilder();
                if (stackTraceElement != null) {
                    String className = stackTraceElement.getClassName();
                    adVar.copyOnWrite();
                    C60113ae aeVar = (C60113ae) adVar.instance;
                    className.getClass();
                    aeVar.f162567a |= 1;
                    aeVar.f162568b = className;
                    String methodName = stackTraceElement.getMethodName();
                    adVar.copyOnWrite();
                    C60113ae aeVar2 = (C60113ae) adVar.instance;
                    methodName.getClass();
                    aeVar2.f162567a |= 2;
                    aeVar2.f162569c = methodName;
                    int lineNumber = stackTraceElement.getLineNumber();
                    adVar.copyOnWrite();
                    C60113ae aeVar3 = (C60113ae) adVar.instance;
                    aeVar3.f162567a |= 8;
                    aeVar3.f162571e = lineNumber;
                    if (stackTraceElement.getFileName() != null) {
                        String fileName = stackTraceElement.getFileName();
                        adVar.copyOnWrite();
                        C60113ae aeVar4 = (C60113ae) adVar.instance;
                        fileName.getClass();
                        aeVar4.f162567a |= 4;
                        aeVar4.f162570d = fileName;
                    }
                }
                acVar.copyOnWrite();
                C60114af afVar3 = (C60114af) acVar.instance;
                C60113ae aeVar5 = (C60113ae) adVar.build();
                aeVar5.getClass();
                C62971cq cqVar = afVar3.f162579e;
                if (!cqVar.mo58948c()) {
                    afVar3.f162579e = C62942bv.mutableCopy(cqVar);
                }
                afVar3.f162579e.add(aeVar5);
            }
        }
        return acVar;
    }
}
