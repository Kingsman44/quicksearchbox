package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.gw */
/* compiled from: PG */
public final class C66987gw extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66987gw f182085b;

    /* renamed from: c */
    private static volatile C63010eb f182086c;

    /* renamed from: a */
    public C62971cq f182087a = C62942bv.emptyProtobufList();

    static {
        C66987gw gwVar = new C66987gw();
        f182085b = gwVar;
        C62942bv.registerDefaultInstance(C66987gw.class, gwVar);
    }

    private C66987gw() {
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
                return newMessageInfo(f182085b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C66987gw();
            case 4:
                return new C66986gv();
            case 5:
                return f182085b;
            case 6:
                C63010eb ebVar = f182086c;
                if (ebVar == null) {
                    synchronized (C66987gw.class) {
                        ebVar = f182086c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182085b);
                            f182086c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
