package com.google.android.apps.gsa.staticplugins.p7678cl.p7680b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4017at.p4082j.p4083a.C54370bw;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.cl.b.q */
/* compiled from: PG */
public final class C97927q extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C97927q f273446d;

    /* renamed from: e */
    private static volatile C63010eb f273447e;

    /* renamed from: a */
    public int f273448a;

    /* renamed from: b */
    public C54370bw f273449b;

    /* renamed from: c */
    public long f273450c;

    static {
        C97927q qVar = new C97927q();
        f273446d = qVar;
        C62942bv.registerDefaultInstance(C97927q.class, qVar);
    }

    private C97927q() {
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
                return newMessageInfo(f273446d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C97927q();
            case 4:
                return new C97926p();
            case 5:
                return f273446d;
            case 6:
                C63010eb ebVar = f273447e;
                if (ebVar == null) {
                    synchronized (C97927q.class) {
                        ebVar = f273447e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f273446d);
                            f273447e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
