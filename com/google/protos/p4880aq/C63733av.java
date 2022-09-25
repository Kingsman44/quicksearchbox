package com.google.protos.p4880aq;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aq.av */
/* compiled from: PG */
public final class C63733av extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63733av f172308c;

    /* renamed from: d */
    private static volatile C63010eb f172309d;

    /* renamed from: a */
    public int f172310a = 0;

    /* renamed from: b */
    public Object f172311b;

    static {
        C63733av avVar = new C63733av();
        f172308c = avVar;
        C62942bv.registerDefaultInstance(C63733av.class, avVar);
    }

    private C63733av() {
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
                return newMessageInfo(f172308c, "\u0001\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000", new Object[]{"b", "a", C63760q.class, C63760q.class, C63760q.class, C63745bg.class, C63747d.class, C63745bg.class});
            case 3:
                return new C63733av();
            case 4:
                return new C63731at();
            case 5:
                return f172308c;
            case 6:
                C63010eb ebVar = f172309d;
                if (ebVar == null) {
                    synchronized (C63733av.class) {
                        ebVar = f172309d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172308c);
                            f172309d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
