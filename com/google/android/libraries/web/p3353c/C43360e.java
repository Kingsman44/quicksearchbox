package com.google.android.libraries.web.p3353c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.web.c.e */
/* compiled from: PG */
public final class C43360e extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C43360e f113259e;

    /* renamed from: f */
    private static volatile C63010eb f113260f;

    /* renamed from: a */
    public int f113261a;

    /* renamed from: b */
    public int f113262b;

    /* renamed from: c */
    public int f113263c;

    /* renamed from: d */
    public int f113264d;

    static {
        C43360e eVar = new C43360e();
        f113259e = eVar;
        C62942bv.registerDefaultInstance(C43360e.class, eVar);
    }

    private C43360e() {
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
                return newMessageInfo(f113259e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C43360e();
            case 4:
                return new C43359d();
            case 5:
                return f113259e;
            case 6:
                C63010eb ebVar = f113260f;
                if (ebVar == null) {
                    synchronized (C43360e.class) {
                        ebVar = f113260f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f113259e);
                            f113260f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
