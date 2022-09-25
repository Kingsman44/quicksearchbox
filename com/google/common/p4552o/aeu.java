package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5218j.p5220b.p5221a.C66809m;

/* renamed from: com.google.common.o.aeu */
/* compiled from: PG */
public final class aeu extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final aeu f158487d;

    /* renamed from: e */
    private static volatile C63010eb f158488e;

    /* renamed from: a */
    public int f158489a;

    /* renamed from: b */
    public int f158490b;

    /* renamed from: c */
    public double f158491c;

    static {
        aeu aeu = new aeu();
        f158487d = aeu;
        C62942bv.registerDefaultInstance(aeu.class, aeu);
    }

    private aeu() {
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
                return newMessageInfo(f158487d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002က\u0002\u0003ဌ\u0001", new Object[]{"a", C45240c.f118157a, "b", C66809m.f181678a});
            case 3:
                return new aeu();
            case 4:
                return new aet();
            case 5:
                return f158487d;
            case 6:
                C63010eb ebVar = f158488e;
                if (ebVar == null) {
                    synchronized (aeu.class) {
                        ebVar = f158488e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158487d);
                            f158488e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
