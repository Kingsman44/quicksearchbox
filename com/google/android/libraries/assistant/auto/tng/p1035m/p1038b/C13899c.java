package com.google.android.libraries.assistant.auto.tng.p1035m.p1038b;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p727a.C11989b;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.m.b.c */
/* compiled from: PG */
public final class C13899c extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C13899c f42324e;

    /* renamed from: f */
    private static volatile C63010eb f42325f;

    /* renamed from: a */
    public int f42326a;

    /* renamed from: b */
    public int f42327b = 0;

    /* renamed from: c */
    public Object f42328c;

    /* renamed from: d */
    public int f42329d = 1;

    static {
        C13899c cVar = new C13899c();
        f42324e = cVar;
        C62942bv.registerDefaultInstance(C13899c.class, cVar);
    }

    private C13899c() {
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
                return newMessageInfo(f42324e, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001့\u0000\u0002င\u0003\u0003ြ\u0000\u0004ျ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C11989b.class});
            case 3:
                return new C13899c();
            case 4:
                return new C13898b();
            case 5:
                return f42324e;
            case 6:
                C63010eb ebVar = f42325f;
                if (ebVar == null) {
                    synchronized (C13899c.class) {
                        ebVar = f42325f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f42324e);
                            f42325f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
