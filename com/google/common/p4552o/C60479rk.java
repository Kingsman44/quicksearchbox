package com.google.common.p4552o;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7891nu;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.rk */
/* compiled from: PG */
public final class C60479rk extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C60479rk f163679g;

    /* renamed from: h */
    private static volatile C63010eb f163680h;

    /* renamed from: a */
    public int f163681a;

    /* renamed from: b */
    public int f163682b;

    /* renamed from: c */
    public int f163683c;

    /* renamed from: d */
    public int f163684d;

    /* renamed from: e */
    public int f163685e;

    /* renamed from: f */
    public int f163686f;

    static {
        C60479rk rkVar = new C60479rk();
        f163679g = rkVar;
        C62942bv.registerDefaultInstance(C60479rk.class, rkVar);
    }

    private C60479rk() {
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
                return newMessageInfo(f163679g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဋ\u0002\u0004ဌ\u0003\u0005င\u0004", new Object[]{"a", "b", C60477ri.f163677a, C45240c.f118157a, C60478rj.f163678a, "d", "e", C7891nu.m22888b(), C10662f.f35572a});
            case 3:
                return new C60479rk();
            case 4:
                return new C60476rh();
            case 5:
                return f163679g;
            case 6:
                C63010eb ebVar = f163680h;
                if (ebVar == null) {
                    synchronized (C60479rk.class) {
                        ebVar = f163680h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163679g);
                            f163680h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
