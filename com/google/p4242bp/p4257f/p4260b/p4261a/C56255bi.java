package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.protos.p4963bf.p4964a.p4965a.C64602g;

/* renamed from: com.google.bp.f.b.a.bi */
/* compiled from: PG */
public final class C56255bi extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C56255bi f149939a;

    /* renamed from: e */
    private static volatile C63010eb f149940e;

    /* renamed from: b */
    private int f149941b;

    /* renamed from: c */
    private C64602g f149942c;

    /* renamed from: d */
    private byte f149943d = 2;

    static {
        C56255bi biVar = new C56255bi();
        f149939a = biVar;
        C62942bv.registerDefaultInstance(C56255bi.class, biVar);
    }

    private C56255bi() {
        C63088z zVar = C63088z.f170246b;
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f149943d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f149943d = b;
                return null;
            case 2:
                return newMessageInfo(f149939a, "\u0001\u0001\u0000\u0001\u0010\u0010\u0001\u0000\u0000\u0001\u0010ᐉ\u0003", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C56255bi();
            case 4:
                return new C56254bh();
            case 5:
                return f149939a;
            case 6:
                C63010eb ebVar = f149940e;
                if (ebVar == null) {
                    synchronized (C56255bi.class) {
                        ebVar = f149940e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149939a);
                            f149940e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
