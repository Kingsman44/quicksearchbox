package com.google.assistant.p3803ag.p3804a.p3805a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.a.a.g */
/* compiled from: PG */
public final class C48787g extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48787g f126237b;

    /* renamed from: d */
    private static volatile C63010eb f126238d;

    /* renamed from: a */
    public C62971cq f126239a = emptyProtobufList();

    /* renamed from: c */
    private byte f126240c = 2;

    static {
        C48787g gVar = new C48787g();
        f126237b = gVar;
        C62942bv.registerDefaultInstance(C48787g.class, gVar);
    }

    private C48787g() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f126240c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f126240c = b;
                return null;
            case 2:
                return newMessageInfo(f126237b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C48786f.class});
            case 3:
                return new C48787g();
            case 4:
                return new C48784d();
            case 5:
                return f126237b;
            case 6:
                C63010eb ebVar = f126238d;
                if (ebVar == null) {
                    synchronized (C48787g.class) {
                        ebVar = f126238d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126237b);
                            f126238d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
