package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.ka */
/* compiled from: PG */
public final class C7790ka extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C7790ka f27251c;

    /* renamed from: d */
    private static volatile C63010eb f27252d;

    /* renamed from: a */
    public C62971cq f27253a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f27254b = emptyProtobufList();

    static {
        C7790ka kaVar = new C7790ka();
        f27251c = kaVar;
        C62942bv.registerDefaultInstance(C7790ka.class, kaVar);
    }

    private C7790ka() {
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
                return newMessageInfo(f27251c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", C7818lb.class, "b", C7818lb.class});
            case 3:
                return new C7790ka();
            case 4:
                return new C7788jz();
            case 5:
                return f27251c;
            case 6:
                C63010eb ebVar = f27252d;
                if (ebVar == null) {
                    synchronized (C7790ka.class) {
                        ebVar = f27252d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27251c);
                            f27252d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
