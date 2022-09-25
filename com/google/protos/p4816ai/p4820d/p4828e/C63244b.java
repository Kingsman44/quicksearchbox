package com.google.protos.p4816ai.p4820d.p4828e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ai.d.e.b */
/* compiled from: PG */
public final class C63244b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63244b f170882a;

    /* renamed from: e */
    private static volatile C63010eb f170883e;

    /* renamed from: b */
    private int f170884b;

    /* renamed from: c */
    private C60220t f170885c;

    /* renamed from: d */
    private byte f170886d = 2;

    static {
        C63244b bVar = new C63244b();
        f170882a = bVar;
        C62942bv.registerDefaultInstance(C63244b.class, bVar);
    }

    private C63244b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f170886d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f170886d = b;
                return null;
            case 2:
                return newMessageInfo(f170882a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C63244b();
            case 4:
                return new C63243a();
            case 5:
                return f170882a;
            case 6:
                C63010eb ebVar = f170883e;
                if (ebVar == null) {
                    synchronized (C63244b.class) {
                        ebVar = f170883e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170882a);
                            f170883e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
