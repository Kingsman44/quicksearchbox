package com.google.p4420by.p4425c.p4428b.p4429a.p4430a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.by.c.b.a.a.e */
/* compiled from: PG */
public final class C57882e extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57882e f154833d;

    /* renamed from: f */
    private static volatile C63010eb f154834f;

    /* renamed from: a */
    public int f154835a;

    /* renamed from: b */
    public double f154836b;

    /* renamed from: c */
    public double f154837c = 1.0d;

    /* renamed from: e */
    private int f154838e;

    static {
        C57882e eVar = new C57882e();
        f154833d = eVar;
        C62942bv.registerDefaultInstance(C57882e.class, eVar);
    }

    private C57882e() {
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
                return newMessageInfo(f154833d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002က\u0001\u0003က\u0002", new Object[]{"e", "a", C57879b.f154832a, "b", C45240c.f118157a});
            case 3:
                return new C57882e();
            case 4:
                return new C57881d();
            case 5:
                return f154833d;
            case 6:
                C63010eb ebVar = f154834f;
                if (ebVar == null) {
                    synchronized (C57882e.class) {
                        ebVar = f154834f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154833d);
                            f154834f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
