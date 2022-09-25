package com.google.lens.p4701g;

import com.google.android.libraries.p1657ba.p1664c.p1668c.p1669a.C19651b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.cn */
/* compiled from: PG */
public final class C62318cn extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62318cn f168229c;

    /* renamed from: d */
    private static volatile C63010eb f168230d;

    /* renamed from: a */
    public int f168231a;

    /* renamed from: b */
    public C19651b f168232b;

    static {
        C62318cn cnVar = new C62318cn();
        f168229c = cnVar;
        C62942bv.registerDefaultInstance(C62318cn.class, cnVar);
    }

    private C62318cn() {
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
                return newMessageInfo(f168229c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C62318cn();
            case 4:
                return new C62317cm();
            case 5:
                return f168229c;
            case 6:
                C63010eb ebVar = f168230d;
                if (ebVar == null) {
                    synchronized (C62318cn.class) {
                        ebVar = f168230d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168229c);
                            f168230d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
