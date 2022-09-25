package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.te */
/* compiled from: PG */
public final class C60527te extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C60527te f163903c;

    /* renamed from: d */
    private static volatile C63010eb f163904d;

    /* renamed from: a */
    public int f163905a;

    /* renamed from: b */
    public int f163906b;

    static {
        C60527te teVar = new C60527te();
        f163903c = teVar;
        C62942bv.registerDefaultInstance(C60527te.class, teVar);
    }

    private C60527te() {
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
                return newMessageInfo(f163903c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C60527te();
            case 4:
                return new C60526td();
            case 5:
                return f163903c;
            case 6:
                C63010eb ebVar = f163904d;
                if (ebVar == null) {
                    synchronized (C60527te.class) {
                        ebVar = f163904d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163903c);
                            f163904d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
