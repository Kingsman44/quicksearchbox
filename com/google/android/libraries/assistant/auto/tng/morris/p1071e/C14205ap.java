package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ap */
/* compiled from: PG */
public final class C14205ap extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14205ap f42985b;

    /* renamed from: c */
    private static volatile C63010eb f42986c;

    /* renamed from: a */
    public C62971cq f42987a = emptyProtobufList();

    static {
        C14205ap apVar = new C14205ap();
        f42985b = apVar;
        C62942bv.registerDefaultInstance(C14205ap.class, apVar);
    }

    private C14205ap() {
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
                return newMessageInfo(f42985b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C14525ml.class});
            case 3:
                return new C14205ap();
            case 4:
                return new C14204ao();
            case 5:
                return f42985b;
            case 6:
                C63010eb ebVar = f42986c;
                if (ebVar == null) {
                    synchronized (C14205ap.class) {
                        ebVar = f42986c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f42985b);
                            f42986c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
