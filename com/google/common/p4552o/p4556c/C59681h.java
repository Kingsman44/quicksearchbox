package com.google.common.p4552o.p4556c;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.c.h */
/* compiled from: PG */
public final class C59681h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C59681h f160009a;

    /* renamed from: h */
    private static volatile C63010eb f160010h;

    /* renamed from: b */
    private int f160011b;

    /* renamed from: c */
    private int f160012c;

    /* renamed from: d */
    private int f160013d;

    /* renamed from: e */
    private int f160014e;

    /* renamed from: f */
    private int f160015f;

    /* renamed from: g */
    private byte f160016g = 2;

    static {
        C59681h hVar = new C59681h();
        f160009a = hVar;
        C62942bv.registerDefaultInstance(C59681h.class, hVar);
    }

    private C59681h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f160016g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f160016g = b;
                return null;
            case 2:
                return newMessageInfo(f160009a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002\u0004ᔄ\u0003", new Object[]{"b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C59681h();
            case 4:
                return new C59680g();
            case 5:
                return f160009a;
            case 6:
                C63010eb ebVar = f160010h;
                if (ebVar == null) {
                    synchronized (C59681h.class) {
                        ebVar = f160010h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f160009a);
                            f160010h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
