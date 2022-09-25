package com.google.android.libraries.web.p3353c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.web.c.b */
/* compiled from: PG */
public final class C43323b extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C43323b f113174a;

    /* renamed from: c */
    private static volatile C63010eb f113175c;

    /* renamed from: b */
    private byte f113176b = 2;

    static {
        C43323b bVar = new C43323b();
        f113174a = bVar;
        C62942bv.registerDefaultInstance(C43323b.class, bVar);
    }

    private C43323b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f113176b);
            case 1:
                this.f113176b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f113174a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C43323b();
            case 4:
                return new C43316a();
            case 5:
                return f113174a;
            case 6:
                C63010eb ebVar = f113175c;
                if (ebVar == null) {
                    synchronized (C43323b.class) {
                        ebVar = f113175c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f113174a);
                            f113175c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
