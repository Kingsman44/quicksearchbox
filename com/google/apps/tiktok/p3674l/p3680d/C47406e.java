package com.google.apps.tiktok.p3674l.p3680d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.tiktok.l.d.e */
/* compiled from: PG */
public final class C47406e extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C47406e f123136c;

    /* renamed from: e */
    private static volatile C63010eb f123137e;

    /* renamed from: a */
    public int f123138a = 0;

    /* renamed from: b */
    public Object f123139b;

    /* renamed from: d */
    private byte f123140d = 2;

    static {
        C47406e eVar = new C47406e();
        f123136c = eVar;
        C62942bv.registerDefaultInstance(C47406e.class, eVar);
    }

    private C47406e() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f123140d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f123140d = b;
                return null;
            case 2:
                return newMessageInfo(f123136c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C47404c.class});
            case 3:
                return new C47406e();
            case 4:
                return new C47405d();
            case 5:
                return f123136c;
            case 6:
                C63010eb ebVar = f123137e;
                if (ebVar == null) {
                    synchronized (C47406e.class) {
                        ebVar = f123137e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f123136c);
                            f123137e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
