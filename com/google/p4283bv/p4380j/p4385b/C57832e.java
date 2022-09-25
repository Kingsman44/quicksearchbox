package com.google.p4283bv.p4380j.p4385b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.j.b.e */
/* compiled from: PG */
public final class C57832e extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C57832e f154517e;

    /* renamed from: f */
    private static volatile C63010eb f154518f;

    /* renamed from: a */
    public int f154519a;

    /* renamed from: b */
    public int f154520b = 0;

    /* renamed from: c */
    public Object f154521c;

    /* renamed from: d */
    public String f154522d = BuildConfig.FLAVOR;

    static {
        C57832e eVar = new C57832e();
        f154517e = eVar;
        C62942bv.registerDefaultInstance(C57832e.class, eVar);
    }

    private C57832e() {
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
                return newMessageInfo(f154517e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ျ\u0000\u0003ွ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d"});
            case 3:
                return new C57832e();
            case 4:
                return new C57831d();
            case 5:
                return f154517e;
            case 6:
                C63010eb ebVar = f154518f;
                if (ebVar == null) {
                    synchronized (C57832e.class) {
                        ebVar = f154518f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154517e);
                            f154518f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
