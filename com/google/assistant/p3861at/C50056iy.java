package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.iy */
/* compiled from: PG */
public final class C50056iy extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50056iy f130140e;

    /* renamed from: f */
    private static volatile C63010eb f130141f;

    /* renamed from: a */
    public int f130142a;

    /* renamed from: b */
    public String f130143b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C50029hy f130144c;

    /* renamed from: d */
    public long f130145d;

    static {
        C50056iy iyVar = new C50056iy();
        f130140e = iyVar;
        C62942bv.registerDefaultInstance(C50056iy.class, iyVar);
    }

    private C50056iy() {
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
                return newMessageInfo(f130140e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C50056iy();
            case 4:
                return new C50055ix();
            case 5:
                return f130140e;
            case 6:
                C63010eb ebVar = f130141f;
                if (ebVar == null) {
                    synchronized (C50056iy.class) {
                        ebVar = f130141f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130140e);
                            f130141f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
