package com.google.p4017at.p4086k.p4087a.p4090b.p4091a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.k.a.b.a.f */
/* compiled from: PG */
public final class C54497f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54497f f143087b;

    /* renamed from: c */
    private static volatile C63010eb f143088c;

    /* renamed from: a */
    public int f143089a;

    static {
        C54497f fVar = new C54497f();
        f143087b = fVar;
        C62942bv.registerDefaultInstance(C54497f.class, fVar);
    }

    private C54497f() {
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
                return newMessageInfo(f143087b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
            case 3:
                return new C54497f();
            case 4:
                return new C54496e();
            case 5:
                return f143087b;
            case 6:
                C63010eb ebVar = f143088c;
                if (ebVar == null) {
                    synchronized (C54497f.class) {
                        ebVar = f143088c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143087b);
                            f143088c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
