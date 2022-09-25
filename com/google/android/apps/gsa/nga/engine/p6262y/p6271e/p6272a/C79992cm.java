package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.cm */
/* compiled from: PG */
public final class C79992cm extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C79992cm f219445d;

    /* renamed from: e */
    private static volatile C63010eb f219446e;

    /* renamed from: a */
    public int f219447a;

    /* renamed from: b */
    public float f219448b;

    /* renamed from: c */
    public float f219449c;

    static {
        C79992cm cmVar = new C79992cm();
        f219445d = cmVar;
        C62942bv.registerDefaultInstance(C79992cm.class, cmVar);
    }

    private C79992cm() {
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
                return newMessageInfo(f219445d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C79992cm();
            case 4:
                return new C79991cl();
            case 5:
                return f219445d;
            case 6:
                C63010eb ebVar = f219446e;
                if (ebVar == null) {
                    synchronized (C79992cm.class) {
                        ebVar = f219446e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219445d);
                            f219446e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
