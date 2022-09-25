package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.bh */
/* compiled from: PG */
public final class C59654bh extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59654bh f159962d;

    /* renamed from: e */
    private static volatile C63010eb f159963e;

    /* renamed from: a */
    public int f159964a;

    /* renamed from: b */
    public int f159965b;

    /* renamed from: c */
    public int f159966c;

    static {
        C59654bh bhVar = new C59654bh();
        f159962d = bhVar;
        C62942bv.registerDefaultInstance(C59654bh.class, bhVar);
    }

    private C59654bh() {
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
                return newMessageInfo(f159962d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", C59652bf.f159961a, C45240c.f118157a});
            case 3:
                return new C59654bh();
            case 4:
                return new C59653bg();
            case 5:
                return f159962d;
            case 6:
                C63010eb ebVar = f159963e;
                if (ebVar == null) {
                    synchronized (C59654bh.class) {
                        ebVar = f159963e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159962d);
                            f159963e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
