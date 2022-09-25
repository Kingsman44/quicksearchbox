package com.google.protos.p4816ai.p4820d.p4821a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ai.d.a.j */
/* compiled from: PG */
public final class C63218j extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63218j f170793d;

    /* renamed from: e */
    private static volatile C63010eb f170794e;

    /* renamed from: a */
    public int f170795a;

    /* renamed from: b */
    public int f170796b;

    /* renamed from: c */
    public long f170797c;

    static {
        C63218j jVar = new C63218j();
        f170793d = jVar;
        C62942bv.registerDefaultInstance(C63218j.class, jVar);
    }

    private C63218j() {
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
                return newMessageInfo(f170793d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C63218j();
            case 4:
                return new C63217i();
            case 5:
                return f170793d;
            case 6:
                C63010eb ebVar = f170794e;
                if (ebVar == null) {
                    synchronized (C63218j.class) {
                        ebVar = f170794e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170793d);
                            f170794e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
