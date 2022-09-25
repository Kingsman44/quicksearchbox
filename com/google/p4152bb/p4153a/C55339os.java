package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.os */
/* compiled from: PG */
public final class C55339os extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55339os f145794c;

    /* renamed from: e */
    private static volatile C63010eb f145795e;

    /* renamed from: a */
    public long f145796a;

    /* renamed from: b */
    public long f145797b;

    /* renamed from: d */
    private int f145798d;

    static {
        C55339os osVar = new C55339os();
        f145794c = osVar;
        C62942bv.registerDefaultInstance(C55339os.class, osVar);
    }

    private C55339os() {
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
                return newMessageInfo(f145794c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C55339os();
            case 4:
                return new C55338or();
            case 5:
                return f145794c;
            case 6:
                C63010eb ebVar = f145795e;
                if (ebVar == null) {
                    synchronized (C55339os.class) {
                        ebVar = f145795e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145794c);
                            f145795e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
