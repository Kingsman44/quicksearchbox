package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.s.k */
/* compiled from: PG */
public final class C78809k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C78809k f216908c;

    /* renamed from: d */
    private static volatile C63010eb f216909d;

    /* renamed from: a */
    public long f216910a;

    /* renamed from: b */
    public int f216911b;

    static {
        C78809k kVar = new C78809k();
        f216908c = kVar;
        C62942bv.registerDefaultInstance(C78809k.class, kVar);
    }

    private C78809k() {
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
                return newMessageInfo(f216908c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\f\u0003\u0002", new Object[]{"b", "a"});
            case 3:
                return new C78809k();
            case 4:
                return new C78807i();
            case 5:
                return f216908c;
            case 6:
                C63010eb ebVar = f216909d;
                if (ebVar == null) {
                    synchronized (C78809k.class) {
                        ebVar = f216909d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f216908c);
                            f216909d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
