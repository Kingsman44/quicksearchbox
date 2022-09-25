package com.google.android.apps.gsa.nga.engine.p6044n.p6052e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.e.f */
/* compiled from: PG */
public final class C76433f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C76433f f211581b;

    /* renamed from: d */
    private static volatile C63010eb f211582d;

    /* renamed from: a */
    public String f211583a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f211584c;

    static {
        C76433f fVar = new C76433f();
        f211581b = fVar;
        C62942bv.registerDefaultInstance(C76433f.class, fVar);
    }

    private C76433f() {
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
                return newMessageInfo(f211581b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C76433f();
            case 4:
                return new C76432e();
            case 5:
                return f211581b;
            case 6:
                C63010eb ebVar = f211582d;
                if (ebVar == null) {
                    synchronized (C76433f.class) {
                        ebVar = f211582d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f211581b);
                            f211582d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
