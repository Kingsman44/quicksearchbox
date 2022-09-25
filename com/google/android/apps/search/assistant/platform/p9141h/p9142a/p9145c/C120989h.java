package com.google.android.apps.search.assistant.platform.p9141h.p9142a.p9145c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.h.a.c.h */
/* compiled from: PG */
public final class C120989h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C120989h f336352b;

    /* renamed from: c */
    private static volatile C63010eb f336353c;

    /* renamed from: a */
    public int f336354a;

    static {
        C120989h hVar = new C120989h();
        f336352b = hVar;
        C62942bv.registerDefaultInstance(C120989h.class, hVar);
    }

    private C120989h() {
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
                return newMessageInfo(f336352b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C120989h();
            case 4:
                return new C120987f();
            case 5:
                return f336352b;
            case 6:
                C63010eb ebVar = f336353c;
                if (ebVar == null) {
                    synchronized (C120989h.class) {
                        ebVar = f336353c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f336352b);
                            f336353c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
