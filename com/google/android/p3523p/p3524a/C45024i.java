package com.google.android.p3523p.p3524a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5218j.C67087ko;

/* renamed from: com.google.android.p.a.i */
/* compiled from: PG */
public final class C45024i extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C45024i f117638d;

    /* renamed from: f */
    private static volatile C63010eb f117639f;

    /* renamed from: a */
    public int f117640a;

    /* renamed from: b */
    public C67087ko f117641b;

    /* renamed from: c */
    public C45020e f117642c;

    /* renamed from: e */
    private byte f117643e = 2;

    static {
        C45024i iVar = new C45024i();
        f117638d = iVar;
        C62942bv.registerDefaultInstance(C45024i.class, iVar);
    }

    private C45024i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f117643e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f117643e = b;
                return null;
            case 2:
                return newMessageInfo(f117638d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C45024i();
            case 4:
                return new C45023h();
            case 5:
                return f117638d;
            case 6:
                C63010eb ebVar = f117639f;
                if (ebVar == null) {
                    synchronized (C45024i.class) {
                        ebVar = f117639f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f117638d);
                            f117639f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
