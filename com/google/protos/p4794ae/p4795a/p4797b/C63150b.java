package com.google.protos.p4794ae.p4795a.p4797b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ae.a.b.b */
/* compiled from: PG */
public final class C63150b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63150b f170524a;

    /* renamed from: e */
    private static volatile C63010eb f170525e;

    /* renamed from: b */
    private int f170526b;

    /* renamed from: c */
    private C61752n f170527c;

    /* renamed from: d */
    private byte f170528d = 2;

    static {
        C63150b bVar = new C63150b();
        f170524a = bVar;
        C62942bv.registerDefaultInstance(C63150b.class, bVar);
    }

    private C63150b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f170528d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f170528d = b;
                return null;
            case 2:
                return newMessageInfo(f170524a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C63150b();
            case 4:
                return new C63149a();
            case 5:
                return f170524a;
            case 6:
                C63010eb ebVar = f170525e;
                if (ebVar == null) {
                    synchronized (C63150b.class) {
                        ebVar = f170525e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170524a);
                            f170525e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
