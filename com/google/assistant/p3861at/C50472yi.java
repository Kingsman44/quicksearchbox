package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.yi */
/* compiled from: PG */
public final class C50472yi extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50472yi f131358e;

    /* renamed from: f */
    private static volatile C63010eb f131359f;

    /* renamed from: a */
    public int f131360a;

    /* renamed from: b */
    public String f131361b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f131362c;

    /* renamed from: d */
    public boolean f131363d;

    static {
        C50472yi yiVar = new C50472yi();
        f131358e = yiVar;
        C62942bv.registerDefaultInstance(C50472yi.class, yiVar);
    }

    private C50472yi() {
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
                return newMessageInfo(f131358e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C50472yi();
            case 4:
                return new C50471yh();
            case 5:
                return f131358e;
            case 6:
                C63010eb ebVar = f131359f;
                if (ebVar == null) {
                    synchronized (C50472yi.class) {
                        ebVar = f131359f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131358e);
                            f131359f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
