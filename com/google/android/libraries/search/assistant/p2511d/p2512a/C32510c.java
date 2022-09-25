package com.google.android.libraries.search.assistant.p2511d.p2512a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62912at;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.d.a.c */
/* compiled from: PG */
public final class C32510c extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C32510c f87086e;

    /* renamed from: g */
    private static volatile C63010eb f87087g;

    /* renamed from: a */
    public int f87088a;

    /* renamed from: b */
    public int f87089b = 0;

    /* renamed from: c */
    public Object f87090c;

    /* renamed from: d */
    public long f87091d;

    /* renamed from: f */
    private byte f87092f = 2;

    static {
        C32510c cVar = new C32510c();
        f87086e = cVar;
        C62942bv.registerDefaultInstance(C32510c.class, cVar);
    }

    private C32510c() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f87092f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f87092f = b;
                return null;
            case 2:
                return newMessageInfo(f87086e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C62912at.class, C62912at.class});
            case 3:
                return new C32510c();
            case 4:
                return new C32509b();
            case 5:
                return f87086e;
            case 6:
                C63010eb ebVar = f87087g;
                if (ebVar == null) {
                    synchronized (C32510c.class) {
                        ebVar = f87087g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f87086e);
                            f87087g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
