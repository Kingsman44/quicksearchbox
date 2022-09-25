package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.py */
/* compiled from: PG */
public final class C52389py extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52389py f137465c;

    /* renamed from: e */
    private static volatile C63010eb f137466e;

    /* renamed from: a */
    public String f137467a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f137468b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f137469d;

    static {
        C52389py pyVar = new C52389py();
        f137465c = pyVar;
        C62942bv.registerDefaultInstance(C52389py.class, pyVar);
    }

    private C52389py() {
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
                return newMessageInfo(f137465c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C52389py();
            case 4:
                return new C52388px();
            case 5:
                return f137465c;
            case 6:
                C63010eb ebVar = f137466e;
                if (ebVar == null) {
                    synchronized (C52389py.class) {
                        ebVar = f137466e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137465c);
                            f137466e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
