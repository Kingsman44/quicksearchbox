package com.google.android.libraries.lens.view.p2069am;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.am.be */
/* compiled from: PG */
public final class C25324be extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C25324be f68896e;

    /* renamed from: f */
    private static volatile C63010eb f68897f;

    /* renamed from: a */
    public String f68898a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f68899b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f68900c;

    /* renamed from: d */
    public String f68901d = BuildConfig.FLAVOR;

    static {
        C25324be beVar = new C25324be();
        f68896e = beVar;
        C62942bv.registerDefaultInstance(C25324be.class, beVar);
    }

    private C25324be() {
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
                return newMessageInfo(f68896e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004Ȉ", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C25324be();
            case 4:
                return new C25322bc();
            case 5:
                return f68896e;
            case 6:
                C63010eb ebVar = f68897f;
                if (ebVar == null) {
                    synchronized (C25324be.class) {
                        ebVar = f68897f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68896e);
                            f68897f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
