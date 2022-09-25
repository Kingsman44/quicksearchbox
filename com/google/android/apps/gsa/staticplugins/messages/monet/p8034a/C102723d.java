package com.google.android.apps.gsa.staticplugins.messages.monet.p8034a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.messages.monet.a.d */
/* compiled from: PG */
public final class C102723d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C102723d f286770e;

    /* renamed from: f */
    private static volatile C63010eb f286771f;

    /* renamed from: a */
    public int f286772a;

    /* renamed from: b */
    public int f286773b;

    /* renamed from: c */
    public int f286774c;

    /* renamed from: d */
    public int f286775d;

    static {
        C102723d dVar = new C102723d();
        f286770e = dVar;
        C62942bv.registerDefaultInstance(C102723d.class, dVar);
    }

    private C102723d() {
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
                return newMessageInfo(f286770e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", C102721b.m170318b(), C45240c.f118157a, "d"});
            case 3:
                return new C102723d();
            case 4:
                return new C102722c();
            case 5:
                return f286770e;
            case 6:
                C63010eb ebVar = f286771f;
                if (ebVar == null) {
                    synchronized (C102723d.class) {
                        ebVar = f286771f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f286770e);
                            f286771f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
