package com.google.protos.p5127o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.o.h */
/* compiled from: PG */
public final class C65682h extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C65682h f178459f;

    /* renamed from: g */
    private static volatile C63010eb f178460g;

    /* renamed from: a */
    public int f178461a;

    /* renamed from: b */
    public C65686l f178462b;

    /* renamed from: c */
    public C65691q f178463c;

    /* renamed from: d */
    public C65684j f178464d;

    /* renamed from: e */
    public C65646aa f178465e;

    static {
        C65682h hVar = new C65682h();
        f178459f = hVar;
        C62942bv.registerDefaultInstance(C65682h.class, hVar);
    }

    private C65682h() {
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
                return newMessageInfo(f178459f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C65682h();
            case 4:
                return new C65681g();
            case 5:
                return f178459f;
            case 6:
                C63010eb ebVar = f178460g;
                if (ebVar == null) {
                    synchronized (C65682h.class) {
                        ebVar = f178460g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178459f);
                            f178460g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
