package com.google.assistant.p3803ag.p3809c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.ay */
/* compiled from: PG */
public final class C48951ay extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48951ay f126654b;

    /* renamed from: c */
    private static volatile C63010eb f126655c;

    /* renamed from: a */
    public C62971cq f126656a = emptyProtobufList();

    static {
        C48951ay ayVar = new C48951ay();
        f126654b = ayVar;
        C62942bv.registerDefaultInstance(C48951ay.class, ayVar);
    }

    private C48951ay() {
    }

    /* renamed from: a */
    public final void mo53203a() {
        C62971cq cqVar = this.f126656a;
        if (!cqVar.mo58948c()) {
            this.f126656a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f126654b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C48952az.class});
            case 3:
                return new C48951ay();
            case 4:
                return new C48950ax();
            case 5:
                return f126654b;
            case 6:
                C63010eb ebVar = f126655c;
                if (ebVar == null) {
                    synchronized (C48951ay.class) {
                        ebVar = f126655c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126654b);
                            f126655c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
