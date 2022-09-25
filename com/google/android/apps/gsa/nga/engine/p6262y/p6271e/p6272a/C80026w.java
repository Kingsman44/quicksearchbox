package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.w */
/* compiled from: PG */
public final class C80026w extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C80026w f219607e;

    /* renamed from: f */
    private static volatile C63010eb f219608f;

    /* renamed from: a */
    public int f219609a;

    /* renamed from: b */
    public String f219610b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f219611c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f219612d = BuildConfig.FLAVOR;

    static {
        C80026w wVar = new C80026w();
        f219607e = wVar;
        C62942bv.registerDefaultInstance(C80026w.class, wVar);
    }

    private C80026w() {
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
                return newMessageInfo(f219607e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C80026w();
            case 4:
                return new C80025v();
            case 5:
                return f219607e;
            case 6:
                C63010eb ebVar = f219608f;
                if (ebVar == null) {
                    synchronized (C80026w.class) {
                        ebVar = f219608f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219607e);
                            f219608f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
