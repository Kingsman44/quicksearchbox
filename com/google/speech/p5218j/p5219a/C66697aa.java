package com.google.speech.p5218j.p5219a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.a.aa */
/* compiled from: PG */
public final class C66697aa extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66697aa f181436b;

    /* renamed from: c */
    private static volatile C63010eb f181437c;

    /* renamed from: a */
    public C62971cq f181438a = C62942bv.emptyProtobufList();

    static {
        C66697aa aaVar = new C66697aa();
        f181436b = aaVar;
        C62942bv.registerDefaultInstance(C66697aa.class, aaVar);
    }

    private C66697aa() {
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
                return newMessageInfo(f181436b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C66697aa();
            case 4:
                return new C66759z();
            case 5:
                return f181436b;
            case 6:
                C63010eb ebVar = f181437c;
                if (ebVar == null) {
                    synchronized (C66697aa.class) {
                        ebVar = f181437c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181436b);
                            f181437c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
