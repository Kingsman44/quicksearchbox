package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.if */
/* compiled from: PG */
public final class C7741if extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C7741if f27048b;

    /* renamed from: d */
    private static volatile C63010eb f27049d;

    /* renamed from: a */
    public float f27050a;

    /* renamed from: c */
    private int f27051c;

    static {
        C7741if ifVar = new C7741if();
        f27048b = ifVar;
        C62942bv.registerDefaultInstance(C7741if.class, ifVar);
    }

    private C7741if() {
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
                return newMessageInfo(f27048b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C7741if();
            case 4:
                return new C7740ie();
            case 5:
                return f27048b;
            case 6:
                C63010eb ebVar = f27049d;
                if (ebVar == null) {
                    synchronized (C7741if.class) {
                        ebVar = f27049d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27048b);
                            f27049d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
