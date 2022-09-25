package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.agw */
/* compiled from: PG */
public final class agw extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final agw f158671d;

    /* renamed from: e */
    private static volatile C63010eb f158672e;

    /* renamed from: a */
    public int f158673a;

    /* renamed from: b */
    public String f158674b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f158675c;

    static {
        agw agw = new agw();
        f158671d = agw;
        C62942bv.registerDefaultInstance(agw.class, agw);
    }

    private agw() {
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
                return newMessageInfo(f158671d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new agw();
            case 4:
                return new agv();
            case 5:
                return f158671d;
            case 6:
                C63010eb ebVar = f158672e;
                if (ebVar == null) {
                    synchronized (agw.class) {
                        ebVar = f158672e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158671d);
                            f158672e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
