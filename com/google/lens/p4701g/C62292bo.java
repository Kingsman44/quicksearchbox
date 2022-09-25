package com.google.lens.p4701g;

import com.google.p4172bg.C55694ab;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.bo */
/* compiled from: PG */
public final class C62292bo extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62292bo f168167c;

    /* renamed from: d */
    private static volatile C63010eb f168168d;

    /* renamed from: a */
    public int f168169a;

    /* renamed from: b */
    public C55694ab f168170b;

    static {
        C62292bo boVar = new C62292bo();
        f168167c = boVar;
        C62942bv.registerDefaultInstance(C62292bo.class, boVar);
    }

    private C62292bo() {
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
                return newMessageInfo(f168167c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C62292bo();
            case 4:
                return new C62291bn();
            case 5:
                return f168167c;
            case 6:
                C63010eb ebVar = f168168d;
                if (ebVar == null) {
                    synchronized (C62292bo.class) {
                        ebVar = f168168d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168167c);
                            f168168d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
