package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.agf */
/* compiled from: PG */
public final class agf extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final agf f158615f;

    /* renamed from: g */
    private static volatile C63010eb f158616g;

    /* renamed from: a */
    public int f158617a;

    /* renamed from: b */
    public int f158618b;

    /* renamed from: c */
    public String f158619c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public agc f158620d;

    /* renamed from: e */
    public boolean f158621e;

    static {
        agf agf = new agf();
        f158615f = agf;
        C62942bv.registerDefaultInstance(agf.class, agf);
    }

    private agf() {
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
                return newMessageInfo(f158615f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", agd.f158614a, C45240c.f118157a, "d", "e"});
            case 3:
                return new agf();
            case 4:
                return new C59579aga();
            case 5:
                return f158615f;
            case 6:
                C63010eb ebVar = f158616g;
                if (ebVar == null) {
                    synchronized (agf.class) {
                        ebVar = f158616g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158615f);
                            f158616g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
