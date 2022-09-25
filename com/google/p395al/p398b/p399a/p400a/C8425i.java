package com.google.p395al.p398b.p399a.p400a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p395al.p417d.p418a.C8545ay;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.b.a.a.i */
/* compiled from: PG */
public final class C8425i extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C8425i f29303a;

    /* renamed from: e */
    private static volatile C63010eb f29304e;

    /* renamed from: b */
    private int f29305b;

    /* renamed from: c */
    private C8545ay f29306c;

    /* renamed from: d */
    private byte f29307d = 2;

    static {
        C8425i iVar = new C8425i();
        f29303a = iVar;
        C62942bv.registerDefaultInstance(C8425i.class, iVar);
    }

    private C8425i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f29307d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f29307d = b;
                return null;
            case 2:
                return newMessageInfo(f29303a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005ဉ\u0004", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C8425i();
            case 4:
                return new C8424h();
            case 5:
                return f29303a;
            case 6:
                C63010eb ebVar = f29304e;
                if (ebVar == null) {
                    synchronized (C8425i.class) {
                        ebVar = f29304e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29303a);
                            f29304e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
