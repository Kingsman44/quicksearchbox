package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.s.a.gb */
/* compiled from: PG */
public final class C53227gb extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53227gb f139499b;

    /* renamed from: c */
    public static final C62940bt f139500c;

    /* renamed from: d */
    private static volatile C63010eb f139501d;

    /* renamed from: a */
    public C62971cq f139502a = emptyProtobufList();

    static {
        C53227gb gbVar = new C53227gb();
        f139499b = gbVar;
        C62942bv.registerDefaultInstance(C53227gb.class, gbVar);
        f139500c = C62942bv.newSingularGeneratedExtension(C53153di.f139315c, gbVar, gbVar, (C62958ce) null, 116, C63066gd.MESSAGE, C53227gb.class);
    }

    private C53227gb() {
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
                return newMessageInfo(f139499b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C53226ga.class});
            case 3:
                return new C53227gb();
            case 4:
                return new C53221fw();
            case 5:
                return f139499b;
            case 6:
                C63010eb ebVar = f139501d;
                if (ebVar == null) {
                    synchronized (C53227gb.class) {
                        ebVar = f139501d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139499b);
                            f139501d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
