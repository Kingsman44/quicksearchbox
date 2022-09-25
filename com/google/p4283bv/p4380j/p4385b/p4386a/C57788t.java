package com.google.p4283bv.p4380j.p4385b.p4386a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.youtube.elements.C66166ck;

/* renamed from: com.google.bv.j.b.a.t */
/* compiled from: PG */
public final class C57788t extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C57788t f154394a;

    /* renamed from: e */
    private static volatile C63010eb f154395e;

    /* renamed from: b */
    private int f154396b;

    /* renamed from: c */
    private C66166ck f154397c;

    /* renamed from: d */
    private byte f154398d = 2;

    static {
        C57788t tVar = new C57788t();
        f154394a = tVar;
        C62942bv.registerDefaultInstance(C57788t.class, tVar);
    }

    private C57788t() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f154398d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f154398d = b;
                return null;
            case 2:
                return newMessageInfo(f154394a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C57788t();
            case 4:
                return new C57787s();
            case 5:
                return f154394a;
            case 6:
                C63010eb ebVar = f154395e;
                if (ebVar == null) {
                    synchronized (C57788t.class) {
                        ebVar = f154395e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154394a);
                            f154395e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
