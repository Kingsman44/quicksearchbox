package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.lh */
/* compiled from: PG */
public final class C87996lh extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C87996lh f237967d;

    /* renamed from: e */
    private static volatile C63010eb f237968e;

    /* renamed from: a */
    public int f237969a;

    /* renamed from: b */
    public long f237970b;

    /* renamed from: c */
    public long f237971c;

    static {
        C87996lh lhVar = new C87996lh();
        f237967d = lhVar;
        C62942bv.registerDefaultInstance(C87996lh.class, lhVar);
    }

    private C87996lh() {
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
                return newMessageInfo(f237967d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C87996lh();
            case 4:
                return new C87995lg();
            case 5:
                return f237967d;
            case 6:
                C63010eb ebVar = f237968e;
                if (ebVar == null) {
                    synchronized (C87996lh.class) {
                        ebVar = f237968e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237967d);
                            f237968e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
