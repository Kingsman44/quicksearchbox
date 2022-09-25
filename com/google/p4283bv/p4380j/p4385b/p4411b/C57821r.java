package com.google.p4283bv.p4380j.p4385b.p4411b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.j.b.b.r */
/* compiled from: PG */
public final class C57821r extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C57821r f154482e;

    /* renamed from: f */
    private static volatile C63010eb f154483f;

    /* renamed from: a */
    public int f154484a;

    /* renamed from: b */
    public int f154485b;

    /* renamed from: c */
    public boolean f154486c;

    /* renamed from: d */
    public String f154487d = BuildConfig.FLAVOR;

    static {
        C57821r rVar = new C57821r();
        f154482e = rVar;
        C62942bv.registerDefaultInstance(C57821r.class, rVar);
    }

    private C57821r() {
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
                return newMessageInfo(f154482e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C57818o.f154481a, C45240c.f118157a, "d"});
            case 3:
                return new C57821r();
            case 4:
                return new C57820q();
            case 5:
                return f154482e;
            case 6:
                C63010eb ebVar = f154483f;
                if (ebVar == null) {
                    synchronized (C57821r.class) {
                        ebVar = f154483f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154482e);
                            f154483f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
