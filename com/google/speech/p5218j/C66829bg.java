package com.google.speech.p5218j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.bg */
/* compiled from: PG */
public final class C66829bg extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C66829bg f181726e;

    /* renamed from: g */
    private static volatile C63010eb f181727g;

    /* renamed from: a */
    public int f181728a;

    /* renamed from: b */
    public int f181729b = 0;

    /* renamed from: c */
    public Object f181730c;

    /* renamed from: d */
    public C66782aw f181731d;

    /* renamed from: f */
    private byte f181732f = 2;

    static {
        C66829bg bgVar = new C66829bg();
        f181726e = bgVar;
        C62942bv.registerDefaultInstance(C66829bg.class, bgVar);
    }

    private C66829bg() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f181732f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f181732f = b;
                return null;
            case 2:
                return newMessageInfo(f181726e, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐼ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C66825bc.class, C66827be.class, C66784ay.class, C66823ba.class});
            case 3:
                return new C66829bg();
            case 4:
                return new C66828bf();
            case 5:
                return f181726e;
            case 6:
                C63010eb ebVar = f181727g;
                if (ebVar == null) {
                    synchronized (C66829bg.class) {
                        ebVar = f181727g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181726e);
                            f181727g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
