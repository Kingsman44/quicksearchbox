package com.google.android.libraries.assistant.p1363c.p1398g.p1436k;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.assistant.c.g.k.be */
/* compiled from: PG */
public final class C17496be extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C17496be f50505c;

    /* renamed from: d */
    private static volatile C63010eb f50506d;

    /* renamed from: a */
    public int f50507a;

    /* renamed from: b */
    public C63088z f50508b = C63088z.f170246b;

    static {
        C17496be beVar = new C17496be();
        f50505c = beVar;
        C62942bv.registerDefaultInstance(C17496be.class, beVar);
    }

    private C17496be() {
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
                return newMessageInfo(f50505c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            case 3:
                return new C17496be();
            case 4:
                return new C17495bd();
            case 5:
                return f50505c;
            case 6:
                C63010eb ebVar = f50506d;
                if (ebVar == null) {
                    synchronized (C17496be.class) {
                        ebVar = f50506d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f50505c);
                            f50506d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
