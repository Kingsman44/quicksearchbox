package com.google.p4017at.p4018a.p4019a.p4020a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.a.a.a.ac */
/* compiled from: PG */
public final class C53745ac extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53745ac f141093d;

    /* renamed from: e */
    private static volatile C63010eb f141094e;

    /* renamed from: a */
    public int f141095a;

    /* renamed from: b */
    public int f141096b;

    /* renamed from: c */
    public C53743aa f141097c;

    static {
        C53745ac acVar = new C53745ac();
        f141093d = acVar;
        C62942bv.registerDefaultInstance(C53745ac.class, acVar);
    }

    private C53745ac() {
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
                return newMessageInfo(f141093d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C53744ab.f141092a, C45240c.f118157a});
            case 3:
                return new C53745ac();
            case 4:
                return new C53806q();
            case 5:
                return f141093d;
            case 6:
                C63010eb ebVar = f141094e;
                if (ebVar == null) {
                    synchronized (C53745ac.class) {
                        ebVar = f141094e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141093d);
                            f141094e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
