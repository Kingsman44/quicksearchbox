package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.ai */
/* compiled from: PG */
public final class C64448ai extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C64448ai f174826d;

    /* renamed from: e */
    private static volatile C63010eb f174827e;

    /* renamed from: a */
    public int f174828a = 0;

    /* renamed from: b */
    public Object f174829b;

    /* renamed from: c */
    public int f174830c;

    static {
        C64448ai aiVar = new C64448ai();
        f174826d = aiVar;
        C62942bv.registerDefaultInstance(C64448ai.class, aiVar);
    }

    private C64448ai() {
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
                return newMessageInfo(f174826d, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u000b\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"b", "a", C45240c.f118157a, C64447ah.class, C64550z.class, C64443ad.class, C64441ab.class});
            case 3:
                return new C64448ai();
            case 4:
                return new C64548x();
            case 5:
                return f174826d;
            case 6:
                C63010eb ebVar = f174827e;
                if (ebVar == null) {
                    synchronized (C64448ai.class) {
                        ebVar = f174827e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174826d);
                            f174827e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
