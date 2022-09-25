package com.google.android.libraries.gsa.actionusermodel.p1830c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5129p.p5131b.C65768az;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.c.b */
/* compiled from: PG */
public final class C22099b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C22099b f60908d;

    /* renamed from: f */
    private static volatile C63010eb f60909f;

    /* renamed from: a */
    public int f60910a;

    /* renamed from: b */
    public C65768az f60911b;

    /* renamed from: c */
    public C62971cq f60912c = emptyProtobufList();

    /* renamed from: e */
    private byte f60913e = 2;

    static {
        C22099b bVar = new C22099b();
        f60908d = bVar;
        C62942bv.registerDefaultInstance(C22099b.class, bVar);
    }

    private C22099b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f60913e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f60913e = b;
                return null;
            case 2:
                return newMessageInfo(f60908d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001b", new Object[]{"a", "b", C45240c.f118157a, C22104g.class});
            case 3:
                return new C22099b();
            case 4:
                return new C22098a();
            case 5:
                return f60908d;
            case 6:
                C63010eb ebVar = f60909f;
                if (ebVar == null) {
                    synchronized (C22099b.class) {
                        ebVar = f60909f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f60908d);
                            f60909f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
