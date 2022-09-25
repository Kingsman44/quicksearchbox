package com.google.lens.p4701g;

import com.google.android.libraries.p1657ba.p1664c.p1668c.C19652b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.cp */
/* compiled from: PG */
public final class C62320cp extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62320cp f168233b;

    /* renamed from: c */
    private static volatile C63010eb f168234c;

    /* renamed from: a */
    public C62971cq f168235a = emptyProtobufList();

    static {
        C62320cp cpVar = new C62320cp();
        f168233b = cpVar;
        C62942bv.registerDefaultInstance(C62320cp.class, cpVar);
    }

    private C62320cp() {
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
                return newMessageInfo(f168233b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C19652b.class});
            case 3:
                return new C62320cp();
            case 4:
                return new C62319co();
            case 5:
                return f168233b;
            case 6:
                C63010eb ebVar = f168234c;
                if (ebVar == null) {
                    synchronized (C62320cp.class) {
                        ebVar = f168234c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168233b);
                            f168234c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
