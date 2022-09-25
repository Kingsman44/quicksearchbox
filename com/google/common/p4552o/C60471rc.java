package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.rc */
/* compiled from: PG */
public final class C60471rc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C60471rc f163658c;

    /* renamed from: d */
    private static volatile C63010eb f163659d;

    /* renamed from: a */
    public int f163660a;

    /* renamed from: b */
    public int f163661b;

    static {
        C60471rc rcVar = new C60471rc();
        f163658c = rcVar;
        C62942bv.registerDefaultInstance(C60471rc.class, rcVar);
    }

    private C60471rc() {
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
                return newMessageInfo(f163658c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C60470rb.m92595b()});
            case 3:
                return new C60471rc();
            case 4:
                return new C60463qz();
            case 5:
                return f163658c;
            case 6:
                C63010eb ebVar = f163659d;
                if (ebVar == null) {
                    synchronized (C60471rc.class) {
                        ebVar = f163659d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163658c);
                            f163659d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
