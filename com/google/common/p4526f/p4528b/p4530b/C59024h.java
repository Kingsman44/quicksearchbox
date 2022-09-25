package com.google.common.p4526f.p4528b.p4530b;

import com.google.common.p4526f.C59090j;
import com.google.common.p4526f.p4528b.C59031f;
import com.google.common.p4526f.p4528b.C59037l;
import java.util.logging.Level;

/* renamed from: com.google.common.f.b.b.h */
/* compiled from: PG */
public final class C59024h extends C59019c {
    public C59024h(C59031f fVar, C59037l lVar) {
        super(fVar, lVar);
        setThrown((Throwable) this.f156931a.mo56272b(C59090j.f157047a));
        getMessage();
    }

    public C59024h(RuntimeException runtimeException, C59031f fVar, C59037l lVar) {
        super(fVar, lVar);
        Level level;
        if (fVar.mo56309l().intValue() < Level.WARNING.intValue()) {
            level = Level.WARNING;
        } else {
            level = fVar.mo56309l();
        }
        setLevel(level);
        setThrown(runtimeException);
        StringBuilder sb = new StringBuilder("LOGGING ERROR: ");
        sb.append(runtimeException.getMessage());
        sb.append(10);
        C59019c.m91248a(fVar, sb);
        setMessage(sb.toString());
    }
}
