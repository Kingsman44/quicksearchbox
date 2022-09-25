package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.gg */
/* compiled from: PG */
public final class C66971gg extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C66971gg f182040a;

    /* renamed from: c */
    private static volatile C63010eb f182041c;

    /* renamed from: b */
    private byte f182042b = 2;

    static {
        C66971gg ggVar = new C66971gg();
        f182040a = ggVar;
        C62942bv.registerDefaultInstance(C66971gg.class, ggVar);
    }

    private C66971gg() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f182042b);
            case 1:
                this.f182042b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f182040a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C66971gg();
            case 4:
                return new C66970gf();
            case 5:
                return f182040a;
            case 6:
                C63010eb ebVar = f182041c;
                if (ebVar == null) {
                    synchronized (C66971gg.class) {
                        ebVar = f182041c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182040a);
                            f182041c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
