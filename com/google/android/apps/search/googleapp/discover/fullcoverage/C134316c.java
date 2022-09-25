package com.google.android.apps.search.googleapp.discover.fullcoverage;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57062ad;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.fullcoverage.c */
/* compiled from: PG */
public final class C134316c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C134316c f365851d;

    /* renamed from: f */
    private static volatile C63010eb f365852f;

    /* renamed from: a */
    public int f365853a;

    /* renamed from: b */
    public C57062ad f365854b;

    /* renamed from: c */
    public boolean f365855c;

    /* renamed from: e */
    private byte f365856e = 2;

    static {
        C134316c cVar = new C134316c();
        f365851d = cVar;
        C62942bv.registerDefaultInstance(C134316c.class, cVar);
    }

    private C134316c() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f365856e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f365856e = b;
                return null;
            case 2:
                return newMessageInfo(f365851d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C134316c();
            case 4:
                return new C134315b();
            case 5:
                return f365851d;
            case 6:
                C63010eb ebVar = f365852f;
                if (ebVar == null) {
                    synchronized (C134316c.class) {
                        ebVar = f365852f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f365851d);
                            f365852f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
