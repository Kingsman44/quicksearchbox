package com.google.assistant.p3824am;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p381aj.p382a.p383a.p384a.C8240t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.am.b */
/* compiled from: PG */
public final class C49243b extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C49243b f127304a;

    /* renamed from: e */
    private static volatile C63010eb f127305e;

    /* renamed from: b */
    private int f127306b;

    /* renamed from: c */
    private C8240t f127307c;

    /* renamed from: d */
    private byte f127308d = 2;

    static {
        C49243b bVar = new C49243b();
        f127304a = bVar;
        C62942bv.registerDefaultInstance(C49243b.class, bVar);
    }

    private C49243b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f127308d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f127308d = b;
                return null;
            case 2:
                return newMessageInfo(f127304a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005ᐉ\u0004", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C49243b();
            case 4:
                return new C49242a();
            case 5:
                return f127304a;
            case 6:
                C63010eb ebVar = f127305e;
                if (ebVar == null) {
                    synchronized (C49243b.class) {
                        ebVar = f127305e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127304a);
                            f127305e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
