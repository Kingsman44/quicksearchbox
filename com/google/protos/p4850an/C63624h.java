package com.google.protos.p4850an;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4883as.p4884a.C63775d;

/* renamed from: com.google.protos.an.h */
/* compiled from: PG */
public final class C63624h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63624h f172070b;

    /* renamed from: c */
    private static volatile C63010eb f172071c;

    /* renamed from: a */
    public C62971cq f172072a = emptyProtobufList();

    static {
        C63624h hVar = new C63624h();
        f172070b = hVar;
        C62942bv.registerDefaultInstance(C63624h.class, hVar);
    }

    private C63624h() {
    }

    /* renamed from: a */
    public final void mo59222a() {
        C62971cq cqVar = this.f172072a;
        if (!cqVar.mo58948c()) {
            this.f172072a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f172070b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C63775d.class});
            case 3:
                return new C63624h();
            case 4:
                return new C63618g();
            case 5:
                return f172070b;
            case 6:
                C63010eb ebVar = f172071c;
                if (ebVar == null) {
                    synchronized (C63624h.class) {
                        ebVar = f172071c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172070b);
                            f172071c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
