package com.google.protos.p5129p.p5131b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.p.b.dj */
/* compiled from: PG */
public final class C65833dj extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65833dj f178962b;

    /* renamed from: d */
    private static volatile C63010eb f178963d;

    /* renamed from: a */
    public String f178964a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f178965c;

    static {
        C65833dj djVar = new C65833dj();
        f178962b = djVar;
        C62942bv.registerDefaultInstance(C65833dj.class, djVar);
    }

    private C65833dj() {
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
                return newMessageInfo(f178962b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C65833dj();
            case 4:
                return new C65832di();
            case 5:
                return f178962b;
            case 6:
                C63010eb ebVar = f178963d;
                if (ebVar == null) {
                    synchronized (C65833dj.class) {
                        ebVar = f178963d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178962b);
                            f178963d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
