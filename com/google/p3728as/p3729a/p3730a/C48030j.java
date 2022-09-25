package com.google.p3728as.p3729a.p3730a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.as.a.a.j */
/* compiled from: PG */
public final class C48030j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48030j f124314b;

    /* renamed from: c */
    private static volatile C63010eb f124315c;

    /* renamed from: a */
    public C48026f f124316a;

    static {
        C48030j jVar = new C48030j();
        f124314b = jVar;
        C62942bv.registerDefaultInstance(C48030j.class, jVar);
    }

    private C48030j() {
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
                return newMessageInfo(f124314b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C48030j();
            case 4:
                return new C48029i();
            case 5:
                return f124314b;
            case 6:
                C63010eb ebVar = f124315c;
                if (ebVar == null) {
                    synchronized (C48030j.class) {
                        ebVar = f124315c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124314b);
                            f124315c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
