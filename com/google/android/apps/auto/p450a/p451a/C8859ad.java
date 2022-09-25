package com.google.android.apps.auto.p450a.p451a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.auto.a.a.ad */
/* compiled from: PG */
public final class C8859ad extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8859ad f30772c;

    /* renamed from: e */
    private static volatile C63010eb f30773e;

    /* renamed from: a */
    public int f30774a;

    /* renamed from: b */
    public C62971cq f30775b = C62942bv.emptyProtobufList();

    /* renamed from: d */
    private int f30776d;

    static {
        C8859ad adVar = new C8859ad();
        f30772c = adVar;
        C62942bv.registerDefaultInstance(C8859ad.class, adVar);
    }

    private C8859ad() {
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
                return newMessageInfo(f30772c, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0004\u001a", new Object[]{"d", "a", C8868am.f30803a, "b"});
            case 3:
                return new C8859ad();
            case 4:
                return new C8858ac();
            case 5:
                return f30772c;
            case 6:
                C63010eb ebVar = f30773e;
                if (ebVar == null) {
                    synchronized (C8859ad.class) {
                        ebVar = f30773e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30772c);
                            f30773e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
