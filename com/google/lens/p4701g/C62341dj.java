package com.google.lens.p4701g;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.dj */
/* compiled from: PG */
public final class C62341dj extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62341dj f168297b;

    /* renamed from: c */
    private static volatile C63010eb f168298c;

    /* renamed from: a */
    public C62971cq f168299a = emptyProtobufList();

    static {
        C62341dj djVar = new C62341dj();
        f168297b = djVar;
        C62942bv.registerDefaultInstance(C62341dj.class, djVar);
    }

    private C62341dj() {
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
                return newMessageInfo(f168297b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C62337df.class});
            case 3:
                return new C62341dj();
            case 4:
                return new C62340di();
            case 5:
                return f168297b;
            case 6:
                C63010eb ebVar = f168298c;
                if (ebVar == null) {
                    synchronized (C62341dj.class) {
                        ebVar = f168298c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168297b);
                            f168298c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
