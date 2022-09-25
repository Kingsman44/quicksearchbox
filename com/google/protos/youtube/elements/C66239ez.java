package com.google.protos.youtube.elements;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.ez */
/* compiled from: PG */
public final class C66239ez extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C66239ez f180121a;

    /* renamed from: c */
    private static volatile C63010eb f180122c;

    /* renamed from: b */
    private byte f180123b = 2;

    static {
        C66239ez ezVar = new C66239ez();
        f180121a = ezVar;
        C62942bv.registerDefaultInstance(C66239ez.class, ezVar);
    }

    private C66239ez() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f180123b);
            case 1:
                this.f180123b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f180121a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C66239ez();
            case 4:
                return new C66238ey();
            case 5:
                return f180121a;
            case 6:
                C63010eb ebVar = f180122c;
                if (ebVar == null) {
                    synchronized (C66239ez.class) {
                        ebVar = f180122c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180121a);
                            f180122c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
