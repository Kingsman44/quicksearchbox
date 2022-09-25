package com.google.assistant.p3745ab.p3772x;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.x.d */
/* compiled from: PG */
public final class C48427d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48427d f125145a;

    /* renamed from: d */
    private static volatile C63010eb f125146d;

    /* renamed from: b */
    private int f125147b;

    /* renamed from: c */
    private C48432i f125148c;

    static {
        C48427d dVar = new C48427d();
        f125145a = dVar;
        C62942bv.registerDefaultInstance(C48427d.class, dVar);
    }

    private C48427d() {
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
                return newMessageInfo(f125145a, "\u0001\u0001\u0000\u0001\r\r\u0001\u0000\u0000\u0000\rဉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C48427d();
            case 4:
                return new C48426c();
            case 5:
                return f125145a;
            case 6:
                C63010eb ebVar = f125146d;
                if (ebVar == null) {
                    synchronized (C48427d.class) {
                        ebVar = f125146d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125145a);
                            f125146d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
