package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.ke */
/* compiled from: PG */
public final class C67077ke extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C67077ke f182335c;

    /* renamed from: e */
    private static volatile C63010eb f182336e;

    /* renamed from: a */
    public int f182337a = 0;

    /* renamed from: b */
    public Object f182338b;

    /* renamed from: d */
    private byte f182339d = 2;

    static {
        C67077ke keVar = new C67077ke();
        f182335c = keVar;
        C62942bv.registerDefaultInstance(C67077ke.class, keVar);
    }

    private C67077ke() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f182339d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f182339d = b;
                return null;
            case 2:
                return newMessageInfo(f182335c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"b", "a", C67075kc.class});
            case 3:
                return new C67077ke();
            case 4:
                return new C67076kd();
            case 5:
                return f182335c;
            case 6:
                C63010eb ebVar = f182336e;
                if (ebVar == null) {
                    synchronized (C67077ke.class) {
                        ebVar = f182336e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182335c);
                            f182336e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
