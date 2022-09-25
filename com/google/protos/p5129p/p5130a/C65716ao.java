package com.google.protos.p5129p.p5130a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.p.a.ao */
/* compiled from: PG */
public final class C65716ao extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C65716ao f178536d;

    /* renamed from: e */
    private static volatile C63010eb f178537e;

    /* renamed from: a */
    public int f178538a;

    /* renamed from: b */
    public int f178539b;

    /* renamed from: c */
    public String f178540c = BuildConfig.FLAVOR;

    static {
        C65716ao aoVar = new C65716ao();
        f178536d = aoVar;
        C62942bv.registerDefaultInstance(C65716ao.class, aoVar);
    }

    private C65716ao() {
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
                return newMessageInfo(f178536d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C65714am.f178535a, C45240c.f118157a});
            case 3:
                return new C65716ao();
            case 4:
                return new C65713al();
            case 5:
                return f178536d;
            case 6:
                C63010eb ebVar = f178537e;
                if (ebVar == null) {
                    synchronized (C65716ao.class) {
                        ebVar = f178537e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178536d);
                            f178537e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
