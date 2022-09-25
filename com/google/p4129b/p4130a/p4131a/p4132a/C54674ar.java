package com.google.p4129b.p4130a.p4131a.p4132a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.b.a.a.a.ar */
/* compiled from: PG */
public final class C54674ar extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54674ar f143518c;

    /* renamed from: d */
    private static volatile C63010eb f143519d;

    /* renamed from: a */
    public int f143520a = 0;

    /* renamed from: b */
    public Object f143521b;

    static {
        C54674ar arVar = new C54674ar();
        f143518c = arVar;
        C62942bv.registerDefaultInstance(C54674ar.class, arVar);
    }

    private C54674ar() {
        C63088z zVar = C63088z.f170246b;
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
                return newMessageInfo(f143518c, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"b", "a", C54673aq.class, C54666aj.class, C54671ao.class, C54668al.class});
            case 3:
                return new C54674ar();
            case 4:
                return new C54669am();
            case 5:
                return f143518c;
            case 6:
                C63010eb ebVar = f143519d;
                if (ebVar == null) {
                    synchronized (C54674ar.class) {
                        ebVar = f143519d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143518c);
                            f143519d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
