package com.google.protos.p4850an.p4865e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.e.h */
/* compiled from: PG */
public final class C63594h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63594h f172008d;

    /* renamed from: e */
    private static volatile C63010eb f172009e;

    /* renamed from: a */
    public int f172010a;

    /* renamed from: b */
    public int f172011b;

    /* renamed from: c */
    public String f172012c = BuildConfig.FLAVOR;

    static {
        C63594h hVar = new C63594h();
        f172008d = hVar;
        C62942bv.registerDefaultInstance(C63594h.class, hVar);
    }

    private C63594h() {
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
                return newMessageInfo(f172008d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C63592f.f172007a, C45240c.f118157a});
            case 3:
                return new C63594h();
            case 4:
                return new C63591e();
            case 5:
                return f172008d;
            case 6:
                C63010eb ebVar = f172009e;
                if (ebVar == null) {
                    synchronized (C63594h.class) {
                        ebVar = f172009e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172008d);
                            f172009e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
