package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.c.a.ak */
/* compiled from: PG */
public final class C57229ak extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C57229ak f152774e;

    /* renamed from: f */
    private static volatile C63010eb f152775f;

    /* renamed from: a */
    public int f152776a;

    /* renamed from: b */
    public float f152777b;

    /* renamed from: c */
    public int f152778c;

    /* renamed from: d */
    public int f152779d;

    static {
        C57229ak akVar = new C57229ak();
        f152774e = akVar;
        C62942bv.registerDefaultInstance(C57229ak.class, akVar);
    }

    private C57229ak() {
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
                return newMessageInfo(f152774e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ဋ\u0001\u0003ဋ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C57229ak();
            case 4:
                return new C57228aj();
            case 5:
                return f152774e;
            case 6:
                C63010eb ebVar = f152775f;
                if (ebVar == null) {
                    synchronized (C57229ak.class) {
                        ebVar = f152775f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152774e);
                            f152775f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
