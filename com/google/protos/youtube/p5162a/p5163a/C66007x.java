package com.google.protos.youtube.p5162a.p5163a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.a.a.x */
/* compiled from: PG */
public final class C66007x extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66007x f179502b;

    /* renamed from: d */
    private static volatile C63010eb f179503d;

    /* renamed from: a */
    public String f179504a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f179505c;

    static {
        C66007x xVar = new C66007x();
        f179502b = xVar;
        C62942bv.registerDefaultInstance(C66007x.class, xVar);
    }

    private C66007x() {
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
                return newMessageInfo(f179502b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C66007x();
            case 4:
                return new C66006w();
            case 5:
                return f179502b;
            case 6:
                C63010eb ebVar = f179503d;
                if (ebVar == null) {
                    synchronized (C66007x.class) {
                        ebVar = f179503d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179502b);
                            f179503d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
