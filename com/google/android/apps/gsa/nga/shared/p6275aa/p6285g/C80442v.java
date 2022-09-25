package com.google.android.apps.gsa.nga.shared.p6275aa.p6285g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.g.v */
/* compiled from: PG */
public final class C80442v extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C80442v f220789e;

    /* renamed from: f */
    private static volatile C63010eb f220790f;

    /* renamed from: a */
    public int f220791a;

    /* renamed from: b */
    public boolean f220792b;

    /* renamed from: c */
    public double f220793c;

    /* renamed from: d */
    public int f220794d;

    static {
        C80442v vVar = new C80442v();
        f220789e = vVar;
        C62942bv.registerDefaultInstance(C80442v.class, vVar);
    }

    private C80442v() {
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
                return newMessageInfo(f220789e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002က\u0002\u0003ဌ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C80441u.m128164b()});
            case 3:
                return new C80442v();
            case 4:
                return new C80439s();
            case 5:
                return f220789e;
            case 6:
                C63010eb ebVar = f220790f;
                if (ebVar == null) {
                    synchronized (C80442v.class) {
                        ebVar = f220790f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220789e);
                            f220790f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
