package com.google.protos.p4895aw.p4896a.p4897a.p4898a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.a.a.a.bh */
/* compiled from: PG */
public final class C63921bh extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63921bh f172854b;

    /* renamed from: d */
    private static volatile C63010eb f172855d;

    /* renamed from: a */
    public C62971cq f172856a = emptyProtobufList();

    /* renamed from: c */
    private byte f172857c = 2;

    static {
        C63921bh bhVar = new C63921bh();
        f172854b = bhVar;
        C62942bv.registerDefaultInstance(C63921bh.class, bhVar);
    }

    private C63921bh() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f172857c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f172857c = b;
                return null;
            case 2:
                return newMessageInfo(f172854b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C63919bf.class});
            case 3:
                return new C63921bh();
            case 4:
                return new C63920bg();
            case 5:
                return f172854b;
            case 6:
                C63010eb ebVar = f172855d;
                if (ebVar == null) {
                    synchronized (C63921bh.class) {
                        ebVar = f172855d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172854b);
                            f172855d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
