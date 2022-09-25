package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.fv */
/* compiled from: PG */
public final class C51387fv extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51387fv f133828e;

    /* renamed from: f */
    private static volatile C63010eb f133829f;

    /* renamed from: a */
    public int f133830a;

    /* renamed from: b */
    public int f133831b;

    /* renamed from: c */
    public int f133832c;

    /* renamed from: d */
    public int f133833d;

    static {
        C51387fv fvVar = new C51387fv();
        f133828e = fvVar;
        C62942bv.registerDefaultInstance(C51387fv.class, fvVar);
    }

    private C51387fv() {
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
                return newMessageInfo(f133828e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C51385ft.f133827a, C45240c.f118157a, C51382fq.f133826a, "d", C51380fo.f133825a});
            case 3:
                return new C51387fv();
            case 4:
                return new C51384fs();
            case 5:
                return f133828e;
            case 6:
                C63010eb ebVar = f133829f;
                if (ebVar == null) {
                    synchronized (C51387fv.class) {
                        ebVar = f133829f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133828e);
                            f133829f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
