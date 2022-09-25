package com.google.apps.p3581b.p3582a.p3583a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.b.a.a.h */
/* compiled from: PG */
public final class C45619h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C45619h f119989c;

    /* renamed from: d */
    private static volatile C63010eb f119990d;

    /* renamed from: a */
    public int f119991a = 0;

    /* renamed from: b */
    public Object f119992b;

    static {
        C45619h hVar = new C45619h();
        f119989c = hVar;
        C62942bv.registerDefaultInstance(C45619h.class, hVar);
    }

    private C45619h() {
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
                return newMessageInfo(f119989c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C45616e.class, C45618g.class});
            case 3:
                return new C45619h();
            case 4:
                return new C45614c();
            case 5:
                return f119989c;
            case 6:
                C63010eb ebVar = f119990d;
                if (ebVar == null) {
                    synchronized (C45619h.class) {
                        ebVar = f119990d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f119989c);
                            f119990d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
