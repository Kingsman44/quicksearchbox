package com.google.android.libraries.assistant.p1594s.p1597b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.s.b.ar */
/* compiled from: PG */
public final class C19157ar extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C19157ar f53652b;

    /* renamed from: c */
    private static volatile C63010eb f53653c;

    /* renamed from: a */
    public C62971cq f53654a = emptyProtobufList();

    static {
        C19157ar arVar = new C19157ar();
        f53652b = arVar;
        C62942bv.registerDefaultInstance(C19157ar.class, arVar);
    }

    private C19157ar() {
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
                return newMessageInfo(f53652b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C19156aq.class});
            case 3:
                return new C19157ar();
            case 4:
                return new C19154ao();
            case 5:
                return f53652b;
            case 6:
                C63010eb ebVar = f53653c;
                if (ebVar == null) {
                    synchronized (C19157ar.class) {
                        ebVar = f53653c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53652b);
                            f53653c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
