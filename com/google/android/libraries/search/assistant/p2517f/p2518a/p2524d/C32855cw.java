package com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.f.a.d.cw */
/* compiled from: PG */
public final class C32855cw extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C32855cw f88074b;

    /* renamed from: c */
    private static volatile C63010eb f88075c;

    /* renamed from: a */
    public C62971cq f88076a = emptyProtobufList();

    static {
        C32855cw cwVar = new C32855cw();
        f88074b = cwVar;
        C62942bv.registerDefaultInstance(C32855cw.class, cwVar);
    }

    private C32855cw() {
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
                return newMessageInfo(f88074b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C32853cu.class});
            case 3:
                return new C32855cw();
            case 4:
                return new C32854cv();
            case 5:
                return f88074b;
            case 6:
                C63010eb ebVar = f88075c;
                if (ebVar == null) {
                    synchronized (C32855cw.class) {
                        ebVar = f88075c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f88074b);
                            f88075c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
