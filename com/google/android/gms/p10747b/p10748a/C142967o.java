package com.google.android.gms.p10747b.p10748a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.b.a.o */
/* compiled from: PG */
public final class C142967o extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C142967o f387916c;

    /* renamed from: d */
    private static volatile C63010eb f387917d;

    /* renamed from: a */
    public int f387918a = 0;

    /* renamed from: b */
    public Object f387919b;

    static {
        C142967o oVar = new C142967o();
        f387916c = oVar;
        C62942bv.registerDefaultInstance(C142967o.class, oVar);
    }

    private C142967o() {
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
                return newMessageInfo(f387916c, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"b", "a", C142960h.class, C142958f.class, C142964l.class, C142966n.class});
            case 3:
                return new C142967o();
            case 4:
                return new C142956d();
            case 5:
                return f387916c;
            case 6:
                C63010eb ebVar = f387917d;
                if (ebVar == null) {
                    synchronized (C142967o.class) {
                        ebVar = f387917d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f387916c);
                            f387917d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
