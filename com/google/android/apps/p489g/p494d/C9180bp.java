package com.google.android.apps.p489g.p494d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.bp */
/* compiled from: PG */
public final class C9180bp extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C9180bp f31701b;

    /* renamed from: d */
    private static volatile C63010eb f31702d;

    /* renamed from: a */
    public C62971cq f31703a = emptyProtobufList();

    /* renamed from: c */
    private byte f31704c = 2;

    static {
        C9180bp bpVar = new C9180bp();
        f31701b = bpVar;
        C62942bv.registerDefaultInstance(C9180bp.class, bpVar);
    }

    private C9180bp() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f31704c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f31704c = b;
                return null;
            case 2:
                return newMessageInfo(f31701b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C9278v.class});
            case 3:
                return new C9180bp();
            case 4:
                return new C9179bo();
            case 5:
                return f31701b;
            case 6:
                C63010eb ebVar = f31702d;
                if (ebVar == null) {
                    synchronized (C9180bp.class) {
                        ebVar = f31702d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31701b);
                            f31702d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
