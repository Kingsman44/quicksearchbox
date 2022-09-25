package com.google.android.libraries.assistant.auto.tng.gmm.grpc.p1002d;

import com.google.assistant.p3897e.p3917i.p3918a.C51420ha;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.gmm.grpc.d.i */
/* compiled from: PG */
public final class C13625i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C13625i f41653c;

    /* renamed from: d */
    private static volatile C63010eb f41654d;

    /* renamed from: a */
    public int f41655a;

    /* renamed from: b */
    public C51420ha f41656b;

    static {
        C13625i iVar = new C13625i();
        f41653c = iVar;
        C62942bv.registerDefaultInstance(C13625i.class, iVar);
    }

    private C13625i() {
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
                return newMessageInfo(f41653c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C13625i();
            case 4:
                return new C13624h();
            case 5:
                return f41653c;
            case 6:
                C63010eb ebVar = f41654d;
                if (ebVar == null) {
                    synchronized (C13625i.class) {
                        ebVar = f41654d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f41653c);
                            f41654d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
