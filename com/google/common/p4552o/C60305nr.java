package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.nr */
/* compiled from: PG */
public final class C60305nr extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C60305nr f163179e;

    /* renamed from: f */
    private static volatile C63010eb f163180f;

    /* renamed from: a */
    public int f163181a;

    /* renamed from: b */
    public int f163182b;

    /* renamed from: c */
    public String f163183c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f163184d = BuildConfig.FLAVOR;

    static {
        C60305nr nrVar = new C60305nr();
        f163179e = nrVar;
        C62942bv.registerDefaultInstance(C60305nr.class, nrVar);
    }

    private C60305nr() {
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
                return newMessageInfo(f163179e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C60304nq.f163178a, C45240c.f118157a, "d"});
            case 3:
                return new C60305nr();
            case 4:
                return new C60303np();
            case 5:
                return f163179e;
            case 6:
                C63010eb ebVar = f163180f;
                if (ebVar == null) {
                    synchronized (C60305nr.class) {
                        ebVar = f163180f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163179e);
                            f163180f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
