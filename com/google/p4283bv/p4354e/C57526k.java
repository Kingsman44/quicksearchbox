package com.google.p4283bv.p4354e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7669fo;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.k */
/* compiled from: PG */
public final class C57526k extends C62937bq implements C62938br {

    /* renamed from: b */
    public static final C57526k f153659b;

    /* renamed from: e */
    private static volatile C63010eb f153660e;

    /* renamed from: a */
    public C7669fo f153661a;

    /* renamed from: c */
    private int f153662c;

    /* renamed from: d */
    private byte f153663d = 2;

    static {
        C57526k kVar = new C57526k();
        f153659b = kVar;
        C62942bv.registerDefaultInstance(C57526k.class, kVar);
    }

    private C57526k() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153663d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153663d = b;
                return null;
            case 2:
                return newMessageInfo(f153659b, "\u0001\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0000\u0007ဉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C57526k();
            case 4:
                return new C57525j();
            case 5:
                return f153659b;
            case 6:
                C63010eb ebVar = f153660e;
                if (ebVar == null) {
                    synchronized (C57526k.class) {
                        ebVar = f153660e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153659b);
                            f153660e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
