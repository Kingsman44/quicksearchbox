package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.ih */
/* compiled from: PG */
public final class C83000ih extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C83000ih f226494e;

    /* renamed from: f */
    private static volatile C63010eb f226495f;

    /* renamed from: a */
    public int f226496a;

    /* renamed from: b */
    public int f226497b;

    /* renamed from: c */
    public boolean f226498c;

    /* renamed from: d */
    public boolean f226499d;

    static {
        C83000ih ihVar = new C83000ih();
        f226494e = ihVar;
        C62942bv.registerDefaultInstance(C83000ih.class, ihVar);
    }

    private C83000ih() {
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
                return newMessageInfo(f226494e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C82999ig.f226493a, C45240c.f118157a, "d"});
            case 3:
                return new C83000ih();
            case 4:
                return new C82998if();
            case 5:
                return f226494e;
            case 6:
                C63010eb ebVar = f226495f;
                if (ebVar == null) {
                    synchronized (C83000ih.class) {
                        ebVar = f226495f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226494e);
                            f226495f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
