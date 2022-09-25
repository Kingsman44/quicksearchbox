package com.google.android.libraries.search.assistant.invocation.p2655o.p2656a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.a.ce */
/* compiled from: PG */
public final class C34069ce extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C34069ce f90782a;

    /* renamed from: b */
    private static volatile C63010eb f90783b;

    static {
        C34069ce ceVar = new C34069ce();
        f90782a = ceVar;
        C62942bv.registerDefaultInstance(C34069ce.class, ceVar);
    }

    private C34069ce() {
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
                return newMessageInfo(f90782a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C34069ce();
            case 4:
                return new C34068cd();
            case 5:
                return f90782a;
            case 6:
                C63010eb ebVar = f90783b;
                if (ebVar == null) {
                    synchronized (C34069ce.class) {
                        ebVar = f90783b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90782a);
                            f90783b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
