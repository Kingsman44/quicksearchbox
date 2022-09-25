package com.google.assistant.p3931f.p3939c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.f.c.al */
/* compiled from: PG */
public final class C52822al extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52822al f138585d;

    /* renamed from: e */
    private static volatile C63010eb f138586e;

    /* renamed from: a */
    public String f138587a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f138588b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f138589c;

    static {
        C52822al alVar = new C52822al();
        f138585d = alVar;
        C62942bv.registerDefaultInstance(C52822al.class, alVar);
    }

    private C52822al() {
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
                return newMessageInfo(f138585d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C52822al();
            case 4:
                return new C52821ak();
            case 5:
                return f138585d;
            case 6:
                C63010eb ebVar = f138586e;
                if (ebVar == null) {
                    synchronized (C52822al.class) {
                        ebVar = f138586e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138585d);
                            f138586e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
