package com.google.protos.p5129p.p5130a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65768az;

/* renamed from: com.google.protos.p.a.b */
/* compiled from: PG */
public final class C65717b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C65717b f178541f;

    /* renamed from: h */
    private static volatile C63010eb f178542h;

    /* renamed from: a */
    public int f178543a;

    /* renamed from: b */
    public int f178544b;

    /* renamed from: c */
    public C65716ao f178545c;

    /* renamed from: d */
    public C63042fg f178546d;

    /* renamed from: e */
    public C62971cq f178547e = emptyProtobufList();

    /* renamed from: g */
    private byte f178548g = 2;

    static {
        C65717b bVar = new C65717b();
        f178541f = bVar;
        C62942bv.registerDefaultInstance(C65717b.class, bVar);
    }

    private C65717b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f178548g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f178548g = b;
                return null;
            case 2:
                return newMessageInfo(f178541f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0001\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005Л", new Object[]{"a", "b", C65753ak.m96798c(), C45240c.f118157a, "d", "e", C65768az.class});
            case 3:
                return new C65717b();
            case 4:
                return new C65701a();
            case 5:
                return f178541f;
            case 6:
                C63010eb ebVar = f178542h;
                if (ebVar == null) {
                    synchronized (C65717b.class) {
                        ebVar = f178542h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178541f);
                            f178542h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
