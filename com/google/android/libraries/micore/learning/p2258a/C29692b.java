package com.google.android.libraries.micore.learning.p2258a;

import com.google.common.p4552o.p4554b.p4555a.C59628h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.micore.learning.a.b */
/* compiled from: PG */
public final class C29692b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C29692b f80422b;

    /* renamed from: c */
    private static volatile C63010eb f80423c;

    /* renamed from: a */
    public C62971cq f80424a = emptyProtobufList();

    static {
        C29692b bVar = new C29692b();
        f80422b = bVar;
        C62942bv.registerDefaultInstance(C29692b.class, bVar);
    }

    private C29692b() {
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
                return newMessageInfo(f80422b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C59628h.class});
            case 3:
                return new C29692b();
            case 4:
                return new C29691a();
            case 5:
                return f80422b;
            case 6:
                C63010eb ebVar = f80423c;
                if (ebVar == null) {
                    synchronized (C29692b.class) {
                        ebVar = f80423c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f80422b);
                            f80423c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
