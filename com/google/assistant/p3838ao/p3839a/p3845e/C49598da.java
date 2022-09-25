package com.google.assistant.p3838ao.p3839a.p3845e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ao.a.e.da */
/* compiled from: PG */
public final class C49598da extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C49598da f127991a;

    /* renamed from: c */
    private static volatile C63010eb f127992c;

    /* renamed from: b */
    private byte f127993b = 2;

    static {
        C49598da daVar = new C49598da();
        f127991a = daVar;
        C62942bv.registerDefaultInstance(C49598da.class, daVar);
    }

    private C49598da() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f127993b);
            case 1:
                this.f127993b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f127991a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C49598da();
            case 4:
                return new C49596cz();
            case 5:
                return f127991a;
            case 6:
                C63010eb ebVar = f127992c;
                if (ebVar == null) {
                    synchronized (C49598da.class) {
                        ebVar = f127992c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127991a);
                            f127992c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
