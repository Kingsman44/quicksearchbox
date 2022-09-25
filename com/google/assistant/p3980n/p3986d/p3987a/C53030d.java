package com.google.assistant.p3980n.p3986d.p3987a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.n.d.a.d */
/* compiled from: PG */
public final class C53030d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53030d f138992b;

    /* renamed from: d */
    private static volatile C63010eb f138993d;

    /* renamed from: a */
    public C63088z f138994a = C63088z.f170246b;

    /* renamed from: c */
    private int f138995c;

    static {
        C53030d dVar = new C53030d();
        f138992b = dVar;
        C62942bv.registerDefaultInstance(C53030d.class, dVar);
    }

    private C53030d() {
        emptyProtobufList();
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
                return newMessageInfo(f138992b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C53030d();
            case 4:
                return new C53029c();
            case 5:
                return f138992b;
            case 6:
                C63010eb ebVar = f138993d;
                if (ebVar == null) {
                    synchronized (C53030d.class) {
                        ebVar = f138993d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138992b);
                            f138993d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
