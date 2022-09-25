package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.assistant.p3897e.p3921j.C52522uw;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.b */
/* compiled from: PG */
public final class C51839b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51839b f135990c;

    /* renamed from: d */
    private static volatile C63010eb f135991d;

    /* renamed from: a */
    public int f135992a;

    /* renamed from: b */
    public C52522uw f135993b;

    static {
        C51839b bVar = new C51839b();
        f135990c = bVar;
        C62942bv.registerDefaultInstance(C51839b.class, bVar);
    }

    private C51839b() {
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
                return newMessageInfo(f135990c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C51839b();
            case 4:
                return new C51812a();
            case 5:
                return f135990c;
            case 6:
                C63010eb ebVar = f135991d;
                if (ebVar == null) {
                    synchronized (C51839b.class) {
                        ebVar = f135991d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135990c);
                            f135991d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
