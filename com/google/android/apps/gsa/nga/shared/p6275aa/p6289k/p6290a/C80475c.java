package com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6290a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62960cg;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.k.a.c */
/* compiled from: PG */
public final class C80475c extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C80475c f220879e;

    /* renamed from: f */
    private static volatile C63010eb f220880f;

    /* renamed from: a */
    public int f220881a;

    /* renamed from: b */
    public long f220882b;

    /* renamed from: c */
    public C62960cg f220883c = emptyFloatList();

    /* renamed from: d */
    public String f220884d = BuildConfig.FLAVOR;

    static {
        C80475c cVar = new C80475c();
        f220879e = cVar;
        C62942bv.registerDefaultInstance(C80475c.class, cVar);
    }

    private C80475c() {
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
                return newMessageInfo(f220879e, "\u0000\u0004\u0000\u0000\u0001\u0006\u0004\u0000\u0001\u0000\u0001\f\u0002\u0002\u0004$\u0006Ȉ", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C80475c();
            case 4:
                return new C80473a();
            case 5:
                return f220879e;
            case 6:
                C63010eb ebVar = f220880f;
                if (ebVar == null) {
                    synchronized (C80475c.class) {
                        ebVar = f220880f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220879e);
                            f220880f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
