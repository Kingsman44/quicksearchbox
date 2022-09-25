package com.google.protos.p5127o.p5128a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.nlp.p4730a.C62785e;
import com.google.nlp.p4730a.C62799s;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.o.a.v */
/* compiled from: PG */
public final class C65641v extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65641v f178364a;

    /* renamed from: f */
    private static volatile C63010eb f178365f;

    /* renamed from: b */
    private int f178366b;

    /* renamed from: c */
    private C62799s f178367c;

    /* renamed from: d */
    private C62785e f178368d;

    /* renamed from: e */
    private byte f178369e = 2;

    static {
        C65641v vVar = new C65641v();
        f178364a = vVar;
        C62942bv.registerDefaultInstance(C65641v.class, vVar);
    }

    private C65641v() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f178369e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f178369e = b;
                return null;
            case 2:
                return newMessageInfo(f178364a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"b", C45240c.f118157a, "d"});
            case 3:
                return new C65641v();
            case 4:
                return new C65640u();
            case 5:
                return f178364a;
            case 6:
                C63010eb ebVar = f178365f;
                if (ebVar == null) {
                    synchronized (C65641v.class) {
                        ebVar = f178365f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178364a);
                            f178365f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
