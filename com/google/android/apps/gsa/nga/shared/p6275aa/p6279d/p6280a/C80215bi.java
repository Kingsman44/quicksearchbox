package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.bi */
/* compiled from: PG */
public final class C80215bi extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C80215bi f220083d;

    /* renamed from: e */
    private static volatile C63010eb f220084e;

    /* renamed from: a */
    public int f220085a;

    /* renamed from: b */
    public int f220086b;

    /* renamed from: c */
    public C80213bg f220087c;

    static {
        C80215bi biVar = new C80215bi();
        f220083d = biVar;
        C62942bv.registerDefaultInstance(C80215bi.class, biVar);
    }

    private C80215bi() {
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
                return newMessageInfo(f220083d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C80248co.m128105b(), C45240c.f118157a});
            case 3:
                return new C80215bi();
            case 4:
                return new C80214bh();
            case 5:
                return f220083d;
            case 6:
                C63010eb ebVar = f220084e;
                if (ebVar == null) {
                    synchronized (C80215bi.class) {
                        ebVar = f220084e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220083d);
                            f220084e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
