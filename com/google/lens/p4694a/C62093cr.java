package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.cr */
/* compiled from: PG */
public final class C62093cr extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C62093cr f167699a;

    /* renamed from: c */
    private static volatile C63010eb f167700c;

    /* renamed from: b */
    private byte f167701b = 2;

    static {
        C62093cr crVar = new C62093cr();
        f167699a = crVar;
        C62942bv.registerDefaultInstance(C62093cr.class, crVar);
    }

    private C62093cr() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167701b);
            case 1:
                this.f167701b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f167699a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62093cr();
            case 4:
                return new C62092cq();
            case 5:
                return f167699a;
            case 6:
                C63010eb ebVar = f167700c;
                if (ebVar == null) {
                    synchronized (C62093cr.class) {
                        ebVar = f167700c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167699a);
                            f167700c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
