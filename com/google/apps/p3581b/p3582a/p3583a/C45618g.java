package com.google.apps.p3581b.p3582a.p3583a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.b.a.a.g */
/* compiled from: PG */
public final class C45618g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C45618g f119985c;

    /* renamed from: d */
    private static volatile C63010eb f119986d;

    /* renamed from: a */
    public int f119987a;

    /* renamed from: b */
    public C45613b f119988b;

    static {
        C45618g gVar = new C45618g();
        f119985c = gVar;
        C62942bv.registerDefaultInstance(C45618g.class, gVar);
    }

    private C45618g() {
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
                return newMessageInfo(f119985c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C45618g();
            case 4:
                return new C45617f();
            case 5:
                return f119985c;
            case 6:
                C63010eb ebVar = f119986d;
                if (ebVar == null) {
                    synchronized (C45618g.class) {
                        ebVar = f119986d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f119985c);
                            f119986d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
