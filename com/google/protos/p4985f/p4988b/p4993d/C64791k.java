package com.google.protos.p4985f.p4988b.p4993d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.b.d.k */
/* compiled from: PG */
public final class C64791k extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C64791k f175598d;

    /* renamed from: e */
    private static volatile C63010eb f175599e;

    /* renamed from: a */
    public int f175600a;

    /* renamed from: b */
    public C64788h f175601b;

    /* renamed from: c */
    public C62971cq f175602c = C62942bv.emptyProtobufList();

    static {
        C64791k kVar = new C64791k();
        f175598d = kVar;
        C62942bv.registerDefaultInstance(C64791k.class, kVar);
    }

    private C64791k() {
        emptyProtobufList();
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
                return newMessageInfo(f175598d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001a", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C64791k();
            case 4:
                return new C64790j();
            case 5:
                return f175598d;
            case 6:
                C63010eb ebVar = f175599e;
                if (ebVar == null) {
                    synchronized (C64791k.class) {
                        ebVar = f175599e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175598d);
                            f175599e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
