package com.google.assistant.p3886c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.ar */
/* compiled from: PG */
public final class C50706ar extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C50706ar f131960a;

    /* renamed from: c */
    private static volatile C63010eb f131961c;

    /* renamed from: b */
    private byte f131962b = 2;

    static {
        C50706ar arVar = new C50706ar();
        f131960a = arVar;
        C62942bv.registerDefaultInstance(C50706ar.class, arVar);
    }

    private C50706ar() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f131962b);
            case 1:
                this.f131962b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f131960a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C50706ar();
            case 4:
                return new C50705aq();
            case 5:
                return f131960a;
            case 6:
                C63010eb ebVar = f131961c;
                if (ebVar == null) {
                    synchronized (C50706ar.class) {
                        ebVar = f131961c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131960a);
                            f131961c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
