package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.lh */
/* compiled from: PG */
public final class C7824lh extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C7824lh f27444c;

    /* renamed from: d */
    private static volatile C63010eb f27445d;

    /* renamed from: a */
    public int f27446a;

    /* renamed from: b */
    public int f27447b;

    static {
        C7824lh lhVar = new C7824lh();
        f27444c = lhVar;
        C62942bv.registerDefaultInstance(C7824lh.class, lhVar);
    }

    private C7824lh() {
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
                return newMessageInfo(f27444c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C7824lh();
            case 4:
                return new C7823lg();
            case 5:
                return f27444c;
            case 6:
                C63010eb ebVar = f27445d;
                if (ebVar == null) {
                    synchronized (C7824lh.class) {
                        ebVar = f27445d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27444c);
                            f27445d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
