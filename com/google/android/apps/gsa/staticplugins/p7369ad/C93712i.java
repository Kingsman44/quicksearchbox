package com.google.android.apps.gsa.staticplugins.p7369ad;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.ad.i */
/* compiled from: PG */
public final class C93712i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C93712i f261525c;

    /* renamed from: d */
    private static volatile C63010eb f261526d;

    /* renamed from: a */
    public int f261527a;

    /* renamed from: b */
    public long f261528b;

    static {
        C93712i iVar = new C93712i();
        f261525c = iVar;
        C62942bv.registerDefaultInstance(C93712i.class, iVar);
    }

    private C93712i() {
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
                return newMessageInfo(f261525c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C93712i();
            case 4:
                return new C93711h();
            case 5:
                return f261525c;
            case 6:
                C63010eb ebVar = f261526d;
                if (ebVar == null) {
                    synchronized (C93712i.class) {
                        ebVar = f261526d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f261525c);
                            f261526d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
