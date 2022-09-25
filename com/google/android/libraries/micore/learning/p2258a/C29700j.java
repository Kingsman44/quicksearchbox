package com.google.android.libraries.micore.learning.p2258a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63077o;

/* renamed from: com.google.android.libraries.micore.learning.a.j */
/* compiled from: PG */
public final class C29700j extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C29700j f80437f;

    /* renamed from: g */
    private static volatile C63010eb f80438g;

    /* renamed from: a */
    public C62910ar f80439a;

    /* renamed from: b */
    public boolean f80440b;

    /* renamed from: c */
    public boolean f80441c;

    /* renamed from: d */
    public boolean f80442d;

    /* renamed from: e */
    public C63077o f80443e;

    static {
        C29700j jVar = new C29700j();
        f80437f = jVar;
        C62942bv.registerDefaultInstance(C29700j.class, jVar);
    }

    private C29700j() {
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
                return newMessageInfo(f80437f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002\u0007\u0003\u0007\u0004\u0007\u0005\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C29700j();
            case 4:
                return new C29699i();
            case 5:
                return f80437f;
            case 6:
                C63010eb ebVar = f80438g;
                if (ebVar == null) {
                    synchronized (C29700j.class) {
                        ebVar = f80438g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f80437f);
                            f80438g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
