package com.google.assistant.p3745ab.p3755g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.g.h */
/* compiled from: PG */
public final class C48333h extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C48333h f124978e;

    /* renamed from: f */
    private static volatile C63010eb f124979f;

    /* renamed from: a */
    public int f124980a;

    /* renamed from: b */
    public int f124981b;

    /* renamed from: c */
    public int f124982c;

    /* renamed from: d */
    public int f124983d;

    static {
        C48333h hVar = new C48333h();
        f124978e = hVar;
        C62942bv.registerDefaultInstance(C48333h.class, hVar);
    }

    private C48333h() {
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
                return newMessageInfo(f124978e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C48333h();
            case 4:
                return new C48332g();
            case 5:
                return f124978e;
            case 6:
                C63010eb ebVar = f124979f;
                if (ebVar == null) {
                    synchronized (C48333h.class) {
                        ebVar = f124979f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124978e);
                            f124979f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
