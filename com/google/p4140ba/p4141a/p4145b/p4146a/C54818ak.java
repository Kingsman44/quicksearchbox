package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.ak */
/* compiled from: PG */
public final class C54818ak extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54818ak f143828c;

    /* renamed from: d */
    private static volatile C63010eb f143829d;

    /* renamed from: a */
    public int f143830a;

    /* renamed from: b */
    public C54843bi f143831b;

    static {
        C54818ak akVar = new C54818ak();
        f143828c = akVar;
        C62942bv.registerDefaultInstance(C54818ak.class, akVar);
    }

    private C54818ak() {
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
                return newMessageInfo(f143828c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C54818ak();
            case 4:
                return new C54817aj();
            case 5:
                return f143828c;
            case 6:
                C63010eb ebVar = f143829d;
                if (ebVar == null) {
                    synchronized (C54818ak.class) {
                        ebVar = f143829d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143828c);
                            f143829d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
