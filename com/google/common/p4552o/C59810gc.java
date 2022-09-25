package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.gc */
/* compiled from: PG */
public final class C59810gc extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59810gc f161631d;

    /* renamed from: e */
    private static volatile C63010eb f161632e;

    /* renamed from: a */
    public int f161633a;

    /* renamed from: b */
    public String f161634b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f161635c = BuildConfig.FLAVOR;

    static {
        C59810gc gcVar = new C59810gc();
        f161631d = gcVar;
        C62942bv.registerDefaultInstance(C59810gc.class, gcVar);
    }

    private C59810gc() {
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
                return newMessageInfo(f161631d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C59810gc();
            case 4:
                return new C59809gb();
            case 5:
                return f161631d;
            case 6:
                C63010eb ebVar = f161632e;
                if (ebVar == null) {
                    synchronized (C59810gc.class) {
                        ebVar = f161632e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161631d);
                            f161632e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
