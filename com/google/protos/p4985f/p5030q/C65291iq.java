package com.google.protos.p4985f.p5030q;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.iq */
/* compiled from: PG */
public final class C65291iq extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C65291iq f176610d;

    /* renamed from: e */
    private static volatile C63010eb f176611e;

    /* renamed from: a */
    public int f176612a;

    /* renamed from: b */
    public String f176613b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f176614c;

    static {
        C65291iq iqVar = new C65291iq();
        f176610d = iqVar;
        C62942bv.registerDefaultInstance(C65291iq.class, iqVar);
    }

    private C65291iq() {
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
                return newMessageInfo(f176610d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C65292ir.f176615a});
            case 3:
                return new C65291iq();
            case 4:
                return new C65290ip();
            case 5:
                return f176610d;
            case 6:
                C63010eb ebVar = f176611e;
                if (ebVar == null) {
                    synchronized (C65291iq.class) {
                        ebVar = f176611e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176610d);
                            f176611e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
