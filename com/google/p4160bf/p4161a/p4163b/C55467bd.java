package com.google.p4160bf.p4161a.p4163b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.a.b.bd */
/* compiled from: PG */
public final class C55467bd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55467bd f146323c;

    /* renamed from: d */
    private static volatile C63010eb f146324d;

    /* renamed from: a */
    public int f146325a;

    /* renamed from: b */
    public int f146326b;

    static {
        C55467bd bdVar = new C55467bd();
        f146323c = bdVar;
        C62942bv.registerDefaultInstance(C55467bd.class, bdVar);
    }

    private C55467bd() {
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
                return newMessageInfo(f146323c, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဌ\u0003", new Object[]{"a", "b", C55466bc.f146322a});
            case 3:
                return new C55467bd();
            case 4:
                return new C55465bb();
            case 5:
                return f146323c;
            case 6:
                C63010eb ebVar = f146324d;
                if (ebVar == null) {
                    synchronized (C55467bd.class) {
                        ebVar = f146324d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146323c);
                            f146324d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
