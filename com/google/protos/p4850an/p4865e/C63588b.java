package com.google.protos.p4850an.p4865e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.e.b */
/* compiled from: PG */
public final class C63588b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63588b f172001a;

    /* renamed from: b */
    private static volatile C63010eb f172002b;

    static {
        C63588b bVar = new C63588b();
        f172001a = bVar;
        C62942bv.registerDefaultInstance(C63588b.class, bVar);
    }

    private C63588b() {
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
                return newMessageInfo(f172001a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C63588b();
            case 4:
                return new C63587a();
            case 5:
                return f172001a;
            case 6:
                C63010eb ebVar = f172002b;
                if (ebVar == null) {
                    synchronized (C63588b.class) {
                        ebVar = f172002b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172001a);
                            f172002b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
