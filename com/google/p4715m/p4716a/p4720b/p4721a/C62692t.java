package com.google.p4715m.p4716a.p4720b.p4721a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.m.a.b.a.t */
/* compiled from: PG */
public final class C62692t extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62692t f169255d;

    /* renamed from: e */
    private static volatile C63010eb f169256e;

    /* renamed from: a */
    public int f169257a;

    /* renamed from: b */
    public String f169258b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f169259c = BuildConfig.FLAVOR;

    static {
        C62692t tVar = new C62692t();
        f169255d = tVar;
        C62942bv.registerDefaultInstance(C62692t.class, tVar);
    }

    private C62692t() {
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
                return newMessageInfo(f169255d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C62692t();
            case 4:
                return new C62691s();
            case 5:
                return f169255d;
            case 6:
                C63010eb ebVar = f169256e;
                if (ebVar == null) {
                    synchronized (C62692t.class) {
                        ebVar = f169256e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169255d);
                            f169256e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
