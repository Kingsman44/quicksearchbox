package com.google.android.apps.gsa.assistant.settings.p526e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assistant.settings.e.e */
/* compiled from: PG */
public final class C9753e extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C9753e f33664d;

    /* renamed from: e */
    private static volatile C63010eb f33665e;

    /* renamed from: a */
    public int f33666a;

    /* renamed from: b */
    public String f33667b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f33668c;

    static {
        C9753e eVar = new C9753e();
        f33664d = eVar;
        C62942bv.registerDefaultInstance(C9753e.class, eVar);
    }

    private C9753e() {
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
                return newMessageInfo(f33664d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C9753e();
            case 4:
                return new C9752d();
            case 5:
                return f33664d;
            case 6:
                C63010eb ebVar = f33665e;
                if (ebVar == null) {
                    synchronized (C9753e.class) {
                        ebVar = f33665e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f33664d);
                            f33665e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
