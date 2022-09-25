package com.google.android.libraries.lens.view.filters;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.filters.n */
/* compiled from: PG */
public final class C26017n extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C26017n f70699d;

    /* renamed from: e */
    private static volatile C63010eb f70700e;

    /* renamed from: a */
    public int f70701a;

    /* renamed from: b */
    public int f70702b;

    /* renamed from: c */
    public boolean f70703c;

    static {
        C26017n nVar = new C26017n();
        f70699d = nVar;
        C62942bv.registerDefaultInstance(C26017n.class, nVar);
    }

    private C26017n() {
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
                return newMessageInfo(f70699d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C56306df.m87965b(), C45240c.f118157a});
            case 3:
                return new C26017n();
            case 4:
                return new C26016m();
            case 5:
                return f70699d;
            case 6:
                C63010eb ebVar = f70700e;
                if (ebVar == null) {
                    synchronized (C26017n.class) {
                        ebVar = f70700e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f70699d);
                            f70700e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
