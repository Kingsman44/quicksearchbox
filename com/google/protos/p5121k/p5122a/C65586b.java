package com.google.protos.p5121k.p5122a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.k.a.b */
/* compiled from: PG */
public final class C65586b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65586b f178263a;

    /* renamed from: b */
    private static volatile C63010eb f178264b;

    static {
        C65586b bVar = new C65586b();
        f178263a = bVar;
        C62942bv.registerDefaultInstance(C65586b.class, bVar);
    }

    private C65586b() {
        emptyProtobufList();
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
                return newMessageInfo(f178263a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C65586b();
            case 4:
                return new C65585a();
            case 5:
                return f178263a;
            case 6:
                C63010eb ebVar = f178264b;
                if (ebVar == null) {
                    synchronized (C65586b.class) {
                        ebVar = f178264b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178263a);
                            f178264b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
