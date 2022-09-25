package com.google.protos.p4816ai.p4818b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ai.b.j */
/* compiled from: PG */
public final class C63204j extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C63204j f170749e;

    /* renamed from: g */
    private static volatile C63010eb f170750g;

    /* renamed from: a */
    public int f170751a = 0;

    /* renamed from: b */
    public Object f170752b;

    /* renamed from: c */
    public int f170753c = 0;

    /* renamed from: d */
    public Object f170754d;

    /* renamed from: f */
    private byte f170755f = 2;

    static {
        C63204j jVar = new C63204j();
        f170749e = jVar;
        C62942bv.registerDefaultInstance(C63204j.class, jVar);
    }

    private C63204j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f170755f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f170755f = b;
                return null;
            case 2:
                return newMessageInfo(f170749e, "\u0001\u0004\u0002\u0000\u0001\u0006\u0004\u0000\u0000\u0002\u0001ᐼ\u0000\u0002ᐼ\u0000\u0003့\u0001\u0006ြ\u0001", new Object[]{"b", "a", "d", C45240c.f118157a, C60220t.class, C60218r.class, C63200f.class});
            case 3:
                return new C63204j();
            case 4:
                return new C63203i();
            case 5:
                return f170749e;
            case 6:
                C63010eb ebVar = f170750g;
                if (ebVar == null) {
                    synchronized (C63204j.class) {
                        ebVar = f170750g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170749e);
                            f170750g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
