package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.ey */
/* compiled from: PG */
public final class C53196ey extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53196ey f139421a;

    /* renamed from: b */
    private static volatile C63010eb f139422b;

    static {
        C53196ey eyVar = new C53196ey();
        f139421a = eyVar;
        C62942bv.registerDefaultInstance(C53196ey.class, eyVar);
    }

    private C53196ey() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f139421a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53196ey();
            case 4:
                return new C53195ex();
            case 5:
                return f139421a;
            case 6:
                C63010eb ebVar = f139422b;
                if (ebVar == null) {
                    synchronized (C53196ey.class) {
                        ebVar = f139422b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139421a);
                            f139422b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
