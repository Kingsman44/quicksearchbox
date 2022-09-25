package com.google.protos.p5129p.p5130a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65137b;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65768az;

/* renamed from: com.google.protos.p.a.u */
/* compiled from: PG */
public final class C65736u extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C65736u f178580e;

    /* renamed from: g */
    private static volatile C63010eb f178581g;

    /* renamed from: a */
    public int f178582a;

    /* renamed from: b */
    public int f178583b;

    /* renamed from: c */
    public C62971cq f178584c = emptyProtobufList();

    /* renamed from: d */
    public C65137b f178585d;

    /* renamed from: f */
    private byte f178586f = 2;

    static {
        C65736u uVar = new C65736u();
        f178580e = uVar;
        C62942bv.registerDefaultInstance(C65736u.class, uVar);
    }

    private C65736u() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f178586f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f178586f = b;
                return null;
            case 2:
                return newMessageInfo(f178580e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001ဌ\u0000\u0002Л\u0003ᐉ\u0001", new Object[]{"a", "b", C65753ak.m96798c(), C45240c.f118157a, C65768az.class, "d"});
            case 3:
                return new C65736u();
            case 4:
                return new C65735t();
            case 5:
                return f178580e;
            case 6:
                C63010eb ebVar = f178581g;
                if (ebVar == null) {
                    synchronized (C65736u.class) {
                        ebVar = f178581g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178580e);
                            f178581g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
