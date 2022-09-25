package com.google.p4160bf.p4164b.p4165a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.bs */
/* compiled from: PG */
public final class C55636bs extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55636bs f146795d;

    /* renamed from: e */
    private static volatile C63010eb f146796e;

    /* renamed from: a */
    public int f146797a;

    /* renamed from: b */
    public C55683w f146798b;

    /* renamed from: c */
    public int f146799c;

    static {
        C55636bs bsVar = new C55636bs();
        f146795d = bsVar;
        C62942bv.registerDefaultInstance(C55636bs.class, bsVar);
    }

    private C55636bs() {
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
                return newMessageInfo(f146795d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C55633bp.f146794a});
            case 3:
                return new C55636bs();
            case 4:
                return new C55635br();
            case 5:
                return f146795d;
            case 6:
                C63010eb ebVar = f146796e;
                if (ebVar == null) {
                    synchronized (C55636bs.class) {
                        ebVar = f146796e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146795d);
                            f146796e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
