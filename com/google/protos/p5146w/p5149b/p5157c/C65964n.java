package com.google.protos.p5146w.p5149b.p5157c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.w.b.c.n */
/* compiled from: PG */
public final class C65964n extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65964n f179430b;

    /* renamed from: d */
    private static volatile C63010eb f179431d;

    /* renamed from: a */
    public String f179432a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f179433c;

    static {
        C65964n nVar = new C65964n();
        f179430b = nVar;
        C62942bv.registerDefaultInstance(C65964n.class, nVar);
    }

    private C65964n() {
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
                return newMessageInfo(f179430b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C65964n();
            case 4:
                return new C65963m();
            case 5:
                return f179430b;
            case 6:
                C63010eb ebVar = f179431d;
                if (ebVar == null) {
                    synchronized (C65964n.class) {
                        ebVar = f179431d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179430b);
                            f179431d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
