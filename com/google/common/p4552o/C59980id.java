package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.id */
/* compiled from: PG */
public final class C59980id extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C59980id f162098e;

    /* renamed from: f */
    private static volatile C63010eb f162099f;

    /* renamed from: a */
    public int f162100a;

    /* renamed from: b */
    public long f162101b;

    /* renamed from: c */
    public int f162102c;

    /* renamed from: d */
    public int f162103d;

    static {
        C59980id idVar = new C59980id();
        f162098e = idVar;
        C62942bv.registerDefaultInstance(C59980id.class, idVar);
    }

    private C59980id() {
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
                return newMessageInfo(f162098e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဃ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C59980id();
            case 4:
                return new C59979ic();
            case 5:
                return f162098e;
            case 6:
                C63010eb ebVar = f162099f;
                if (ebVar == null) {
                    synchronized (C59980id.class) {
                        ebVar = f162099f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162098e);
                            f162099f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
