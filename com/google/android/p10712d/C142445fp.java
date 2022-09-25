package com.google.android.p10712d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.fp */
/* compiled from: PG */
public final class C142445fp extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C142445fp f386524d;

    /* renamed from: e */
    private static volatile C63010eb f386525e;

    /* renamed from: a */
    public int f386526a;

    /* renamed from: b */
    public int f386527b;

    /* renamed from: c */
    public String f386528c = BuildConfig.FLAVOR;

    static {
        C142445fp fpVar = new C142445fp();
        f386524d = fpVar;
        C62942bv.registerDefaultInstance(C142445fp.class, fpVar);
    }

    private C142445fp() {
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
                return newMessageInfo(f386524d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C142445fp();
            case 4:
                return new C142444fo();
            case 5:
                return f386524d;
            case 6:
                C63010eb ebVar = f386525e;
                if (ebVar == null) {
                    synchronized (C142445fp.class) {
                        ebVar = f386525e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386524d);
                            f386525e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
