package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.di */
/* compiled from: PG */
public final class C51018di extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51018di f132836d;

    /* renamed from: f */
    private static volatile C63010eb f132837f;

    /* renamed from: a */
    public int f132838a;

    /* renamed from: b */
    public C51012dc f132839b;

    /* renamed from: c */
    public C51016dg f132840c;

    /* renamed from: e */
    private byte f132841e = 2;

    static {
        C51018di diVar = new C51018di();
        f132836d = diVar;
        C62942bv.registerDefaultInstance(C51018di.class, diVar);
    }

    private C51018di() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f132841e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f132841e = b;
                return null;
            case 2:
                return newMessageInfo(f132836d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C51018di();
            case 4:
                return new C51017dh();
            case 5:
                return f132836d;
            case 6:
                C63010eb ebVar = f132837f;
                if (ebVar == null) {
                    synchronized (C51018di.class) {
                        ebVar = f132837f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132836d);
                            f132837f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
