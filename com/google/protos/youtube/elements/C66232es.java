package com.google.protos.youtube.elements;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.es */
/* compiled from: PG */
public final class C66232es extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C66232es f180105a;

    /* renamed from: c */
    private static volatile C63010eb f180106c;

    /* renamed from: b */
    private byte f180107b = 2;

    static {
        C66232es esVar = new C66232es();
        f180105a = esVar;
        C62942bv.registerDefaultInstance(C66232es.class, esVar);
    }

    private C66232es() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f180107b);
            case 1:
                this.f180107b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f180105a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C66232es();
            case 4:
                return new C66231er();
            case 5:
                return f180105a;
            case 6:
                C63010eb ebVar = f180106c;
                if (ebVar == null) {
                    synchronized (C66232es.class) {
                        ebVar = f180106c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180105a);
                            f180106c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
