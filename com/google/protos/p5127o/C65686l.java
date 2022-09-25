package com.google.protos.p5127o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.o.l */
/* compiled from: PG */
public final class C65686l extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C65686l f178470d;

    /* renamed from: e */
    private static volatile C63010eb f178471e;

    /* renamed from: a */
    public int f178472a;

    /* renamed from: b */
    public String f178473b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f178474c = BuildConfig.FLAVOR;

    static {
        C65686l lVar = new C65686l();
        f178470d = lVar;
        C62942bv.registerDefaultInstance(C65686l.class, lVar);
    }

    private C65686l() {
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
                return newMessageInfo(f178470d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C65686l();
            case 4:
                return new C65685k();
            case 5:
                return f178470d;
            case 6:
                C63010eb ebVar = f178471e;
                if (ebVar == null) {
                    synchronized (C65686l.class) {
                        ebVar = f178471e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178470d);
                            f178471e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
