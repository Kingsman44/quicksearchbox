package com.google.assistant.p3858ar.p3859a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ar.a.b */
/* compiled from: PG */
public final class C49712b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49712b f128295c;

    /* renamed from: d */
    private static volatile C63010eb f128296d;

    /* renamed from: a */
    public int f128297a;

    /* renamed from: b */
    public boolean f128298b;

    static {
        C49712b bVar = new C49712b();
        f128295c = bVar;
        C62942bv.registerDefaultInstance(C49712b.class, bVar);
    }

    private C49712b() {
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
                return newMessageInfo(f128295c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C49712b();
            case 4:
                return new C49711a();
            case 5:
                return f128295c;
            case 6:
                C63010eb ebVar = f128296d;
                if (ebVar == null) {
                    synchronized (C49712b.class) {
                        ebVar = f128296d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128295c);
                            f128296d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
