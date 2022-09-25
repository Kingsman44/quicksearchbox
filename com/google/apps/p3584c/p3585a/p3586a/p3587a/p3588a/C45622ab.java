package com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a;

import com.google.p4479cg.C58072d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.c.a.a.a.a.ab */
/* compiled from: PG */
public final class C45622ab extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C45622ab f119993c;

    /* renamed from: d */
    private static volatile C63010eb f119994d;

    /* renamed from: a */
    public int f119995a;

    /* renamed from: b */
    public C58072d f119996b;

    static {
        C45622ab abVar = new C45622ab();
        f119993c = abVar;
        C62942bv.registerDefaultInstance(C45622ab.class, abVar);
    }

    private C45622ab() {
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
                return newMessageInfo(f119993c, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005ဉ\u0002", new Object[]{"a", "b"});
            case 3:
                return new C45622ab();
            case 4:
                return new C45621aa();
            case 5:
                return f119993c;
            case 6:
                C63010eb ebVar = f119994d;
                if (ebVar == null) {
                    synchronized (C45622ab.class) {
                        ebVar = f119994d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f119993c);
                            f119994d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
