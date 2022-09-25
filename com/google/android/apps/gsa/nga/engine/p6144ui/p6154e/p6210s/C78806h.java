package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.s.h */
/* compiled from: PG */
public final class C78806h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C78806h f216899c;

    /* renamed from: d */
    private static volatile C63010eb f216900d;

    /* renamed from: a */
    public long f216901a;

    /* renamed from: b */
    public int f216902b;

    static {
        C78806h hVar = new C78806h();
        f216899c = hVar;
        C62942bv.registerDefaultInstance(C78806h.class, hVar);
    }

    private C78806h() {
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
                return newMessageInfo(f216899c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\f\u0003\u0002", new Object[]{"b", "a"});
            case 3:
                return new C78806h();
            case 4:
                return new C78804f();
            case 5:
                return f216899c;
            case 6:
                C63010eb ebVar = f216900d;
                if (ebVar == null) {
                    synchronized (C78806h.class) {
                        ebVar = f216900d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f216899c);
                            f216900d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
