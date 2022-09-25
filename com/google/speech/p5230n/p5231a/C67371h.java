package com.google.speech.p5230n.p5231a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.n.a.h */
/* compiled from: PG */
public final class C67371h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67371h f183124c;

    /* renamed from: e */
    private static volatile C63010eb f183125e;

    /* renamed from: a */
    public int f183126a = 0;

    /* renamed from: b */
    public Object f183127b;

    /* renamed from: d */
    private byte f183128d = 2;

    static {
        C67371h hVar = new C67371h();
        f183124c = hVar;
        C62942bv.registerDefaultInstance(C67371h.class, hVar);
    }

    private C67371h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f183128d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f183128d = b;
                return null;
            case 2:
                return newMessageInfo(f183124c, "\u0001\u0003\u0001\u0000\u0002\u0004\u0003\u0000\u0000\u0003\u0002ᐼ\u0000\u0003ᐼ\u0000\u0004ᐼ\u0000", new Object[]{"b", "a", C67376m.class, C67381r.class, C67383t.class});
            case 3:
                return new C67371h();
            case 4:
                return new C67370g();
            case 5:
                return f183124c;
            case 6:
                C63010eb ebVar = f183125e;
                if (ebVar == null) {
                    synchronized (C67371h.class) {
                        ebVar = f183125e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183124c);
                            f183125e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
