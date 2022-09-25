package com.google.assistant.p3781ad.p3789d.p3791b.p3792a;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113321r;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123766cf;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.a.ca */
/* compiled from: PG */
public final class C48639ca extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48639ca f125713c;

    /* renamed from: d */
    private static volatile C63010eb f125714d;

    /* renamed from: a */
    public C123766cf f125715a;

    /* renamed from: b */
    public C62971cq f125716b = emptyProtobufList();

    static {
        C48639ca caVar = new C48639ca();
        f125713c = caVar;
        C62942bv.registerDefaultInstance(C48639ca.class, caVar);
    }

    private C48639ca() {
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
                return newMessageInfo(f125713c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0002\u001b", new Object[]{"a", "b", C113321r.class});
            case 3:
                return new C48639ca();
            case 4:
                return new C48637bz();
            case 5:
                return f125713c;
            case 6:
                C63010eb ebVar = f125714d;
                if (ebVar == null) {
                    synchronized (C48639ca.class) {
                        ebVar = f125714d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125713c);
                            f125714d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
