package com.google.p4283bv.p4343c.p4344a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.protos.p4816ai.p4818b.C63204j;

/* renamed from: com.google.bv.c.a.b */
/* compiled from: PG */
public final class C56949b extends C62937bq implements C62938br {

    /* renamed from: d */
    public static final C56949b f151993d;

    /* renamed from: f */
    private static volatile C63010eb f151994f;

    /* renamed from: a */
    public int f151995a;

    /* renamed from: b */
    public boolean f151996b;

    /* renamed from: c */
    public C63204j f151997c;

    /* renamed from: e */
    private byte f151998e = 2;

    static {
        C56949b bVar = new C56949b();
        f151993d = bVar;
        C62942bv.registerDefaultInstance(C56949b.class, bVar);
    }

    private C56949b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f151998e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f151998e = b;
                return null;
            case 2:
                return newMessageInfo(f151993d, "\u0001\u0002\u0000\u0001\u0002\n\u0002\u0000\u0000\u0001\u0002ဇ\u0001\nᐉ\b", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C56949b();
            case 4:
                return new C56948a();
            case 5:
                return f151993d;
            case 6:
                C63010eb ebVar = f151994f;
                if (ebVar == null) {
                    synchronized (C56949b.class) {
                        ebVar = f151994f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151993d);
                            f151994f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
