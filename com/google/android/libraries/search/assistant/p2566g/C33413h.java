package com.google.android.libraries.search.assistant.p2566g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3860as.C49796j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.g.h */
/* compiled from: PG */
public final class C33413h extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C33413h f89483e;

    /* renamed from: f */
    private static volatile C63010eb f89484f;

    /* renamed from: a */
    public int f89485a;

    /* renamed from: b */
    public C49796j f89486b;

    /* renamed from: c */
    public double f89487c;

    /* renamed from: d */
    public float f89488d;

    static {
        C33413h hVar = new C33413h();
        f89483e = hVar;
        C62942bv.registerDefaultInstance(C33413h.class, hVar);
    }

    private C33413h() {
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
                return newMessageInfo(f89483e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002က\u0001\u0003ခ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C33413h();
            case 4:
                return new C33412g();
            case 5:
                return f89483e;
            case 6:
                C63010eb ebVar = f89484f;
                if (ebVar == null) {
                    synchronized (C33413h.class) {
                        ebVar = f89484f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f89483e);
                            f89484f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
