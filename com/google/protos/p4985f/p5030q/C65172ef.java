package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.ef */
/* compiled from: PG */
public final class C65172ef extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65172ef f176375a;

    /* renamed from: b */
    private static volatile C63010eb f176376b;

    static {
        C65172ef efVar = new C65172ef();
        f176375a = efVar;
        C62942bv.registerDefaultInstance(C65172ef.class, efVar);
    }

    private C65172ef() {
        emptyProtobufList();
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
                return newMessageInfo(f176375a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C65172ef();
            case 4:
                return new C65171ee();
            case 5:
                return f176375a;
            case 6:
                C63010eb ebVar = f176376b;
                if (ebVar == null) {
                    synchronized (C65172ef.class) {
                        ebVar = f176376b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176375a);
                            f176376b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
