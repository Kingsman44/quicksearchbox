package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ajr */
/* compiled from: PG */
public final class ajr extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final ajr f158904f;

    /* renamed from: g */
    private static volatile C63010eb f158905g;

    /* renamed from: a */
    public int f158906a;

    /* renamed from: b */
    public String f158907b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f158908c;

    /* renamed from: d */
    public long f158909d;

    /* renamed from: e */
    public int f158910e;

    static {
        ajr ajr = new ajr();
        f158904f = ajr;
        C62942bv.registerDefaultInstance(ajr.class, ajr);
    }

    private ajr() {
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
                return newMessageInfo(f158904f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004င\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new ajr();
            case 4:
                return new ajq();
            case 5:
                return f158904f;
            case 6:
                C63010eb ebVar = f158905g;
                if (ebVar == null) {
                    synchronized (ajr.class) {
                        ebVar = f158905g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158904f);
                            f158905g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
