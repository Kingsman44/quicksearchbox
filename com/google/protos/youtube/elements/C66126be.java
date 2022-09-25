package com.google.protos.youtube.elements;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.be */
/* compiled from: PG */
public final class C66126be extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66126be f179824d;

    /* renamed from: e */
    private static volatile C63010eb f179825e;

    /* renamed from: a */
    public int f179826a;

    /* renamed from: b */
    public String f179827b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f179828c;

    static {
        C66126be beVar = new C66126be();
        f179824d = beVar;
        C62942bv.registerDefaultInstance(C66126be.class, beVar);
    }

    private C66126be() {
        emptyIntList();
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
                return newMessageInfo(f179824d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66126be();
            case 4:
                return new C66125bd();
            case 5:
                return f179824d;
            case 6:
                C63010eb ebVar = f179825e;
                if (ebVar == null) {
                    synchronized (C66126be.class) {
                        ebVar = f179825e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179824d);
                            f179825e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
