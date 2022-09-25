package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.jf */
/* compiled from: PG */
public final class C53312jf extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53312jf f139807a;

    /* renamed from: b */
    private static volatile C63010eb f139808b;

    static {
        C53312jf jfVar = new C53312jf();
        f139807a = jfVar;
        C62942bv.registerDefaultInstance(C53312jf.class, jfVar);
    }

    private C53312jf() {
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
                return newMessageInfo(f139807a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53312jf();
            case 4:
                return new C53311je();
            case 5:
                return f139807a;
            case 6:
                C63010eb ebVar = f139808b;
                if (ebVar == null) {
                    synchronized (C53312jf.class) {
                        ebVar = f139808b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139807a);
                            f139808b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
