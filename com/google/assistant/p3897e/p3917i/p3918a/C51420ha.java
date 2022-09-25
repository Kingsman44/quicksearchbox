package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.i.a.ha */
/* compiled from: PG */
public final class C51420ha extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51420ha f133933d;

    /* renamed from: e */
    private static volatile C63010eb f133934e;

    /* renamed from: a */
    public int f133935a;

    /* renamed from: b */
    public C63088z f133936b = C63088z.f170246b;

    /* renamed from: c */
    public int f133937c;

    static {
        C51420ha haVar = new C51420ha();
        f133933d = haVar;
        C62942bv.registerDefaultInstance(C51420ha.class, haVar);
    }

    private C51420ha() {
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
                return newMessageInfo(f133933d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C51417gy.f133924a});
            case 3:
                return new C51420ha();
            case 4:
                return new C51416gx();
            case 5:
                return f133933d;
            case 6:
                C63010eb ebVar = f133934e;
                if (ebVar == null) {
                    synchronized (C51420ha.class) {
                        ebVar = f133934e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133933d);
                            f133934e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
