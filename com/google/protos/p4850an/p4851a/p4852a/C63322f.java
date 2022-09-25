package com.google.protos.p4850an.p4851a.p4852a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.a.a.f */
/* compiled from: PG */
public final class C63322f extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C63322f f171143a;

    /* renamed from: e */
    private static volatile C63010eb f171144e;

    /* renamed from: b */
    private int f171145b;

    /* renamed from: c */
    private C63321e f171146c;

    /* renamed from: d */
    private byte f171147d = 2;

    static {
        C63322f fVar = new C63322f();
        f171143a = fVar;
        C62942bv.registerDefaultInstance(C63322f.class, fVar);
    }

    private C63322f() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171147d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171147d = b;
                return null;
            case 2:
                return newMessageInfo(f171143a, "\u0001\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0001\u0006ᐉ\u0004", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C63322f();
            case 4:
                return new C63319c();
            case 5:
                return f171143a;
            case 6:
                C63010eb ebVar = f171144e;
                if (ebVar == null) {
                    synchronized (C63322f.class) {
                        ebVar = f171144e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171143a);
                            f171144e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
