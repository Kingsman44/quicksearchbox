package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bx */
/* compiled from: PG */
public final class C138216bx extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C138216bx f376058e;

    /* renamed from: f */
    private static volatile C63010eb f376059f;

    /* renamed from: a */
    public int f376060a;

    /* renamed from: b */
    public String f376061b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f376062c;

    /* renamed from: d */
    public C138246cb f376063d;

    static {
        C138216bx bxVar = new C138216bx();
        f376058e = bxVar;
        C62942bv.registerDefaultInstance(C138216bx.class, bxVar);
    }

    private C138216bx() {
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
                return newMessageInfo(f376058e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဃ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C138216bx();
            case 4:
                return new C138215bw();
            case 5:
                return f376058e;
            case 6:
                C63010eb ebVar = f376059f;
                if (ebVar == null) {
                    synchronized (C138216bx.class) {
                        ebVar = f376059f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f376058e);
                            f376059f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
