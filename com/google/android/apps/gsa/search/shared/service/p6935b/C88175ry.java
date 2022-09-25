package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.shared.p6919a.C87394b;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.ry */
/* compiled from: PG */
public final class C88175ry extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C88175ry f238360e;

    /* renamed from: f */
    public static final C62940bt f238361f;

    /* renamed from: g */
    private static volatile C63010eb f238362g;

    /* renamed from: a */
    public int f238363a;

    /* renamed from: b */
    public String f238364b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f238365c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f238366d;

    static {
        C88175ry ryVar = new C88175ry();
        f238360e = ryVar;
        C62942bv.registerDefaultInstance(C88175ry.class, ryVar);
        f238361f = C62942bv.newSingularGeneratedExtension(C87741bw.f237477c, ryVar, ryVar, (C62958ce) null, 183290042, C63066gd.MESSAGE, C88175ry.class);
    }

    private C88175ry() {
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
                return newMessageInfo(f238360e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", C87394b.f235982a});
            case 3:
                return new C88175ry();
            case 4:
                return new C88174rx();
            case 5:
                return f238360e;
            case 6:
                C63010eb ebVar = f238362g;
                if (ebVar == null) {
                    synchronized (C88175ry.class) {
                        ebVar = f238362g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238360e);
                            f238362g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
