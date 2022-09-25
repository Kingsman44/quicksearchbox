package com.google.protos.p5129p.p5131b;

import com.google.assistant.p3897e.p3921j.C52428rj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.p.b.aq */
/* compiled from: PG */
public final class C65759aq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65759aq f178771c;

    /* renamed from: d */
    public static final C62940bt f178772d;

    /* renamed from: e */
    private static volatile C63010eb f178773e;

    /* renamed from: a */
    public int f178774a;

    /* renamed from: b */
    public C52428rj f178775b;

    static {
        C65759aq aqVar = new C65759aq();
        f178771c = aqVar;
        C62942bv.registerDefaultInstance(C65759aq.class, aqVar);
        f178772d = C62942bv.newSingularGeneratedExtension(C65808cl.f178897d, aqVar, aqVar, (C62958ce) null, 449863242, C63066gd.MESSAGE, C65759aq.class);
    }

    private C65759aq() {
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
                return newMessageInfo(f178771c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65759aq();
            case 4:
                return new C65758ap();
            case 5:
                return f178771c;
            case 6:
                C63010eb ebVar = f178773e;
                if (ebVar == null) {
                    synchronized (C65759aq.class) {
                        ebVar = f178773e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178771c);
                            f178773e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
