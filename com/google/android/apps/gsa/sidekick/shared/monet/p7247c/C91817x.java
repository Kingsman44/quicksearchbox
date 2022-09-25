package com.google.android.apps.gsa.sidekick.shared.monet.p7247c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.c.x */
/* compiled from: PG */
public final class C91817x extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C91817x f256076d;

    /* renamed from: e */
    private static volatile C63010eb f256077e;

    /* renamed from: a */
    public int f256078a;

    /* renamed from: b */
    public String f256079b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f256080c;

    static {
        C91817x xVar = new C91817x();
        f256076d = xVar;
        C62942bv.registerDefaultInstance(C91817x.class, xVar);
    }

    private C91817x() {
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
                return newMessageInfo(f256076d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C91817x();
            case 4:
                return new C91816w();
            case 5:
                return f256076d;
            case 6:
                C63010eb ebVar = f256077e;
                if (ebVar == null) {
                    synchronized (C91817x.class) {
                        ebVar = f256077e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f256076d);
                            f256077e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
