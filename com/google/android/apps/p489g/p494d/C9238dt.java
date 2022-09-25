package com.google.android.apps.p489g.p494d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.dt */
/* compiled from: PG */
public final class C9238dt extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C9238dt f31936d;

    /* renamed from: f */
    private static volatile C63010eb f31937f;

    /* renamed from: a */
    public int f31938a;

    /* renamed from: b */
    public String f31939b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C9141ad f31940c;

    /* renamed from: e */
    private byte f31941e = 2;

    static {
        C9238dt dtVar = new C9238dt();
        f31936d = dtVar;
        C62942bv.registerDefaultInstance(C9238dt.class, dtVar);
    }

    private C9238dt() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f31941e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f31941e = b;
                return null;
            case 2:
                return newMessageInfo(f31936d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C9238dt();
            case 4:
                return new C9237ds();
            case 5:
                return f31936d;
            case 6:
                C63010eb ebVar = f31937f;
                if (ebVar == null) {
                    synchronized (C9238dt.class) {
                        ebVar = f31937f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31936d);
                            f31937f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
