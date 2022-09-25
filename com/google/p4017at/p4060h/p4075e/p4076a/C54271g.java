package com.google.p4017at.p4060h.p4075e.p4076a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.e.a.g */
/* compiled from: PG */
public final class C54271g extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C54271g f142505e;

    /* renamed from: g */
    private static volatile C63010eb f142506g;

    /* renamed from: a */
    public int f142507a;

    /* renamed from: b */
    public C57784p f142508b;

    /* renamed from: c */
    public C57784p f142509c;

    /* renamed from: d */
    public C57784p f142510d;

    /* renamed from: f */
    private byte f142511f = 2;

    static {
        C54271g gVar = new C54271g();
        f142505e = gVar;
        C62942bv.registerDefaultInstance(C54271g.class, gVar);
    }

    private C54271g() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f142511f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f142511f = b;
                return null;
            case 2:
                return newMessageInfo(f142505e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C54271g();
            case 4:
                return new C54270f();
            case 5:
                return f142505e;
            case 6:
                C63010eb ebVar = f142506g;
                if (ebVar == null) {
                    synchronized (C54271g.class) {
                        ebVar = f142506g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142505e);
                            f142506g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
