package com.google.p4653i.p4654a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.i.a.ag */
/* compiled from: PG */
public final class C61666ag extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C61666ag f166594e;

    /* renamed from: g */
    private static volatile C63010eb f166595g;

    /* renamed from: a */
    public int f166596a;

    /* renamed from: b */
    public C61709s f166597b;

    /* renamed from: c */
    public int f166598c = 1;

    /* renamed from: d */
    public boolean f166599d;

    /* renamed from: f */
    private byte f166600f = 2;

    static {
        C61666ag agVar = new C61666ag();
        f166594e = agVar;
        C62942bv.registerDefaultInstance(C61666ag.class, agVar);
    }

    private C61666ag() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f166600f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f166600f = b;
                return null;
            case 2:
                return newMessageInfo(f166594e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဌ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, C61706p.f166700a, "d"});
            case 3:
                return new C61666ag();
            case 4:
                return new C61665af();
            case 5:
                return f166594e;
            case 6:
                C63010eb ebVar = f166595g;
                if (ebVar == null) {
                    synchronized (C61666ag.class) {
                        ebVar = f166595g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166594e);
                            f166595g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
