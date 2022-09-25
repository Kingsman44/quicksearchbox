package com.google.research.p5181a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.research.a.b */
/* compiled from: PG */
public final class C66299b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66299b f180304d;

    /* renamed from: e */
    private static volatile C63010eb f180305e;

    /* renamed from: a */
    public int f180306a;

    /* renamed from: b */
    public boolean f180307b;

    /* renamed from: c */
    public int f180308c;

    static {
        C66299b bVar = new C66299b();
        f180304d = bVar;
        C62942bv.registerDefaultInstance(C66299b.class, bVar);
    }

    private C66299b() {
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
                return newMessageInfo(f180304d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66299b();
            case 4:
                return new C66277a();
            case 5:
                return f180304d;
            case 6:
                C63010eb ebVar = f180305e;
                if (ebVar == null) {
                    synchronized (C66299b.class) {
                        ebVar = f180305e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180304d);
                            f180305e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
