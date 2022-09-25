package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80517f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.fp */
/* compiled from: PG */
public final class C82927fp extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C82927fp f226237d;

    /* renamed from: f */
    private static volatile C63010eb f226238f;

    /* renamed from: a */
    public int f226239a;

    /* renamed from: b */
    public String f226240b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f226241c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f226242e;

    static {
        C82927fp fpVar = new C82927fp();
        f226237d = fpVar;
        C62942bv.registerDefaultInstance(C82927fp.class, fpVar);
    }

    private C82927fp() {
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
                return newMessageInfo(f226237d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", C80517f.m128188b(), "b", C45240c.f118157a});
            case 3:
                return new C82927fp();
            case 4:
                return new C82926fo();
            case 5:
                return f226237d;
            case 6:
                C63010eb ebVar = f226238f;
                if (ebVar == null) {
                    synchronized (C82927fp.class) {
                        ebVar = f226238f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226237d);
                            f226238f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
