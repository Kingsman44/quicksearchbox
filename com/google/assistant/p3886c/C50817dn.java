package com.google.assistant.p3886c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.dn */
/* compiled from: PG */
public final class C50817dn extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50817dn f132287e;

    /* renamed from: f */
    private static volatile C63010eb f132288f;

    /* renamed from: a */
    public int f132289a;

    /* renamed from: b */
    public float f132290b;

    /* renamed from: c */
    public float f132291c;

    /* renamed from: d */
    public C50816dm f132292d;

    static {
        C50817dn dnVar = new C50817dn();
        f132287e = dnVar;
        C62942bv.registerDefaultInstance(C50817dn.class, dnVar);
    }

    private C50817dn() {
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
                return newMessageInfo(f132287e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C50817dn();
            case 4:
                return new C50814dk();
            case 5:
                return f132287e;
            case 6:
                C63010eb ebVar = f132288f;
                if (ebVar == null) {
                    synchronized (C50817dn.class) {
                        ebVar = f132288f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132287e);
                            f132288f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
