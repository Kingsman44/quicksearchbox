package com.google.android.libraries.assistant.auto.tng.gmm.grpc.p1002d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.gmm.grpc.d.g */
/* compiled from: PG */
public final class C13623g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C13623g f41649c;

    /* renamed from: d */
    private static volatile C63010eb f41650d;

    /* renamed from: a */
    public int f41651a;

    /* renamed from: b */
    public int f41652b;

    static {
        C13623g gVar = new C13623g();
        f41649c = gVar;
        C62942bv.registerDefaultInstance(C13623g.class, gVar);
    }

    private C13623g() {
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
                return newMessageInfo(f41649c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C13622f.f41648a});
            case 3:
                return new C13623g();
            case 4:
                return new C13621e();
            case 5:
                return f41649c;
            case 6:
                C63010eb ebVar = f41650d;
                if (ebVar == null) {
                    synchronized (C13623g.class) {
                        ebVar = f41650d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f41649c);
                            f41650d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
