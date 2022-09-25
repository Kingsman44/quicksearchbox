package com.google.protos.p4850an;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.p */
/* compiled from: PG */
public final class C63632p extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63632p f172093a;

    /* renamed from: c */
    private static volatile C63010eb f172094c;

    /* renamed from: b */
    private byte f172095b = 2;

    static {
        C63632p pVar = new C63632p();
        f172093a = pVar;
        C62942bv.registerDefaultInstance(C63632p.class, pVar);
    }

    private C63632p() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f172095b);
            case 1:
                this.f172095b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f172093a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C63632p();
            case 4:
                return new C63631o();
            case 5:
                return f172093a;
            case 6:
                C63010eb ebVar = f172094c;
                if (ebVar == null) {
                    synchronized (C63632p.class) {
                        ebVar = f172094c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172093a);
                            f172094c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
