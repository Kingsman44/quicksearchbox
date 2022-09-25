package com.google.frameworks.client.p4624a.p4629b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.frameworks.client.a.b.l */
/* compiled from: PG */
public final class C61315l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C61315l f165828c;

    /* renamed from: d */
    private static volatile C63010eb f165829d;

    /* renamed from: a */
    public int f165830a;

    /* renamed from: b */
    public int f165831b;

    static {
        C61315l lVar = new C61315l();
        f165828c = lVar;
        C62942bv.registerDefaultInstance(C61315l.class, lVar);
    }

    private C61315l() {
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
                return newMessageInfo(f165828c, "\u0001\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဌ\u0000", new Object[]{"a", "b", C61314k.f165827a});
            case 3:
                return new C61315l();
            case 4:
                return new C61313j();
            case 5:
                return f165828c;
            case 6:
                C63010eb ebVar = f165829d;
                if (ebVar == null) {
                    synchronized (C61315l.class) {
                        ebVar = f165829d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f165828c);
                            f165829d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
