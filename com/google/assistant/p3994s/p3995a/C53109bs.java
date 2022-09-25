package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.bs */
/* compiled from: PG */
public final class C53109bs extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53109bs f139176a;

    /* renamed from: b */
    private static volatile C63010eb f139177b;

    static {
        C53109bs bsVar = new C53109bs();
        f139176a = bsVar;
        C62942bv.registerDefaultInstance(C53109bs.class, bsVar);
    }

    private C53109bs() {
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
                return newMessageInfo(f139176a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53109bs();
            case 4:
                return new C53108br();
            case 5:
                return f139176a;
            case 6:
                C63010eb ebVar = f139177b;
                if (ebVar == null) {
                    synchronized (C53109bs.class) {
                        ebVar = f139177b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139176a);
                            f139177b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
