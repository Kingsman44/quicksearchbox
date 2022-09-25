package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.cp */
/* compiled from: PG */
public final class C57418cp extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C57418cp f153391a;

    /* renamed from: c */
    private static volatile C63010eb f153392c;

    /* renamed from: b */
    private byte f153393b = 2;

    static {
        C57418cp cpVar = new C57418cp();
        f153391a = cpVar;
        C62942bv.registerDefaultInstance(C57418cp.class, cpVar);
    }

    private C57418cp() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153393b);
            case 1:
                this.f153393b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f153391a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C57418cp();
            case 4:
                return new C57417co();
            case 5:
                return f153391a;
            case 6:
                C63010eb ebVar = f153392c;
                if (ebVar == null) {
                    synchronized (C57418cp.class) {
                        ebVar = f153392c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153391a);
                            f153392c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
