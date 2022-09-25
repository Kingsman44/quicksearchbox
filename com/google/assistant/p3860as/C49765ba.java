package com.google.assistant.p3860as;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.as.ba */
/* compiled from: PG */
public final class C49765ba extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C49765ba f128504a;

    /* renamed from: b */
    private static volatile C63010eb f128505b;

    static {
        C49765ba baVar = new C49765ba();
        f128504a = baVar;
        C62942bv.registerDefaultInstance(C49765ba.class, baVar);
    }

    private C49765ba() {
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
                return newMessageInfo(f128504a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C49765ba();
            case 4:
                return new C49763az();
            case 5:
                return f128504a;
            case 6:
                C63010eb ebVar = f128505b;
                if (ebVar == null) {
                    synchronized (C49765ba.class) {
                        ebVar = f128505b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128504a);
                            f128505b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
