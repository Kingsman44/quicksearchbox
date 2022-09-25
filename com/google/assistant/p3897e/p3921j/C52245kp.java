package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.kp */
/* compiled from: PG */
public final class C52245kp extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52245kp f137112c;

    /* renamed from: d */
    private static volatile C63010eb f137113d;

    /* renamed from: a */
    public int f137114a;

    /* renamed from: b */
    public int f137115b;

    static {
        C52245kp kpVar = new C52245kp();
        f137112c = kpVar;
        C62942bv.registerDefaultInstance(C52245kp.class, kpVar);
    }

    private C52245kp() {
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
                return newMessageInfo(f137112c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C52244ko.f137111a});
            case 3:
                return new C52245kp();
            case 4:
                return new C52243kn();
            case 5:
                return f137112c;
            case 6:
                C63010eb ebVar = f137113d;
                if (ebVar == null) {
                    synchronized (C52245kp.class) {
                        ebVar = f137113d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137112c);
                            f137113d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
