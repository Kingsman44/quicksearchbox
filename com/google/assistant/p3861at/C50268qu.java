package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.qu */
/* compiled from: PG */
public final class C50268qu extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50268qu f130720e;

    /* renamed from: f */
    private static volatile C63010eb f130721f;

    /* renamed from: a */
    public int f130722a;

    /* renamed from: b */
    public String f130723b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f130724c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f130725d = emptyProtobufList();

    static {
        C50268qu quVar = new C50268qu();
        f130720e = quVar;
        C62942bv.registerDefaultInstance(C50268qu.class, quVar);
    }

    private C50268qu() {
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
                return newMessageInfo(f130720e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", C50264qq.class});
            case 3:
                return new C50268qu();
            case 4:
                return new C50267qt();
            case 5:
                return f130720e;
            case 6:
                C63010eb ebVar = f130721f;
                if (ebVar == null) {
                    synchronized (C50268qu.class) {
                        ebVar = f130721f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130720e);
                            f130721f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
