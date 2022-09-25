package com.google.assistant.p4008y.p4009a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.a.s */
/* compiled from: PG */
public final class C53610s extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53610s f140712b;

    /* renamed from: d */
    private static volatile C63010eb f140713d;

    /* renamed from: a */
    public C53542ab f140714a;

    /* renamed from: c */
    private int f140715c;

    static {
        C53610s sVar = new C53610s();
        f140712b = sVar;
        C62942bv.registerDefaultInstance(C53610s.class, sVar);
    }

    private C53610s() {
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
                return newMessageInfo(f140712b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C53610s();
            case 4:
                return new C53609r();
            case 5:
                return f140712b;
            case 6:
                C63010eb ebVar = f140713d;
                if (ebVar == null) {
                    synchronized (C53610s.class) {
                        ebVar = f140713d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140712b);
                            f140713d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
