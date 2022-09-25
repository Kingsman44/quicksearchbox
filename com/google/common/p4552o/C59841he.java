package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.he */
/* compiled from: PG */
public final class C59841he extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59841he f161712d;

    /* renamed from: e */
    private static volatile C63010eb f161713e;

    /* renamed from: a */
    public int f161714a;

    /* renamed from: b */
    public String f161715b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f161716c = BuildConfig.FLAVOR;

    static {
        C59841he heVar = new C59841he();
        f161712d = heVar;
        C62942bv.registerDefaultInstance(C59841he.class, heVar);
    }

    private C59841he() {
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
                return newMessageInfo(f161712d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C59841he();
            case 4:
                return new C59840hd();
            case 5:
                return f161712d;
            case 6:
                C63010eb ebVar = f161713e;
                if (ebVar == null) {
                    synchronized (C59841he.class) {
                        ebVar = f161713e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161712d);
                            f161713e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
