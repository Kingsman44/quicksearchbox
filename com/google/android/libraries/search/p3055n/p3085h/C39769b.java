package com.google.android.libraries.search.p3055n.p3085h;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.search.n.h.b */
/* compiled from: PG */
public final class C39769b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C39769b f104600e;

    /* renamed from: f */
    private static volatile C63010eb f104601f;

    /* renamed from: a */
    public int f104602a;

    /* renamed from: b */
    public C39777j f104603b;

    /* renamed from: c */
    public String f104604c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C63088z f104605d = C63088z.f170246b;

    static {
        C39769b bVar = new C39769b();
        f104600e = bVar;
        C62942bv.registerDefaultInstance(C39769b.class, bVar);
    }

    private C39769b() {
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
                return newMessageInfo(f104600e, "\u0001\u0003\u0000\u0001\b\u001f\u0003\u0000\u0000\u0000\bဉ\u0007\tဈ\b\u001fည\u001e", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C39769b();
            case 4:
                return new C39768a();
            case 5:
                return f104600e;
            case 6:
                C63010eb ebVar = f104601f;
                if (ebVar == null) {
                    synchronized (C39769b.class) {
                        ebVar = f104601f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f104600e);
                            f104601f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
