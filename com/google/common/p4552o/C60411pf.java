package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.pf */
/* compiled from: PG */
public final class C60411pf extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C60411pf f163484a;

    /* renamed from: c */
    private static volatile C63010eb f163485c;

    /* renamed from: b */
    private byte f163486b = 2;

    static {
        C60411pf pfVar = new C60411pf();
        f163484a = pfVar;
        C62942bv.registerDefaultInstance(C60411pf.class, pfVar);
    }

    private C60411pf() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f163486b);
            case 1:
                this.f163486b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f163484a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C60411pf();
            case 4:
                return new C60410pe();
            case 5:
                return f163484a;
            case 6:
                C63010eb ebVar = f163485c;
                if (ebVar == null) {
                    synchronized (C60411pf.class) {
                        ebVar = f163485c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163484a);
                            f163485c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
