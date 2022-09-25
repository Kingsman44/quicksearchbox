package com.google.p4017at.p4018a.p4019a.p4020a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.a.a.a.ar */
/* compiled from: PG */
public final class C53760ar extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53760ar f141123c;

    /* renamed from: d */
    private static volatile C63010eb f141124d;

    /* renamed from: a */
    public int f141125a;

    /* renamed from: b */
    public int f141126b;

    static {
        C53760ar arVar = new C53760ar();
        f141123c = arVar;
        C62942bv.registerDefaultInstance(C53760ar.class, arVar);
    }

    private C53760ar() {
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
                return newMessageInfo(f141123c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C53759aq.f141122a});
            case 3:
                return new C53760ar();
            case 4:
                return new C53758ap();
            case 5:
                return f141123c;
            case 6:
                C63010eb ebVar = f141124d;
                if (ebVar == null) {
                    synchronized (C53760ar.class) {
                        ebVar = f141124d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141123c);
                            f141124d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
