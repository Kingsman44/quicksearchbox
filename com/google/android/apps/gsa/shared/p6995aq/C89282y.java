package com.google.android.apps.gsa.shared.p6995aq;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.aq.y */
/* compiled from: PG */
public final class C89282y extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C89282y f242066f;

    /* renamed from: g */
    private static volatile C63010eb f242067g;

    /* renamed from: a */
    public int f242068a;

    /* renamed from: b */
    public int f242069b;

    /* renamed from: c */
    public int f242070c;

    /* renamed from: d */
    public int f242071d;

    /* renamed from: e */
    public int f242072e;

    static {
        C89282y yVar = new C89282y();
        f242066f = yVar;
        C62942bv.registerDefaultInstance(C89282y.class, yVar);
    }

    private C89282y() {
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
                return newMessageInfo(f242066f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C89282y();
            case 4:
                return new C89281x();
            case 5:
                return f242066f;
            case 6:
                C63010eb ebVar = f242067g;
                if (ebVar == null) {
                    synchronized (C89282y.class) {
                        ebVar = f242067g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f242066f);
                            f242067g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
