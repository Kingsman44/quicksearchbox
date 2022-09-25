package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.qb */
/* compiled from: PG */
public final class C50249qb extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50249qb f130671d;

    /* renamed from: e */
    private static volatile C63010eb f130672e;

    /* renamed from: a */
    public int f130673a;

    /* renamed from: b */
    public String f130674b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f130675c = BuildConfig.FLAVOR;

    static {
        C50249qb qbVar = new C50249qb();
        f130671d = qbVar;
        C62942bv.registerDefaultInstance(C50249qb.class, qbVar);
    }

    private C50249qb() {
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
                return newMessageInfo(f130671d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C50249qb();
            case 4:
                return new C50248qa();
            case 5:
                return f130671d;
            case 6:
                C63010eb ebVar = f130672e;
                if (ebVar == null) {
                    synchronized (C50249qb.class) {
                        ebVar = f130672e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130671d);
                            f130672e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
