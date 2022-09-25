package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.vz */
/* compiled from: PG */
public final class C50408vz extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50408vz f131201d;

    /* renamed from: e */
    private static volatile C63010eb f131202e;

    /* renamed from: a */
    public int f131203a;

    /* renamed from: b */
    public C50404vv f131204b;

    /* renamed from: c */
    public C50406vx f131205c;

    static {
        C50408vz vzVar = new C50408vz();
        f131201d = vzVar;
        C62942bv.registerDefaultInstance(C50408vz.class, vzVar);
    }

    private C50408vz() {
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
                return newMessageInfo(f131201d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C50408vz();
            case 4:
                return new C50407vy();
            case 5:
                return f131201d;
            case 6:
                C63010eb ebVar = f131202e;
                if (ebVar == null) {
                    synchronized (C50408vz.class) {
                        ebVar = f131202e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131201d);
                            f131202e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
