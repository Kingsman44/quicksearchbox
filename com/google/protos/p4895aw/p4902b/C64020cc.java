package com.google.protos.p4895aw.p4902b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.b.cc */
/* compiled from: PG */
public final class C64020cc extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64020cc f173121b;

    /* renamed from: c */
    private static volatile C63010eb f173122c;

    /* renamed from: a */
    public C62971cq f173123a = emptyProtobufList();

    static {
        C64020cc ccVar = new C64020cc();
        f173121b = ccVar;
        C62942bv.registerDefaultInstance(C64020cc.class, ccVar);
    }

    private C64020cc() {
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
                return newMessageInfo(f173121b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C64019cb.class});
            case 3:
                return new C64020cc();
            case 4:
                return new C64016bz();
            case 5:
                return f173121b;
            case 6:
                C63010eb ebVar = f173122c;
                if (ebVar == null) {
                    synchronized (C64020cc.class) {
                        ebVar = f173122c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173121b);
                            f173122c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
