package com.google.android.apps.search.googleapp.p10310h;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7682ga;
import com.google.p4283bv.p4354e.p4356b.C57057b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.h.l */
/* compiled from: PG */
public final class C136131l extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C136131l f370752d;

    /* renamed from: f */
    private static volatile C63010eb f370753f;

    /* renamed from: a */
    public int f370754a;

    /* renamed from: b */
    public C7682ga f370755b;

    /* renamed from: c */
    public C57057b f370756c;

    /* renamed from: e */
    private byte f370757e = 2;

    static {
        C136131l lVar = new C136131l();
        f370752d = lVar;
        C62942bv.registerDefaultInstance(C136131l.class, lVar);
    }

    private C136131l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f370757e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f370757e = b;
                return null;
            case 2:
                return newMessageInfo(f370752d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C136131l();
            case 4:
                return new C136130k();
            case 5:
                return f370752d;
            case 6:
                C63010eb ebVar = f370753f;
                if (ebVar == null) {
                    synchronized (C136131l.class) {
                        ebVar = f370753f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f370752d);
                            f370753f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
