package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ie */
/* compiled from: PG */
public final class C50036ie extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50036ie f130085d;

    /* renamed from: e */
    private static volatile C63010eb f130086e;

    /* renamed from: a */
    public int f130087a;

    /* renamed from: b */
    public String f130088b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f130089c = emptyProtobufList();

    static {
        C50036ie ieVar = new C50036ie();
        f130085d = ieVar;
        C62942bv.registerDefaultInstance(C50036ie.class, ieVar);
    }

    private C50036ie() {
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
                return newMessageInfo(f130085d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, C50032ia.class});
            case 3:
                return new C50036ie();
            case 4:
                return new C50035id();
            case 5:
                return f130085d;
            case 6:
                C63010eb ebVar = f130086e;
                if (ebVar == null) {
                    synchronized (C50036ie.class) {
                        ebVar = f130086e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130085d);
                            f130086e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
