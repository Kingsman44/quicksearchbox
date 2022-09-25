package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.dj */
/* compiled from: PG */
public final class C124698dj extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C124698dj f344014d;

    /* renamed from: e */
    private static volatile C63010eb f344015e;

    /* renamed from: a */
    public int f344016a;

    /* renamed from: b */
    public String f344017b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f344018c;

    static {
        C124698dj djVar = new C124698dj();
        f344014d = djVar;
        C62942bv.registerDefaultInstance(C124698dj.class, djVar);
    }

    private C124698dj() {
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
                return newMessageInfo(f344014d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C124698dj();
            case 4:
                return new C124697di();
            case 5:
                return f344014d;
            case 6:
                C63010eb ebVar = f344015e;
                if (ebVar == null) {
                    synchronized (C124698dj.class) {
                        ebVar = f344015e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f344014d);
                            f344015e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
