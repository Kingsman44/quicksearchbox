package com.google.p4184bj.p4204d.p4205a.p4206a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.d.a.a.b */
/* compiled from: PG */
public final class C56007b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56007b f149167a;

    /* renamed from: b */
    private static volatile C63010eb f149168b;

    static {
        C56007b bVar = new C56007b();
        f149167a = bVar;
        C62942bv.registerDefaultInstance(C56007b.class, bVar);
    }

    private C56007b() {
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
                return newMessageInfo(f149167a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56007b();
            case 4:
                return new C56006a();
            case 5:
                return f149167a;
            case 6:
                C63010eb ebVar = f149168b;
                if (ebVar == null) {
                    synchronized (C56007b.class) {
                        ebVar = f149168b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149167a);
                            f149168b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
