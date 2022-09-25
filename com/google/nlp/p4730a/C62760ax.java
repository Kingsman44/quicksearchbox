package com.google.nlp.p4730a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.a.ax */
/* compiled from: PG */
public final class C62760ax extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62760ax f169492b;

    /* renamed from: c */
    private static volatile C63010eb f169493c;

    /* renamed from: a */
    public C62971cq f169494a = emptyProtobufList();

    static {
        C62760ax axVar = new C62760ax();
        f169492b = axVar;
        C62942bv.registerDefaultInstance(C62760ax.class, axVar);
    }

    private C62760ax() {
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
                return newMessageInfo(f169492b, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"a", C62751ao.class});
            case 3:
                return new C62760ax();
            case 4:
                return new C62759aw();
            case 5:
                return f169492b;
            case 6:
                C63010eb ebVar = f169493c;
                if (ebVar == null) {
                    synchronized (C62760ax.class) {
                        ebVar = f169493c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169492b);
                            f169493c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
