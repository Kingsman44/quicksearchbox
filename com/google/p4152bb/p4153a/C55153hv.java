package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.hv */
/* compiled from: PG */
public final class C55153hv extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55153hv f145187d;

    /* renamed from: f */
    private static volatile C63010eb f145188f;

    /* renamed from: a */
    public int f145189a;

    /* renamed from: b */
    public String f145190b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C54969b f145191c;

    /* renamed from: e */
    private byte f145192e = 2;

    static {
        C55153hv hvVar = new C55153hv();
        f145187d = hvVar;
        C62942bv.registerDefaultInstance(C55153hv.class, hvVar);
    }

    private C55153hv() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145192e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145192e = b;
                return null;
            case 2:
                return newMessageInfo(f145187d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C55153hv();
            case 4:
                return new C55152hu();
            case 5:
                return f145187d;
            case 6:
                C63010eb ebVar = f145188f;
                if (ebVar == null) {
                    synchronized (C55153hv.class) {
                        ebVar = f145188f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145187d);
                            f145188f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
