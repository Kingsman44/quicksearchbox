package com.google.android.p10712d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.bu */
/* compiled from: PG */
public final class C142342bu extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C142342bu f386204d;

    /* renamed from: e */
    private static volatile C63010eb f386205e;

    /* renamed from: a */
    public int f386206a;

    /* renamed from: b */
    public String f386207b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f386208c = BuildConfig.FLAVOR;

    static {
        C142342bu buVar = new C142342bu();
        f386204d = buVar;
        C62942bv.registerDefaultInstance(C142342bu.class, buVar);
    }

    private C142342bu() {
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
                return newMessageInfo(f386204d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C142342bu();
            case 4:
                return new C142341bt();
            case 5:
                return f386204d;
            case 6:
                C63010eb ebVar = f386205e;
                if (ebVar == null) {
                    synchronized (C142342bu.class) {
                        ebVar = f386205e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386204d);
                            f386205e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
