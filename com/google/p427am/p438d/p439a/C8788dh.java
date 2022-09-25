package com.google.p427am.p438d.p439a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.d.a.dh */
/* compiled from: PG */
public final class C8788dh extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8788dh f30161c;

    /* renamed from: d */
    private static volatile C63010eb f30162d;

    /* renamed from: a */
    public C62971cq f30163a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f30164b = emptyProtobufList();

    static {
        C8788dh dhVar = new C8788dh();
        f30161c = dhVar;
        C62942bv.registerDefaultInstance(C8788dh.class, dhVar);
    }

    private C8788dh() {
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
                return newMessageInfo(f30161c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", C8751by.class, "b", C8751by.class});
            case 3:
                return new C8788dh();
            case 4:
                return new C8787dg();
            case 5:
                return f30161c;
            case 6:
                C63010eb ebVar = f30162d;
                if (ebVar == null) {
                    synchronized (C8788dh.class) {
                        ebVar = f30162d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30161c);
                            f30162d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
