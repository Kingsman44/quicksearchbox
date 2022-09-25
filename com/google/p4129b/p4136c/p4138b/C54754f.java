package com.google.p4129b.p4136c.p4138b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63037fb;

/* renamed from: com.google.b.c.b.f */
/* compiled from: PG */
public final class C54754f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54754f f143668a;

    /* renamed from: c */
    private static volatile C63010eb f143669c;

    /* renamed from: b */
    private C63037fb f143670b;

    static {
        C54754f fVar = new C54754f();
        f143668a = fVar;
        C62942bv.registerDefaultInstance(C54754f.class, fVar);
    }

    private C54754f() {
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
                return newMessageInfo(f143668a, "\u0000\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0000\u0000\u0004\t", new Object[]{"b"});
            case 3:
                return new C54754f();
            case 4:
                return new C54753e();
            case 5:
                return f143668a;
            case 6:
                C63010eb ebVar = f143669c;
                if (ebVar == null) {
                    synchronized (C54754f.class) {
                        ebVar = f143669c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143668a);
                            f143669c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
