package com.google.android.apps.auto.p450a.p452b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.auto.a.b.f */
/* compiled from: PG */
public final class C8940f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C8940f f30987d;

    /* renamed from: f */
    private static volatile C63010eb f30988f;

    /* renamed from: a */
    public C63042fg f30989a;

    /* renamed from: b */
    public C63042fg f30990b;

    /* renamed from: c */
    public int f30991c;

    /* renamed from: e */
    private int f30992e;

    static {
        C8940f fVar = new C8940f();
        f30987d = fVar;
        C62942bv.registerDefaultInstance(C8940f.class, fVar);
    }

    private C8940f() {
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
                return newMessageInfo(f30987d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003င\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C8940f();
            case 4:
                return new C8939e();
            case 5:
                return f30987d;
            case 6:
                C63010eb ebVar = f30988f;
                if (ebVar == null) {
                    synchronized (C8940f.class) {
                        ebVar = f30988f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30987d);
                            f30988f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
