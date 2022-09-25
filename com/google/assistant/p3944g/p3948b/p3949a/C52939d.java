package com.google.assistant.p3944g.p3948b.p3949a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.g.b.a.d */
/* compiled from: PG */
public final class C52939d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C52939d f138804e;

    /* renamed from: f */
    private static volatile C63010eb f138805f;

    /* renamed from: a */
    public int f138806a;

    /* renamed from: b */
    public int f138807b = 0;

    /* renamed from: c */
    public Object f138808c;

    /* renamed from: d */
    public int f138809d;

    static {
        C52939d dVar = new C52939d();
        f138804e = dVar;
        C62942bv.registerDefaultInstance(C52939d.class, dVar);
    }

    private C52939d() {
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
                return newMessageInfo(f138804e, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ျ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C52929a.f138776a});
            case 3:
                return new C52939d();
            case 4:
                return new C52938c();
            case 5:
                return f138804e;
            case 6:
                C63010eb ebVar = f138805f;
                if (ebVar == null) {
                    synchronized (C52939d.class) {
                        ebVar = f138805f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138804e);
                            f138805f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
