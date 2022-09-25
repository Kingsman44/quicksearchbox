package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.cc */
/* compiled from: PG */
public final class C65111cc extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65111cc f176270a;

    /* renamed from: b */
    private static volatile C63010eb f176271b;

    static {
        C65111cc ccVar = new C65111cc();
        f176270a = ccVar;
        C62942bv.registerDefaultInstance(C65111cc.class, ccVar);
    }

    private C65111cc() {
        emptyProtobufList();
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
                return newMessageInfo(f176270a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65111cc();
            case 4:
                return new C65110cb();
            case 5:
                return f176270a;
            case 6:
                C63010eb ebVar = f176271b;
                if (ebVar == null) {
                    synchronized (C65111cc.class) {
                        ebVar = f176271b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176270a);
                            f176271b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
