package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.is */
/* compiled from: PG */
public final class C55177is extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55177is f145255c;

    /* renamed from: d */
    private static volatile C63010eb f145256d;

    /* renamed from: a */
    public int f145257a;

    /* renamed from: b */
    public int f145258b;

    static {
        C55177is isVar = new C55177is();
        f145255c = isVar;
        C62942bv.registerDefaultInstance(C55177is.class, isVar);
    }

    private C55177is() {
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
                return newMessageInfo(f145255c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C55178it.f145259a});
            case 3:
                return new C55177is();
            case 4:
                return new C55176ir();
            case 5:
                return f145255c;
            case 6:
                C63010eb ebVar = f145256d;
                if (ebVar == null) {
                    synchronized (C55177is.class) {
                        ebVar = f145256d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145255c);
                            f145256d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
