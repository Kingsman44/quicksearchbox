package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ae */
/* compiled from: PG */
public final class C49819ae extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C49819ae f129086e;

    /* renamed from: f */
    private static volatile C63010eb f129087f;

    /* renamed from: a */
    public int f129088a;

    /* renamed from: b */
    public String f129089b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f129090c = emptyProtobufList();

    /* renamed from: d */
    public C49845bc f129091d;

    static {
        C49819ae aeVar = new C49819ae();
        f129086e = aeVar;
        C62942bv.registerDefaultInstance(C49819ae.class, aeVar);
    }

    private C49819ae() {
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
                return newMessageInfo(f129086e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a, C49816ac.class, "d"});
            case 3:
                return new C49819ae();
            case 4:
                return new C49817ad();
            case 5:
                return f129086e;
            case 6:
                C63010eb ebVar = f129087f;
                if (ebVar == null) {
                    synchronized (C49819ae.class) {
                        ebVar = f129087f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129086e);
                            f129087f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
