package com.google.android.apps.search.googleapp.discover.p10214s;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.s.m */
/* compiled from: PG */
public final class C134595m extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C134595m f366542d;

    /* renamed from: e */
    private static volatile C63010eb f366543e;

    /* renamed from: a */
    public int f366544a;

    /* renamed from: b */
    public String f366545b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f366546c = BuildConfig.FLAVOR;

    static {
        C134595m mVar = new C134595m();
        f366542d = mVar;
        C62942bv.registerDefaultInstance(C134595m.class, mVar);
    }

    private C134595m() {
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
                return newMessageInfo(f366542d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C134595m();
            case 4:
                return new C134594l();
            case 5:
                return f366542d;
            case 6:
                C63010eb ebVar = f366543e;
                if (ebVar == null) {
                    synchronized (C134595m.class) {
                        ebVar = f366543e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f366542d);
                            f366543e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
