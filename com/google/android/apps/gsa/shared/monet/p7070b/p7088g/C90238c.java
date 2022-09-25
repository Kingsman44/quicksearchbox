package com.google.android.apps.gsa.shared.monet.p7070b.p7088g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.monet.b.g.c */
/* compiled from: PG */
public final class C90238c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C90238c f252081d;

    /* renamed from: e */
    private static volatile C63010eb f252082e;

    /* renamed from: a */
    public int f252083a;

    /* renamed from: b */
    public int f252084b;

    /* renamed from: c */
    public boolean f252085c;

    static {
        C90238c cVar = new C90238c();
        f252081d = cVar;
        C62942bv.registerDefaultInstance(C90238c.class, cVar);
    }

    private C90238c() {
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
                return newMessageInfo(f252081d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C90241f.f252092a, C45240c.f118157a});
            case 3:
                return new C90238c();
            case 4:
                return new C90237b();
            case 5:
                return f252081d;
            case 6:
                C63010eb ebVar = f252082e;
                if (ebVar == null) {
                    synchronized (C90238c.class) {
                        ebVar = f252082e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f252081d);
                            f252082e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
