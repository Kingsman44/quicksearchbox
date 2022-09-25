package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.ar */
/* compiled from: PG */
public final class C57366ar extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C57366ar f153251a;

    /* renamed from: c */
    private static volatile C63010eb f153252c;

    /* renamed from: b */
    private byte f153253b = 2;

    static {
        C57366ar arVar = new C57366ar();
        f153251a = arVar;
        C62942bv.registerDefaultInstance(C57366ar.class, arVar);
    }

    private C57366ar() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153253b);
            case 1:
                this.f153253b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f153251a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C57366ar();
            case 4:
                return new C57365aq();
            case 5:
                return f153251a;
            case 6:
                C63010eb ebVar = f153252c;
                if (ebVar == null) {
                    synchronized (C57366ar.class) {
                        ebVar = f153252c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153251a);
                            f153252c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
