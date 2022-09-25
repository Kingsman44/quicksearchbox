package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.aig */
/* compiled from: PG */
public final class aig extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final aig f135167d;

    /* renamed from: e */
    private static volatile C63010eb f135168e;

    /* renamed from: a */
    public int f135169a;

    /* renamed from: b */
    public boolean f135170b;

    /* renamed from: c */
    public boolean f135171c;

    static {
        aig aig = new aig();
        f135167d = aig;
        C62942bv.registerDefaultInstance(aig.class, aig);
    }

    private aig() {
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
                return newMessageInfo(f135167d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new aig();
            case 4:
                return new aif();
            case 5:
                return f135167d;
            case 6:
                C63010eb ebVar = f135168e;
                if (ebVar == null) {
                    synchronized (aig.class) {
                        ebVar = f135168e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135167d);
                            f135168e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
