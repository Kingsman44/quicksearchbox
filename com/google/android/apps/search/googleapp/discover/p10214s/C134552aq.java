package com.google.android.apps.search.googleapp.discover.p10214s;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57696b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.googleapp.discover.s.aq */
/* compiled from: PG */
public final class C134552aq extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C134552aq f366420e;

    /* renamed from: g */
    private static volatile C63010eb f366421g;

    /* renamed from: a */
    public int f366422a;

    /* renamed from: b */
    public boolean f366423b;

    /* renamed from: c */
    public C63042fg f366424c;

    /* renamed from: d */
    public C57696b f366425d;

    /* renamed from: f */
    private byte f366426f = 2;

    static {
        C134552aq aqVar = new C134552aq();
        f366420e = aqVar;
        C62942bv.registerDefaultInstance(C134552aq.class, aqVar);
    }

    private C134552aq() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f366426f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f366426f = b;
                return null;
            case 2:
                return newMessageInfo(f366420e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဇ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C134552aq();
            case 4:
                return new C134551ap();
            case 5:
                return f366420e;
            case 6:
                C63010eb ebVar = f366421g;
                if (ebVar == null) {
                    synchronized (C134552aq.class) {
                        ebVar = f366421g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f366420e);
                            f366421g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
