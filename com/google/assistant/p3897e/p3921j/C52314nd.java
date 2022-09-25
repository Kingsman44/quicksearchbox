package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.nd */
/* compiled from: PG */
public final class C52314nd extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52314nd f137316a;

    /* renamed from: b */
    private static volatile C63010eb f137317b;

    static {
        C52314nd ndVar = new C52314nd();
        f137316a = ndVar;
        C62942bv.registerDefaultInstance(C52314nd.class, ndVar);
    }

    private C52314nd() {
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
                return newMessageInfo(f137316a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C52314nd();
            case 4:
                return new C52313nc();
            case 5:
                return f137316a;
            case 6:
                C63010eb ebVar = f137317b;
                if (ebVar == null) {
                    synchronized (C52314nd.class) {
                        ebVar = f137317b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137316a);
                            f137317b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
