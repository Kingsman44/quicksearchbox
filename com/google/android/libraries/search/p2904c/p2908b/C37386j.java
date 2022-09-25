package com.google.android.libraries.search.p2904c.p2908b;

import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.b.j */
/* compiled from: PG */
public final class C37386j extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C37386j f99302d;

    /* renamed from: e */
    private static volatile C63010eb f99303e;

    /* renamed from: a */
    public int f99304a;

    /* renamed from: b */
    public C37388l f99305b;

    /* renamed from: c */
    public int f99306c;

    static {
        C37386j jVar = new C37386j();
        f99302d = jVar;
        C62942bv.registerDefaultInstance(C37386j.class, jVar);
    }

    private C37386j() {
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
                return newMessageInfo(f99302d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C39226b.m68656b()});
            case 3:
                return new C37386j();
            case 4:
                return new C37385i();
            case 5:
                return f99302d;
            case 6:
                C63010eb ebVar = f99303e;
                if (ebVar == null) {
                    synchronized (C37386j.class) {
                        ebVar = f99303e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99302d);
                            f99303e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
