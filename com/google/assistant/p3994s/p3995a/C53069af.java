package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.af */
/* compiled from: PG */
public final class C53069af extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53069af f139071a;

    /* renamed from: b */
    private static volatile C63010eb f139072b;

    static {
        C53069af afVar = new C53069af();
        f139071a = afVar;
        C62942bv.registerDefaultInstance(C53069af.class, afVar);
    }

    private C53069af() {
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
                return newMessageInfo(f139071a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53069af();
            case 4:
                return new C53068ae();
            case 5:
                return f139071a;
            case 6:
                C63010eb ebVar = f139072b;
                if (ebVar == null) {
                    synchronized (C53069af.class) {
                        ebVar = f139072b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139071a);
                            f139072b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
