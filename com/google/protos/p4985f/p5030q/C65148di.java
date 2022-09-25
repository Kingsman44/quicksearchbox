package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.di */
/* compiled from: PG */
public final class C65148di extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65148di f176322a;

    /* renamed from: b */
    private static volatile C63010eb f176323b;

    static {
        C65148di diVar = new C65148di();
        f176322a = diVar;
        C62942bv.registerDefaultInstance(C65148di.class, diVar);
    }

    private C65148di() {
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
                return newMessageInfo(f176322a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65148di();
            case 4:
                return new C65147dh();
            case 5:
                return f176322a;
            case 6:
                C63010eb ebVar = f176323b;
                if (ebVar == null) {
                    synchronized (C65148di.class) {
                        ebVar = f176323b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176322a);
                            f176323b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
