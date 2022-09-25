package com.google.p3717aq.p3718a.p3719a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.aq.a.a.d */
/* compiled from: PG */
public final class C47870d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C47870d f123943a;

    /* renamed from: b */
    private static volatile C63010eb f123944b;

    static {
        C47870d dVar = new C47870d();
        f123943a = dVar;
        C62942bv.registerDefaultInstance(C47870d.class, dVar);
    }

    private C47870d() {
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
                return newMessageInfo(f123943a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C47870d();
            case 4:
                return new C47869c();
            case 5:
                return f123943a;
            case 6:
                C63010eb ebVar = f123944b;
                if (ebVar == null) {
                    synchronized (C47870d.class) {
                        ebVar = f123944b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f123943a);
                            f123944b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
