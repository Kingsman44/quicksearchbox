package com.google.android.apps.search.assistant.platform.p9141h.p9146b.p9147a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.h.b.a.d */
/* compiled from: PG */
public final class C121002d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C121002d f336371c;

    /* renamed from: d */
    private static volatile C63010eb f336372d;

    /* renamed from: a */
    public int f336373a;

    /* renamed from: b */
    public int f336374b;

    static {
        C121002d dVar = new C121002d();
        f336371c = dVar;
        C62942bv.registerDefaultInstance(C121002d.class, dVar);
    }

    private C121002d() {
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
                return newMessageInfo(f336371c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C121001c.m200300b()});
            case 3:
                return new C121002d();
            case 4:
                return new C120999a();
            case 5:
                return f336371c;
            case 6:
                C63010eb ebVar = f336372d;
                if (ebVar == null) {
                    synchronized (C121002d.class) {
                        ebVar = f336372d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f336371c);
                            f336372d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
