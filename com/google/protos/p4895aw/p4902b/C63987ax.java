package com.google.protos.p4895aw.p4902b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.b.ax */
/* compiled from: PG */
public final class C63987ax extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63987ax f173047d;

    /* renamed from: e */
    private static volatile C63010eb f173048e;

    /* renamed from: a */
    public int f173049a;

    /* renamed from: b */
    public boolean f173050b;

    /* renamed from: c */
    public int f173051c = 100;

    static {
        C63987ax axVar = new C63987ax();
        f173047d = axVar;
        C62942bv.registerDefaultInstance(C63987ax.class, axVar);
    }

    private C63987ax() {
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
                return newMessageInfo(f173047d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဋ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C63987ax();
            case 4:
                return new C63986aw();
            case 5:
                return f173047d;
            case 6:
                C63010eb ebVar = f173048e;
                if (ebVar == null) {
                    synchronized (C63987ax.class) {
                        ebVar = f173048e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173047d);
                            f173048e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
