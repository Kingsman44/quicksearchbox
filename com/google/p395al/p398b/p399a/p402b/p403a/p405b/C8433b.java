package com.google.p395al.p398b.p399a.p402b.p403a.p405b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.b.a.b.a.b.b */
/* compiled from: PG */
public final class C8433b extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C8433b f29321a;

    /* renamed from: c */
    private static volatile C63010eb f29322c;

    /* renamed from: b */
    private byte f29323b = 2;

    static {
        C8433b bVar = new C8433b();
        f29321a = bVar;
        C62942bv.registerDefaultInstance(C8433b.class, bVar);
    }

    private C8433b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f29323b);
            case 1:
                this.f29323b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f29321a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C8433b();
            case 4:
                return new C8432a();
            case 5:
                return f29321a;
            case 6:
                C63010eb ebVar = f29322c;
                if (ebVar == null) {
                    synchronized (C8433b.class) {
                        ebVar = f29322c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29321a);
                            f29322c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
