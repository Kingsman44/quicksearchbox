package com.google.android.p10712d;

import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.cz */
/* compiled from: PG */
public final class C142374cz extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C142374cz f386329e;

    /* renamed from: f */
    private static volatile C63010eb f386330f;

    /* renamed from: a */
    public int f386331a;

    /* renamed from: b */
    public int f386332b = 16000;

    /* renamed from: c */
    public int f386333c = 24;

    /* renamed from: d */
    public int f386334d = SimpleSnackbar.LENGTH_SHORT;

    static {
        C142374cz czVar = new C142374cz();
        f386329e = czVar;
        C62942bv.registerDefaultInstance(C142374cz.class, czVar);
    }

    private C142374cz() {
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
                return newMessageInfo(f386329e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C142374cz();
            case 4:
                return new C142373cy();
            case 5:
                return f386329e;
            case 6:
                C63010eb ebVar = f386330f;
                if (ebVar == null) {
                    synchronized (C142374cz.class) {
                        ebVar = f386330f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386329e);
                            f386330f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
