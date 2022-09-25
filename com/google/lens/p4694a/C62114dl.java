package com.google.lens.p4694a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.dl */
/* compiled from: PG */
public final class C62114dl extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62114dl f167736e;

    /* renamed from: f */
    private static volatile C63010eb f167737f;

    /* renamed from: a */
    public int f167738a;

    /* renamed from: b */
    public String f167739b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f167740c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f167741d = BuildConfig.FLAVOR;

    static {
        C62114dl dlVar = new C62114dl();
        f167736e = dlVar;
        C62942bv.registerDefaultInstance(C62114dl.class, dlVar);
    }

    private C62114dl() {
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
                return newMessageInfo(f167736e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C62114dl();
            case 4:
                return new C62113dk();
            case 5:
                return f167736e;
            case 6:
                C63010eb ebVar = f167737f;
                if (ebVar == null) {
                    synchronized (C62114dl.class) {
                        ebVar = f167737f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167736e);
                            f167737f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
