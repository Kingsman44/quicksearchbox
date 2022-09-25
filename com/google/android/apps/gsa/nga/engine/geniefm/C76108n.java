package com.google.android.apps.gsa.nga.engine.geniefm;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.geniefm.n */
/* compiled from: PG */
public final class C76108n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C76108n f211001c;

    /* renamed from: d */
    private static volatile C63010eb f211002d;

    /* renamed from: a */
    public C62971cq f211003a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f211004b = emptyProtobufList();

    static {
        C76108n nVar = new C76108n();
        f211001c = nVar;
        C62942bv.registerDefaultInstance(C76108n.class, nVar);
    }

    private C76108n() {
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
                return newMessageInfo(f211001c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", C76106l.class, "b", C76106l.class});
            case 3:
                return new C76108n();
            case 4:
                return new C76107m();
            case 5:
                return f211001c;
            case 6:
                C63010eb ebVar = f211002d;
                if (ebVar == null) {
                    synchronized (C76108n.class) {
                        ebVar = f211002d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f211001c);
                            f211002d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
