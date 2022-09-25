package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.z */
/* compiled from: PG */
public final class C52634z extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52634z f138199b;

    /* renamed from: d */
    private static volatile C63010eb f138200d;

    /* renamed from: a */
    public int f138201a;

    /* renamed from: c */
    private String f138202c = BuildConfig.FLAVOR;

    static {
        C52634z zVar = new C52634z();
        f138199b = zVar;
        C62942bv.registerDefaultInstance(C52634z.class, zVar);
    }

    private C52634z() {
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
                return newMessageInfo(f138199b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", C45240c.f118157a});
            case 3:
                return new C52634z();
            case 4:
                return new C52607y();
            case 5:
                return f138199b;
            case 6:
                C63010eb ebVar = f138200d;
                if (ebVar == null) {
                    synchronized (C52634z.class) {
                        ebVar = f138200d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138199b);
                            f138200d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
