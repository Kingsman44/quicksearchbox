package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.hr */
/* compiled from: PG */
public final class C67009hr extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67009hr f182157c;

    /* renamed from: d */
    private static volatile C63010eb f182158d;

    /* renamed from: a */
    public int f182159a;

    /* renamed from: b */
    public C66760aa f182160b;

    static {
        C67009hr hrVar = new C67009hr();
        f182157c = hrVar;
        C62942bv.registerDefaultInstance(C67009hr.class, hrVar);
    }

    private C67009hr() {
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
                return newMessageInfo(f182157c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C67009hr();
            case 4:
                return new C67008hq();
            case 5:
                return f182157c;
            case 6:
                C63010eb ebVar = f182158d;
                if (ebVar == null) {
                    synchronized (C67009hr.class) {
                        ebVar = f182158d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182157c);
                            f182158d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
