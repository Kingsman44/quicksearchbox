package com.google.protos.p4850an;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.aw */
/* compiled from: PG */
public final class C63352aw extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C63352aw f171196a;

    /* renamed from: c */
    private static volatile C63010eb f171197c;

    /* renamed from: b */
    private byte f171198b = 2;

    static {
        C63352aw awVar = new C63352aw();
        f171196a = awVar;
        C62942bv.registerDefaultInstance(C63352aw.class, awVar);
    }

    private C63352aw() {
        emptyIntList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171198b);
            case 1:
                this.f171198b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f171196a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C63352aw();
            case 4:
                return new C63351av();
            case 5:
                return f171196a;
            case 6:
                C63010eb ebVar = f171197c;
                if (ebVar == null) {
                    synchronized (C63352aw.class) {
                        ebVar = f171197c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171196a);
                            f171197c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
