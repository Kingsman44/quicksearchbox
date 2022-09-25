package com.google.protos.p4816ai.p4820d.p4828e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ai.d.e.g */
/* compiled from: PG */
public final class C63249g extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C63249g f170895f;

    /* renamed from: g */
    private static volatile C63010eb f170896g;

    /* renamed from: a */
    public int f170897a;

    /* renamed from: b */
    public long f170898b;

    /* renamed from: c */
    public long f170899c;

    /* renamed from: d */
    public long f170900d;

    /* renamed from: e */
    public int f170901e;

    static {
        C63249g gVar = new C63249g();
        f170895f = gVar;
        C62942bv.registerDefaultInstance(C63249g.class, gVar);
    }

    private C63249g() {
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
                return newMessageInfo(f170895f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C63247e.f170894a});
            case 3:
                return new C63249g();
            case 4:
                return new C63248f();
            case 5:
                return f170895f;
            case 6:
                C63010eb ebVar = f170896g;
                if (ebVar == null) {
                    synchronized (C63249g.class) {
                        ebVar = f170896g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170895f);
                            f170896g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
