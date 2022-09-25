package com.google.protos.p4850an.p4866f;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.f.b */
/* compiled from: PG */
public final class C63597b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63597b f172022a;

    /* renamed from: b */
    private static volatile C63010eb f172023b;

    static {
        C63597b bVar = new C63597b();
        f172022a = bVar;
        C62942bv.registerDefaultInstance(C63597b.class, bVar);
    }

    private C63597b() {
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
                return newMessageInfo(f172022a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C63597b();
            case 4:
                return new C63596a();
            case 5:
                return f172022a;
            case 6:
                C63010eb ebVar = f172023b;
                if (ebVar == null) {
                    synchronized (C63597b.class) {
                        ebVar = f172023b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172022a);
                            f172023b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
