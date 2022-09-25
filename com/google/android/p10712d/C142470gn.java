package com.google.android.p10712d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.gn */
/* compiled from: PG */
public final class C142470gn extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C142470gn f386633f;

    /* renamed from: g */
    private static volatile C63010eb f386634g;

    /* renamed from: a */
    public int f386635a = 0;

    /* renamed from: b */
    public Object f386636b;

    /* renamed from: c */
    public String f386637c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f386638d;

    /* renamed from: e */
    public long f386639e;

    static {
        C142470gn gnVar = new C142470gn();
        f386633f = gnVar;
        C62942bv.registerDefaultInstance(C142470gn.class, gnVar);
    }

    private C142470gn() {
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
                return newMessageInfo(f386633f, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȼ\u0000\u0004Ȼ\u0000\u0005\u0003", new Object[]{"b", "a", C45240c.f118157a, "d", "e"});
            case 3:
                return new C142470gn();
            case 4:
                return new C142469gm();
            case 5:
                return f386633f;
            case 6:
                C63010eb ebVar = f386634g;
                if (ebVar == null) {
                    synchronized (C142470gn.class) {
                        ebVar = f386634g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386633f);
                            f386634g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
