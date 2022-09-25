package com.google.android.apps.gsa.sidekick.shared.p7238g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7718hj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.g.d */
/* compiled from: PG */
public final class C91734d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C91734d f255848e;

    /* renamed from: g */
    private static volatile C63010eb f255849g;

    /* renamed from: a */
    public int f255850a;

    /* renamed from: b */
    public C7718hj f255851b;

    /* renamed from: c */
    public C62971cq f255852c = emptyProtobufList();

    /* renamed from: d */
    public boolean f255853d;

    /* renamed from: f */
    private byte f255854f = 2;

    static {
        C91734d dVar = new C91734d();
        f255848e = dVar;
        C62942bv.registerDefaultInstance(C91734d.class, dVar);
    }

    private C91734d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f255854f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f255854f = b;
                return null;
            case 2:
                return newMessageInfo(f255848e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001ᐉ\u0000\u0002Л\u0003ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a, C7718hj.class, "d"});
            case 3:
                return new C91734d();
            case 4:
                return new C91733c();
            case 5:
                return f255848e;
            case 6:
                C63010eb ebVar = f255849g;
                if (ebVar == null) {
                    synchronized (C91734d.class) {
                        ebVar = f255849g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f255848e);
                            f255849g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
