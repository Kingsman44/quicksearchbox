package com.google.assistant.p3838ao.p3839a.p3845e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ao.a.e.ck */
/* compiled from: PG */
public final class C49581ck extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C49581ck f127939a;

    /* renamed from: b */
    private static volatile C63010eb f127940b;

    static {
        C49581ck ckVar = new C49581ck();
        f127939a = ckVar;
        C62942bv.registerDefaultInstance(C49581ck.class, ckVar);
    }

    private C49581ck() {
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
                return newMessageInfo(f127939a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C49581ck();
            case 4:
                return new C49580cj();
            case 5:
                return f127939a;
            case 6:
                C63010eb ebVar = f127940b;
                if (ebVar == null) {
                    synchronized (C49581ck.class) {
                        ebVar = f127940b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127939a);
                            f127940b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
