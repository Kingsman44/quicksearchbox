package com.google.protos.p4757ac.p4758a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ac.a.f */
/* compiled from: PG */
public final class C63107f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63107f f170337d;

    /* renamed from: e */
    private static volatile C63010eb f170338e;

    /* renamed from: a */
    public int f170339a;

    /* renamed from: b */
    public String f170340b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f170341c = BuildConfig.FLAVOR;

    static {
        C63107f fVar = new C63107f();
        f170337d = fVar;
        C62942bv.registerDefaultInstance(C63107f.class, fVar);
    }

    private C63107f() {
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
                return newMessageInfo(f170337d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C63107f();
            case 4:
                return new C63106e();
            case 5:
                return f170337d;
            case 6:
                C63010eb ebVar = f170338e;
                if (ebVar == null) {
                    synchronized (C63107f.class) {
                        ebVar = f170338e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170337d);
                            f170338e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
