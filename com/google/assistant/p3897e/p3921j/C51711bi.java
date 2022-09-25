package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.bi */
/* compiled from: PG */
public final class C51711bi extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51711bi f135654c;

    /* renamed from: d */
    private static volatile C63010eb f135655d;

    /* renamed from: a */
    public int f135656a;

    /* renamed from: b */
    public boolean f135657b;

    static {
        C51711bi biVar = new C51711bi();
        f135654c = biVar;
        C62942bv.registerDefaultInstance(C51711bi.class, biVar);
    }

    private C51711bi() {
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
                return newMessageInfo(f135654c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C51711bi();
            case 4:
                return new C51710bh();
            case 5:
                return f135654c;
            case 6:
                C63010eb ebVar = f135655d;
                if (ebVar == null) {
                    synchronized (C51711bi.class) {
                        ebVar = f135655d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135654c);
                            f135655d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
