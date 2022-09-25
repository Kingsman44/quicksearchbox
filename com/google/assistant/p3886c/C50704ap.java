package com.google.assistant.p3886c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.ap */
/* compiled from: PG */
public final class C50704ap extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50704ap f131954d;

    /* renamed from: f */
    private static volatile C63010eb f131955f;

    /* renamed from: a */
    public int f131956a;

    /* renamed from: b */
    public int f131957b;

    /* renamed from: c */
    public C50706ar f131958c;

    /* renamed from: e */
    private byte f131959e = 2;

    static {
        C50704ap apVar = new C50704ap();
        f131954d = apVar;
        C62942bv.registerDefaultInstance(C50704ap.class, apVar);
    }

    private C50704ap() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f131959e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f131959e = b;
                return null;
            case 2:
                return newMessageInfo(f131954d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C50701am.m85888b(), C45240c.f118157a});
            case 3:
                return new C50704ap();
            case 4:
                return new C50703ao();
            case 5:
                return f131954d;
            case 6:
                C63010eb ebVar = f131955f;
                if (ebVar == null) {
                    synchronized (C50704ap.class) {
                        ebVar = f131955f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131954d);
                            f131955f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
