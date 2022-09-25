package com.google.assistant.p3781ad.p3789d.p3791b.p3792a;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113321r;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.a.c */
/* compiled from: PG */
public final class C48638c extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48638c f125710b;

    /* renamed from: c */
    private static volatile C63010eb f125711c;

    /* renamed from: a */
    public C62971cq f125712a = emptyProtobufList();

    static {
        C48638c cVar = new C48638c();
        f125710b = cVar;
        C62942bv.registerDefaultInstance(C48638c.class, cVar);
    }

    private C48638c() {
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
                return newMessageInfo(f125710b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C113321r.class});
            case 3:
                return new C48638c();
            case 4:
                return new C48611b();
            case 5:
                return f125710b;
            case 6:
                C63010eb ebVar = f125711c;
                if (ebVar == null) {
                    synchronized (C48638c.class) {
                        ebVar = f125711c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125710b);
                            f125711c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
