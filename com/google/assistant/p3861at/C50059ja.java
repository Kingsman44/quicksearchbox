package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ja */
/* compiled from: PG */
public final class C50059ja extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50059ja f130153d;

    /* renamed from: e */
    private static volatile C63010eb f130154e;

    /* renamed from: a */
    public int f130155a;

    /* renamed from: b */
    public String f130156b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C50029hy f130157c;

    static {
        C50059ja jaVar = new C50059ja();
        f130153d = jaVar;
        C62942bv.registerDefaultInstance(C50059ja.class, jaVar);
    }

    private C50059ja() {
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
                return newMessageInfo(f130153d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C50059ja();
            case 4:
                return new C50057iz();
            case 5:
                return f130153d;
            case 6:
                C63010eb ebVar = f130154e;
                if (ebVar == null) {
                    synchronized (C50059ja.class) {
                        ebVar = f130154e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130153d);
                            f130154e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
