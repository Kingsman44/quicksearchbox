package com.google.p4283bv.p4354e.p4356b.p4358b.p4359a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57696b;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57788t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.a.x */
/* compiled from: PG */
public final class C57109x extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C57109x f152452e;

    /* renamed from: g */
    private static volatile C63010eb f152453g;

    /* renamed from: a */
    public int f152454a;

    /* renamed from: b */
    public int f152455b = 0;

    /* renamed from: c */
    public Object f152456c;

    /* renamed from: d */
    public C57696b f152457d;

    /* renamed from: f */
    private byte f152458f = 2;

    static {
        C57109x xVar = new C57109x();
        f152452e = xVar;
        C62942bv.registerDefaultInstance(C57109x.class, xVar);
    }

    private C57109x() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152458f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152458f = b;
                return null;
            case 2:
                return newMessageInfo(f152452e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᐼ\u0000\u0002ᐉ\u0002\u0003ᐼ\u0000", new Object[]{C45240c.f118157a, "b", "a", C57784p.class, "d", C57788t.class});
            case 3:
                return new C57109x();
            case 4:
                return new C57108w();
            case 5:
                return f152452e;
            case 6:
                C63010eb ebVar = f152453g;
                if (ebVar == null) {
                    synchronized (C57109x.class) {
                        ebVar = f152453g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152452e);
                            f152453g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
