package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.cu */
/* compiled from: PG */
public final class C37472cu extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C37472cu f99467a;

    /* renamed from: b */
    private static volatile C63010eb f99468b;

    static {
        C37472cu cuVar = new C37472cu();
        f99467a = cuVar;
        C62942bv.registerDefaultInstance(C37472cu.class, cuVar);
    }

    private C37472cu() {
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
                return newMessageInfo(f99467a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C37472cu();
            case 4:
                return new C37471ct();
            case 5:
                return f99467a;
            case 6:
                C63010eb ebVar = f99468b;
                if (ebVar == null) {
                    synchronized (C37472cu.class) {
                        ebVar = f99468b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99467a);
                            f99468b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
