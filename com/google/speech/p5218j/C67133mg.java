package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.mg */
/* compiled from: PG */
public final class C67133mg extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67133mg f182480c;

    /* renamed from: d */
    private static volatile C63010eb f182481d;

    /* renamed from: a */
    public int f182482a;

    /* renamed from: b */
    public C67135mi f182483b;

    static {
        C67133mg mgVar = new C67133mg();
        f182480c = mgVar;
        C62942bv.registerDefaultInstance(C67133mg.class, mgVar);
    }

    private C67133mg() {
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
                return newMessageInfo(f182480c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C67133mg();
            case 4:
                return new C67132mf();
            case 5:
                return f182480c;
            case 6:
                C63010eb ebVar = f182481d;
                if (ebVar == null) {
                    synchronized (C67133mg.class) {
                        ebVar = f182481d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182480c);
                            f182481d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
