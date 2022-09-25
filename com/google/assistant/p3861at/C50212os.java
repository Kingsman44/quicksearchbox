package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.os */
/* compiled from: PG */
public final class C50212os extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50212os f130562e;

    /* renamed from: f */
    private static volatile C63010eb f130563f;

    /* renamed from: a */
    public int f130564a;

    /* renamed from: b */
    public int f130565b;

    /* renamed from: c */
    public String f130566c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f130567d = C62942bv.emptyProtobufList();

    static {
        C50212os osVar = new C50212os();
        f130562e = osVar;
        C62942bv.registerDefaultInstance(C50212os.class, osVar);
    }

    private C50212os() {
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
                return newMessageInfo(f130562e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001a\u0003ဈ\u0001", new Object[]{"a", "b", C50211or.m85792b(), "d", C45240c.f118157a});
            case 3:
                return new C50212os();
            case 4:
                return new C50209op();
            case 5:
                return f130562e;
            case 6:
                C63010eb ebVar = f130563f;
                if (ebVar == null) {
                    synchronized (C50212os.class) {
                        ebVar = f130563f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130562e);
                            f130563f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
