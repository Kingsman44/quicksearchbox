package com.google.android.apps.auto.p450a.p451a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.auto.a.a.bb */
/* compiled from: PG */
public final class C8884bb extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C8884bb f30842c;

    /* renamed from: e */
    private static volatile C63010eb f30843e;

    /* renamed from: a */
    public int f30844a;

    /* renamed from: b */
    public int f30845b;

    /* renamed from: d */
    private byte f30846d = 2;

    static {
        C8884bb bbVar = new C8884bb();
        f30842c = bbVar;
        C62942bv.registerDefaultInstance(C8884bb.class, bbVar);
    }

    private C8884bb() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f30846d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f30846d = b;
                return null;
            case 2:
                return newMessageInfo(f30842c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C8884bb();
            case 4:
                return new C8883ba();
            case 5:
                return f30842c;
            case 6:
                C63010eb ebVar = f30843e;
                if (ebVar == null) {
                    synchronized (C8884bb.class) {
                        ebVar = f30843e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30842c);
                            f30843e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
