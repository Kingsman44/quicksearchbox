package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.fl */
/* compiled from: PG */
public final class C53210fl extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53210fl f139465a;

    /* renamed from: b */
    private static volatile C63010eb f139466b;

    static {
        C53210fl flVar = new C53210fl();
        f139465a = flVar;
        C62942bv.registerDefaultInstance(C53210fl.class, flVar);
    }

    private C53210fl() {
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
                return newMessageInfo(f139465a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53210fl();
            case 4:
                return new C53209fk();
            case 5:
                return f139465a;
            case 6:
                C63010eb ebVar = f139466b;
                if (ebVar == null) {
                    synchronized (C53210fl.class) {
                        ebVar = f139466b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139465a);
                            f139466b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
