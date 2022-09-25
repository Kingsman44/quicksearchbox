package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.b.g */
/* compiled from: PG */
public final class C80377g extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C80377g f220548e;

    /* renamed from: g */
    private static volatile C63010eb f220549g;

    /* renamed from: a */
    public boolean f220550a;

    /* renamed from: b */
    public int f220551b;

    /* renamed from: c */
    public double f220552c;

    /* renamed from: d */
    public C80375e f220553d;

    /* renamed from: f */
    private byte f220554f = 2;

    static {
        C80377g gVar = new C80377g();
        f220548e = gVar;
        C62942bv.registerDefaultInstance(C80377g.class, gVar);
    }

    private C80377g() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f220554f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f220554f = b;
                return null;
            case 2:
                return newMessageInfo(f220548e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0001\u0001\u0007\u0002\f\u0003\u0000\u0004Љ", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C80377g();
            case 4:
                return new C80376f();
            case 5:
                return f220548e;
            case 6:
                C63010eb ebVar = f220549g;
                if (ebVar == null) {
                    synchronized (C80377g.class) {
                        ebVar = f220549g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220548e);
                            f220549g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
