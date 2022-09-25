package com.google.p4283bv.p4380j.p4385b.p4411b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.j.b.b.n */
/* compiled from: PG */
public final class C57817n extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57817n f154476d;

    /* renamed from: e */
    private static volatile C63010eb f154477e;

    /* renamed from: a */
    public int f154478a;

    /* renamed from: b */
    public int f154479b;

    /* renamed from: c */
    public int f154480c;

    static {
        C57817n nVar = new C57817n();
        f154476d = nVar;
        C62942bv.registerDefaultInstance(C57817n.class, nVar);
    }

    private C57817n() {
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
                return newMessageInfo(f154476d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C57817n();
            case 4:
                return new C57816m();
            case 5:
                return f154476d;
            case 6:
                C63010eb ebVar = f154477e;
                if (ebVar == null) {
                    synchronized (C57817n.class) {
                        ebVar = f154477e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154476d);
                            f154477e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
