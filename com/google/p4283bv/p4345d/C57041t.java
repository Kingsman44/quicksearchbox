package com.google.p4283bv.p4345d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7973qv;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.d.t */
/* compiled from: PG */
public final class C57041t extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C57041t f152278e;

    /* renamed from: g */
    private static volatile C63010eb f152279g;

    /* renamed from: a */
    public int f152280a;

    /* renamed from: b */
    public C7669fo f152281b;

    /* renamed from: c */
    public C7973qv f152282c;

    /* renamed from: d */
    public C57039r f152283d;

    /* renamed from: f */
    private byte f152284f = 2;

    static {
        C57041t tVar = new C57041t();
        f152278e = tVar;
        C62942bv.registerDefaultInstance(C57041t.class, tVar);
    }

    private C57041t() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152284f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152284f = b;
                return null;
            case 2:
                return newMessageInfo(f152278e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001\u0005ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C57041t();
            case 4:
                return new C57040s();
            case 5:
                return f152278e;
            case 6:
                C63010eb ebVar = f152279g;
                if (ebVar == null) {
                    synchronized (C57041t.class) {
                        ebVar = f152279g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152278e);
                            f152279g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
