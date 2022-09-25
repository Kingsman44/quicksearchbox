package com.google.frameworks.client.p4630b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.frameworks.client.b.k */
/* compiled from: PG */
public final class C61328k extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C61328k f165853d;

    /* renamed from: e */
    private static volatile C63010eb f165854e;

    /* renamed from: a */
    public int f165855a;

    /* renamed from: b */
    public C62971cq f165856b = emptyProtobufList();

    /* renamed from: c */
    public C61327j f165857c;

    static {
        C61328k kVar = new C61328k();
        f165853d = kVar;
        C62942bv.registerDefaultInstance(C61328k.class, kVar);
    }

    private C61328k() {
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
                return newMessageInfo(f165853d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"a", "b", C61325h.class, C45240c.f118157a});
            case 3:
                return new C61328k();
            case 4:
                return new C61323f();
            case 5:
                return f165853d;
            case 6:
                C63010eb ebVar = f165854e;
                if (ebVar == null) {
                    synchronized (C61328k.class) {
                        ebVar = f165854e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f165853d);
                            f165854e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
