package com.google.p427am.p432b.p433a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.b.a.ao */
/* compiled from: PG */
public final class C8636ao extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8636ao f29912b;

    /* renamed from: c */
    private static volatile C63010eb f29913c;

    /* renamed from: a */
    public int f29914a;

    static {
        C8636ao aoVar = new C8636ao();
        f29912b = aoVar;
        C62942bv.registerDefaultInstance(C8636ao.class, aoVar);
    }

    private C8636ao() {
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
                return newMessageInfo(f29912b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C8636ao();
            case 4:
                return new C8634am();
            case 5:
                return f29912b;
            case 6:
                C63010eb ebVar = f29913c;
                if (ebVar == null) {
                    synchronized (C8636ao.class) {
                        ebVar = f29913c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29912b);
                            f29913c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
