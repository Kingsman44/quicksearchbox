package com.google.assistant.p3860as;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.as.aw */
/* compiled from: PG */
public final class C49760aw extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C49760aw f128496a;

    /* renamed from: e */
    private static volatile C63010eb f128497e;

    /* renamed from: b */
    private int f128498b;

    /* renamed from: c */
    private C61746h f128499c;

    /* renamed from: d */
    private byte f128500d = 2;

    static {
        C49760aw awVar = new C49760aw();
        f128496a = awVar;
        C62942bv.registerDefaultInstance(C49760aw.class, awVar);
    }

    private C49760aw() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f128500d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f128500d = b;
                return null;
            case 2:
                return newMessageInfo(f128496a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C49760aw();
            case 4:
                return new C49759av();
            case 5:
                return f128496a;
            case 6:
                C63010eb ebVar = f128497e;
                if (ebVar == null) {
                    synchronized (C49760aw.class) {
                        ebVar = f128497e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128496a);
                            f128497e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
