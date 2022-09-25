package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.j.et */
/* compiled from: PG */
public final class C52087et extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52087et f136700d;

    /* renamed from: f */
    private static volatile C63010eb f136701f;

    /* renamed from: a */
    public String f136702a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f136703b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C63088z f136704c = C63088z.f170246b;

    /* renamed from: e */
    private int f136705e;

    static {
        C52087et etVar = new C52087et();
        f136700d = etVar;
        C62942bv.registerDefaultInstance(C52087et.class, etVar);
    }

    private C52087et() {
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
                return newMessageInfo(f136700d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C52087et();
            case 4:
                return new C52086es();
            case 5:
                return f136700d;
            case 6:
                C63010eb ebVar = f136701f;
                if (ebVar == null) {
                    synchronized (C52087et.class) {
                        ebVar = f136701f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136700d);
                            f136701f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
