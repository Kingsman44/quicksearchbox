package com.google.android.libraries.mdi.download;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.mdi.download.ed */
/* compiled from: PG */
public final class C29380ed extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C29380ed f79641f;

    /* renamed from: g */
    private static volatile C63010eb f79642g;

    /* renamed from: a */
    public int f79643a;

    /* renamed from: b */
    public int f79644b;

    /* renamed from: c */
    public int f79645c;

    /* renamed from: d */
    public long f79646d;

    /* renamed from: e */
    public int f79647e;

    static {
        C29380ed edVar = new C29380ed();
        f79641f = edVar;
        C62942bv.registerDefaultInstance(C29380ed.class, edVar);
    }

    private C29380ed() {
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
                return newMessageInfo(f79641f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0003\u0004ဂ\u0002", new Object[]{"a", "b", C29378eb.f79640a, C45240c.f118157a, C29342dz.f79531a, "e", C29339dw.f79530a, "d"});
            case 3:
                return new C29380ed();
            case 4:
                return new C29341dy();
            case 5:
                return f79641f;
            case 6:
                C63010eb ebVar = f79642g;
                if (ebVar == null) {
                    synchronized (C29380ed.class) {
                        ebVar = f79642g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f79641f);
                            f79642g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
