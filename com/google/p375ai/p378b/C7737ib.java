package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57440dk;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.ib */
/* compiled from: PG */
public final class C7737ib extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C7737ib f27040d;

    /* renamed from: f */
    private static volatile C63010eb f27041f;

    /* renamed from: a */
    public int f27042a;

    /* renamed from: b */
    public C7669fo f27043b;

    /* renamed from: c */
    public C57440dk f27044c;

    /* renamed from: e */
    private byte f27045e = 2;

    static {
        C7737ib ibVar = new C7737ib();
        f27040d = ibVar;
        C62942bv.registerDefaultInstance(C7737ib.class, ibVar);
    }

    private C7737ib() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f27045e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f27045e = b;
                return null;
            case 2:
                return newMessageInfo(f27040d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C7737ib();
            case 4:
                return new C7736ia();
            case 5:
                return f27040d;
            case 6:
                C63010eb ebVar = f27041f;
                if (ebVar == null) {
                    synchronized (C7737ib.class) {
                        ebVar = f27041f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27040d);
                            f27041f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
