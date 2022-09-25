package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.d */
/* compiled from: PG */
public final class C80006d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C80006d f219514e;

    /* renamed from: f */
    private static volatile C63010eb f219515f;

    /* renamed from: a */
    public int f219516a;

    /* renamed from: b */
    public boolean f219517b;

    /* renamed from: c */
    public int f219518c;

    /* renamed from: d */
    public float f219519d;

    static {
        C80006d dVar = new C80006d();
        f219514e = dVar;
        C62942bv.registerDefaultInstance(C80006d.class, dVar);
    }

    private C80006d() {
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
                return newMessageInfo(f219514e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ခ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C80006d();
            case 4:
                return new C79979c();
            case 5:
                return f219514e;
            case 6:
                C63010eb ebVar = f219515f;
                if (ebVar == null) {
                    synchronized (C80006d.class) {
                        ebVar = f219515f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219514e);
                            f219515f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
