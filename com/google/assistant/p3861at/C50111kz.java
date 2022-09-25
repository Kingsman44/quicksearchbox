package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.kz */
/* compiled from: PG */
public final class C50111kz extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C50111kz f130266f;

    /* renamed from: g */
    private static volatile C63010eb f130267g;

    /* renamed from: a */
    public int f130268a;

    /* renamed from: b */
    public int f130269b = 0;

    /* renamed from: c */
    public Object f130270c;

    /* renamed from: d */
    public String f130271d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f130272e = BuildConfig.FLAVOR;

    static {
        C50111kz kzVar = new C50111kz();
        f130266f = kzVar;
        C62942bv.registerDefaultInstance(C50111kz.class, kzVar);
    }

    private C50111kz() {
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
                return newMessageInfo(f130266f, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ြ\u0000\u0004ျ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C50109kx.class});
            case 3:
                return new C50111kz();
            case 4:
                return new C50110ky();
            case 5:
                return f130266f;
            case 6:
                C63010eb ebVar = f130267g;
                if (ebVar == null) {
                    synchronized (C50111kz.class) {
                        ebVar = f130267g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130266f);
                            f130267g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
