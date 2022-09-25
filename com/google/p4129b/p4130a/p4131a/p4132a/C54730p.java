package com.google.p4129b.p4130a.p4131a.p4132a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.b.a.a.a.p */
/* compiled from: PG */
public final class C54730p extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54730p f143631b;

    /* renamed from: c */
    private static volatile C63010eb f143632c;

    /* renamed from: a */
    public C63088z f143633a = C63088z.f170246b;

    static {
        C54730p pVar = new C54730p();
        f143631b = pVar;
        C62942bv.registerDefaultInstance(C54730p.class, pVar);
    }

    private C54730p() {
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
                return newMessageInfo(f143631b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"a"});
            case 3:
                return new C54730p();
            case 4:
                return new C54729o();
            case 5:
                return f143631b;
            case 6:
                C63010eb ebVar = f143632c;
                if (ebVar == null) {
                    synchronized (C54730p.class) {
                        ebVar = f143632c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143631b);
                            f143632c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
