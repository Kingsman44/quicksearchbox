package com.google.p4129b.p4136c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.c.g */
/* compiled from: PG */
public final class C54759g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54759g f143679c;

    /* renamed from: d */
    private static volatile C63010eb f143680d;

    /* renamed from: a */
    public C54773u f143681a;

    /* renamed from: b */
    public C54758f f143682b;

    static {
        C54759g gVar = new C54759g();
        f143679c = gVar;
        C62942bv.registerDefaultInstance(C54759g.class, gVar);
    }

    private C54759g() {
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
                return newMessageInfo(f143679c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C54759g();
            case 4:
                return new C54743a();
            case 5:
                return f143679c;
            case 6:
                C63010eb ebVar = f143680d;
                if (ebVar == null) {
                    synchronized (C54759g.class) {
                        ebVar = f143680d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143679c);
                            f143680d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
