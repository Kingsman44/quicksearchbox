package com.google.nlp.p4735b.p4736a.p4737a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.nlp.p4735b.p4736a.C62818b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.b.a.a.h */
/* compiled from: PG */
public final class C62815h extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C62815h f169624f;

    /* renamed from: h */
    private static volatile C63010eb f169625h;

    /* renamed from: a */
    public int f169626a;

    /* renamed from: b */
    public C62818b f169627b;

    /* renamed from: c */
    public C62995dn f169628c = C62995dn.f170057a;

    /* renamed from: d */
    public boolean f169629d;

    /* renamed from: e */
    public int f169630e;

    /* renamed from: g */
    private byte f169631g = 2;

    static {
        C62815h hVar = new C62815h();
        f169624f = hVar;
        C62942bv.registerDefaultInstance(C62815h.class, hVar);
    }

    private C62815h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f169631g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f169631g = b;
                return null;
            case 2:
                return newMessageInfo(f169624f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0001\u0000\u0001\u0001ᐉ\u0001\u00022\u0003ဇ\u0003\u0006ဌ\u0004", new Object[]{"a", "b", C45240c.f118157a, C62814g.f169623a, "d", "e", C62812e.f169622a});
            case 3:
                return new C62815h();
            case 4:
                return new C62813f();
            case 5:
                return f169624f;
            case 6:
                C63010eb ebVar = f169625h;
                if (ebVar == null) {
                    synchronized (C62815h.class) {
                        ebVar = f169625h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169624f);
                            f169625h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
