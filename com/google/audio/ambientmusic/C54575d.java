package com.google.audio.ambientmusic;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.audio.ambientmusic.d */
/* compiled from: PG */
public final class C54575d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54575d f143292d;

    /* renamed from: e */
    private static volatile C63010eb f143293e;

    /* renamed from: a */
    public int f143294a;

    /* renamed from: b */
    public int f143295b;

    /* renamed from: c */
    public boolean f143296c;

    static {
        C54575d dVar = new C54575d();
        f143292d = dVar;
        C62942bv.registerDefaultInstance(C54575d.class, dVar);
    }

    private C54575d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f143292d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C54575d();
            case 4:
                return new C54574c();
            case 5:
                return f143292d;
            case 6:
                C63010eb ebVar = f143293e;
                if (ebVar == null) {
                    synchronized (C54575d.class) {
                        ebVar = f143293e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143292d);
                            f143293e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
