package com.google.protos.p5144u;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.u.b */
/* compiled from: PG */
public final class C65889b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65889b f179204a;

    /* renamed from: b */
    private static volatile C63010eb f179205b;

    static {
        C65889b bVar = new C65889b();
        f179204a = bVar;
        C62942bv.registerDefaultInstance(C65889b.class, bVar);
    }

    private C65889b() {
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
                return newMessageInfo(f179204a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65889b();
            case 4:
                return new C65888a();
            case 5:
                return f179204a;
            case 6:
                C63010eb ebVar = f179205b;
                if (ebVar == null) {
                    synchronized (C65889b.class) {
                        ebVar = f179205b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179204a);
                            f179205b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
