package com.google.android.apps.search.googleapp.promomanager.p10372b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63926bm;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.dj */
/* compiled from: PG */
public final class C137009dj extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C137009dj f372879f;

    /* renamed from: g */
    private static volatile C63010eb f372880g;

    /* renamed from: a */
    public int f372881a;

    /* renamed from: b */
    public int f372882b;

    /* renamed from: c */
    public C63042fg f372883c;

    /* renamed from: d */
    public boolean f372884d;

    /* renamed from: e */
    public boolean f372885e;

    static {
        C137009dj djVar = new C137009dj();
        f372879f = djVar;
        C62942bv.registerDefaultInstance(C137009dj.class, djVar);
    }

    private C137009dj() {
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
                return newMessageInfo(f372879f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C63926bm.m96319b(), C45240c.f118157a, "d", "e"});
            case 3:
                return new C137009dj();
            case 4:
                return new C137008di();
            case 5:
                return f372879f;
            case 6:
                C63010eb ebVar = f372880g;
                if (ebVar == null) {
                    synchronized (C137009dj.class) {
                        ebVar = f372880g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f372879f);
                            f372880g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
