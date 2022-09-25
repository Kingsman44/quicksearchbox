package com.google.p427am.p438d.p439a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.am.d.a.cl */
/* compiled from: PG */
public final class C8765cl extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C8765cl f30124d;

    /* renamed from: e */
    private static volatile C63010eb f30125e;

    /* renamed from: a */
    public String f30126a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C63088z f30127b = C63088z.f170246b;

    /* renamed from: c */
    public int f30128c;

    static {
        C8765cl clVar = new C8765cl();
        f30124d = clVar;
        C62942bv.registerDefaultInstance(C8765cl.class, clVar);
    }

    private C8765cl() {
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
                return newMessageInfo(f30124d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C8765cl();
            case 4:
                return new C8764ck();
            case 5:
                return f30124d;
            case 6:
                C63010eb ebVar = f30125e;
                if (ebVar == null) {
                    synchronized (C8765cl.class) {
                        ebVar = f30125e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30124d);
                            f30125e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
