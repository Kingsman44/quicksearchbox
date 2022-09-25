package com.google.protos.p4985f.p5046x;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.x.c */
/* compiled from: PG */
public final class C65378c extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65378c f177772b;

    /* renamed from: d */
    private static volatile C63010eb f177773d;

    /* renamed from: a */
    public int f177774a;

    /* renamed from: c */
    private int f177775c;

    static {
        C65378c cVar = new C65378c();
        f177772b = cVar;
        C62942bv.registerDefaultInstance(C65378c.class, cVar);
    }

    private C65378c() {
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
                return newMessageInfo(f177772b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002င\u0001", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C65378c();
            case 4:
                return new C65377b();
            case 5:
                return f177772b;
            case 6:
                C63010eb ebVar = f177773d;
                if (ebVar == null) {
                    synchronized (C65378c.class) {
                        ebVar = f177773d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177772b);
                            f177773d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
