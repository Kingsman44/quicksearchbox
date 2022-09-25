package com.google.common.p4552o;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.alr */
/* compiled from: PG */
public final class alr extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final alr f159095g;

    /* renamed from: h */
    private static volatile C63010eb f159096h;

    /* renamed from: a */
    public int f159097a;

    /* renamed from: b */
    public boolean f159098b;

    /* renamed from: c */
    public boolean f159099c;

    /* renamed from: d */
    public boolean f159100d;

    /* renamed from: e */
    public boolean f159101e;

    /* renamed from: f */
    public boolean f159102f;

    static {
        alr alr = new alr();
        f159095g = alr;
        C62942bv.registerDefaultInstance(alr.class, alr);
    }

    private alr() {
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
                return newMessageInfo(f159095g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new alr();
            case 4:
                return new alq();
            case 5:
                return f159095g;
            case 6:
                C63010eb ebVar = f159096h;
                if (ebVar == null) {
                    synchronized (alr.class) {
                        ebVar = f159096h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159095g);
                            f159096h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
