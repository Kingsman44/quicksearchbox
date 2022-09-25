package com.google.p4283bv.p4380j.p4385b.p4386a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.j.b.a.j */
/* compiled from: PG */
public final class C57778j extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57778j f154369d;

    /* renamed from: g */
    private static volatile C63010eb f154370g;

    /* renamed from: a */
    public String f154371a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f154372b;

    /* renamed from: c */
    public C57780l f154373c;

    /* renamed from: e */
    private int f154374e;

    /* renamed from: f */
    private byte f154375f = 2;

    static {
        C57778j jVar = new C57778j();
        f154369d = jVar;
        C62942bv.registerDefaultInstance(C57778j.class, jVar);
    }

    private C57778j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f154375f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f154375f = b;
                return null;
            case 2:
                return newMessageInfo(f154369d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဌ\u0001\u0003ᐉ\u0002", new Object[]{"e", "a", "b", C57781m.f154381a, C45240c.f118157a});
            case 3:
                return new C57778j();
            case 4:
                return new C57777i();
            case 5:
                return f154369d;
            case 6:
                C63010eb ebVar = f154370g;
                if (ebVar == null) {
                    synchronized (C57778j.class) {
                        ebVar = f154370g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154369d);
                            f154370g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
