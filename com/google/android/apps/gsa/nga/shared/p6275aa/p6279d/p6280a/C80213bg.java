package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.bg */
/* compiled from: PG */
public final class C80213bg extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C80213bg f220077e;

    /* renamed from: f */
    private static volatile C63010eb f220078f;

    /* renamed from: a */
    public int f220079a;

    /* renamed from: b */
    public int f220080b = 0;

    /* renamed from: c */
    public Object f220081c;

    /* renamed from: d */
    public String f220082d = BuildConfig.FLAVOR;

    static {
        C80213bg bgVar = new C80213bg();
        f220077e = bgVar;
        C62942bv.registerDefaultInstance(C80213bg.class, bgVar);
    }

    private C80213bg() {
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
                return newMessageInfo(f220077e, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C80206b.class, C80193an.class, C80223bq.class, C80183ad.class, C80261p.class, C80253h.class});
            case 3:
                return new C80213bg();
            case 4:
                return new C80211be();
            case 5:
                return f220077e;
            case 6:
                C63010eb ebVar = f220078f;
                if (ebVar == null) {
                    synchronized (C80213bg.class) {
                        ebVar = f220078f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220077e);
                            f220078f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
