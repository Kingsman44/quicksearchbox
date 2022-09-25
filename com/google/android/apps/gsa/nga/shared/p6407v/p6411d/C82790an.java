package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.an */
/* compiled from: PG */
public final class C82790an extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C82790an f225572d;

    /* renamed from: e */
    private static volatile C63010eb f225573e;

    /* renamed from: a */
    public int f225574a;

    /* renamed from: b */
    public String f225575b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f225576c = BuildConfig.FLAVOR;

    static {
        C82790an anVar = new C82790an();
        f225572d = anVar;
        C62942bv.registerDefaultInstance(C82790an.class, anVar);
    }

    private C82790an() {
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
                return newMessageInfo(f225572d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C82790an();
            case 4:
                return new C82789am();
            case 5:
                return f225572d;
            case 6:
                C63010eb ebVar = f225573e;
                if (ebVar == null) {
                    synchronized (C82790an.class) {
                        ebVar = f225573e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f225572d);
                            f225573e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
