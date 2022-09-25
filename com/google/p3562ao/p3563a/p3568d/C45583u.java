package com.google.p3562ao.p3563a.p3568d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.ao.a.d.u */
/* compiled from: PG */
public final class C45583u extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C45583u f119127b;

    /* renamed from: c */
    private static volatile C63010eb f119128c;

    /* renamed from: a */
    public C45587y f119129a;

    static {
        C45583u uVar = new C45583u();
        f119127b = uVar;
        C62942bv.registerDefaultInstance(C45583u.class, uVar);
    }

    private C45583u() {
        C63088z zVar = C63088z.f170246b;
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
                return newMessageInfo(f119127b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C45583u();
            case 4:
                return new C45582t();
            case 5:
                return f119127b;
            case 6:
                C63010eb ebVar = f119128c;
                if (ebVar == null) {
                    synchronized (C45583u.class) {
                        ebVar = f119128c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f119127b);
                            f119128c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
