package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.jf */
/* compiled from: PG */
public final class C50064jf extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C50064jf f130160a;

    /* renamed from: b */
    private static volatile C63010eb f130161b;

    static {
        C50064jf jfVar = new C50064jf();
        f130160a = jfVar;
        C62942bv.registerDefaultInstance(C50064jf.class, jfVar);
    }

    private C50064jf() {
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
                return newMessageInfo(f130160a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C50064jf();
            case 4:
                return new C50063je();
            case 5:
                return f130160a;
            case 6:
                C63010eb ebVar = f130161b;
                if (ebVar == null) {
                    synchronized (C50064jf.class) {
                        ebVar = f130161b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130160a);
                            f130161b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
