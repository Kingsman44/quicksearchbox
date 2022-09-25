package com.google.android.libraries.assistant.p1594s.p1597b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.s.b.aq */
/* compiled from: PG */
public final class C19156aq extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C19156aq f53647d;

    /* renamed from: e */
    private static volatile C63010eb f53648e;

    /* renamed from: a */
    public int f53649a;

    /* renamed from: b */
    public int f53650b;

    /* renamed from: c */
    public int f53651c;

    static {
        C19156aq aqVar = new C19156aq();
        f53647d = aqVar;
        C62942bv.registerDefaultInstance(C19156aq.class, aqVar);
    }

    private C19156aq() {
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
                return newMessageInfo(f53647d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", C48580an.m85242c(), C45240c.f118157a});
            case 3:
                return new C19156aq();
            case 4:
                return new C19155ap();
            case 5:
                return f53647d;
            case 6:
                C63010eb ebVar = f53648e;
                if (ebVar == null) {
                    synchronized (C19156aq.class) {
                        ebVar = f53648e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53647d);
                            f53648e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
