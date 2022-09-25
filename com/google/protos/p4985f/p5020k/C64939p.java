package com.google.protos.p4985f.p5020k;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.k.p */
/* compiled from: PG */
public final class C64939p extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64939p f175870a;

    /* renamed from: i */
    private static volatile C63010eb f175871i;

    /* renamed from: b */
    private int f175872b;

    /* renamed from: c */
    private C64919au f175873c;

    /* renamed from: d */
    private C64919au f175874d;

    /* renamed from: e */
    private C64910al f175875e;

    /* renamed from: f */
    private C64919au f175876f;

    /* renamed from: g */
    private C64919au f175877g;

    /* renamed from: h */
    private byte f175878h = 2;

    static {
        C64939p pVar = new C64939p();
        f175870a = pVar;
        C62942bv.registerDefaultInstance(C64939p.class, pVar);
    }

    private C64939p() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f175878h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f175878h = b;
                return null;
            case 2:
                return newMessageInfo(f175870a, "\u0001\u0005\u0000\u0001\u0011\u0015\u0005\u0000\u0000\u0004\u0011ᐉ\r\u0012ဉ\u000f\u0013ᐉ\u0010\u0014ᐉ\u0011\u0015ᐉ\u000e", new Object[]{"b", C45240c.f118157a, "e", C10662f.f35572a, C30325g.f82003a, "d"});
            case 3:
                return new C64939p();
            case 4:
                return new C64938o();
            case 5:
                return f175870a;
            case 6:
                C63010eb ebVar = f175871i;
                if (ebVar == null) {
                    synchronized (C64939p.class) {
                        ebVar = f175871i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175870a);
                            f175871i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
