package com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4784c.p4785a.p4786a.p4787a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ad.a.a.a.c.a.a.a.b */
/* compiled from: PG */
public final class C63136b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63136b f170492a;

    /* renamed from: b */
    private static volatile C63010eb f170493b;

    static {
        C63136b bVar = new C63136b();
        f170492a = bVar;
        C62942bv.registerDefaultInstance(C63136b.class, bVar);
    }

    private C63136b() {
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
                return newMessageInfo(f170492a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C63136b();
            case 4:
                return new C63135a();
            case 5:
                return f170492a;
            case 6:
                C63010eb ebVar = f170493b;
                if (ebVar == null) {
                    synchronized (C63136b.class) {
                        ebVar = f170493b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170492a);
                            f170493b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
