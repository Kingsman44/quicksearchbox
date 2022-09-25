package com.google.protos.p5144u;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.net.p4726a.p4728b.C62724b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.u.g */
/* compiled from: PG */
public final class C65894g extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65894g f179210a;

    /* renamed from: e */
    private static volatile C63010eb f179211e;

    /* renamed from: b */
    private int f179212b;

    /* renamed from: c */
    private C62724b f179213c;

    /* renamed from: d */
    private byte f179214d = 2;

    static {
        C65894g gVar = new C65894g();
        f179210a = gVar;
        C62942bv.registerDefaultInstance(C65894g.class, gVar);
    }

    private C65894g() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179214d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f179214d = b;
                return null;
            case 2:
                return newMessageInfo(f179210a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0002", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C65894g();
            case 4:
                return new C65893f();
            case 5:
                return f179210a;
            case 6:
                C63010eb ebVar = f179211e;
                if (ebVar == null) {
                    synchronized (C65894g.class) {
                        ebVar = f179211e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179210a);
                            f179211e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
