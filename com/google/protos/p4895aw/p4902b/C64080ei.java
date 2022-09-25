package com.google.protos.p4895aw.p4902b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.b.ei */
/* compiled from: PG */
public final class C64080ei extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64080ei f173232c;

    /* renamed from: d */
    private static volatile C63010eb f173233d;

    /* renamed from: a */
    public int f173234a = 0;

    /* renamed from: b */
    public Object f173235b;

    static {
        C64080ei eiVar = new C64080ei();
        f173232c = eiVar;
        C62942bv.registerDefaultInstance(C64080ei.class, eiVar);
    }

    private C64080ei() {
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
                return newMessageInfo(f173232c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001း\u0000", new Object[]{"b", "a"});
            case 3:
                return new C64080ei();
            case 4:
                return new C64079eh();
            case 5:
                return f173232c;
            case 6:
                C63010eb ebVar = f173233d;
                if (ebVar == null) {
                    synchronized (C64080ei.class) {
                        ebVar = f173233d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173232c);
                            f173233d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
