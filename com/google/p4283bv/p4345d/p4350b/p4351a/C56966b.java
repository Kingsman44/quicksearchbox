package com.google.p4283bv.p4345d.p4350b.p4351a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7681g;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.d.b.a.b */
/* compiled from: PG */
public final class C56966b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C56966b f152030e;

    /* renamed from: f */
    private static volatile C63010eb f152031f;

    /* renamed from: a */
    public int f152032a;

    /* renamed from: b */
    public int f152033b;

    /* renamed from: c */
    public boolean f152034c;

    /* renamed from: d */
    public boolean f152035d;

    static {
        C56966b bVar = new C56966b();
        f152030e = bVar;
        C62942bv.registerDefaultInstance(C56966b.class, bVar);
    }

    private C56966b() {
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
                return newMessageInfo(f152030e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C7681g.m22803b(), C45240c.f118157a, "d"});
            case 3:
                return new C56966b();
            case 4:
                return new C56965a();
            case 5:
                return f152030e;
            case 6:
                C63010eb ebVar = f152031f;
                if (ebVar == null) {
                    synchronized (C56966b.class) {
                        ebVar = f152031f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152030e);
                            f152031f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
