package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.rz */
/* compiled from: PG */
public final class C52444rz extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52444rz f137661c;

    /* renamed from: d */
    private static volatile C63010eb f137662d;

    /* renamed from: a */
    public int f137663a = 0;

    /* renamed from: b */
    public Object f137664b;

    static {
        C52444rz rzVar = new C52444rz();
        f137661c = rzVar;
        C62942bv.registerDefaultInstance(C52444rz.class, rzVar);
    }

    private C52444rz() {
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
                return newMessageInfo(f137661c, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001ျ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000", new Object[]{"b", "a", C52403ql.class, C52393qb.class, C52460so.class});
            case 3:
                return new C52444rz();
            case 4:
                return new C52443ry();
            case 5:
                return f137661c;
            case 6:
                C63010eb ebVar = f137662d;
                if (ebVar == null) {
                    synchronized (C52444rz.class) {
                        ebVar = f137662d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137661c);
                            f137662d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
