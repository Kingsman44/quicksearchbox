package com.google.android.apps.gsa.unifiedime;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.unifiedime.d */
/* compiled from: PG */
public final class C118586d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C118586d f330853e;

    /* renamed from: f */
    private static volatile C63010eb f330854f;

    /* renamed from: a */
    public int f330855a;

    /* renamed from: b */
    public String f330856b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public float f330857c;

    /* renamed from: d */
    public int f330858d;

    static {
        C118586d dVar = new C118586d();
        f330853e = dVar;
        C62942bv.registerDefaultInstance(C118586d.class, dVar);
    }

    private C118586d() {
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
                return newMessageInfo(f330853e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", C118585c.m196889b()});
            case 3:
                return new C118586d();
            case 4:
                return new C118576a();
            case 5:
                return f330853e;
            case 6:
                C63010eb ebVar = f330854f;
                if (ebVar == null) {
                    synchronized (C118586d.class) {
                        ebVar = f330854f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f330853e);
                            f330854f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
