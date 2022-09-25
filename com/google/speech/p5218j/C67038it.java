package com.google.speech.p5218j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.it */
/* compiled from: PG */
public final class C67038it extends C62937bq implements C62938br {

    /* renamed from: d */
    public static final C67038it f182220d;

    /* renamed from: f */
    private static volatile C63010eb f182221f;

    /* renamed from: a */
    public int f182222a;

    /* renamed from: b */
    public int f182223b;

    /* renamed from: c */
    public C67095kw f182224c;

    /* renamed from: e */
    private byte f182225e = 2;

    static {
        C67038it itVar = new C67038it();
        f182220d = itVar;
        C62942bv.registerDefaultInstance(C67038it.class, itVar);
    }

    private C67038it() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f182225e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f182225e = b;
                return null;
            case 2:
                return newMessageInfo(f182220d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C67037is.m97414b(), C45240c.f118157a});
            case 3:
                return new C67038it();
            case 4:
                return new C67035iq();
            case 5:
                return f182220d;
            case 6:
                C63010eb ebVar = f182221f;
                if (ebVar == null) {
                    synchronized (C67038it.class) {
                        ebVar = f182221f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182220d);
                            f182221f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
