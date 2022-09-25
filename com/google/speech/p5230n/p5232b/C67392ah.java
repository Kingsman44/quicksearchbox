package com.google.speech.p5230n.p5232b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.n.b.ah */
/* compiled from: PG */
public final class C67392ah extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67392ah f183173a;

    /* renamed from: b */
    private static volatile C63010eb f183174b;

    static {
        C67392ah ahVar = new C67392ah();
        f183173a = ahVar;
        C62942bv.registerDefaultInstance(C67392ah.class, ahVar);
    }

    private C67392ah() {
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f183173a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C67392ah();
            case 4:
                return new C67391ag();
            case 5:
                return f183173a;
            case 6:
                C63010eb ebVar = f183174b;
                if (ebVar == null) {
                    synchronized (C67392ah.class) {
                        ebVar = f183174b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183173a);
                            f183174b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
