package com.google.assistant.p3838ao.p3839a.p3845e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ao.a.e.ad */
/* compiled from: PG */
public final class C49520ad extends C62937bq implements C62938br {

    /* renamed from: b */
    public static final C49520ad f127756b;

    /* renamed from: e */
    private static volatile C63010eb f127757e;

    /* renamed from: a */
    public int f127758a;

    /* renamed from: c */
    private int f127759c;

    /* renamed from: d */
    private byte f127760d = 2;

    static {
        C49520ad adVar = new C49520ad();
        f127756b = adVar;
        C62942bv.registerDefaultInstance(C49520ad.class, adVar);
    }

    private C49520ad() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f127760d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f127760d = b;
                return null;
            case 2:
                return newMessageInfo(f127756b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C49521ae.f127761a});
            case 3:
                return new C49520ad();
            case 4:
                return new C49519ac();
            case 5:
                return f127756b;
            case 6:
                C63010eb ebVar = f127757e;
                if (ebVar == null) {
                    synchronized (C49520ad.class) {
                        ebVar = f127757e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127756b);
                            f127757e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
