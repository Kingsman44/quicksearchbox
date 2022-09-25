package com.google.p4283bv.p4354e.p4356b.p4358b.p4360b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.b.af */
/* compiled from: PG */
public final class C57122af extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57122af f152479d;

    /* renamed from: e */
    private static volatile C63010eb f152480e;

    /* renamed from: a */
    public int f152481a;

    /* renamed from: b */
    public boolean f152482b;

    /* renamed from: c */
    public C57121ae f152483c;

    static {
        C57122af afVar = new C57122af();
        f152479d = afVar;
        C62942bv.registerDefaultInstance(C57122af.class, afVar);
    }

    private C57122af() {
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
                return newMessageInfo(f152479d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C57122af();
            case 4:
                return new C57119ac();
            case 5:
                return f152479d;
            case 6:
                C63010eb ebVar = f152480e;
                if (ebVar == null) {
                    synchronized (C57122af.class) {
                        ebVar = f152480e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152479d);
                            f152480e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
