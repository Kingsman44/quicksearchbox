package com.google.p4283bv.p4345d.p4350b.p4353c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.d.b.c.b */
/* compiled from: PG */
public final class C57010b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C57010b f152185a;

    /* renamed from: b */
    private static volatile C63010eb f152186b;

    static {
        C57010b bVar = new C57010b();
        f152185a = bVar;
        C62942bv.registerDefaultInstance(C57010b.class, bVar);
    }

    private C57010b() {
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
                return newMessageInfo(f152185a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C57010b();
            case 4:
                return new C57009a();
            case 5:
                return f152185a;
            case 6:
                C63010eb ebVar = f152186b;
                if (ebVar == null) {
                    synchronized (C57010b.class) {
                        ebVar = f152186b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152185a);
                            f152186b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
