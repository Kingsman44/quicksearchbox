package com.google.android.apps.gsa.nga.shared.p6345h;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.m */
/* compiled from: PG */
public final class C81317m extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C81317m f222586d;

    /* renamed from: e */
    private static volatile C63010eb f222587e;

    /* renamed from: a */
    public int f222588a;

    /* renamed from: b */
    public int f222589b;

    /* renamed from: c */
    public long f222590c;

    static {
        C81317m mVar = new C81317m();
        f222586d = mVar;
        C62942bv.registerDefaultInstance(C81317m.class, mVar);
    }

    private C81317m() {
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
                return newMessageInfo(f222586d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C81317m();
            case 4:
                return new C81316l();
            case 5:
                return f222586d;
            case 6:
                C63010eb ebVar = f222587e;
                if (ebVar == null) {
                    synchronized (C81317m.class) {
                        ebVar = f222587e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222586d);
                            f222587e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
