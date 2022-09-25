package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.mx */
/* compiled from: PG */
public final class C7867mx extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C7867mx f27550d;

    /* renamed from: f */
    private static volatile C63010eb f27551f;

    /* renamed from: a */
    public int f27552a;

    /* renamed from: b */
    public C8150xj f27553b;

    /* renamed from: c */
    public C7708h f27554c;

    /* renamed from: e */
    private byte f27555e = 2;

    static {
        C7867mx mxVar = new C7867mx();
        f27550d = mxVar;
        C62942bv.registerDefaultInstance(C7867mx.class, mxVar);
    }

    private C7867mx() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f27555e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f27555e = b;
                return null;
            case 2:
                return newMessageInfo(f27550d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C7867mx();
            case 4:
                return new C7866mw();
            case 5:
                return f27550d;
            case 6:
                C63010eb ebVar = f27551f;
                if (ebVar == null) {
                    synchronized (C7867mx.class) {
                        ebVar = f27551f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27550d);
                            f27551f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
