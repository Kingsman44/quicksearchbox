package com.google.p3728as.p3729a.p3730a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.as.a.a.b */
/* compiled from: PG */
public final class C48022b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48022b f124271c;

    /* renamed from: d */
    private static volatile C63010eb f124272d;

    /* renamed from: a */
    public C48028h f124273a;

    /* renamed from: b */
    public int f124274b;

    static {
        C48022b bVar = new C48022b();
        f124271c = bVar;
        C62942bv.registerDefaultInstance(C48022b.class, bVar);
    }

    private C48022b() {
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
                return newMessageInfo(f124271c, "\u0000\u0002\u0000\u0000\u0004\u0005\u0002\u0000\u0000\u0000\u0004\t\u0005\f", new Object[]{"a", "b"});
            case 3:
                return new C48022b();
            case 4:
                return new C48019a();
            case 5:
                return f124271c;
            case 6:
                C63010eb ebVar = f124272d;
                if (ebVar == null) {
                    synchronized (C48022b.class) {
                        ebVar = f124272d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124271c);
                            f124272d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
