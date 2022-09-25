package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.fj */
/* compiled from: PG */
public final class C59782fj extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59782fj f161528d;

    /* renamed from: f */
    private static volatile C63010eb f161529f;

    /* renamed from: a */
    public String f161530a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public boolean f161531b;

    /* renamed from: c */
    public boolean f161532c;

    /* renamed from: e */
    private int f161533e;

    static {
        C59782fj fjVar = new C59782fj();
        f161528d = fjVar;
        C62942bv.registerDefaultInstance(C59782fj.class, fjVar);
    }

    private C59782fj() {
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
                return newMessageInfo(f161528d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C59782fj();
            case 4:
                return new C59781fi();
            case 5:
                return f161528d;
            case 6:
                C63010eb ebVar = f161529f;
                if (ebVar == null) {
                    synchronized (C59782fj.class) {
                        ebVar = f161529f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161528d);
                            f161529f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
