package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.c */
/* compiled from: PG */
public final class C57402c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62962ci f153328d = new C57348a();

    /* renamed from: e */
    public static final C57402c f153329e;

    /* renamed from: f */
    private static volatile C63010eb f153330f;

    /* renamed from: a */
    public int f153331a = 0;

    /* renamed from: b */
    public Object f153332b;

    /* renamed from: c */
    public C62961ch f153333c = emptyIntList();

    static {
        C57402c cVar = new C57402c();
        f153329e = cVar;
        C62942bv.registerDefaultInstance(C57402c.class, cVar);
    }

    private C57402c() {
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
                return newMessageInfo(f153329e, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001ြ\u0000\u0002\u001e\u0003ြ\u0000", new Object[]{"b", "a", C57492fi.class, C45240c.f118157a, C57456e.m88357b(), C57349aa.class});
            case 3:
                return new C57402c();
            case 4:
                return new C57375b();
            case 5:
                return f153329e;
            case 6:
                C63010eb ebVar = f153330f;
                if (ebVar == null) {
                    synchronized (C57402c.class) {
                        ebVar = f153330f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153329e);
                            f153330f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
