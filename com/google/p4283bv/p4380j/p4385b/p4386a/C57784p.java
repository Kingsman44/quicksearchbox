package com.google.p4283bv.p4380j.p4385b.p4386a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63070h;
import com.google.protos.youtube.elements.p5168d.p5169a.C66184b;

/* renamed from: com.google.bv.j.b.a.p */
/* compiled from: PG */
public final class C57784p extends C62937bq implements C62938br {

    /* renamed from: f */
    public static final C57784p f154382f;

    /* renamed from: h */
    private static volatile C63010eb f154383h;

    /* renamed from: a */
    public int f154384a;

    /* renamed from: b */
    public C63070h f154385b;

    /* renamed from: c */
    public C66184b f154386c;

    /* renamed from: d */
    public C57776h f154387d;

    /* renamed from: e */
    public C57792x f154388e;

    /* renamed from: g */
    private byte f154389g = 2;

    static {
        C57784p pVar = new C57784p();
        f154382f = pVar;
        C62942bv.registerDefaultInstance(C57784p.class, pVar);
    }

    private C57784p() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f154389g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f154389g = b;
                return null;
            case 2:
                return newMessageInfo(f154382f, "\u0001\u0004\u0000\u0001\u0002\b\u0004\u0000\u0000\u0001\u0002ဉ\u0000\u0003ဉ\u0001\u0004ᐉ\u0002\bဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C57784p();
            case 4:
                return new C57783o();
            case 5:
                return f154382f;
            case 6:
                C63010eb ebVar = f154383h;
                if (ebVar == null) {
                    synchronized (C57784p.class) {
                        ebVar = f154383h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154382f);
                            f154383h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
