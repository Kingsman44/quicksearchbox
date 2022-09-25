package com.google.android.libraries.gsa.actionusermodel;

import com.google.android.libraries.gsa.actionusermodel.p1830c.C22104g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5129p.p5131b.C65768az;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.ay */
/* compiled from: PG */
public final class C22067ay extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C22067ay f60801d;

    /* renamed from: f */
    private static volatile C63010eb f60802f;

    /* renamed from: a */
    public int f60803a;

    /* renamed from: b */
    public C65768az f60804b;

    /* renamed from: c */
    public C62971cq f60805c = emptyProtobufList();

    /* renamed from: e */
    private byte f60806e = 2;

    static {
        C22067ay ayVar = new C22067ay();
        f60801d = ayVar;
        C62942bv.registerDefaultInstance(C22067ay.class, ayVar);
    }

    private C22067ay() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f60806e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f60806e = b;
                return null;
            case 2:
                return newMessageInfo(f60801d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001b", new Object[]{"a", "b", C45240c.f118157a, C22104g.class});
            case 3:
                return new C22067ay();
            case 4:
                return new C22066ax();
            case 5:
                return f60801d;
            case 6:
                C63010eb ebVar = f60802f;
                if (ebVar == null) {
                    synchronized (C22067ay.class) {
                        ebVar = f60802f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f60801d);
                            f60802f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
