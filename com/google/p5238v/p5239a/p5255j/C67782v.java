package com.google.p5238v.p5239a.p5255j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.v.a.j.v */
/* compiled from: PG */
public final class C67782v extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C67782v f183891b;

    /* renamed from: c */
    private static volatile C63010eb f183892c;

    /* renamed from: a */
    public int f183893a;

    static {
        C67782v vVar = new C67782v();
        f183891b = vVar;
        C62942bv.registerDefaultInstance(C67782v.class, vVar);
    }

    private C67782v() {
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
                return newMessageInfo(f183891b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"a"});
            case 3:
                return new C67782v();
            case 4:
                return new C67781u();
            case 5:
                return f183891b;
            case 6:
                C63010eb ebVar = f183892c;
                if (ebVar == null) {
                    synchronized (C67782v.class) {
                        ebVar = f183892c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183891b);
                            f183892c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
