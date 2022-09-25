package com.google.assistant.p3897e.p3921j.p3926e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.hv */
/* compiled from: PG */
public final class C52023hv extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52023hv f136539d;

    /* renamed from: e */
    private static volatile C63010eb f136540e;

    /* renamed from: a */
    public int f136541a;

    /* renamed from: b */
    public String f136542b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C52022hu f136543c;

    static {
        C52023hv hvVar = new C52023hv();
        f136539d = hvVar;
        C62942bv.registerDefaultInstance(C52023hv.class, hvVar);
    }

    private C52023hv() {
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
                return newMessageInfo(f136539d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C52023hv();
            case 4:
                return new C52020hs();
            case 5:
                return f136539d;
            case 6:
                C63010eb ebVar = f136540e;
                if (ebVar == null) {
                    synchronized (C52023hv.class) {
                        ebVar = f136540e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136539d);
                            f136540e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
