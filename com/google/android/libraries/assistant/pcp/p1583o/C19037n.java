package com.google.android.libraries.assistant.pcp.p1583o;

import com.google.assistant.p3803ag.p3809c.C49019dl;
import com.google.assistant.p3803ag.p3809c.C49116ha;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.pcp.o.n */
/* compiled from: PG */
public final /* synthetic */ class C19037n implements Function {

    /* renamed from: a */
    public final /* synthetic */ C49019dl f53423a;

    public /* synthetic */ C19037n(C49019dl dlVar) {
        this.f53423a = dlVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C49019dl dlVar = (C49019dl) obj;
        C49116ha haVar = this.f53423a.f126797d;
        if (haVar == null) {
            haVar = C49116ha.f127027d;
        }
        C63042fg fgVar = haVar.f127031c;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        C49116ha haVar2 = dlVar.f126797d;
        if (haVar2 == null) {
            haVar2 = C49116ha.f127027d;
        }
        C63042fg fgVar2 = haVar2.f127031c;
        if (fgVar2 == null) {
            fgVar2 = C63042fg.f170152c;
        }
        int a = C62953e.m95476a(fgVar, fgVar2);
        if (a < 0) {
            return C19040q.OBSOLETE;
        }
        return a == 0 ? C19040q.EQUAL : C19040q.NEWER;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
