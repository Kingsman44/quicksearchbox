package com.google.protos.p4850an.p4855d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4850an.C63626j;

/* renamed from: com.google.protos.an.d.i */
/* compiled from: PG */
public final class C63577i extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63577i f171961d;

    /* renamed from: f */
    private static volatile C63010eb f171962f;

    /* renamed from: a */
    public int f171963a;

    /* renamed from: b */
    public C63626j f171964b;

    /* renamed from: c */
    public int f171965c;

    /* renamed from: e */
    private byte f171966e = 2;

    static {
        C63577i iVar = new C63577i();
        f171961d = iVar;
        C62942bv.registerDefaultInstance(C63577i.class, iVar);
    }

    private C63577i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171966e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171966e = b;
                return null;
            case 2:
                return newMessageInfo(f171961d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C63577i();
            case 4:
                return new C63566h();
            case 5:
                return f171961d;
            case 6:
                C63010eb ebVar = f171962f;
                if (ebVar == null) {
                    synchronized (C63577i.class) {
                        ebVar = f171962f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171961d);
                            f171962f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
