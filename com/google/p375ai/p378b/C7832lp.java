package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.lp */
/* compiled from: PG */
public final class C7832lp extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C7832lp f27462d;

    /* renamed from: e */
    private static volatile C63010eb f27463e;

    /* renamed from: a */
    public int f27464a;

    /* renamed from: b */
    public int f27465b = 1;

    /* renamed from: c */
    public String f27466c = BuildConfig.FLAVOR;

    static {
        C7832lp lpVar = new C7832lp();
        f27462d = lpVar;
        C62942bv.registerDefaultInstance(C7832lp.class, lpVar);
    }

    private C7832lp() {
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
                return newMessageInfo(f27462d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C7830ln.f27461a, C45240c.f118157a});
            case 3:
                return new C7832lp();
            case 4:
                return new C7829lm();
            case 5:
                return f27462d;
            case 6:
                C63010eb ebVar = f27463e;
                if (ebVar == null) {
                    synchronized (C7832lp.class) {
                        ebVar = f27463e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27462d);
                            f27463e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
