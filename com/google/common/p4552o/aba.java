package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4563i.C59905bn;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.aba */
/* compiled from: PG */
public final class aba extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final aba f158175d;

    /* renamed from: e */
    private static volatile C63010eb f158176e;

    /* renamed from: a */
    public int f158177a;

    /* renamed from: b */
    public boolean f158178b;

    /* renamed from: c */
    public C59905bn f158179c;

    static {
        aba aba = new aba();
        f158175d = aba;
        C62942bv.registerDefaultInstance(aba.class, aba);
    }

    private aba() {
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
                return newMessageInfo(f158175d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new aba();
            case 4:
                return new aaz();
            case 5:
                return f158175d;
            case 6:
                C63010eb ebVar = f158176e;
                if (ebVar == null) {
                    synchronized (aba.class) {
                        ebVar = f158176e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158175d);
                            f158176e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
