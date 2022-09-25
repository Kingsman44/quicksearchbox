package com.google.p4017at.p4049f.p4050a.p4053b.p4054a.p4055a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.f.a.b.a.a.o */
/* compiled from: PG */
public final class C53950o extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53950o f141546c;

    /* renamed from: d */
    private static volatile C63010eb f141547d;

    /* renamed from: a */
    public int f141548a;

    /* renamed from: b */
    public int f141549b;

    static {
        C53950o oVar = new C53950o();
        f141546c = oVar;
        C62942bv.registerDefaultInstance(C53950o.class, oVar);
    }

    private C53950o() {
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
                return newMessageInfo(f141546c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C53949n.f141545a});
            case 3:
                return new C53950o();
            case 4:
                return new C53948m();
            case 5:
                return f141546c;
            case 6:
                C63010eb ebVar = f141547d;
                if (ebVar == null) {
                    synchronized (C53950o.class) {
                        ebVar = f141547d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141546c);
                            f141547d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
