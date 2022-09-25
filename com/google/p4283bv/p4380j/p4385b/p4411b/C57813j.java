package com.google.p4283bv.p4380j.p4385b.p4411b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.j.b.b.j */
/* compiled from: PG */
public final class C57813j extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C57813j f154466e;

    /* renamed from: f */
    private static volatile C63010eb f154467f;

    /* renamed from: a */
    public int f154468a;

    /* renamed from: b */
    public int f154469b;

    /* renamed from: c */
    public C57821r f154470c;

    /* renamed from: d */
    public C57815l f154471d;

    static {
        C57813j jVar = new C57813j();
        f154466e = jVar;
        C62942bv.registerDefaultInstance(C57813j.class, jVar);
    }

    private C57813j() {
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
                return newMessageInfo(f154466e, "\u0001\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0000\u0000\u0004ဋ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C57813j();
            case 4:
                return new C57812i();
            case 5:
                return f154466e;
            case 6:
                C63010eb ebVar = f154467f;
                if (ebVar == null) {
                    synchronized (C57813j.class) {
                        ebVar = f154467f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154466e);
                            f154467f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
