package com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4396b.p4400c.p4401a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.j.b.a.b.b.c.a.b */
/* compiled from: PG */
public final class C57718b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57718b f154195d;

    /* renamed from: e */
    private static volatile C63010eb f154196e;

    /* renamed from: a */
    public int f154197a;

    /* renamed from: b */
    public boolean f154198b;

    /* renamed from: c */
    public boolean f154199c;

    static {
        C57718b bVar = new C57718b();
        f154195d = bVar;
        C62942bv.registerDefaultInstance(C57718b.class, bVar);
    }

    private C57718b() {
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
                return newMessageInfo(f154195d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C57718b();
            case 4:
                return new C57717a();
            case 5:
                return f154195d;
            case 6:
                C63010eb ebVar = f154196e;
                if (ebVar == null) {
                    synchronized (C57718b.class) {
                        ebVar = f154196e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154195d);
                            f154196e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
