package com.google.android.apps.search.googleapp.activity;

import com.google.android.apps.search.googleapp.p10310h.C136137r;
import com.google.android.apps.search.googleapp.p10527u.C139775p;
import com.google.android.apps.search.googleapp.p10527u.C139777r;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.activity.as */
/* compiled from: PG */
public final class C133395as extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C133395as f363478e;

    /* renamed from: g */
    private static volatile C63010eb f363479g;

    /* renamed from: a */
    public int f363480a;

    /* renamed from: b */
    public C139777r f363481b;

    /* renamed from: c */
    public C139775p f363482c;

    /* renamed from: d */
    public C136137r f363483d;

    /* renamed from: f */
    private byte f363484f = 2;

    static {
        C133395as asVar = new C133395as();
        f363478e = asVar;
        C62942bv.registerDefaultInstance(C133395as.class, asVar);
    }

    private C133395as() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f363484f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f363484f = b;
                return null;
            case 2:
                return newMessageInfo(f363478e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C133395as();
            case 4:
                return new C133394ar();
            case 5:
                return f363478e;
            case 6:
                C63010eb ebVar = f363479g;
                if (ebVar == null) {
                    synchronized (C133395as.class) {
                        ebVar = f363479g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f363478e);
                            f363479g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
