package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.aga */
/* compiled from: PG */
public final class C51675aga extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C51675aga f135029a;

    /* renamed from: b */
    private static volatile C63010eb f135030b;

    static {
        C51675aga aga = new C51675aga();
        f135029a = aga;
        C62942bv.registerDefaultInstance(C51675aga.class, aga);
    }

    private C51675aga() {
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
                return newMessageInfo(f135029a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C51675aga();
            case 4:
                return new afz();
            case 5:
                return f135029a;
            case 6:
                C63010eb ebVar = f135030b;
                if (ebVar == null) {
                    synchronized (C51675aga.class) {
                        ebVar = f135030b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135029a);
                            f135030b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
