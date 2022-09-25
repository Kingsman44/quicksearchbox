package com.google.assistant.p3745ab.p3746a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.assistant.ab.a.j */
/* compiled from: PG */
public final class C48186j extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C48186j f124682e;

    /* renamed from: f */
    private static volatile C63010eb f124683f;

    /* renamed from: a */
    public int f124684a;

    /* renamed from: b */
    public String f124685b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f124686c;

    /* renamed from: d */
    public C63042fg f124687d;

    static {
        C48186j jVar = new C48186j();
        f124682e = jVar;
        C62942bv.registerDefaultInstance(C48186j.class, jVar);
    }

    private C48186j() {
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
                return newMessageInfo(f124682e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C48186j();
            case 4:
                return new C48185i();
            case 5:
                return f124682e;
            case 6:
                C63010eb ebVar = f124683f;
                if (ebVar == null) {
                    synchronized (C48186j.class) {
                        ebVar = f124683f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124682e);
                            f124683f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
