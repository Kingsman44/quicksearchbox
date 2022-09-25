package com.google.p4017at.p4060h.p4073d.p4074a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.d.a.x */
/* compiled from: PG */
public final class C54260x extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C54260x f142466e;

    /* renamed from: g */
    private static volatile C63010eb f142467g;

    /* renamed from: a */
    public String f142468a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f142469b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f142470c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f142471d = BuildConfig.FLAVOR;

    /* renamed from: f */
    private int f142472f;

    static {
        C54260x xVar = new C54260x();
        f142466e = xVar;
        C62942bv.registerDefaultInstance(C54260x.class, xVar);
    }

    private C54260x() {
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
                return newMessageInfo(f142466e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C54260x();
            case 4:
                return new C54259w();
            case 5:
                return f142466e;
            case 6:
                C63010eb ebVar = f142467g;
                if (ebVar == null) {
                    synchronized (C54260x.class) {
                        ebVar = f142467g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142466e);
                            f142467g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
