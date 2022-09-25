package com.google.common.p4552o.p4554b.p4555a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.b.a.j */
/* compiled from: PG */
public final class C59630j extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59630j f159882d;

    /* renamed from: e */
    private static volatile C63010eb f159883e;

    /* renamed from: a */
    public int f159884a;

    /* renamed from: b */
    public String f159885b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f159886c;

    static {
        C59630j jVar = new C59630j();
        f159882d = jVar;
        C62942bv.registerDefaultInstance(C59630j.class, jVar);
    }

    private C59630j() {
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
                return newMessageInfo(f159882d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C59630j();
            case 4:
                return new C59629i();
            case 5:
                return f159882d;
            case 6:
                C63010eb ebVar = f159883e;
                if (ebVar == null) {
                    synchronized (C59630j.class) {
                        ebVar = f159883e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159882d);
                            f159883e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
