package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.hr */
/* compiled from: PG */
public final class C59854hr extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C59854hr f161750g;

    /* renamed from: h */
    private static volatile C63010eb f161751h;

    /* renamed from: a */
    public int f161752a;

    /* renamed from: b */
    public String f161753b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f161754c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public long f161755d;

    /* renamed from: e */
    public long f161756e;

    /* renamed from: f */
    public long f161757f;

    static {
        C59854hr hrVar = new C59854hr();
        f161750g = hrVar;
        C62942bv.registerDefaultInstance(C59854hr.class, hrVar);
    }

    private C59854hr() {
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
                return newMessageInfo(f161750g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C59854hr();
            case 4:
                return new C59853hq();
            case 5:
                return f161750g;
            case 6:
                C63010eb ebVar = f161751h;
                if (ebVar == null) {
                    synchronized (C59854hr.class) {
                        ebVar = f161751h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161750g);
                            f161751h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
