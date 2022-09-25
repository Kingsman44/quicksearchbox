package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.dn */
/* compiled from: PG */
public final class C66897dn extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66897dn f181868b;

    /* renamed from: c */
    private static volatile C63010eb f181869c;

    /* renamed from: a */
    public C62971cq f181870a = emptyProtobufList();

    static {
        C66897dn dnVar = new C66897dn();
        f181868b = dnVar;
        C62942bv.registerDefaultInstance(C66897dn.class, dnVar);
    }

    private C66897dn() {
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
                return newMessageInfo(f181868b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C66895dl.class});
            case 3:
                return new C66897dn();
            case 4:
                return new C66896dm();
            case 5:
                return f181868b;
            case 6:
                C63010eb ebVar = f181869c;
                if (ebVar == null) {
                    synchronized (C66897dn.class) {
                        ebVar = f181869c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181868b);
                            f181869c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
