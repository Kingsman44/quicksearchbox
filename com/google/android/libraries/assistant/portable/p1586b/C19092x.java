package com.google.android.libraries.assistant.portable.p1586b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.portable.b.x */
/* compiled from: PG */
public final class C19092x extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C19092x f53551b;

    /* renamed from: d */
    private static volatile C63010eb f53552d;

    /* renamed from: a */
    public int f53553a;

    /* renamed from: c */
    private int f53554c;

    static {
        C19092x xVar = new C19092x();
        f53551b = xVar;
        C62942bv.registerDefaultInstance(C19092x.class, xVar);
    }

    private C19092x() {
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
                return newMessageInfo(f53551b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C19093y.f53555a});
            case 3:
                return new C19092x();
            case 4:
                return new C19091w();
            case 5:
                return f53551b;
            case 6:
                C63010eb ebVar = f53552d;
                if (ebVar == null) {
                    synchronized (C19092x.class) {
                        ebVar = f53552d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53551b);
                            f53552d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
