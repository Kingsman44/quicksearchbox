package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.io */
/* compiled from: PG */
public final class C50046io extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C50046io f130119a;

    /* renamed from: b */
    private static volatile C63010eb f130120b;

    static {
        C50046io ioVar = new C50046io();
        f130119a = ioVar;
        C62942bv.registerDefaultInstance(C50046io.class, ioVar);
    }

    private C50046io() {
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
                return newMessageInfo(f130119a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C50046io();
            case 4:
                return new C50045in();
            case 5:
                return f130119a;
            case 6:
                C63010eb ebVar = f130120b;
                if (ebVar == null) {
                    synchronized (C50046io.class) {
                        ebVar = f130120b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130119a);
                            f130120b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
