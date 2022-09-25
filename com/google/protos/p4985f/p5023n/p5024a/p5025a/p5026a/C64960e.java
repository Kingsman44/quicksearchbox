package com.google.protos.p4985f.p5023n.p5024a.p5025a.p5026a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.n.a.a.a.e */
/* compiled from: PG */
public final class C64960e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64960e f175922c;

    /* renamed from: d */
    private static volatile C63010eb f175923d;

    /* renamed from: a */
    public int f175924a = 0;

    /* renamed from: b */
    public Object f175925b;

    static {
        C64960e eVar = new C64960e();
        f175922c = eVar;
        C62942bv.registerDefaultInstance(C64960e.class, eVar);
    }

    private C64960e() {
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
                return newMessageInfo(f175922c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ျ\u0000\u0002ျ\u0000\u0003ြ\u0000", new Object[]{"b", "a", C64959d.class});
            case 3:
                return new C64960e();
            case 4:
                return new C64957b();
            case 5:
                return f175922c;
            case 6:
                C63010eb ebVar = f175923d;
                if (ebVar == null) {
                    synchronized (C64960e.class) {
                        ebVar = f175923d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175922c);
                            f175923d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
