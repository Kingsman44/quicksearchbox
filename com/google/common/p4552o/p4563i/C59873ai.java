package com.google.common.p4552o.p4563i;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.i.ai */
/* compiled from: PG */
public final class C59873ai extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59873ai f161802c;

    /* renamed from: d */
    private static volatile C63010eb f161803d;

    /* renamed from: a */
    public int f161804a;

    /* renamed from: b */
    public int f161805b;

    static {
        C59873ai aiVar = new C59873ai();
        f161802c = aiVar;
        C62942bv.registerDefaultInstance(C59873ai.class, aiVar);
    }

    private C59873ai() {
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
                return newMessageInfo(f161802c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C59872ah.f161801a});
            case 3:
                return new C59873ai();
            case 4:
                return new C59871ag();
            case 5:
                return f161802c;
            case 6:
                C63010eb ebVar = f161803d;
                if (ebVar == null) {
                    synchronized (C59873ai.class) {
                        ebVar = f161803d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161802c);
                            f161803d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
