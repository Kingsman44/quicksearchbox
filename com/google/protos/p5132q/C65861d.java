package com.google.protos.p5132q;

import com.google.p4172bg.C55711b;
import com.google.p4172bg.C55747h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.q.d */
/* compiled from: PG */
public final class C65861d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65861d f179033c;

    /* renamed from: e */
    private static volatile C63010eb f179034e;

    /* renamed from: a */
    public int f179035a = 0;

    /* renamed from: b */
    public Object f179036b;

    /* renamed from: d */
    private byte f179037d = 2;

    static {
        C65861d dVar = new C65861d();
        f179033c = dVar;
        C62942bv.registerDefaultInstance(C65861d.class, dVar);
    }

    private C65861d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179037d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f179037d = b;
                return null;
            case 2:
                return newMessageInfo(f179033c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᐼ\u0000\u0002ᐼ\u0000\u0003ᐼ\u0000", new Object[]{"b", "a", C65860c.class, C55747h.class, C55711b.class});
            case 3:
                return new C65861d();
            case 4:
                return new C65858a();
            case 5:
                return f179033c;
            case 6:
                C63010eb ebVar = f179034e;
                if (ebVar == null) {
                    synchronized (C65861d.class) {
                        ebVar = f179034e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179033c);
                            f179034e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
