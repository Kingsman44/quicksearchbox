package com.google.p4017at.p4018a.p4019a.p4020a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.at.a.a.a.p */
/* compiled from: PG */
public final class C53805p extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53805p f141221c;

    /* renamed from: d */
    private static volatile C63010eb f141222d;

    /* renamed from: a */
    public int f141223a;

    /* renamed from: b */
    public C63088z f141224b = C63088z.f170246b;

    static {
        C53805p pVar = new C53805p();
        f141221c = pVar;
        C62942bv.registerDefaultInstance(C53805p.class, pVar);
    }

    private C53805p() {
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
                return newMessageInfo(f141221c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            case 3:
                return new C53805p();
            case 4:
                return new C53804o();
            case 5:
                return f141221c;
            case 6:
                C63010eb ebVar = f141222d;
                if (ebVar == null) {
                    synchronized (C53805p.class) {
                        ebVar = f141222d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141221c);
                            f141222d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
