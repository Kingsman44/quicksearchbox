package com.google.android.libraries.assistant.pcp.p1541b;

import com.google.android.libraries.assistant.pcp.C18777i;
import com.google.android.libraries.assistant.pcp.p1546d.C18577e;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.pcp.b.r */
/* compiled from: PG */
public final /* synthetic */ class C18547r implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C63042fg f52551a;

    /* renamed from: b */
    public final /* synthetic */ C18777i f52552b;

    public /* synthetic */ C18547r(C63042fg fgVar, C18777i iVar) {
        this.f52551a = fgVar;
        this.f52552b = iVar;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        C63042fg fgVar = this.f52551a;
        C18577e eVar = (C18577e) obj;
        int b = this.f52552b.mo24043b();
        int i = b - 1;
        if (b == 0) {
            throw null;
        } else if (i == 0) {
            return false;
        } else {
            if (i != 1) {
                if (i == 2) {
                    return false;
                }
                if (i == 3) {
                    return true;
                }
                throw new AssertionError();
            } else if (eVar.mo24065c().isEmpty()) {
                return true;
            } else {
                C63042fg fgVar2 = (C63042fg) eVar.mo24065c().get();
                C62910ar arVar = eVar.mo24064b().f126852b;
                if (arVar == null) {
                    arVar = C62910ar.f169858c;
                }
                if (C62953e.m95476a(C62953e.m95481f(fgVar2, arVar), fgVar) <= 0) {
                    return true;
                }
                return false;
            }
        }
    }
}
