package com.google.p4741o.p4742a.p4743a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.o.a.a.l */
/* compiled from: PG */
public final class C62863l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62863l f169749c;

    /* renamed from: d */
    private static volatile C63010eb f169750d;

    /* renamed from: a */
    public int f169751a;

    /* renamed from: b */
    public int f169752b;

    static {
        C62863l lVar = new C62863l();
        f169749c = lVar;
        C62942bv.registerDefaultInstance(C62863l.class, lVar);
    }

    private C62863l() {
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
                return newMessageInfo(f169749c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0004", new Object[]{"a", "b"});
            case 3:
                return new C62863l();
            case 4:
                return new C62862k();
            case 5:
                return f169749c;
            case 6:
                C63010eb ebVar = f169750d;
                if (ebVar == null) {
                    synchronized (C62863l.class) {
                        ebVar = f169750d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169749c);
                            f169750d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
