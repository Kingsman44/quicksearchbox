package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.ha */
/* compiled from: PG */
public final class C7709ha extends C62937bq implements C62938br {

    /* renamed from: f */
    public static final C7709ha f26910f;

    /* renamed from: h */
    private static volatile C63010eb f26911h;

    /* renamed from: a */
    public int f26912a;

    /* renamed from: b */
    public C60220t f26913b;

    /* renamed from: c */
    public int f26914c;

    /* renamed from: d */
    public int f26915d;

    /* renamed from: e */
    public C60220t f26916e;

    /* renamed from: g */
    private byte f26917g = 2;

    static {
        C7709ha haVar = new C7709ha();
        f26910f = haVar;
        C62942bv.registerDefaultInstance(C7709ha.class, haVar);
    }

    private C7709ha() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f26917g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f26917g = b;
                return null;
            case 2:
                return newMessageInfo(f26910f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0003င\u0002\u0004င\u0003\u0005ᐉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C7709ha();
            case 4:
                return new C7707gz();
            case 5:
                return f26910f;
            case 6:
                C63010eb ebVar = f26911h;
                if (ebVar == null) {
                    synchronized (C7709ha.class) {
                        ebVar = f26911h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26910f);
                            f26911h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
