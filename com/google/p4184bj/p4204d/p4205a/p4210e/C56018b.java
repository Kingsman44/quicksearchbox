package com.google.p4184bj.p4204d.p4205a.p4210e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.d.a.e.b */
/* compiled from: PG */
public final class C56018b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56018b f149185a;

    /* renamed from: b */
    private static volatile C63010eb f149186b;

    static {
        C56018b bVar = new C56018b();
        f149185a = bVar;
        C62942bv.registerDefaultInstance(C56018b.class, bVar);
    }

    private C56018b() {
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
                return newMessageInfo(f149185a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56018b();
            case 4:
                return new C56017a();
            case 5:
                return f149185a;
            case 6:
                C63010eb ebVar = f149186b;
                if (ebVar == null) {
                    synchronized (C56018b.class) {
                        ebVar = f149186b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149185a);
                            f149186b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
