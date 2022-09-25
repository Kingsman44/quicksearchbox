package com.google.android.apps.gsa.shared.p7124p.p7125a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.p.a.b */
/* compiled from: PG */
public final class C90445b extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C90445b f252668a;

    /* renamed from: c */
    private static volatile C63010eb f252669c;

    /* renamed from: b */
    private byte f252670b = 2;

    static {
        C90445b bVar = new C90445b();
        f252668a = bVar;
        C62942bv.registerDefaultInstance(C90445b.class, bVar);
    }

    private C90445b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f252670b);
            case 1:
                this.f252670b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f252668a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C90445b();
            case 4:
                return new C90444a();
            case 5:
                return f252668a;
            case 6:
                C63010eb ebVar = f252669c;
                if (ebVar == null) {
                    synchronized (C90445b.class) {
                        ebVar = f252669c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f252668a);
                            f252669c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
