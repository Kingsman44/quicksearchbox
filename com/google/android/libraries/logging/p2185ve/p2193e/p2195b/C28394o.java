package com.google.android.libraries.logging.p2185ve.p2193e.p2195b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.logging.ve.e.b.o */
/* compiled from: PG */
public final class C28394o extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C28394o f77145c;

    /* renamed from: d */
    private static volatile C63010eb f77146d;

    /* renamed from: a */
    public int f77147a;

    /* renamed from: b */
    public int f77148b;

    static {
        C28394o oVar = new C28394o();
        f77145c = oVar;
        C62942bv.registerDefaultInstance(C28394o.class, oVar);
    }

    private C28394o() {
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
                return newMessageInfo(f77145c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C28394o();
            case 4:
                return new C28393n();
            case 5:
                return f77145c;
            case 6:
                C63010eb ebVar = f77146d;
                if (ebVar == null) {
                    synchronized (C28394o.class) {
                        ebVar = f77146d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f77145c);
                            f77146d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
