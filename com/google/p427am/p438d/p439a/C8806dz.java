package com.google.p427am.p438d.p439a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.d.a.dz */
/* compiled from: PG */
public final class C8806dz extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8806dz f30184c;

    /* renamed from: d */
    private static volatile C63010eb f30185d;

    /* renamed from: a */
    public C62971cq f30186a = emptyProtobufList();

    /* renamed from: b */
    public C8804dx f30187b;

    static {
        C8806dz dzVar = new C8806dz();
        f30184c = dzVar;
        C62942bv.registerDefaultInstance(C8806dz.class, dzVar);
    }

    private C8806dz() {
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
                return newMessageInfo(f30184c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001c\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C8806dz();
            case 4:
                return new C8805dy();
            case 5:
                return f30184c;
            case 6:
                C63010eb ebVar = f30185d;
                if (ebVar == null) {
                    synchronized (C8806dz.class) {
                        ebVar = f30185d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30184c);
                            f30185d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
