package com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.a.a.h */
/* compiled from: PG */
public final class C122099h extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C122099h f338744c;

    /* renamed from: e */
    private static volatile C63010eb f338745e;

    /* renamed from: a */
    public int f338746a;

    /* renamed from: b */
    public C122106o f338747b;

    /* renamed from: d */
    private byte f338748d = 2;

    static {
        C122099h hVar = new C122099h();
        f338744c = hVar;
        C62942bv.registerDefaultInstance(C122099h.class, hVar);
    }

    private C122099h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f338748d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f338748d = b;
                return null;
            case 2:
                return newMessageInfo(f338744c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C122099h();
            case 4:
                return new C122098g();
            case 5:
                return f338744c;
            case 6:
                C63010eb ebVar = f338745e;
                if (ebVar == null) {
                    synchronized (C122099h.class) {
                        ebVar = f338745e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f338744c);
                            f338745e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
