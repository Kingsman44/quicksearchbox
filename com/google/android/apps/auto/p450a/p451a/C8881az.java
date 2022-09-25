package com.google.android.apps.auto.p450a.p451a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.auto.a.a.az */
/* compiled from: PG */
public final class C8881az extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8881az f30830c;

    /* renamed from: d */
    private static volatile C63010eb f30831d;

    /* renamed from: a */
    public C62971cq f30832a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public C62971cq f30833b = emptyProtobufList();

    static {
        C8881az azVar = new C8881az();
        f30830c = azVar;
        C62942bv.registerDefaultInstance(C8881az.class, azVar);
    }

    private C8881az() {
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
                return newMessageInfo(f30830c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001a\u0002\u001b", new Object[]{"a", "b", C8865aj.class});
            case 3:
                return new C8881az();
            case 4:
                return new C8880ay();
            case 5:
                return f30830c;
            case 6:
                C63010eb ebVar = f30831d;
                if (ebVar == null) {
                    synchronized (C8881az.class) {
                        ebVar = f30831d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30830c);
                            f30831d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
