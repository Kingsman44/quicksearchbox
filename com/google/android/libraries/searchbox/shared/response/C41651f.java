package com.google.android.libraries.searchbox.shared.response;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.searchbox.shared.response.f */
/* compiled from: PG */
public final class C41651f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C41651f f108873b;

    /* renamed from: c */
    private static volatile C63010eb f108874c;

    /* renamed from: a */
    public C62971cq f108875a = C62942bv.emptyProtobufList();

    static {
        C41651f fVar = new C41651f();
        f108873b = fVar;
        C62942bv.registerDefaultInstance(C41651f.class, fVar);
    }

    private C41651f() {
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
                return newMessageInfo(f108873b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001a", new Object[]{"a"});
            case 3:
                return new C41651f();
            case 4:
                return new C41650e();
            case 5:
                return f108873b;
            case 6:
                C63010eb ebVar = f108874c;
                if (ebVar == null) {
                    synchronized (C41651f.class) {
                        ebVar = f108874c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f108873b);
                            f108874c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
