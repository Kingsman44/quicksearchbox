package com.google.assistant.p3745ab.p3746a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.a.h */
/* compiled from: PG */
public final class C48184h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48184h f124677d;

    /* renamed from: e */
    private static volatile C63010eb f124678e;

    /* renamed from: a */
    public int f124679a;

    /* renamed from: b */
    public int f124680b;

    /* renamed from: c */
    public C48183g f124681c;

    static {
        C48184h hVar = new C48184h();
        f124677d = hVar;
        C62942bv.registerDefaultInstance(C48184h.class, hVar);
    }

    private C48184h() {
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
                return newMessageInfo(f124677d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C48181e.f124669a, C45240c.f118157a});
            case 3:
                return new C48184h();
            case 4:
                return new C48180d();
            case 5:
                return f124677d;
            case 6:
                C63010eb ebVar = f124678e;
                if (ebVar == null) {
                    synchronized (C48184h.class) {
                        ebVar = f124678e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124677d);
                            f124678e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
