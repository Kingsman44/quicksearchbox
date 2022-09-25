package com.google.p4283bv.p4354e.p4356b.p4358b.p4359a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57696b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.a.r */
/* compiled from: PG */
public final class C57103r extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57103r f152436d;

    /* renamed from: f */
    private static volatile C63010eb f152437f;

    /* renamed from: a */
    public int f152438a;

    /* renamed from: b */
    public int f152439b;

    /* renamed from: c */
    public C57696b f152440c;

    /* renamed from: e */
    private byte f152441e = 2;

    static {
        C57103r rVar = new C57103r();
        f152436d = rVar;
        C62942bv.registerDefaultInstance(C57103r.class, rVar);
    }

    private C57103r() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152441e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152441e = b;
                return null;
            case 2:
                return newMessageInfo(f152436d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C57101p.f152435a, C45240c.f118157a});
            case 3:
                return new C57103r();
            case 4:
                return new C57100o();
            case 5:
                return f152436d;
            case 6:
                C63010eb ebVar = f152437f;
                if (ebVar == null) {
                    synchronized (C57103r.class) {
                        ebVar = f152437f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152436d);
                            f152437f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
