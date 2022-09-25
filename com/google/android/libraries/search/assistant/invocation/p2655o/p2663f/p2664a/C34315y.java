package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.a.y */
/* compiled from: PG */
public final class C34315y extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C34315y f91249a;

    /* renamed from: b */
    private static volatile C63010eb f91250b;

    static {
        C34315y yVar = new C34315y();
        f91249a = yVar;
        C62942bv.registerDefaultInstance(C34315y.class, yVar);
    }

    private C34315y() {
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
                return newMessageInfo(f91249a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C34315y();
            case 4:
                return new C34314x();
            case 5:
                return f91249a;
            case 6:
                C63010eb ebVar = f91250b;
                if (ebVar == null) {
                    synchronized (C34315y.class) {
                        ebVar = f91250b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f91249a);
                            f91250b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
