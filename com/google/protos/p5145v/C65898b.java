package com.google.protos.p5145v;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p5189s.p5190a.p5191a.p5192a.p5193a.p5194a.C66419b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.v.b */
/* compiled from: PG */
public final class C65898b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C65898b f179218e;

    /* renamed from: f */
    private static volatile C63010eb f179219f;

    /* renamed from: a */
    public int f179220a;

    /* renamed from: b */
    public int f179221b;

    /* renamed from: c */
    public int f179222c;

    /* renamed from: d */
    public int f179223d;

    static {
        C65898b bVar = new C65898b();
        f179218e = bVar;
        C62942bv.registerDefaultInstance(C65898b.class, bVar);
    }

    private C65898b() {
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
                return newMessageInfo(f179218e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a, C66419b.m97203b(), "d"});
            case 3:
                return new C65898b();
            case 4:
                return new C65897a();
            case 5:
                return f179218e;
            case 6:
                C63010eb ebVar = f179219f;
                if (ebVar == null) {
                    synchronized (C65898b.class) {
                        ebVar = f179219f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179218e);
                            f179219f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
