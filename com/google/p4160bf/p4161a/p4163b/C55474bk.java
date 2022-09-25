package com.google.p4160bf.p4161a.p4163b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.a.b.bk */
/* compiled from: PG */
public final class C55474bk extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55474bk f146354c;

    /* renamed from: d */
    private static volatile C63010eb f146355d;

    /* renamed from: a */
    public int f146356a;

    /* renamed from: b */
    public int f146357b;

    static {
        C55474bk bkVar = new C55474bk();
        f146354c = bkVar;
        C62942bv.registerDefaultInstance(C55474bk.class, bkVar);
    }

    private C55474bk() {
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
                return newMessageInfo(f146354c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C55472bi.f146353a});
            case 3:
                return new C55474bk();
            case 4:
                return new C55471bh();
            case 5:
                return f146354c;
            case 6:
                C63010eb ebVar = f146355d;
                if (ebVar == null) {
                    synchronized (C55474bk.class) {
                        ebVar = f146355d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146354c);
                            f146355d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
