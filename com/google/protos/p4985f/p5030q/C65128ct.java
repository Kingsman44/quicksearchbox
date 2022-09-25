package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.ct */
/* compiled from: PG */
public final class C65128ct extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65128ct f176292b;

    /* renamed from: c */
    private static volatile C63010eb f176293c;

    /* renamed from: a */
    public C62961ch f176294a = emptyIntList();

    static {
        C65128ct ctVar = new C65128ct();
        f176292b = ctVar;
        C62942bv.registerDefaultInstance(C65128ct.class, ctVar);
    }

    private C65128ct() {
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
                return newMessageInfo(f176292b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0016", new Object[]{"a"});
            case 3:
                return new C65128ct();
            case 4:
                return new C65127cs();
            case 5:
                return f176292b;
            case 6:
                C63010eb ebVar = f176293c;
                if (ebVar == null) {
                    synchronized (C65128ct.class) {
                        ebVar = f176293c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176292b);
                            f176293c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
