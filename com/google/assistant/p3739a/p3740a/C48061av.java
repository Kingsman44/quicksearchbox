package com.google.assistant.p3739a.p3740a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.a.a.av */
/* compiled from: PG */
public final class C48061av extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48061av f124387c;

    /* renamed from: d */
    private static volatile C63010eb f124388d;

    /* renamed from: a */
    public int f124389a = 0;

    /* renamed from: b */
    public Object f124390b;

    static {
        C48061av avVar = new C48061av();
        f124387c = avVar;
        C62942bv.registerDefaultInstance(C48061av.class, avVar);
    }

    private C48061av() {
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
                return newMessageInfo(f124387c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"b", "a", C48056aq.class, C48058as.class});
            case 3:
                return new C48061av();
            case 4:
                return new C48054ao();
            case 5:
                return f124387c;
            case 6:
                C63010eb ebVar = f124388d;
                if (ebVar == null) {
                    synchronized (C48061av.class) {
                        ebVar = f124388d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124387c);
                            f124388d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
