package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.ho */
/* compiled from: PG */
public final class C53267ho extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53267ho f139638b;

    /* renamed from: c */
    private static volatile C63010eb f139639c;

    /* renamed from: a */
    public C62971cq f139640a = emptyProtobufList();

    static {
        C53267ho hoVar = new C53267ho();
        f139638b = hoVar;
        C62942bv.registerDefaultInstance(C53267ho.class, hoVar);
    }

    private C53267ho() {
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
                return newMessageInfo(f139638b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C53265hm.class});
            case 3:
                return new C53267ho();
            case 4:
                return new C53266hn();
            case 5:
                return f139638b;
            case 6:
                C63010eb ebVar = f139639c;
                if (ebVar == null) {
                    synchronized (C53267ho.class) {
                        ebVar = f139639c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139638b);
                            f139639c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
