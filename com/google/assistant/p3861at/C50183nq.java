package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.nq */
/* compiled from: PG */
public final class C50183nq extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50183nq f130455e;

    /* renamed from: f */
    private static volatile C63010eb f130456f;

    /* renamed from: a */
    public int f130457a;

    /* renamed from: b */
    public String f130458b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f130459c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f130460d = BuildConfig.FLAVOR;

    static {
        C50183nq nqVar = new C50183nq();
        f130455e = nqVar;
        C62942bv.registerDefaultInstance(C50183nq.class, nqVar);
    }

    private C50183nq() {
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
                return newMessageInfo(f130455e, "\u0001\u0003\u0000\u0001\u0002\u0006\u0003\u0000\u0000\u0000\u0002ဈ\u0000\u0005ဈ\u0003\u0006ဈ\u0002", new Object[]{"a", "b", "d", C45240c.f118157a});
            case 3:
                return new C50183nq();
            case 4:
                return new C50182np();
            case 5:
                return f130455e;
            case 6:
                C63010eb ebVar = f130456f;
                if (ebVar == null) {
                    synchronized (C50183nq.class) {
                        ebVar = f130456f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130455e);
                            f130456f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
