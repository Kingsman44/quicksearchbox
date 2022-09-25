package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.ai.b.qp */
/* compiled from: PG */
public final class C7967qp extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C7967qp f27987b;

    /* renamed from: c */
    public static final C62940bt f27988c;

    /* renamed from: f */
    private static volatile C63010eb f27989f;

    /* renamed from: a */
    public C7969qr f27990a;

    /* renamed from: d */
    private int f27991d;

    /* renamed from: e */
    private byte f27992e = 2;

    static {
        C7967qp qpVar = new C7967qp();
        f27987b = qpVar;
        C62942bv.registerDefaultInstance(C7967qp.class, qpVar);
        f27988c = C62942bv.newSingularGeneratedExtension(C7604dd.f26266a, qpVar, qpVar, (C62958ce) null, 100946300, C63066gd.MESSAGE, C7967qp.class);
    }

    private C7967qp() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f27992e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f27992e = b;
                return null;
            case 2:
                return newMessageInfo(f27987b, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005ᐉ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C7967qp();
            case 4:
                return new C7966qo();
            case 5:
                return f27987b;
            case 6:
                C63010eb ebVar = f27989f;
                if (ebVar == null) {
                    synchronized (C7967qp.class) {
                        ebVar = f27989f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27987b);
                            f27989f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
