package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.rg */
/* compiled from: PG */
public final class C60475rg extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C60475rg f163673c;

    /* renamed from: d */
    private static volatile C63010eb f163674d;

    /* renamed from: a */
    public int f163675a;

    /* renamed from: b */
    public int f163676b;

    static {
        C60475rg rgVar = new C60475rg();
        f163673c = rgVar;
        C62942bv.registerDefaultInstance(C60475rg.class, rgVar);
    }

    private C60475rg() {
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
                return newMessageInfo(f163673c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C60475rg();
            case 4:
                return new C60474rf();
            case 5:
                return f163673c;
            case 6:
                C63010eb ebVar = f163674d;
                if (ebVar == null) {
                    synchronized (C60475rg.class) {
                        ebVar = f163674d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163673c);
                            f163674d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
