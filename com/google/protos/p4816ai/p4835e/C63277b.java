package com.google.protos.p4816ai.p4835e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4816ai.p4819c.C63208d;

/* renamed from: com.google.protos.ai.e.b */
/* compiled from: PG */
public final class C63277b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C63277b f171014e;

    /* renamed from: g */
    private static volatile C63010eb f171015g;

    /* renamed from: a */
    public int f171016a;

    /* renamed from: b */
    public C60220t f171017b;

    /* renamed from: c */
    public C63208d f171018c;

    /* renamed from: d */
    public boolean f171019d;

    /* renamed from: f */
    private byte f171020f = 2;

    static {
        C63277b bVar = new C63277b();
        f171014e = bVar;
        C62942bv.registerDefaultInstance(C63277b.class, bVar);
    }

    private C63277b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171020f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171020f = b;
                return null;
            case 2:
                return newMessageInfo(f171014e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C63277b();
            case 4:
                return new C63276a();
            case 5:
                return f171014e;
            case 6:
                C63010eb ebVar = f171015g;
                if (ebVar == null) {
                    synchronized (C63277b.class) {
                        ebVar = f171015g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171014e);
                            f171015g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
