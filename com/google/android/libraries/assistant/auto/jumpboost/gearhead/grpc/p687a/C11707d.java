package com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a;

import com.google.android.apps.auto.p450a.p451a.C8857ab;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.a.d */
/* compiled from: PG */
public final class C11707d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C11707d f37728c;

    /* renamed from: d */
    private static volatile C63010eb f37729d;

    /* renamed from: a */
    public C62971cq f37730a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public C62971cq f37731b = emptyProtobufList();

    static {
        C11707d dVar = new C11707d();
        f37728c = dVar;
        C62942bv.registerDefaultInstance(C11707d.class, dVar);
    }

    private C11707d() {
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
                return newMessageInfo(f37728c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001a\u0002\u001b", new Object[]{"a", "b", C8857ab.class});
            case 3:
                return new C11707d();
            case 4:
                return new C11706c();
            case 5:
                return f37728c;
            case 6:
                C63010eb ebVar = f37729d;
                if (ebVar == null) {
                    synchronized (C11707d.class) {
                        ebVar = f37729d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f37728c);
                            f37729d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
