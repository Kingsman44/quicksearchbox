package com.google.common.p4552o.p4564j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.j.aq */
/* compiled from: PG */
public final class C60021aq extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C60021aq f162228b;

    /* renamed from: c */
    private static volatile C63010eb f162229c;

    /* renamed from: a */
    public C62971cq f162230a = C62942bv.emptyProtobufList();

    static {
        C60021aq aqVar = new C60021aq();
        f162228b = aqVar;
        C62942bv.registerDefaultInstance(C60021aq.class, aqVar);
    }

    private C60021aq() {
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
                return newMessageInfo(f162228b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C60021aq();
            case 4:
                return new C60020ap();
            case 5:
                return f162228b;
            case 6:
                C63010eb ebVar = f162229c;
                if (ebVar == null) {
                    synchronized (C60021aq.class) {
                        ebVar = f162229c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162228b);
                            f162229c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
