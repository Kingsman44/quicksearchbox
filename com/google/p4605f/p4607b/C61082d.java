package com.google.p4605f.p4607b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.f.b.d */
/* compiled from: PG */
public final class C61082d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C61082d f165368a;

    /* renamed from: b */
    private static volatile C63010eb f165369b;

    static {
        C61082d dVar = new C61082d();
        f165368a = dVar;
        C62942bv.registerDefaultInstance(C61082d.class, dVar);
    }

    private C61082d() {
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
                return newMessageInfo(f165368a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C61082d();
            case 4:
                return new C61081c();
            case 5:
                return f165368a;
            case 6:
                C63010eb ebVar = f165369b;
                if (ebVar == null) {
                    synchronized (C61082d.class) {
                        ebVar = f165369b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f165368a);
                            f165369b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
