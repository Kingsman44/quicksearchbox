package com.google.protos.p4895aw.p4902b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.b.dr */
/* compiled from: PG */
public final class C64062dr extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64062dr f173204b;

    /* renamed from: c */
    private static volatile C63010eb f173205c;

    /* renamed from: a */
    public C62971cq f173206a = emptyProtobufList();

    static {
        C64062dr drVar = new C64062dr();
        f173204b = drVar;
        C62942bv.registerDefaultInstance(C64062dr.class, drVar);
    }

    private C64062dr() {
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
                return newMessageInfo(f173204b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C64104v.class});
            case 3:
                return new C64062dr();
            case 4:
                return new C64061dq();
            case 5:
                return f173204b;
            case 6:
                C63010eb ebVar = f173205c;
                if (ebVar == null) {
                    synchronized (C64062dr.class) {
                        ebVar = f173205c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173204b);
                            f173205c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
