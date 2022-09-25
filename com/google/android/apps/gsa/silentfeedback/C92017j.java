package com.google.android.apps.gsa.silentfeedback;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.silentfeedback.j */
/* compiled from: PG */
public final class C92017j extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C92017j f256539d;

    /* renamed from: e */
    private static volatile C63010eb f256540e;

    /* renamed from: a */
    public int f256541a;

    /* renamed from: b */
    public boolean f256542b = true;

    /* renamed from: c */
    public long f256543c = 10;

    static {
        C92017j jVar = new C92017j();
        f256539d = jVar;
        C62942bv.registerDefaultInstance(C92017j.class, jVar);
    }

    private C92017j() {
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
                return newMessageInfo(f256539d, "\u0001\u0002\u0000\u0001\u0016\u0017\u0002\u0000\u0000\u0000\u0016ဇ\u0000\u0017ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C92017j();
            case 4:
                return new C92016i();
            case 5:
                return f256539d;
            case 6:
                C63010eb ebVar = f256540e;
                if (ebVar == null) {
                    synchronized (C92017j.class) {
                        ebVar = f256540e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f256539d);
                            f256540e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
