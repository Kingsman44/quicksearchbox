package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ahw */
/* compiled from: PG */
public final class ahw extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final ahw f129344e;

    /* renamed from: f */
    private static volatile C63010eb f129345f;

    /* renamed from: a */
    public int f129346a;

    /* renamed from: b */
    public String f129347b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f129348c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f129349d = BuildConfig.FLAVOR;

    static {
        ahw ahw = new ahw();
        f129344e = ahw;
        C62942bv.registerDefaultInstance(ahw.class, ahw);
    }

    private ahw() {
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
                return newMessageInfo(f129344e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new ahw();
            case 4:
                return new ahv();
            case 5:
                return f129344e;
            case 6:
                C63010eb ebVar = f129345f;
                if (ebVar == null) {
                    synchronized (ahw.class) {
                        ebVar = f129345f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129344e);
                            f129345f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
