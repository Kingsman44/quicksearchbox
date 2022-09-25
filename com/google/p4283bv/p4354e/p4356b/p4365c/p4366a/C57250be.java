package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.c.a.be */
/* compiled from: PG */
public final class C57250be extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57250be f152826d;

    /* renamed from: e */
    private static volatile C63010eb f152827e;

    /* renamed from: a */
    public int f152828a;

    /* renamed from: b */
    public boolean f152829b;

    /* renamed from: c */
    public boolean f152830c;

    static {
        C57250be beVar = new C57250be();
        f152826d = beVar;
        C62942bv.registerDefaultInstance(C57250be.class, beVar);
    }

    private C57250be() {
        emptyIntList();
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
                return newMessageInfo(f152826d, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0000\u0004ဇ\u0002\u0005ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C57250be();
            case 4:
                return new C57249bd();
            case 5:
                return f152826d;
            case 6:
                C63010eb ebVar = f152827e;
                if (ebVar == null) {
                    synchronized (C57250be.class) {
                        ebVar = f152827e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152826d);
                            f152827e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
