package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6364s3.p6365a.C81482q;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.eu */
/* compiled from: PG */
public final class C82905eu extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C82905eu f226154e;

    /* renamed from: f */
    private static volatile C63010eb f226155f;

    /* renamed from: a */
    public int f226156a;

    /* renamed from: b */
    public int f226157b;

    /* renamed from: c */
    public String f226158c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C81482q f226159d;

    static {
        C82905eu euVar = new C82905eu();
        f226154e = euVar;
        C62942bv.registerDefaultInstance(C82905eu.class, euVar);
    }

    private C82905eu() {
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
                return newMessageInfo(f226154e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C82904et.m132424b(), C45240c.f118157a, "d"});
            case 3:
                return new C82905eu();
            case 4:
                return new C82902er();
            case 5:
                return f226154e;
            case 6:
                C63010eb ebVar = f226155f;
                if (ebVar == null) {
                    synchronized (C82905eu.class) {
                        ebVar = f226155f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226154e);
                            f226155f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
