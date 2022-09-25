package com.google.android.apps.auto.p450a.p451a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.auto.a.a.ap */
/* compiled from: PG */
public final class C8871ap extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8871ap f30804c;

    /* renamed from: d */
    private static volatile C63010eb f30805d;

    /* renamed from: a */
    public int f30806a;

    /* renamed from: b */
    public C8863ah f30807b;

    static {
        C8871ap apVar = new C8871ap();
        f30804c = apVar;
        C62942bv.registerDefaultInstance(C8871ap.class, apVar);
    }

    private C8871ap() {
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
                return newMessageInfo(f30804c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C8871ap();
            case 4:
                return new C8870ao();
            case 5:
                return f30804c;
            case 6:
                C63010eb ebVar = f30805d;
                if (ebVar == null) {
                    synchronized (C8871ap.class) {
                        ebVar = f30805d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30804c);
                            f30805d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
