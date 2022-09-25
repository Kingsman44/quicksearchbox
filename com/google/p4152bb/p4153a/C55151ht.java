package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.ht */
/* compiled from: PG */
public final class C55151ht extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55151ht f145182c;

    /* renamed from: e */
    private static volatile C63010eb f145183e;

    /* renamed from: a */
    public int f145184a;

    /* renamed from: b */
    public int f145185b;

    /* renamed from: d */
    private int f145186d;

    static {
        C55151ht htVar = new C55151ht();
        f145182c = htVar;
        C62942bv.registerDefaultInstance(C55151ht.class, htVar);
    }

    private C55151ht() {
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
                return newMessageInfo(f145182c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", C55149hr.f145181a});
            case 3:
                return new C55151ht();
            case 4:
                return new C55148hq();
            case 5:
                return f145182c;
            case 6:
                C63010eb ebVar = f145183e;
                if (ebVar == null) {
                    synchronized (C55151ht.class) {
                        ebVar = f145183e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145182c);
                            f145183e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
