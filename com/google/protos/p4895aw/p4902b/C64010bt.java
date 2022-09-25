package com.google.protos.p4895aw.p4902b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.b.bt */
/* compiled from: PG */
public final class C64010bt extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64010bt f173097b;

    /* renamed from: c */
    private static volatile C63010eb f173098c;

    /* renamed from: a */
    public C62971cq f173099a = emptyProtobufList();

    static {
        C64010bt btVar = new C64010bt();
        f173097b = btVar;
        C62942bv.registerDefaultInstance(C64010bt.class, btVar);
    }

    private C64010bt() {
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
                return newMessageInfo(f173097b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C64043cz.class});
            case 3:
                return new C64010bt();
            case 4:
                return new C64009bs();
            case 5:
                return f173097b;
            case 6:
                C63010eb ebVar = f173098c;
                if (ebVar == null) {
                    synchronized (C64010bt.class) {
                        ebVar = f173098c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173097b);
                            f173098c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
