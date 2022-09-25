package com.google.android.libraries.assistant.auto.tng.suggestions.p1263k;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.k.f */
/* compiled from: PG */
public final class C16370f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C16370f f48191b;

    /* renamed from: c */
    private static volatile C63010eb f48192c;

    /* renamed from: a */
    public C62971cq f48193a = emptyProtobufList();

    static {
        C16370f fVar = new C16370f();
        f48191b = fVar;
        C62942bv.registerDefaultInstance(C16370f.class, fVar);
    }

    private C16370f() {
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
                return newMessageInfo(f48191b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C16368d.class});
            case 3:
                return new C16370f();
            case 4:
                return new C16369e();
            case 5:
                return f48191b;
            case 6:
                C63010eb ebVar = f48192c;
                if (ebVar == null) {
                    synchronized (C16370f.class) {
                        ebVar = f48192c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48191b);
                            f48192c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
