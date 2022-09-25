package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.ai */
/* compiled from: PG */
public final class C80287ai extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C80287ai f220310f;

    /* renamed from: g */
    private static volatile C63010eb f220311g;

    /* renamed from: a */
    public int f220312a;

    /* renamed from: b */
    public String f220313b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f220314c;

    /* renamed from: d */
    public String f220315d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public long f220316e;

    static {
        C80287ai aiVar = new C80287ai();
        f220310f = aiVar;
        C62942bv.registerDefaultInstance(C80287ai.class, aiVar);
    }

    private C80287ai() {
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
                return newMessageInfo(f220310f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", C45240c.f118157a, C65753ak.m96798c(), "d", "e"});
            case 3:
                return new C80287ai();
            case 4:
                return new C80286ah();
            case 5:
                return f220310f;
            case 6:
                C63010eb ebVar = f220311g;
                if (ebVar == null) {
                    synchronized (C80287ai.class) {
                        ebVar = f220311g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220310f);
                            f220311g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
