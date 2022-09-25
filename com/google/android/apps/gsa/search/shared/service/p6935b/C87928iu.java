package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.iu */
/* compiled from: PG */
public final class C87928iu extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C87928iu f237839b;

    /* renamed from: c */
    private static volatile C63010eb f237840c;

    /* renamed from: a */
    public C62971cq f237841a = emptyProtobufList();

    static {
        C87928iu iuVar = new C87928iu();
        f237839b = iuVar;
        C62942bv.registerDefaultInstance(C87928iu.class, iuVar);
    }

    private C87928iu() {
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
                return newMessageInfo(f237839b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C87927it.class});
            case 3:
                return new C87928iu();
            case 4:
                return new C87925ir();
            case 5:
                return f237839b;
            case 6:
                C63010eb ebVar = f237840c;
                if (ebVar == null) {
                    synchronized (C87928iu.class) {
                        ebVar = f237840c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237839b);
                            f237840c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
