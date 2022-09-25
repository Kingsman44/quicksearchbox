package com.google.assistant.p3996t.p3997a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.t.a.f */
/* compiled from: PG */
public final class C53479f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53479f f140355b;

    /* renamed from: c */
    private static volatile C63010eb f140356c;

    /* renamed from: a */
    public C62971cq f140357a = emptyProtobufList();

    static {
        C53479f fVar = new C53479f();
        f140355b = fVar;
        C62942bv.registerDefaultInstance(C53479f.class, fVar);
    }

    private C53479f() {
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
                return newMessageInfo(f140355b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C53475b.class});
            case 3:
                return new C53479f();
            case 4:
                return new C53478e();
            case 5:
                return f140355b;
            case 6:
                C63010eb ebVar = f140356c;
                if (ebVar == null) {
                    synchronized (C53479f.class) {
                        ebVar = f140356c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140355b);
                            f140356c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
