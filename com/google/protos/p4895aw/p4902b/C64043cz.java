package com.google.protos.p4895aw.p4902b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.protos.aw.b.cz */
/* compiled from: PG */
public final class C64043cz extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C64043cz f173162d;

    /* renamed from: e */
    private static volatile C63010eb f173163e;

    /* renamed from: a */
    public int f173164a;

    /* renamed from: b */
    public C63088z f173165b = C63088z.f170246b;

    /* renamed from: c */
    public int f173166c;

    static {
        C64043cz czVar = new C64043cz();
        f173162d = czVar;
        C62942bv.registerDefaultInstance(C64043cz.class, czVar);
    }

    private C64043cz() {
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
                return newMessageInfo(f173162d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C64041cx.f173161a});
            case 3:
                return new C64043cz();
            case 4:
                return new C64040cw();
            case 5:
                return f173162d;
            case 6:
                C63010eb ebVar = f173163e;
                if (ebVar == null) {
                    synchronized (C64043cz.class) {
                        ebVar = f173163e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173162d);
                            f173163e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
