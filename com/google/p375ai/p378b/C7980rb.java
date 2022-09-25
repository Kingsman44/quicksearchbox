package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.rb */
/* compiled from: PG */
public final class C7980rb extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C7980rb f28035c;

    /* renamed from: d */
    private static volatile C63010eb f28036d;

    /* renamed from: a */
    public int f28037a;

    /* renamed from: b */
    public int f28038b;

    static {
        C7980rb rbVar = new C7980rb();
        f28035c = rbVar;
        C62942bv.registerDefaultInstance(C7980rb.class, rbVar);
    }

    private C7980rb() {
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
                return newMessageInfo(f28035c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C8028sw.f28201a});
            case 3:
                return new C7980rb();
            case 4:
                return new C7979ra();
            case 5:
                return f28035c;
            case 6:
                C63010eb ebVar = f28036d;
                if (ebVar == null) {
                    synchronized (C7980rb.class) {
                        ebVar = f28036d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28035c);
                            f28036d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
