package com.google.frameworks.client.data.android.server.tiktok;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.frameworks.client.data.android.server.tiktok.r */
/* compiled from: PG */
public final class C61603r extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C61603r f166472a;

    /* renamed from: c */
    private static volatile C63010eb f166473c;

    /* renamed from: b */
    private byte f166474b = 2;

    static {
        C61603r rVar = new C61603r();
        f166472a = rVar;
        C62942bv.registerDefaultInstance(C61603r.class, rVar);
    }

    private C61603r() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f166474b);
            case 1:
                this.f166474b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f166472a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C61603r();
            case 4:
                return new C61602q();
            case 5:
                return f166472a;
            case 6:
                C63010eb ebVar = f166473c;
                if (ebVar == null) {
                    synchronized (C61603r.class) {
                        ebVar = f166473c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166472a);
                            f166473c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
