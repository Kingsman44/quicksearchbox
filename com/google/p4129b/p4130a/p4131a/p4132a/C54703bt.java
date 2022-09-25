package com.google.p4129b.p4130a.p4131a.p4132a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.b.a.a.a.bt */
/* compiled from: PG */
public final class C54703bt extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54703bt f143586c;

    /* renamed from: d */
    private static volatile C63010eb f143587d;

    /* renamed from: a */
    public int f143588a;

    /* renamed from: b */
    public C62971cq f143589b = emptyProtobufList();

    static {
        C54703bt btVar = new C54703bt();
        f143586c = btVar;
        C62942bv.registerDefaultInstance(C54703bt.class, btVar);
    }

    private C54703bt() {
        C63088z zVar = C63088z.f170246b;
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
                return newMessageInfo(f143586c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"a", "b", C54699bp.class});
            case 3:
                return new C54703bt();
            case 4:
                return new C54702bs();
            case 5:
                return f143586c;
            case 6:
                C63010eb ebVar = f143587d;
                if (ebVar == null) {
                    synchronized (C54703bt.class) {
                        ebVar = f143587d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143586c);
                            f143587d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
