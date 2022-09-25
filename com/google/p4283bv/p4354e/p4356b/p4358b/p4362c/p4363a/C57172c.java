package com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56612d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.c.a.c */
/* compiled from: PG */
public final class C57172c extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57172c f152629b;

    /* renamed from: d */
    private static volatile C63010eb f152630d;

    /* renamed from: a */
    public C56612d f152631a;

    /* renamed from: c */
    private int f152632c;

    static {
        C57172c cVar = new C57172c();
        f152629b = cVar;
        C62942bv.registerDefaultInstance(C57172c.class, cVar);
    }

    private C57172c() {
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
                return newMessageInfo(f152629b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C57172c();
            case 4:
                return new C57171b();
            case 5:
                return f152629b;
            case 6:
                C63010eb ebVar = f152630d;
                if (ebVar == null) {
                    synchronized (C57172c.class) {
                        ebVar = f152630d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152629b);
                            f152630d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
