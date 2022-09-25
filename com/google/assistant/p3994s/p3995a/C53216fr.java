package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.fr */
/* compiled from: PG */
public final class C53216fr extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53216fr f139479a;

    /* renamed from: b */
    private static volatile C63010eb f139480b;

    static {
        C53216fr frVar = new C53216fr();
        f139479a = frVar;
        C62942bv.registerDefaultInstance(C53216fr.class, frVar);
    }

    private C53216fr() {
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
                return newMessageInfo(f139479a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53216fr();
            case 4:
                return new C53215fq();
            case 5:
                return f139479a;
            case 6:
                C63010eb ebVar = f139480b;
                if (ebVar == null) {
                    synchronized (C53216fr.class) {
                        ebVar = f139480b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139479a);
                            f139480b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
