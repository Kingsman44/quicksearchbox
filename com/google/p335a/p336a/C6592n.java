package com.google.p335a.p336a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.a.a.n */
/* compiled from: PG */
public final class C6592n extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C6592n f19595d;

    /* renamed from: e */
    private static volatile C63010eb f19596e;

    /* renamed from: a */
    public int f19597a;

    /* renamed from: b */
    public int f19598b;

    /* renamed from: c */
    public String f19599c = BuildConfig.FLAVOR;

    static {
        C6592n nVar = new C6592n();
        f19595d = nVar;
        C62942bv.registerDefaultInstance(C6592n.class, nVar);
    }

    private C6592n() {
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
                return newMessageInfo(f19595d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C6590l.f19594a, C45240c.f118157a});
            case 3:
                return new C6592n();
            case 4:
                return new C6589k();
            case 5:
                return f19595d;
            case 6:
                C63010eb ebVar = f19596e;
                if (ebVar == null) {
                    synchronized (C6592n.class) {
                        ebVar = f19596e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f19595d);
                            f19596e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
