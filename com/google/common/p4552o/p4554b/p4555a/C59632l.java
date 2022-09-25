package com.google.common.p4552o.p4554b.p4555a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.b.a.l */
/* compiled from: PG */
public final class C59632l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59632l f159887c;

    /* renamed from: d */
    private static volatile C63010eb f159888d;

    /* renamed from: a */
    public int f159889a;

    /* renamed from: b */
    public C59636p f159890b;

    static {
        C59632l lVar = new C59632l();
        f159887c = lVar;
        C62942bv.registerDefaultInstance(C59632l.class, lVar);
    }

    private C59632l() {
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
                return newMessageInfo(f159887c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C59632l();
            case 4:
                return new C59631k();
            case 5:
                return f159887c;
            case 6:
                C63010eb ebVar = f159888d;
                if (ebVar == null) {
                    synchronized (C59632l.class) {
                        ebVar = f159888d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159887c);
                            f159888d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
