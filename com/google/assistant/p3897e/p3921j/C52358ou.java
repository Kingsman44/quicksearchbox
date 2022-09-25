package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ou */
/* compiled from: PG */
public final class C52358ou extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52358ou f137407c;

    /* renamed from: d */
    private static volatile C63010eb f137408d;

    /* renamed from: a */
    public int f137409a;

    /* renamed from: b */
    public int f137410b;

    static {
        C52358ou ouVar = new C52358ou();
        f137407c = ouVar;
        C62942bv.registerDefaultInstance(C52358ou.class, ouVar);
    }

    private C52358ou() {
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
                return newMessageInfo(f137407c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C52356os.f137406a});
            case 3:
                return new C52358ou();
            case 4:
                return new C52355or();
            case 5:
                return f137407c;
            case 6:
                C63010eb ebVar = f137408d;
                if (ebVar == null) {
                    synchronized (C52358ou.class) {
                        ebVar = f137408d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137407c);
                            f137408d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
