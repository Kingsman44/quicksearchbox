package com.google.p4273bs.p4277b.p4278a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bs.b.a.m */
/* compiled from: PG */
public final class C56473m extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56473m f150850b;

    /* renamed from: d */
    private static volatile C63010eb f150851d;

    /* renamed from: a */
    public C62971cq f150852a = emptyProtobufList();

    /* renamed from: c */
    private byte f150853c = 2;

    static {
        C56473m mVar = new C56473m();
        f150850b = mVar;
        C62942bv.registerDefaultInstance(C56473m.class, mVar);
    }

    private C56473m() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f150853c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f150853c = b;
                return null;
            case 2:
                return newMessageInfo(f150850b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C56471k.class});
            case 3:
                return new C56473m();
            case 4:
                return new C56472l();
            case 5:
                return f150850b;
            case 6:
                C63010eb ebVar = f150851d;
                if (ebVar == null) {
                    synchronized (C56473m.class) {
                        ebVar = f150851d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150850b);
                            f150851d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
