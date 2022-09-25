package com.google.android.libraries.search.assistant.invocation.p2651n.p2654c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.n.c.s */
/* compiled from: PG */
public final class C34002s extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C34002s f90631c;

    /* renamed from: d */
    private static volatile C63010eb f90632d;

    /* renamed from: a */
    public int f90633a = 0;

    /* renamed from: b */
    public Object f90634b;

    static {
        C34002s sVar = new C34002s();
        f90631c = sVar;
        C62942bv.registerDefaultInstance(C34002s.class, sVar);
    }

    private C34002s() {
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
                return newMessageInfo(f90631c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"b", "a", C33998o.class, C33996m.class});
            case 3:
                return new C34002s();
            case 4:
                return new C34001r();
            case 5:
                return f90631c;
            case 6:
                C63010eb ebVar = f90632d;
                if (ebVar == null) {
                    synchronized (C34002s.class) {
                        ebVar = f90632d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90631c);
                            f90632d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
