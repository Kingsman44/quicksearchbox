package com.google.assistant.p3897e.p3902c.p3907c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.em */
/* compiled from: PG */
public final class C51049em extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51049em f132927d;

    /* renamed from: e */
    private static volatile C63010eb f132928e;

    /* renamed from: a */
    public int f132929a;

    /* renamed from: b */
    public String f132930b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f132931c = BuildConfig.FLAVOR;

    static {
        C51049em emVar = new C51049em();
        f132927d = emVar;
        C62942bv.registerDefaultInstance(C51049em.class, emVar);
    }

    private C51049em() {
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
                return newMessageInfo(f132927d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C51049em();
            case 4:
                return new C51048el();
            case 5:
                return f132927d;
            case 6:
                C63010eb ebVar = f132928e;
                if (ebVar == null) {
                    synchronized (C51049em.class) {
                        ebVar = f132928e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132927d);
                            f132928e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
