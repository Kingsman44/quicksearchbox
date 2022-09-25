package com.google.p4017at.p4018a.p4019a.p4020a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3562ao.p3570b.p3571a.p3574b.C45596c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.a.a.a.ae */
/* compiled from: PG */
public final class C53747ae extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53747ae f141098d;

    /* renamed from: e */
    private static volatile C63010eb f141099e;

    /* renamed from: a */
    public int f141100a;

    /* renamed from: b */
    public int f141101b;

    /* renamed from: c */
    public C53749ag f141102c;

    static {
        C53747ae aeVar = new C53747ae();
        f141098d = aeVar;
        C62942bv.registerDefaultInstance(C53747ae.class, aeVar);
    }

    private C53747ae() {
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
                return newMessageInfo(f141098d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45596c.f119930a, C45240c.f118157a});
            case 3:
                return new C53747ae();
            case 4:
                return new C53746ad();
            case 5:
                return f141098d;
            case 6:
                C63010eb ebVar = f141099e;
                if (ebVar == null) {
                    synchronized (C53747ae.class) {
                        ebVar = f141099e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141098d);
                            f141099e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
