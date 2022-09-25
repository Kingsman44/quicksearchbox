package com.google.p4283bv.p4380j.p4385b.p4411b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4287b.p4342b.C56947k;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.j.b.b.t */
/* compiled from: PG */
public final class C57823t extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57823t f154488d;

    /* renamed from: f */
    private static volatile C63010eb f154489f;

    /* renamed from: a */
    public int f154490a;

    /* renamed from: b */
    public C56947k f154491b;

    /* renamed from: c */
    public C57809f f154492c;

    /* renamed from: e */
    private byte f154493e = 2;

    static {
        C57823t tVar = new C57823t();
        f154488d = tVar;
        C62942bv.registerDefaultInstance(C57823t.class, tVar);
    }

    private C57823t() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f154493e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f154493e = b;
                return null;
            case 2:
                return newMessageInfo(f154488d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C57823t();
            case 4:
                return new C57822s();
            case 5:
                return f154488d;
            case 6:
                C63010eb ebVar = f154489f;
                if (ebVar == null) {
                    synchronized (C57823t.class) {
                        ebVar = f154489f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154488d);
                            f154489f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
