package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.gs */
/* compiled from: PG */
public final class C7700gs extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C7700gs f26874c;

    /* renamed from: e */
    private static volatile C63010eb f26875e;

    /* renamed from: a */
    public int f26876a = 1;

    /* renamed from: b */
    public C62971cq f26877b = emptyProtobufList();

    /* renamed from: d */
    private int f26878d;

    static {
        C7700gs gsVar = new C7700gs();
        f26874c = gsVar;
        C62942bv.registerDefaultInstance(C7700gs.class, gsVar);
    }

    private C7700gs() {
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
                return newMessageInfo(f26874c, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0004\u001b", new Object[]{"d", "a", C7696go.f26867a, "b", C7699gr.class});
            case 3:
                return new C7700gs();
            case 4:
                return new C7695gn();
            case 5:
                return f26874c;
            case 6:
                C63010eb ebVar = f26875e;
                if (ebVar == null) {
                    synchronized (C7700gs.class) {
                        ebVar = f26875e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26874c);
                            f26875e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
