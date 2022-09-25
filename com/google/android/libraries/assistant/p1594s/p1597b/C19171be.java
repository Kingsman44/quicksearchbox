package com.google.android.libraries.assistant.p1594s.p1597b;

import com.google.assistant.p3781ad.p3789d.p3790a.C48566s;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.s.b.be */
/* compiled from: PG */
public final class C19171be extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C19171be f53699b;

    /* renamed from: c */
    private static volatile C63010eb f53700c;

    /* renamed from: a */
    public C62971cq f53701a = emptyProtobufList();

    static {
        C19171be beVar = new C19171be();
        f53699b = beVar;
        C62942bv.registerDefaultInstance(C19171be.class, beVar);
    }

    private C19171be() {
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
                return newMessageInfo(f53699b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C48566s.class});
            case 3:
                return new C19171be();
            case 4:
                return new C19170bd();
            case 5:
                return f53699b;
            case 6:
                C63010eb ebVar = f53700c;
                if (ebVar == null) {
                    synchronized (C19171be.class) {
                        ebVar = f53700c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53699b);
                            f53700c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
