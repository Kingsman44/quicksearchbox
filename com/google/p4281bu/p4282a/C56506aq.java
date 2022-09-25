package com.google.p4281bu.p4282a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.aq */
/* compiled from: PG */
public final class C56506aq extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56506aq f150913b;

    /* renamed from: c */
    private static volatile C63010eb f150914c;

    /* renamed from: a */
    public C62971cq f150915a = emptyProtobufList();

    static {
        C56506aq aqVar = new C56506aq();
        f150913b = aqVar;
        C62942bv.registerDefaultInstance(C56506aq.class, aqVar);
    }

    private C56506aq() {
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
                return newMessageInfo(f150913b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C56513ax.class});
            case 3:
                return new C56506aq();
            case 4:
                return new C56505ap();
            case 5:
                return f150913b;
            case 6:
                C63010eb ebVar = f150914c;
                if (ebVar == null) {
                    synchronized (C56506aq.class) {
                        ebVar = f150914c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150913b);
                            f150914c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
