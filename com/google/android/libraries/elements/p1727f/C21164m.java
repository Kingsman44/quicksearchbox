package com.google.android.libraries.elements.p1727f;

import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63041ff;
import com.google.protobuf.C63042fg;
import com.google.protos.youtube.elements.C66260r;
import com.google.protos.youtube.elements.p5166b.C66067aa;
import com.google.protos.youtube.elements.p5166b.C66068ab;
import com.google.protos.youtube.elements.p5166b.C66116u;
import com.google.protos.youtube.elements.p5166b.C66117v;
import com.google.protos.youtube.elements.p5166b.C66119x;
import com.google.protos.youtube.elements.p5166b.C66120y;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.elements.f.m */
/* compiled from: PG */
public final class C21164m extends C21259bb {

    /* renamed from: a */
    private final C69464a f59364a;

    public C21164m(C69464a aVar) {
        this.f59364a = aVar;
    }

    /* renamed from: a */
    public final void mo25782a(C66260r rVar, String str, C21319z zVar, Throwable th) {
        long currentTimeMillis = System.currentTimeMillis();
        C63041ff ffVar = (C63041ff) C63042fg.f170152c.createBuilder();
        ffVar.copyOnWrite();
        ((C63042fg) ffVar.instance).f170154a = currentTimeMillis / 1000;
        ffVar.copyOnWrite();
        ((C63042fg) ffVar.instance).f170155b = (int) ((currentTimeMillis % 1000) * 1000000);
        C63042fg fgVar = (C63042fg) ffVar.build();
        int i = rVar == C66260r.LOG_LEVEL_WARN ? 3 : 4;
        C66119x xVar = (C66119x) C66120y.f179806g.createBuilder();
        xVar.copyOnWrite();
        C66120y yVar = (C66120y) xVar.instance;
        yVar.f179811d = i - 1;
        yVar.f179808a |= 4;
        String name = rVar.name();
        xVar.copyOnWrite();
        C66120y yVar2 = (C66120y) xVar.instance;
        name.getClass();
        yVar2.f179808a |= 8;
        yVar2.f179812e = name;
        xVar.copyOnWrite();
        C66120y yVar3 = (C66120y) xVar.instance;
        str.getClass();
        yVar3.f179808a |= 1;
        yVar3.f179809b = str;
        xVar.copyOnWrite();
        C66120y yVar4 = (C66120y) xVar.instance;
        fgVar.getClass();
        yVar4.f179810c = fgVar;
        yVar4.f179808a |= 2;
        if (th != null) {
            String str2 = str + "\n" + th.toString();
            xVar.copyOnWrite();
            C66120y yVar5 = (C66120y) xVar.instance;
            yVar5.f179808a |= 1;
            yVar5.f179809b = str2;
            C66067aa aaVar = (C66067aa) C66068ab.f179665b.createBuilder();
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                C66116u uVar = (C66116u) C66117v.f179799e.createBuilder();
                String str3 = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
                uVar.copyOnWrite();
                C66117v vVar = (C66117v) uVar.instance;
                vVar.f179801a |= 1;
                vVar.f179802b = str3;
                int lineNumber = stackTraceElement.getLineNumber();
                if (lineNumber >= 0) {
                    uVar.copyOnWrite();
                    C66117v vVar2 = (C66117v) uVar.instance;
                    vVar2.f179801a |= 4;
                    vVar2.f179804d = (long) lineNumber;
                }
                String fileName = stackTraceElement.getFileName();
                if (fileName != null) {
                    uVar.copyOnWrite();
                    C66117v vVar3 = (C66117v) uVar.instance;
                    vVar3.f179801a |= 2;
                    vVar3.f179803c = fileName;
                }
                C66117v vVar4 = (C66117v) uVar.build();
                aaVar.copyOnWrite();
                C66068ab abVar = (C66068ab) aaVar.instance;
                vVar4.getClass();
                C62971cq cqVar = abVar.f179667a;
                if (!cqVar.mo58948c()) {
                    abVar.f179667a = C62942bv.mutableCopy(cqVar);
                }
                abVar.f179667a.add(vVar4);
            }
            C66068ab abVar2 = (C66068ab) aaVar.build();
            xVar.copyOnWrite();
            C66120y yVar6 = (C66120y) xVar.instance;
            abVar2.getClass();
            yVar6.f179813f = abVar2;
            yVar6.f179808a |= 16;
        }
        ((DebuggerClient) this.f59364a.mo17428b()).sendLog(((C66120y) xVar.build()).toByteArray());
        if (th != null && th.getCause() != null) {
            mo25782a(rVar, "Caused by:", zVar, th.getCause());
        }
    }
}
