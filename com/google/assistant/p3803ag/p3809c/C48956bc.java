package com.google.assistant.p3803ag.p3809c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.bc */
/* compiled from: PG */
public final class C48956bc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48956bc f126662c;

    /* renamed from: d */
    private static volatile C63010eb f126663d;

    /* renamed from: a */
    public int f126664a = 0;

    /* renamed from: b */
    public Object f126665b;

    static {
        C48956bc bcVar = new C48956bc();
        f126662c = bcVar;
        C62942bv.registerDefaultInstance(C48956bc.class, bcVar);
    }

    private C48956bc() {
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
                return newMessageInfo(f126662c, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဵ\u0000\u0002ဳ\u0000\u0003်\u0000\u0004ျ\u0000", new Object[]{"b", "a"});
            case 3:
                return new C48956bc();
            case 4:
                return new C48954ba();
            case 5:
                return f126662c;
            case 6:
                C63010eb ebVar = f126663d;
                if (ebVar == null) {
                    synchronized (C48956bc.class) {
                        ebVar = f126663d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126662c);
                            f126663d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
