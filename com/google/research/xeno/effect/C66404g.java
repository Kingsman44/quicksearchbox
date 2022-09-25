package com.google.research.xeno.effect;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.research.xeno.effect.g */
/* compiled from: PG */
public final class C66404g extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C66404g f180579a;

    /* renamed from: c */
    private static volatile C63010eb f180580c;

    /* renamed from: b */
    private byte f180581b = 2;

    static {
        C66404g gVar = new C66404g();
        f180579a = gVar;
        C62942bv.registerDefaultInstance(C66404g.class, gVar);
    }

    private C66404g() {
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f180581b);
            case 1:
                this.f180581b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f180579a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C66404g();
            case 4:
                return new C66403f();
            case 5:
                return f180579a;
            case 6:
                C63010eb ebVar = f180580c;
                if (ebVar == null) {
                    synchronized (C66404g.class) {
                        ebVar = f180580c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180579a);
                            f180580c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
