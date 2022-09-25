package com.google.assistant.p3781ad.p3789d.p3791b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.aw */
/* compiled from: PG */
public final class C48688aw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48688aw f125962c;

    /* renamed from: d */
    private static volatile C63010eb f125963d;

    /* renamed from: a */
    public int f125964a;

    /* renamed from: b */
    public String f125965b = BuildConfig.FLAVOR;

    static {
        C48688aw awVar = new C48688aw();
        f125962c = awVar;
        C62942bv.registerDefaultInstance(C48688aw.class, awVar);
    }

    private C48688aw() {
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
                return newMessageInfo(f125962c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C48688aw();
            case 4:
                return new C48687av();
            case 5:
                return f125962c;
            case 6:
                C63010eb ebVar = f125963d;
                if (ebVar == null) {
                    synchronized (C48688aw.class) {
                        ebVar = f125963d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125962c);
                            f125963d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
