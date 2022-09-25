package com.google.protos.p5129p.p5130a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65768az;

/* renamed from: com.google.protos.p.a.af */
/* compiled from: PG */
public final class C65707af extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C65707af f178514d;

    /* renamed from: f */
    private static volatile C63010eb f178515f;

    /* renamed from: a */
    public int f178516a;

    /* renamed from: b */
    public int f178517b;

    /* renamed from: c */
    public C65768az f178518c;

    /* renamed from: e */
    private byte f178519e = 2;

    static {
        C65707af afVar = new C65707af();
        f178514d = afVar;
        C62942bv.registerDefaultInstance(C65707af.class, afVar);
    }

    private C65707af() {
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f178519e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f178519e = b;
                return null;
            case 2:
                return newMessageInfo(f178514d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ဌ\u0000\u0003ᐉ\u0001", new Object[]{"a", "b", C65753ak.m96798c(), C45240c.f118157a});
            case 3:
                return new C65707af();
            case 4:
                return new C65706ae();
            case 5:
                return f178514d;
            case 6:
                C63010eb ebVar = f178515f;
                if (ebVar == null) {
                    synchronized (C65707af.class) {
                        ebVar = f178515f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178514d);
                            f178515f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
