package com.google.p4160bf.p4161a.p4163b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.a.b.s */
/* compiled from: PG */
public final class C55511s extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55511s f146487d;

    /* renamed from: e */
    private static volatile C63010eb f146488e;

    /* renamed from: a */
    public int f146489a;

    /* renamed from: b */
    public C55507o f146490b;

    /* renamed from: c */
    public int f146491c;

    static {
        C55511s sVar = new C55511s();
        f146487d = sVar;
        C62942bv.registerDefaultInstance(C55511s.class, sVar);
    }

    private C55511s() {
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
                return newMessageInfo(f146487d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, C55509q.f146486a});
            case 3:
                return new C55511s();
            case 4:
                return new C55508p();
            case 5:
                return f146487d;
            case 6:
                C63010eb ebVar = f146488e;
                if (ebVar == null) {
                    synchronized (C55511s.class) {
                        ebVar = f146488e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146487d);
                            f146488e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
