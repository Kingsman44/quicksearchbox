package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5218j.C67152mz;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.hd */
/* compiled from: PG */
public final class C82969hd extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C82969hd f226361e;

    /* renamed from: f */
    private static volatile C63010eb f226362f;

    /* renamed from: a */
    public int f226363a;

    /* renamed from: b */
    public int f226364b;

    /* renamed from: c */
    public int f226365c;

    /* renamed from: d */
    public String f226366d = BuildConfig.FLAVOR;

    static {
        C82969hd hdVar = new C82969hd();
        f226361e = hdVar;
        C62942bv.registerDefaultInstance(C82969hd.class, hdVar);
    }

    private C82969hd() {
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
                return newMessageInfo(f226361e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C67152mz.m97428b(), C45240c.f118157a, "d"});
            case 3:
                return new C82969hd();
            case 4:
                return new C82968hc();
            case 5:
                return f226361e;
            case 6:
                C63010eb ebVar = f226362f;
                if (ebVar == null) {
                    synchronized (C82969hd.class) {
                        ebVar = f226362f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226361e);
                            f226362f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
