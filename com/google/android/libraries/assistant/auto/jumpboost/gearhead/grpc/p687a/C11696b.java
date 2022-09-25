package com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.a.b */
/* compiled from: PG */
public final class C11696b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C11696b f37707d;

    /* renamed from: e */
    private static volatile C63010eb f37708e;

    /* renamed from: a */
    public int f37709a;

    /* renamed from: b */
    public boolean f37710b;

    /* renamed from: c */
    public C11681al f37711c;

    static {
        C11696b bVar = new C11696b();
        f37707d = bVar;
        C62942bv.registerDefaultInstance(C11696b.class, bVar);
    }

    private C11696b() {
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
                return newMessageInfo(f37707d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C11696b();
            case 4:
                return new C11669a();
            case 5:
                return f37707d;
            case 6:
                C63010eb ebVar = f37708e;
                if (ebVar == null) {
                    synchronized (C11696b.class) {
                        ebVar = f37708e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f37707d);
                            f37708e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
