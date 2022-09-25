package com.google.android.libraries.performance.primes.transmitter;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71308ej;

/* renamed from: com.google.android.libraries.performance.primes.transmitter.i */
/* compiled from: PG */
public final class C31617i extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C31617i f85086c;

    /* renamed from: e */
    private static volatile C63010eb f85087e;

    /* renamed from: a */
    public int f85088a;

    /* renamed from: b */
    public C71308ej f85089b;

    /* renamed from: d */
    private byte f85090d = 2;

    static {
        C31617i iVar = new C31617i();
        f85086c = iVar;
        C62942bv.registerDefaultInstance(C31617i.class, iVar);
    }

    private C31617i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f85090d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f85090d = b;
                return null;
            case 2:
                return newMessageInfo(f85086c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C31617i();
            case 4:
                return new C31616h();
            case 5:
                return f85086c;
            case 6:
                C63010eb ebVar = f85087e;
                if (ebVar == null) {
                    synchronized (C31617i.class) {
                        ebVar = f85087e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f85086c);
                            f85087e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
