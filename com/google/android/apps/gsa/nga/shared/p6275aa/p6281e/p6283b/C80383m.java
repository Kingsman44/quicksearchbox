package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80426f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.b.m */
/* compiled from: PG */
public final class C80383m extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C80383m f220568e;

    /* renamed from: f */
    private static volatile C63010eb f220569f;

    /* renamed from: a */
    public int f220570a;

    /* renamed from: b */
    public double f220571b;

    /* renamed from: c */
    public C80426f f220572c;

    /* renamed from: d */
    public boolean f220573d;

    static {
        C80383m mVar = new C80383m();
        f220568e = mVar;
        C62942bv.registerDefaultInstance(C80383m.class, mVar);
    }

    private C80383m() {
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
                return newMessageInfo(f220568e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\u0000\u0003\t\u0004\u0007", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C80383m();
            case 4:
                return new C80382l();
            case 5:
                return f220568e;
            case 6:
                C63010eb ebVar = f220569f;
                if (ebVar == null) {
                    synchronized (C80383m.class) {
                        ebVar = f220569f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220568e);
                            f220569f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
