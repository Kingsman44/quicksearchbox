package com.google.assistant.p4016z;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.z.ae */
/* compiled from: PG */
public final class C53680ae extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53680ae f140903c;

    /* renamed from: d */
    private static volatile C63010eb f140904d;

    /* renamed from: a */
    public int f140905a;

    /* renamed from: b */
    public C53738w f140906b;

    static {
        C53680ae aeVar = new C53680ae();
        f140903c = aeVar;
        C62942bv.registerDefaultInstance(C53680ae.class, aeVar);
    }

    private C53680ae() {
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
                return newMessageInfo(f140903c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C53680ae();
            case 4:
                return new C53679ad();
            case 5:
                return f140903c;
            case 6:
                C63010eb ebVar = f140904d;
                if (ebVar == null) {
                    synchronized (C53680ae.class) {
                        ebVar = f140904d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140903c);
                            f140904d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
