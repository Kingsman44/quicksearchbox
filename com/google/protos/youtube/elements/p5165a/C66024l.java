package com.google.protos.youtube.elements.p5165a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.a.l */
/* compiled from: PG */
public final class C66024l extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C66024l f179553e;

    /* renamed from: f */
    private static volatile C63010eb f179554f;

    /* renamed from: a */
    public int f179555a;

    /* renamed from: b */
    public int f179556b;

    /* renamed from: c */
    public int f179557c;

    /* renamed from: d */
    public String f179558d = BuildConfig.FLAVOR;

    static {
        C66024l lVar = new C66024l();
        f179553e = lVar;
        C62942bv.registerDefaultInstance(C66024l.class, lVar);
    }

    private C66024l() {
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
                return newMessageInfo(f179553e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C66024l();
            case 4:
                return new C66023k();
            case 5:
                return f179553e;
            case 6:
                C63010eb ebVar = f179554f;
                if (ebVar == null) {
                    synchronized (C66024l.class) {
                        ebVar = f179554f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179553e);
                            f179554f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
