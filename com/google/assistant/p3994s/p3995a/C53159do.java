package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.s.a.do */
/* compiled from: PG */
public final class C53159do extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53159do f139327d;

    /* renamed from: e */
    private static volatile C63010eb f139328e;

    /* renamed from: a */
    public int f139329a;

    /* renamed from: b */
    public String f139330b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C63088z f139331c = C63088z.f170246b;

    static {
        C53159do doVar = new C53159do();
        f139327d = doVar;
        C62942bv.registerDefaultInstance(C53159do.class, doVar);
    }

    private C53159do() {
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
                return newMessageInfo(f139327d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ည\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C53159do();
            case 4:
                return new C53158dn();
            case 5:
                return f139327d;
            case 6:
                C63010eb ebVar = f139328e;
                if (ebVar == null) {
                    synchronized (C53159do.class) {
                        ebVar = f139328e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139327d);
                            f139328e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
