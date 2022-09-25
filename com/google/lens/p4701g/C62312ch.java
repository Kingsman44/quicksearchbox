package com.google.lens.p4701g;

import com.google.android.libraries.p1657ba.p1664c.p1668c.C19652b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.ch */
/* compiled from: PG */
public final class C62312ch extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62312ch f168214b;

    /* renamed from: c */
    private static volatile C63010eb f168215c;

    /* renamed from: a */
    public C62971cq f168216a = emptyProtobufList();

    static {
        C62312ch chVar = new C62312ch();
        f168214b = chVar;
        C62942bv.registerDefaultInstance(C62312ch.class, chVar);
    }

    private C62312ch() {
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
                return newMessageInfo(f168214b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C19652b.class});
            case 3:
                return new C62312ch();
            case 4:
                return new C62311cg();
            case 5:
                return f168214b;
            case 6:
                C63010eb ebVar = f168215c;
                if (ebVar == null) {
                    synchronized (C62312ch.class) {
                        ebVar = f168215c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168214b);
                            f168215c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
