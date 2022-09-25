package com.google.assistant.p3897e.p3921j.p3926e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.dx */
/* compiled from: PG */
public final class C51917dx extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51917dx f136187e;

    /* renamed from: f */
    private static volatile C63010eb f136188f;

    /* renamed from: a */
    public int f136189a;

    /* renamed from: b */
    public String f136190b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f136191c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C51916dw f136192d;

    static {
        C51917dx dxVar = new C51917dx();
        f136187e = dxVar;
        C62942bv.registerDefaultInstance(C51917dx.class, dxVar);
    }

    private C51917dx() {
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
                return newMessageInfo(f136187e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C51917dx();
            case 4:
                return new C51914du();
            case 5:
                return f136187e;
            case 6:
                C63010eb ebVar = f136188f;
                if (ebVar == null) {
                    synchronized (C51917dx.class) {
                        ebVar = f136188f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136187e);
                            f136188f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
