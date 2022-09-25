package com.google.android.libraries.search.p3055n;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.n.b */
/* compiled from: PG */
public final class C39277b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C39277b f103459e;

    /* renamed from: f */
    private static volatile C63010eb f103460f;

    /* renamed from: a */
    public int f103461a;

    /* renamed from: b */
    public int f103462b;

    /* renamed from: c */
    public int f103463c;

    /* renamed from: d */
    public int f103464d;

    static {
        C39277b bVar = new C39277b();
        f103459e = bVar;
        C62942bv.registerDefaultInstance(C39277b.class, bVar);
    }

    private C39277b() {
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
                return newMessageInfo(f103459e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C39277b();
            case 4:
                return new C39240a();
            case 5:
                return f103459e;
            case 6:
                C63010eb ebVar = f103460f;
                if (ebVar == null) {
                    synchronized (C39277b.class) {
                        ebVar = f103460f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f103459e);
                            f103460f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
