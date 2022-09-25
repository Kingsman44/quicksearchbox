package com.google.protos.p4850an.p4853b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.b.m */
/* compiled from: PG */
public final class C63369m extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C63369m f171256c;

    /* renamed from: e */
    private static volatile C63010eb f171257e;

    /* renamed from: a */
    public int f171258a;

    /* renamed from: b */
    public C63360d f171259b;

    /* renamed from: d */
    private byte f171260d = 2;

    static {
        C63369m mVar = new C63369m();
        f171256c = mVar;
        C62942bv.registerDefaultInstance(C63369m.class, mVar);
    }

    private C63369m() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171260d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171260d = b;
                return null;
            case 2:
                return newMessageInfo(f171256c, "\u0001\u0001\u0000\u0001\f\f\u0001\u0000\u0000\u0001\fᐉ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C63369m();
            case 4:
                return new C63368l();
            case 5:
                return f171256c;
            case 6:
                C63010eb ebVar = f171257e;
                if (ebVar == null) {
                    synchronized (C63369m.class) {
                        ebVar = f171257e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171256c);
                            f171257e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
