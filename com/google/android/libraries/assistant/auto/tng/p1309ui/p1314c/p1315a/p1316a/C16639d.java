package com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.c.a.a.d */
/* compiled from: PG */
public final class C16639d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C16639d f48730c;

    /* renamed from: d */
    private static volatile C63010eb f48731d;

    /* renamed from: a */
    public int f48732a;

    /* renamed from: b */
    public int f48733b;

    static {
        C16639d dVar = new C16639d();
        f48730c = dVar;
        C62942bv.registerDefaultInstance(C16639d.class, dVar);
    }

    private C16639d() {
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
                return newMessageInfo(f48730c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C16628a.f48717a});
            case 3:
                return new C16639d();
            case 4:
                return new C16638c();
            case 5:
                return f48730c;
            case 6:
                C63010eb ebVar = f48731d;
                if (ebVar == null) {
                    synchronized (C16639d.class) {
                        ebVar = f48731d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48730c);
                            f48731d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
