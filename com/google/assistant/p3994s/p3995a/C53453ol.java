package com.google.assistant.p3994s.p3995a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.ol */
/* compiled from: PG */
public final class C53453ol extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53453ol f140292b;

    /* renamed from: d */
    private static volatile C63010eb f140293d;

    /* renamed from: a */
    public C53109bs f140294a;

    /* renamed from: c */
    private int f140295c;

    static {
        C53453ol olVar = new C53453ol();
        f140292b = olVar;
        C62942bv.registerDefaultInstance(C53453ol.class, olVar);
    }

    private C53453ol() {
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
                return newMessageInfo(f140292b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C53453ol();
            case 4:
                return new C53452ok();
            case 5:
                return f140292b;
            case 6:
                C63010eb ebVar = f140293d;
                if (ebVar == null) {
                    synchronized (C53453ol.class) {
                        ebVar = f140293d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140292b);
                            f140293d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
