package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.kf */
/* compiled from: PG */
public final class C50091kf extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50091kf f130222d;

    /* renamed from: e */
    private static volatile C63010eb f130223e;

    /* renamed from: a */
    public int f130224a;

    /* renamed from: b */
    public String f130225b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f130226c = emptyProtobufList();

    static {
        C50091kf kfVar = new C50091kf();
        f130222d = kfVar;
        C62942bv.registerDefaultInstance(C50091kf.class, kfVar);
    }

    private C50091kf() {
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
                return newMessageInfo(f130222d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"a", "b", C45240c.f118157a, C50088kc.class});
            case 3:
                return new C50091kf();
            case 4:
                return new C50090ke();
            case 5:
                return f130222d;
            case 6:
                C63010eb ebVar = f130223e;
                if (ebVar == null) {
                    synchronized (C50091kf.class) {
                        ebVar = f130223e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130222d);
                            f130223e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
