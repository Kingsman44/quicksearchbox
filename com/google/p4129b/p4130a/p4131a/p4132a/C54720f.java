package com.google.p4129b.p4130a.p4131a.p4132a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.b.a.a.a.f */
/* compiled from: PG */
public final class C54720f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54720f f143614b;

    /* renamed from: c */
    private static volatile C63010eb f143615c;

    /* renamed from: a */
    public C63088z f143616a = C63088z.f170246b;

    static {
        C54720f fVar = new C54720f();
        f143614b = fVar;
        C62942bv.registerDefaultInstance(C54720f.class, fVar);
    }

    private C54720f() {
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
                return newMessageInfo(f143614b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"a"});
            case 3:
                return new C54720f();
            case 4:
                return new C54719e();
            case 5:
                return f143614b;
            case 6:
                C63010eb ebVar = f143615c;
                if (ebVar == null) {
                    synchronized (C54720f.class) {
                        ebVar = f143615c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143614b);
                            f143615c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
